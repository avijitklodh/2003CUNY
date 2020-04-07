package codes.newell.services;

import java.util.List;

import codes.newell.dao.UserDAO;
import codes.newell.dao.UserDAOdb;
import codes.newell.entities.User;

public class AdminServiceImpl implements AdminService {

	static UserDAO udao = new UserDAOdb();

	@Override
	public List<User> getAllUsers() {
		return udao.getAllUsers();
	}

	@Override
	public List<User> getUsersByAccountId(Integer id) {
		return udao.getUsersByAccountId(id);
	}

	@Override
	public User getUserById(Integer id) {
		return udao.getUserById(id);
	}

	@Override
	public User createUser(User user) {
		return udao.createUser(user);
	}

	@Override
	public User updateUser(User user) {
		return udao.updateUser(user);
	}

	@Override
	public boolean deleteUserById(Integer id) {
		// TODO: need to withdraw all money in accounts owned only by the user
		return udao.deleteUserById(id);
	}

}
