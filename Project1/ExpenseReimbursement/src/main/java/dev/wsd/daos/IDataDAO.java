package dev.wsd.daos;
 
 

import java.util.ArrayList;

import dev.wsd.collections.*;
import dev.wsd.entities.*;


/**
 * @author Admin
 * @version 1.0
 * @created 07-Apr-2020 8:56:24 AM
 */
public interface IDataDAO {

	public AccountTypeCollection<AccountType> getAccountTypes();

	public TransTypeCollection<TransactionType> getTransactionTypes() ;
	
	public  AccountType  getAccountTypeById(int id);

	public  TransactionType getTransactionTypeById(int id) ;
	
	public ArrayList<Department> getAllDepartments();
	public Department getDepartmentById(int id);

}