package codes.newell.dao;

import java.util.List;

import codes.newell.entities.User;

public interface UserDAO {

	User getUserById(String id);

	List<User> getAllUsers();

	List<User> getAllUsersByAccountId(String id);

	User createUser(User user);

	User updateUser(User user);

	boolean deleteUser(User user);

}
