package dev.calapatia.services;

import dev.calapatia.daos.BankAccountDAO;
import dev.calapatia.daos.BankAccountDAOmaria;
import dev.calapatia.daos.UserDAO;
import dev.calapatia.daos.UserDAOmaria;
import dev.calapatia.entities.BankAccount;
import dev.calapatia.entities.User;



public class TransactionServiceImpl implements TransactionService {
	
	private UserDAO udao = new UserDAOmaria();
	private BankAccountDAO badao = new BankAccountDAOmaria();

	
	public BankAccount deposit(BankAccount account) {
		int transaction;
		account.setBankAccountId(account.getBankAccountId());
		
		transaction = (account.getBalance()+account.getAmount());
	//	System.out.println("I'm in services"+transaction);
		account.setBalance(transaction);
		System.out.println(account);
		this.badao.updateBankAccount(account);	
		return account;
	}

	@Override
	public BankAccount withdraw(BankAccount account) {
		int transaction;
		account.setBankAccountId(account.getBankAccountId());
		this.badao.updateBankAccount(account);	
		transaction = (account.getBalance()-account.getAmount());
		//System.out.println("que" +account.getBalance());
		System.out.println("I'm in services"+transaction);
		account.setBalance(transaction);
		if(transaction<0) {
			System.out.println("You dont have enough money to withdraw that amount");
		}else
		System.out.println(account);
		return account;
	}

}
