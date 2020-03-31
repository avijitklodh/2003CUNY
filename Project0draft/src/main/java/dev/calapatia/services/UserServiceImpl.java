package dev.calapatia.services;

import dev.calapatia.daos.UserDAO;
import dev.calapatia.daos.UserDAOlocal;
import dev.calapatia.entities.User;


public class UserServiceImpl implements UserServices {
	
	private UserDAO userdao = new UserDAOlocal();

	public User registerNewUser(User user) {
		userdao.createUser(user);
		return user;
	}

}
