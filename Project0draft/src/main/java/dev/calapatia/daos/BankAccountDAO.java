package dev.calapatia.daos;

import java.util.List;

import dev.calapatia.entities.BankAccount;

public interface BankAccountDAO {
	
BankAccount createAccount(BankAccount account);
	
BankAccount getBankAccountById(int id);
List<BankAccount> getAllBankAccount();
List<BankAccount> getAllBankAccountByUserId(int id);
	
BankAccount updateBankAccount(BankAccount account);
	
	boolean deleteAccount(BankAccount account);

}
