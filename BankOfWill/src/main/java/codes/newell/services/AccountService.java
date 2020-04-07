package codes.newell.services;

import java.util.List;

import codes.newell.entities.Account;
import codes.newell.entities.Transaction;
import codes.newell.entities.User;
import codes.newell.utilities.InsufficientFundsException;

public interface AccountService {

	Account openAccount(User user, Account account);

	List<Account> getAccountsByUserId(Integer i);

	Transaction addFunds(Account account, Transaction transaction);

	Transaction withdrawFunds(Account account, Transaction transaction) throws InsufficientFundsException;

	Transaction transferFunds(Transaction transaction) throws InsufficientFundsException;

	boolean closeAccount(Account account, User user);
}
