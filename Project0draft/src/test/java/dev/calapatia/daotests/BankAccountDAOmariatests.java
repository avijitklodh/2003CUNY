package dev.calapatia.daotests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import dev.calapatia.daos.BankAccountDAO;
import dev.calapatia.daos.BankAccountDAOmaria;
import dev.calapatia.entities.BankAccount;





public class BankAccountDAOmariatests {

	public static BankAccountDAO badao = new BankAccountDAOmaria();
	
	@Test
	public void createBankAccount() {
		BankAccount launderingacct = new BankAccount();
		launderingacct.setBankAccountId(1);
		launderingacct.setUserId(1);
		badao.createAccount(launderingacct);
		System.out.println(launderingacct);
	}
	
	@Test
	public void getAllBankAccounts() {
		List<BankAccount> accounts = badao.getAllBankAccount();
		System.out.println(accounts);
	}
	
	@Test
	public void getBankAccountsById() {
		BankAccount accounts = badao.getBankAccountById(1);
		System.out.println(accounts);
	}
	
	@Test
	public void getAllBankAccountsByUserId() {
		List <BankAccount> accounts = badao.getAllBankAccountByUserId(1);
		System.out.println(accounts);
	}
//	@Test
//	public void updateBankAccount() {
//		BankAccount something = badao.getSchoolById(2);
//		something.setName("Super Coral Glades");
//		schooldao.updateSchool(coral);
//		System.out.println(coral);
//	}
	
	@Test
	public void deleteBankAccount() {
		BankAccount delete = badao.getBankAccountById(4);
		badao.deleteAccount(delete);
	}

}
