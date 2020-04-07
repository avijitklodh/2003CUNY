package codes.newell.dao;

import java.util.List;

import codes.newell.entities.Account;

public interface AccountDAO {

	Account getAccountById(Integer id);

	List<Account> getAllAccounts();

	List<Account> getAccountsByUserId(Integer id);

	Account createAccount(Account account);

	Account updateAccount(Account account);

	boolean deleteAccountById(Integer id);

}
