package dev.calapatia.daos;

import java.util.List;

import dev.calapatia.entities.User;

public interface UserDAO {
	
	// DAOs should have all CRUD functionality
		//CREATE
		//READ
		//UPDATE
		//DELETE
	User getUserById(int id);
	
	User createUser(User user);

	
	boolean deleteUser(User user);

}
