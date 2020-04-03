package codes.newell.services;

import java.util.List;

import codes.newell.entities.Transaction;

public interface TransactionLog {
	List<Transaction> getTransactionsByUserId(String id);

	List<Transaction> getTransactionsByAccountId(String id);

	Transaction addTransaction(Transaction transaction);
}
