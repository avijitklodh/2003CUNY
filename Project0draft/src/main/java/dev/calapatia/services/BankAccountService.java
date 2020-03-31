package dev.calapatia.services;

import dev.calapatia.entities.User;
import dev.calapatia.entities.BankAccount;

public interface BankAccountService {
	
	// service responsible for signing up new users
		// service responsible for view, create, update, and delete actions for existing users
		// service that users can withdraw and deposit
	
	BankAccount createNewAccount(BankAccount account);
	
	BankAccount viewAccount(BankAccount account, User user);
	
	BankAccount withdraw(BankAccount account, User user);
	
	BankAccount deposit(BankAccount account, User user);
	
	BankAccount deleteAccount(BankAccount account);
	
	

}
