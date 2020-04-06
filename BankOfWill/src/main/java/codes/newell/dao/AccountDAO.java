package codes.newell.dao;

import java.util.List;

import codes.newell.entities.Account;

public interface AccountDAO {

	Account getAccountById(int id);

	List<Account> getAllAccounts();

	List<Account> getAllAccountsByUserId(int id);

	Account createAccount(Account account);

	Account updateAccount(Account account);

	boolean deleteAccount(Account account);

}
