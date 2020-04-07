package codes.newell.services;

import java.util.List;

import codes.newell.dao.AccountDAO;
import codes.newell.dao.AccountDAOdb;
import codes.newell.dao.TransactionLogDAO;
import codes.newell.dao.TransactionLogDAOdb;
import codes.newell.dao.UserAccountDAO;
import codes.newell.dao.UserAccountDAOdb;
import codes.newell.dao.UserDAO;
import codes.newell.dao.UserDAOdb;
import codes.newell.entities.Account;
import codes.newell.entities.Transaction;
import codes.newell.entities.User;
import codes.newell.utilities.InsufficientFundsException;

public class AccountServiceImpl implements AccountService {

	static AccountDAO adao = new AccountDAOdb();
	static UserDAO udao = new UserDAOdb();
	static UserAccountDAO uadao = new UserAccountDAOdb();
	static TransactionLogDAO tdao = new TransactionLogDAOdb();

	@Override
	public Account openAccount(User user, Account account) {
		account = adao.createAccount(account);
		uadao.AddUserAccount(user.getId(), account.getId());
		if (account.getBalance() > 0) {
			Transaction t = new Transaction();
			t.setAmount(account.getBalance());
			t.setFromAccount(account.getId());
			t.setToAccount(account.getId());
			t.setUser(user.getId());
			t.setMessage("initial balance");
			tdao.createTransaction(t);
		}
		return account;
	}

	@Override
	public Transaction withdrawFunds(Account account, Transaction t) throws InsufficientFundsException {
		final double newBalance = account.getBalance() - t.getAmount();
		if (newBalance >= 0) {
			account.setBalance(newBalance);
			adao.updateAccount(account);
			t.setToAccount(1);
			tdao.createTransaction(t);
		} else {
			throw new InsufficientFundsException();
		}
		return t;
	}

	@Override
	public boolean closeAccount(Account account, User user) {
		if (account.getBalance() != 0) {
			Transaction t = new Transaction();
			t.setAmount(account.getBalance());
			t.setFromAccount(user.getId());
			t.setToAccount(1);
			t.setMessage("Final withdrawl to close account");
			try {
				withdrawFunds(account, t);
			} catch (InsufficientFundsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		}

		uadao.removeAccount(account.getId());
		adao.deleteAccountById(account.getId());
		return true;

	}

	@Override
	public Transaction addFunds(Account account, Transaction t) {
		account.setBalance(account.getBalance() + t.getAmount());
		adao.updateAccount(account);
		t.setFromAccount(1);
		tdao.createTransaction(t);
		return t;
	}

	@Override
	public Transaction transferFunds(Transaction t) throws InsufficientFundsException {
		Account from = adao.getAccountById(t.getFromAccount());
		Account to = adao.getAccountById(t.getToAccount());
		final double newBalance = from.getBalance() - t.getAmount();
		if (newBalance < 0)
			throw new InsufficientFundsException();
		from.setBalance(newBalance);
		to.setBalance(to.getBalance() + t.getAmount());
		adao.updateAccount(from);
		adao.updateAccount(to);
		tdao.createTransaction(t);
		return t;
	}

	@Override
	public List<Account> getAccountsByUserId(Integer id) {
		return adao.getAccountsByUserId(id);
	}

}
