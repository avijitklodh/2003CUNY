package codes.newell.dao;

import java.util.List;

import codes.newell.entities.User;

public interface UserDAO {

	User getUserById(String id);

	User getUserByUsernameAndPassword(User user);

	List<User> getAllUsers();

	List<User> getAllUsersByAccountId(String id);

	User createUser(User user);

	User updateUser(User user);

	boolean deleteUserById(String id);

}
