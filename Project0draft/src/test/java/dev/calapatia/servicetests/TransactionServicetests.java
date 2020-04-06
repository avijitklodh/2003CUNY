package dev.calapatia.servicetests;

import static org.junit.Assert.*;

import org.junit.Test;

import dev.calapatia.daos.BankAccountDAO;
import dev.calapatia.daos.BankAccountDAOmaria;
import dev.calapatia.entities.BankAccount;
import dev.calapatia.services.TransactionService;
import dev.calapatia.services.TransactionServiceImpl;


public class TransactionServicetests {
	
	private static TransactionService ts = new TransactionServiceImpl();
	public static BankAccountDAO badao = new BankAccountDAOmaria();

	@Test
	public void depositTest() {

		
		BankAccount deposit = new BankAccount();
		
		deposit.setBankAccountId(6);
		deposit.getBalance();
		deposit.setAmount(700);
		
	//	BankAccount account =  badao.getBankAccountById(3);
		ts.deposit(deposit);

		

		
	}
	
	@Test
	public void withdrawTest() {

		
		BankAccount withdraw = new BankAccount();
		withdraw.setBankAccountId(3);
		withdraw.setBalance(5000);
		System.out.println("Test"+withdraw.getBalance());
		withdraw.setAmount(1000);
		

		ts.withdraw(withdraw);
		
	}

}
