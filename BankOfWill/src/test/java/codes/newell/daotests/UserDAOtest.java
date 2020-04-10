package codes.newell.daotests;

import static org.junit.Assume.assumeNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import codes.newell.dao.UserDAO;
import codes.newell.dao.UserDAOdb;
import codes.newell.entities.User;
import codes.newell.utilities.Hasher;

@DisplayName("User database api tests")
class UserDAOtest {

	static UserDAO udao = new UserDAOdb();

	@DisplayName("Test all single-person CRUD operations on an example user")
	static class FullCRUDTest {

		static User expected;

		@BeforeAll
		static void createUser() {
			User will = new User();
			will.setName("Will Newell");
			will.setUsername("testytestertest");
			will.setPasswordHash(Hasher.hash("dudewhere'smypassword"));
			FullCRUDTest.expected = udao.createUser(will);
		}

		@BeforeEach
		void assumptions() {
			assumeNotNull(expected);
		}

		@Test
		void getUserByUsernameAndPassword() {
			User will = new User();
			will.setUsername("testytestertest");
			will.setPasswordHash(Hasher.hash("dudewhere'smypassword"));
			User actual = udao.getUserByUsernameAndPassword(will);
			assertTrue(expected.equals(actual));
		}

		@Test
		void getUserById() {
			User actual = udao.getUserById(expected.getId());
			assertTrue(expected.equals(actual));
		}

		@Test
		void updateUser() {
			expected.setName("Will NotNewell");
			User actual = udao.updateUser(expected);
			assertTrue(expected.equals(actual));
		}

		@Test
		void deleteUserById() {
			assertTrue(udao.deleteUserById(expected.getId()));
		}
	}

	@Test
	void getAllUsers() {
		List<User> users = udao.getAllUsers();
		assertTrue(users.size() > 0);
	}

	@Test
	void getAllUsersByAccountId() {
		// TODO: write test
		assertTrue(true);
	}

}
