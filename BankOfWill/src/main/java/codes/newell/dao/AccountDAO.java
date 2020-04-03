package codes.newell.dao;

import java.util.List;

import codes.newell.entities.Account;

public interface AccountDAO {

	Account getAccountById(String id);

	List<Account> getAllAccounts();

	List<Account> getAllAccountsByUserId(String id);

	Account createAccount(Account account);

	Account updateAccount(Account account);

	boolean deleteAccount(Account account);

}
