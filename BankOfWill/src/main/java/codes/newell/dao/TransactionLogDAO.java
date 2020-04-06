package codes.newell.dao;

import java.util.List;

import codes.newell.entities.Transaction;

public interface TransactionLogDAO {

	Transaction createTransaction(Transaction transaction);

	Transaction getTransactionById(int id);

	List<Transaction> getTransactionsByUserId(int id);

	List<Transaction> getTransactionsByAccountId(int id);
}
