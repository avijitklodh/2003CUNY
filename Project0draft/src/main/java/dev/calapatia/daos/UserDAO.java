package dev.calapatia.daos;

import java.util.List;

import dev.calapatia.entities.User;

public interface UserDAO {
	
	// DAOs should have all CRUD functionality
		//CREATE
		//READ
		//UPDATE
		//DELETE
	
	User createUser(User user);
	
	User getUserById(int id);
	User getUserByName(String name); //For Superuser?
	List<User> getAllUsers();
	
	User updateUser(User user);
	
	boolean deleteUser(User user);

}
