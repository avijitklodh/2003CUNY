package dev.calapatia.daotests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import dev.calapatia.daos.BankAccountDAO;
import dev.calapatia.daos.BankAccountDAOlocal;
import dev.calapatia.entities.BankAccount;
import dev.calapatia.entities.User;



public class BankAccountDAOtest {
	
	private static BankAccountDAO badao = new BankAccountDAOlocal();
	
	@Before
	public void setup() {
		System.out.println("Testing General ...");
		BankAccount user = new BankAccount();
		
		
		
		BankAccount user2 = new BankAccount();
		
		badao.createAccount(user);
		badao.createAccount(user2);
		
//		System.out.println(user);
//		System.out.println(user2);
//		System.out.println("DAO after updating with user1 and 2:");
//		System.out.println(badao.getAllBankAccount());
	}

//	@Test
//	public void createBankAccount() {
//		BankAccount account = new BankAccount();
//		badao.createAccount(account);
//		System.out.println(account);
//	}
	
//	@Test
//	public void getAllBankAccounts() {
//		System.out.println("I'm in getBankAccount");
//		List<BankAccount> accounts = badao.getAllBankAccount();		
//		System.out.println(accounts);
//		
//	}
	
	@Test
	public void getAllStudentsBySchoolId() {
		
		List<BankAccount> accounts = badao.getAllBankAccountByUserId(0);
		System.out.println(accounts);
	}

}
