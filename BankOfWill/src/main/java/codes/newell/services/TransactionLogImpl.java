package codes.newell.services;

import java.util.List;

import codes.newell.dao.TransactionLogDAO;
import codes.newell.dao.TransactionLogDAOdb;
import codes.newell.entities.Transaction;

public class TransactionLogImpl implements TransactionLog {
	static TransactionLogDAO tdao = new TransactionLogDAOdb();

	@Override
	public List<Transaction> getTransactionsByUserId(Integer id) {
		return tdao.getTransactionsByUserId(id);
	}

	@Override
	public List<Transaction> getTransactionsByAccountId(Integer id) {
		return tdao.getTransactionsByAccountId(id);
	}

}
