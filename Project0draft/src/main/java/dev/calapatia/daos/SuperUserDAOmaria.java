package dev.calapatia.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dev.calapatia.entities.User;
import dev.calapatia.utils.ConnectionUtil;





public class SuperUserDAOmaria implements SuperUserDAO {
	
	public User createUser(User user) {
		try(Connection conn = ConnectionUtil.createConnection()){
			String sql = "INSERT INTO Project0.BANKUSER VALUES (?,?,?)";
			// when you first save an object it has an id of 0
			// please return the primary key of the object we just saved
			PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setInt(1, 0);
			ps.setString(2,user.getUsername());
			ps.setString(3, user.getPassword());
			ps.execute(); // execute the insert statement
			
			ResultSet rs = ps.getGeneratedKeys();
			rs.next();
			int key = rs.getInt("SCHOOL_ID");
			
			user.setUserId(key);
			return user;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}

	public User getUserById(int id) {
		try(Connection conn = ConnectionUtil.createConnection()){
			String sql = "SELECT * FROM Project0.BANKUSER WHERE USER_ID = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			
			// result set contains our information
			// by default result points to before the first record returned
			ResultSet rs = ps.executeQuery();
			
			// moves cursor one spot to first record
			rs.next();
			
			User user = new User();
			
			user.setUserId(rs.getInt("USER_ID"));
			user.setUsername(rs.getString("USERNAME"));
			user.setPassword(rs.getString("PASSWORD"));
			//school.setCapacity(rs.getInt("CAPACITY"));
			
			return  user;
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		return null;
	}

	public User getUserByUserName(String name) {
		try(Connection conn = ConnectionUtil.createConnection()){
			String sql = "SELECT * FROM Project0.BANKUSER WHERE USERNAME = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);

			ResultSet rs = ps.executeQuery();
			
			rs.next();
			
			User user = new User();
			
			user.setUserId(rs.getInt("USER_ID"));
			user.setUsername(rs.getString("USERNAME"));
			user.setPassword(rs.getString("Password"));
			
			
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		return null;	
	}

	public List<User> getAllUsers() {
		try(Connection conn = ConnectionUtil.createConnection()){
			String sql = "SELECT * FROM Project0.BANKUSER";
			PreparedStatement ps = conn.prepareStatement(sql);			

			ResultSet rs = ps.executeQuery();
			
			List<User> users = new ArrayList<User>();
			
			while(rs.next()) {
				
				User user = new User();				
				user.setUserId(rs.getInt("USER_ID"));
				user.setUsername(rs.getString("USERNAME"));
				user.setPassword(rs.getString("PASSWORD"));
				
				users.add(user);
				
			}
					
			return users;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public User updateUser(User user) {
		try(Connection conn = ConnectionUtil.createConnection()){
			
String sql = "UPDATE Project0.BANKUSER SET USERNAME = ?, PASSWORD = ? WHERE USER_ID = ?";			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setInt(3, user.getUserId());
			boolean success = ps.execute();
		
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean deleteUser(User user) {
		try(Connection conn = ConnectionUtil.createConnection()){
			String sql = "DELETE FROM Project0.BANKUSER WHERE USER_ID = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, user.getUserId());
			boolean success = ps.execute();
			return success;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
