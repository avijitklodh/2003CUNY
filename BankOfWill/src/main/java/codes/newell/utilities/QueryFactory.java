package codes.newell.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

public class QueryFactory {
	private enum DDL {
		DML, DQL
	}

	private DDL type;

	private QueryFactory() {

	}

	QueryManager buildManager(String query) {
		if (query.contains("SELECT")) {
			type = DDL.DQL;
		}
		switch (type) {
		case DML:
			return new DMLManager(query);
		case DQL:
			return new DQLManager(query);
		default:
			return null;
		}
	}

	private static abstract class DDLManager implements QueryManager {

		protected final String query;

		/**
		 * Manager for a jdbc prepared statement. Creates a connection based on
		 * src/main/resources/connection.properties.
		 * 
		 * @param query a jdbc query statement. Assumes SQL commands are CAPITALIZED.
		 */
		protected DDLManager(String query) {
			this.query = query;
		}

		protected Connection createConnection() {
			try {
				Properties props = new Properties();
				FileInputStream in = new FileInputStream("src/main/resources/connection.properties");
				props.load(in);
				String details = props.getProperty("condetails");
				Connection conn = DriverManager.getConnection(details);
				return conn;
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				return null;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		}

		protected static void applyParameters(PreparedStatement ps, List<Object> params) throws NoSuchMethodException {
			for (int i = 0; i < params.size(); i++) {
				String name = params.get(i).getClass().getSimpleName();
				try {
					switch (name) {
					case "Integer":
						ps.setInt(i + 1, ((Integer) params.get(i)));
						break;
					case "String":
						ps.setString(i + 1, ((String) params.get(i)));
						break;
					default:
						throw new NoSuchMethodException("PreparedStatement: No known method for object type: " + name);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		@Override
		public abstract ResultSet executeWithParameters(List<Object> parameters) throws NoSuchMethodException;

	}

	private class DMLManager extends DDLManager {
		private DMLManager(String query) {
			super(query);
		}

		@Override
		public ResultSet executeWithParameters(List<Object> params) throws NoSuchMethodException {
			try (Connection con = createConnection()) {
				PreparedStatement ps = con.prepareStatement(this.query, Statement.RETURN_GENERATED_KEYS);
				applyParameters(ps, params);
				return ps.getGeneratedKeys();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
	}

	private class DQLManager extends DDLManager {
		private DQLManager(String query) {
			super(query);
		}

		@Override
		public ResultSet executeWithParameters(List<Object> params) throws NoSuchMethodException {
			try (Connection con = createConnection()) {
				PreparedStatement ps = con.prepareStatement(this.query);
				applyParameters(ps, params);
				return ps.executeQuery();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
	}
}
