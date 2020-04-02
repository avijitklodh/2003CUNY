package dev.calapatia.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import dev.calapatia.entities.User;
import dev.calapatia.utils.ConnectionUtil;
//import dev.ranieri.utils.ConncetionUtil;
//import dev.ranieri.entities.School;
//import dev.ranieri.utils.ConncetionUtil;
//import dev.ranieri.utils.ConncetionUtil;


public class UserDAOmaria implements UserDAO {

	public User createUser(User user) {
		return user;
//		try(Connection conn = ConnectionUtil.createConnection()){
//			String sql = "INSERT INTO Project 0.SCHOOL VALUES (?,?,?,?)";
//			// when you first save an object it has an id of 0
//			// please return the primary key of the object we just saved
//			PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//			ps.setInt(1, 0);
//			ps.setString(2,school.getName());
//			ps.setInt(3, school.getPhone());
//			ps.setInt(4, school.getCapacity());
//			ps.execute(); // execute the insert statement
//			
//			ResultSet rs = ps.getGeneratedKeys();
//			rs.next();
//			int key = rs.getInt("SCHOOL_ID");
//			
//			school.setSchoolId(key);
//			return school;
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//			return null;
//		}
		
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



	public User updateUser(User user) {
		// TODO Auto-generated method stub
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
