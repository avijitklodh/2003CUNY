package dev.calapatia.services;

import dev.calapatia.daos.BankAccountDAO;
import dev.calapatia.daos.BankAccountDAOlocal;
import dev.calapatia.daos.UserDAO;
import dev.calapatia.daos.UserDAOlocal;
import dev.calapatia.entities.BankAccount;
import dev.calapatia.entities.User;
//import dev.ranieri.entities.School;

public class BankAccountServiceImpl implements BankAccountService {
	
	private UserDAO userdao = new UserDAOlocal();
	private BankAccountDAO bankaccountdao = new BankAccountDAOlocal();

	public BankAccount createNewAccount(BankAccount account) {
		this.bankaccountdao.createAccount(account);
		return account;
	}

	public BankAccount viewAccount(BankAccount account, User user) {
	this.bankaccountdao.getBankAccountById(user.getUserId());
	return account;
	}

	public BankAccount withdraw(BankAccount account, User user) {
		User currentUser = userdao.getUserById(user.getUserId());
		currentUser.get
	}
	
//	public BankAccount deposit(BankAccount account, User user) {
//		
//	}

	public BankAccount deleteAccount(BankAccount account) {
		this.bankaccountdao.deleteAccount(account);
		User user = userdao.getUserById(account.getUserId());
		user.getAccounts().remove(account);
		account.setBankAccountId(-1);
		return account;
	}

public BankAccount deposit(BankAccount account, User user) {
	// TODO Auto-generated method stub
	return null;
}

	

}
