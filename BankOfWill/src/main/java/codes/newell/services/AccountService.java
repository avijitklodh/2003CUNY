package codes.newell.services;

import java.util.List;

import codes.newell.entities.Account;
import codes.newell.entities.Transaction;
import codes.newell.entities.User;
import codes.newell.utilities.InsufficientFundsException;

public interface AccountService {

	Account openAccount(User user);

	Account openAccount(User user, double amount);

	Account getAccountById(String id);

	List<Account> getAccountsByUserId(String id);

	Transaction addFunds(Account account, double amount);

	Transaction withdrawFunds(Account account, double amount) throws InsufficientFundsException;

	Transaction transferFunds(Transaction transaction) throws InsufficientFundsException;

	Account removeUserFromAccount(User user, Account account);

	boolean closeAccount(Account account);
}
