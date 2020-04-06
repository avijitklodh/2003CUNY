package codes.newell.dao;

import java.util.List;

import codes.newell.entities.User;

public interface UserDAO {

	User getUserById(Integer id);

	User getUserByUsernameAndPassword(User user);

	List<User> getAllUsers();

	List<User> getAllUsersByAccountId(Integer id);

	User createUser(User user);

	User updateUser(User user);

	boolean deleteUserById(Integer id);

}
