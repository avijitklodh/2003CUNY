package dev.calapatia.daos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dev.calapatia.entities.BankAccount;
//import dev.ranieri.entities.Student;




public class BankAccountDAOlocal implements BankAccountDAO {
	
	private static Map<Integer,BankAccount> bankAccount_table = new HashMap<Integer,BankAccount>();
	private static int idGenerator = 201;
	
	

	public BankAccount createAccount(BankAccount account) {
		account.setBankAccountId(idGenerator);
		idGenerator++;
		
		bankAccount_table.put(account.getBankAccountId(), account);
		
		return account;
	}

	public BankAccount getBankAccountById(int id) {
		return bankAccount_table.get(id);
	}

	public List<BankAccount> getAllBankAccount() {
		List<BankAccount> accounts = new ArrayList<BankAccount>(bankAccount_table.values());
		return accounts;
	}

	public List<BankAccount> getAllBankAccountByUserId(int id) {
List<BankAccount> userAccounts = new ArrayList<BankAccount>();
		
		for(BankAccount b : getAllBankAccount()) {
			
			if(b.getUserId() == id)
				userAccounts.add(b);
		}
		
		
		return userAccounts;
	}

	public BankAccount updateBankAccount(BankAccount account) {
		bankAccount_table.put(account.getBankAccountId(), account);
		return account;
	}

	public boolean deleteAccount(BankAccount account) {
		bankAccount_table.remove(account.getBankAccountId());
		return true;
	}
	
	

}
