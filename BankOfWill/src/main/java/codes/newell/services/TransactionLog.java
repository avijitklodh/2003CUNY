package codes.newell.services;

import java.util.List;

import codes.newell.entities.Transaction;

public interface TransactionLog {
	List<Transaction> getTransactionsByUserId(Integer id);

	List<Transaction> getTransactionsByAccountId(Integer id);

	boolean deleteTransactionsByAccountId(Integer id);
}
