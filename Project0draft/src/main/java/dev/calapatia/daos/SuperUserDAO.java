package dev.calapatia.daos;

import java.util.List;

import dev.calapatia.entities.User;

public interface SuperUserDAO {
User createUser(User user);
	
	User getUserById(int id);
	User getUserByUserName(String name); //For Superuser?
	List<User> getAllUsers();
	
	User updateUser(User user);
	
	boolean deleteUser(User user);

}
