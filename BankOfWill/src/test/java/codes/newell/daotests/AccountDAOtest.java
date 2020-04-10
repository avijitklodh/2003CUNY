package codes.newell.daotests;

import static org.junit.Assume.assumeNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import codes.newell.dao.AccountDAO;
import codes.newell.dao.AccountDAOdb;
import codes.newell.entities.Account;

@DisplayName("Account database api tests")
class AccountDAOtest {

	static AccountDAO adao = new AccountDAOdb();

	@DisplayName("Test all single-account CRUD operations on an example account")
	static class FullCRUDTest {

		static Account expected;

		@BeforeAll
		static void createUser() {
			Account test = new Account();
			test.setBalance(2000.0);
			test.setNickname("test");
			FullCRUDTest.expected = adao.createAccount(test);
		}

		@BeforeEach
		void assumptions() {
			assumeNotNull(expected);
		}

		@Test
		void getAccountById() {
			Account actual = adao.getAccountById(expected.getId());
			assertTrue(expected.equals(actual));
		}

		@Test
		void updateAccount() {
			expected.setBalance(20300);
			Account actual = adao.updateAccount(expected);
			assertTrue(expected.equals(actual));
		}

		@Test
		void deleteUserById() {
			assertTrue(adao.deleteAccountById(expected.getId()));
		}
	}

}
