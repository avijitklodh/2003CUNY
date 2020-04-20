package dev.wsd.services;

import java.sql.SQLException;
import java.util.Set;

import dev.wsd.daos.UserDAO;
import dev.wsd.entities.*;

/**
 * @author Admin
 * @version 1.0
 * @created 07-Apr-2020 8:56:24 AM
 */
public class CrudRepository {

	public CrudRepository() {

	}

	public static ICrudRepository AdminServiceOperation = new ICrudRepository() {

		@Override
		public boolean update(User user) {
			// TODO Auto-generated method stub
			return UserDAO.UserDAOImplementaion.update(user);
		}

		@Override
		public User save(User user) {
			// TODO Auto-generated method stub
			return UserDAO.UserDAOImplementaion.save(user);
		}

		@Override
		public Set<User> findall() throws SQLException {
			// TODO Auto-generated method stub
			return UserDAO.UserDAOImplementaion.findall();
		}

		@Override
		public User findUserById(int id) {
			// TODO Auto-generated method stub
			return UserDAO.UserDAOImplementaion.findUserById(id);
		}

		@Override
		public boolean deleteById(int id) {
			// TODO Auto-generated method stub
			return UserDAO.UserDAOImplementaion.deleteById(id);
		}
	};

}