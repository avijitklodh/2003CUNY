package dev.calapatia.services;

import dev.calapatia.entities.BankAccount;


//service responsible for depositing money
//withdrawing money


public interface TransactionService {
	
	
	BankAccount withdraw(BankAccount account);
	BankAccount deposit(BankAccount account);
	

}
