package codes.newell.services;

import java.util.List;

import codes.newell.entities.User;

public interface AdminService {
	List<User> getAllUsers();

	List<User> getUsersByAccountId(String id);

	User getUserById(String id);

	User createUser(User user);

	User updateUser(User user);

	boolean deleteUser(User user);
}
