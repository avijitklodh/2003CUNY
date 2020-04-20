package dev.wsd.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public final class DBConnectionUtil {
	private static Connection con = null;
	// final static String conString =
	// "jdbc:mariadb://bankdb-wael.c7w4umijvqtz.us-east-2.rds.amazonaws.com:3306/bankdb-wael?user=admin&password=Wsd_1981";

	public static Connection openCon() throws SQLException {
		try {

			FileInputStream in = new FileInputStream("src/main/resources/connection.properties");
			Properties props = new Properties();

			props.load(in);
			String conString = props.getProperty("conString");
			con = DriverManager.getConnection(conString);
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
		return null;
	}

}
