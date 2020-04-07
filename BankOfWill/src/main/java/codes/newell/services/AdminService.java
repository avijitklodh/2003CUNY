package codes.newell.services;

import java.util.List;

import codes.newell.entities.User;

public interface AdminService {
	List<User> getAllUsers();

	List<User> getUsersByAccountId(Integer id);

	User getUserById(Integer id);

	User createUser(User user);

	User updateUser(User user);

	boolean deleteUserById(Integer id);
}
