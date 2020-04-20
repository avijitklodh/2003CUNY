package dev.wsd.daos;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.HashSet;
import java.util.Set;
import dev.wsd.entities.*;
import dev.wsd.utils.*;

/**
 * @author Admin
 * @version 1.0
 * @created 07-Apr-2020 8:56:25 AM
 */
public class UserDAO {

	public UserDAO() {

	}

	public static IUserDAO UserDAOImplementaion = new IUserDAO() {

		@Override
		public User save(User user) {
			// INSERT INTO test.users (firstName, lastName, username, password, `role`)
			// VALUES(NULL, NULL, NULL, NULL, NULL);
			try (Connection con = DBConnectionUtil.openCon();
					PreparedStatement statement1 = con.prepareStatement(
							"INSERT INTO test.users (firstName, lastName, username,password,`role`) VALUES(?, ?, ?, ?,?)",
							Statement.RETURN_GENERATED_KEYS);) {
				try {
					con.setAutoCommit(false);
					statement1.setString(1, user.getFirstName());
					statement1.setString(2, user.getLastName());
					statement1.setString(3, user.getUserName());
					statement1.setString(4, user.getPassword());
					statement1.setString(5, user.getRole());
					statement1.executeUpdate();
					ResultSet rs = statement1.getGeneratedKeys();
					rs.next();// gets first record
					int id = rs.getInt("ID");
					user.setId(id);
					con.commit();
					statement1.close();

					con.close();

				} catch (SQLException e) {
					con.rollback();
				}

			} catch (SQLException e) {

				e.printStackTrace();
			} finally {

			}
			return user;
		}

		@Override
		public boolean deleteById(int userid) {
			int effectedrows = 0;
			try (Connection con = DBConnectionUtil.openCon();
					PreparedStatement statement1 = con.prepareStatement("DELETE test.users  WHERE   ID= ?");) {
				con.setAutoCommit(false);
				statement1.setInt(1, userid);
				effectedrows = statement1.executeUpdate();
				statement1.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {

			}
			return (effectedrows > 0);
		}

		@Override
		public boolean update(User user) {
			// UPDATE test.users SET firstName=NULL, lastName=NULL, username=NULL,
			// password=NULL, `role`=NULL WHERE ID=0;
			int effectedrows = 0;
			try (Connection con = DBConnectionUtil.openCon();
					PreparedStatement statement = con.prepareStatement(
							" UPDATE test.users SET firstName=?, lastName=?, username=?, password=?, `role`=? WHERE ID=?");) {
				statement.setString(1, user.getFirstName());
				statement.setString(2, user.getLastName());

				statement.setString(3, user.getUserName());
				statement.setString(4, user.getPassword());
				statement.setString(5, user.getRole());
				statement.setInt(6, user.getId());
				effectedrows = statement.executeUpdate();
				statement.close();

			} catch (SQLException e) {

				e.printStackTrace();
			} finally {

			}
			return (effectedrows > 0);
		}

		@Override
		public User findUserById(int id) {

			User user = null;
			try (Connection con = DBConnectionUtil.openCon();
					PreparedStatement ps = con.prepareStatement("select * from test.users where ID = ?");) {
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();

				while (rs.next()) {
					user = new User();
					user.setId(rs.getInt("ID"));
					user.setFirstName(rs.getString("firstName"));
					user.setLastName(rs.getString("lastName"));
					user.setUserName(rs.getString("username"));
					user.setPassword(rs.getString("password"));
					user.setRole(rs.getString("role"));

				}

				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {

			}
			return user;

		}

		@Override
		public Set<User> findall() throws SQLException {
			// TODO Auto-generated method stub

			Set<User> userCollection = new HashSet<User>();
			User user;
			try (Connection con = DBConnectionUtil.openCon();
					PreparedStatement ps = con.prepareStatement("select * from  test.users");) {
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					user = new User();
					user.setId(rs.getInt("ID"));
					user.setFirstName(rs.getString("firstName"));
					user.setLastName(rs.getString("lastName"));
					user.setUserName(rs.getString("username"));
					user.setPassword(rs.getString("password"));
					user.setRole(rs.getString("role"));

				}

				con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			} finally {

			}

			return userCollection;
		}
	};

}