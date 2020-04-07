package codes.newell.dao;

import java.util.List;

import codes.newell.entities.Transaction;

public interface TransactionLogDAO {

	Transaction createTransaction(Transaction transaction);

	Transaction getTransactionById(Integer id);

	List<Transaction> getTransactionsByUserId(Integer id);

	List<Transaction> getTransactionsByAccountId(Integer id);
}
