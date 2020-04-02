package codes.newell.services;

import java.util.List;

import codes.newell.entities.Account;
import codes.newell.entities.BankCurrency;
import codes.newell.entities.Transaction;
import codes.newell.entities.User;
import codes.newell.utilities.InsufficientFundsException;

public class AccountServiceImpl implements AccountService {

	public AccountServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Account openAccount(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account getAccountById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getAccountsByUserId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	private static boolean canTransact(Account account, BankCurrency amount) {
		BankCurrency copy = new BankCurrency();
		copy.setRawValue(account.getBalance().getRawValue());
		copy.add(amount);
		return copy.getRawValue().doubleValue() > 0;
	}

	@Override
	public Transaction withdrawFunds(Account account, BankCurrency amount) throws InsufficientFundsException {
		if (canTransact(account, amount)) {
			BankCurrency balance = account.getBalance();
			balance.add(amount);
			// TODO: make transaction && add to log
		} else {
			throw new InsufficientFundsException();
		}
		return new Transaction();
	}

	@Override
	public Account removeUserFromAccount(User user, Account account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean closeAccount(Account account) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account openAccount(User user, BankCurrency amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaction addFunds(Account account, BankCurrency amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaction transferFunds(Transaction transaction) throws InsufficientFundsException {
		// TODO Auto-generated method stub
		return null;
	}

}
