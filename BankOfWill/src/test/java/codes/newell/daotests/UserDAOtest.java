package codes.newell.daotests;

import static org.junit.Assume.assumeNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Ignore;
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

	@DisplayName("Test all single-person CRUD operations on an example user")
	static class FullCRUDTest {
		static UserDAO udao = new UserDAOdb();

		static User expected;

		@BeforeAll
		static void createUser() {
			User will = new User();
			will.setName("Will Newell");
			will.setUsername("newell");
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
			will.setUsername("newell");
			will.setPasswordHash(Hasher.hash("dudewhere'smypassword"));
			User actual = udao.getUserByUsernameAndPassword(will);
			assertEquals(expected, actual);
		}

		@Test
		void getUserById() {
			User actual = udao.getUserById(expected.getId());
			assertEquals(expected, actual);
		}

		@Test
		void updateUser() {
			expected.setName("Will NotNewell");
			User actual = udao.updateUser(expected);
			assertEquals(expected, actual);
		}

		@Test
		void deleteUserById() {
			assertTrue(udao.deleteUserById(expected.getId()));
		}
	}

	@Test
	@Ignore
	void getAllUsers() {
		// TODO: write test
		assertTrue(false);
	}

	@Test
	@Ignore
	void getAllUsersByAccountId() {
		// TODO: write test
		assertTrue(false);
	}

}
