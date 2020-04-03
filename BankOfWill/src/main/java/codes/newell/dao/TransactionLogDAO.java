package codes.newell.dao;

import java.util.List;

import codes.newell.entities.Transaction;

public interface TransactionLogDAO {

	Transaction createTransaction(Transaction transaction);

	Transaction getTransactionById(String id);

	List<Transaction> getTransactionsByUserId(String id);

	List<Transaction> getTransactionsByAccountId(String id);
}
