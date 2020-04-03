package codes.newell.daotests;

import org.junit.jupiter.api.Test;

import codes.newell.dao.UserDAO;
import codes.newell.dao.UserDAOdb;
import codes.newell.entities.User;
import codes.newell.utilities.Hasher;

class UserDAOtest {

	UserDAO udao = new UserDAOdb();

	@Test
	void getUserByUsernameAndPassword() {
		User will = new User();
		will.setUsername("newellwm");
		will.setPasswordHash(Hasher.hash("dudewhere'smypassword"));

	}

	@Test
	void createUser() {
		User will = new User();
		will.setName("Will Newell");
		will.setUsername("newellwm");
		will.setPasswordHash(Hasher.hash("dudewhere'smypassword"));
	}

}
