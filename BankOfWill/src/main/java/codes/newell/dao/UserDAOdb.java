package codes.newell.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import codes.newell.entities.User;
import codes.newell.utilities.ConnectionFactory;
import codes.newell.utilities.ConnectionManager;
import codes.newell.utilities.QueryBuilder;

public class UserDAOdb implements UserDAO {

	@Override
	public User getUserById(Integer id) {
		QueryBuilder<User> qb = new QueryBuilder<>(new User(), QueryBuilder.SELECT_WHERE);

		ConnectionManager cm = ConnectionFactory.buildManager(qb.buildQuery());
		List<Object> params = new ArrayList<>();
		params.add(id);
		try {
			ResultSet rs = cm.executeWithParameters(params);
			rs.next();
			return buildUser(rs);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		QueryBuilder<User> qb = new QueryBuilder<>(new User(), QueryBuilder.SELECT_ALL);
		ConnectionManager cm = ConnectionFactory.buildManager(qb.buildQuery());

		try {
			ResultSet rs = cm.executeWithParameters(new ArrayList<>());
			List<User> results = new ArrayList<>();
			while (rs.next()) {
				results.add(buildUser(rs));
			}
			return results;
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<User> getUsersByAccountId(Integer id) {
		QueryBuilder<User> qb = new QueryBuilder<>(new User(), QueryBuilder.SELECT_WHERE);
		qb.customWhereClause("inner join user_account on id = user_id and account_id = ?");

		ConnectionManager cm = ConnectionFactory.buildManager(qb.buildQuery());
		List<Object> params = new ArrayList<>();
		params.add(id);
		try {
			ResultSet rs = cm.executeWithParameters(params);
			List<User> results = new ArrayList<>();
			while (rs.next()) {
				results.add(buildUser(rs));
			}
			return results;
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User getUserByUsernameAndPassword(User user) {
		QueryBuilder<User> qb = new QueryBuilder<>(new User(), QueryBuilder.SELECT_WHERE);
		qb.customWhereClause("where username = ? and password_hash = ?");

		ConnectionManager cm = ConnectionFactory.buildManager(qb.buildQuery());
		List<Object> params = new ArrayList<>();
		params.add(user.getUsername());
		params.add(user.getPasswordHash());
		try {
			ResultSet rs = cm.executeWithParameters(params);
			rs.next();
			updateUser(user, rs);
			return user;
		} catch (Exception e) {

		}
		return null;
	}

	@Override
	public User createUser(User user) {
		// (first_name, last_name, username, password_hash, is_super)
		QueryBuilder<User> qb = new QueryBuilder<>(new User(), QueryBuilder.CREATE);
		ConnectionManager cm = ConnectionFactory.buildManager(qb.buildQuery());
		List<Object> params = new ArrayList<>();
		params.add(user.getFirstName());
		params.add(user.getLastName());
		params.add(user.getUsername());
		params.add(user.getPasswordHash());
		params.add(user.getAdminStatus());
		try {
			ResultSet rs = cm.executeWithParameters(params);
			rs.next();
			updateUser(user, rs);
			return user;
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User updateUser(User user) {
		// (first_name, last_name, username, password_hash, is_super) where id
		QueryBuilder<User> qb = new QueryBuilder<>(new User(), QueryBuilder.UPDATE);
		ConnectionManager cm = ConnectionFactory.buildManager(qb.buildQuery());
		List<Object> params = new ArrayList<>();
		params.add(user.getFirstName());
		params.add(user.getLastName());
		params.add(user.getUsername());
		params.add(user.getPasswordHash());
		params.add(user.getAdminStatus());
		params.add(user.getId());
		try {
			ResultSet rs = cm.executeWithParameters(params);
			rs.next();
			updateUser(user, rs);
			return user;
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteUserById(Integer id) {
		QueryBuilder<User> qb = new QueryBuilder<>(new User(), QueryBuilder.DELETE);
		ConnectionManager cm = ConnectionFactory.buildManager(qb.buildQuery());
		try {
			cm.executeWithParameter(id);
			return true;
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	private void updateUser(User user, ResultSet rs) throws SQLException {
		user.setId(rs.getInt("id"));
		user.setAdminStatus(rs.getBoolean("is_super"));
		user.setFirstName(rs.getString("first_name"));
		user.setLastName(rs.getString("last_name"));
		user.setUsername(rs.getString("username"));
		user.setPasswordHash(rs.getString("password_hash"));
	}

	private User buildUser(ResultSet rs) throws SQLException {
		User user = new User();
		updateUser(user, rs);
		return user;
	}

	@Override
	public User getUserByUsername(String username) {
		QueryBuilder<User> qb = new QueryBuilder<>(new User(), QueryBuilder.SELECT_WHERE);
		qb.customWhereClause("where username = ?");

		ConnectionManager cm = ConnectionFactory.buildManager(qb.buildQuery());
		try {
			ResultSet rs = cm.executeWithParameter(username);
			rs.next();
			return buildUser(rs);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
