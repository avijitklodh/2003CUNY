package codes.newell.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import codes.newell.entities.Transaction;
import codes.newell.utilities.ConnectionFactory;
import codes.newell.utilities.ConnectionManager;
import codes.newell.utilities.QueryBuilder;

public class TransactionLogDAOdb implements TransactionLogDAO {

	@Override
	public Transaction createTransaction(Transaction t) {
		// (amount, message, t_date, from_account, to_account user_id)
		QueryBuilder qb = new QueryBuilder(Transaction.class, QueryBuilder.CREATE);
		ConnectionManager cm = ConnectionFactory.buildManager(qb.buildQuery());
		List<Object> params = new ArrayList<>();
		params.add(t.getAmount());
		params.add(t.getMessage());
		params.add(t.getDate());
		params.add(t.getFromAccount());
		params.add(t.getToAccount());
		params.add(t.getUser());
		try {
			ResultSet rs = cm.executeWithParameters(params);
			rs.next();
			updateTransaction(t, rs);
			return t;
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Transaction getTransactionById(Integer id) {
		QueryBuilder qb = new QueryBuilder(Transaction.class, QueryBuilder.SELECT_WHERE);

		ConnectionManager cm = ConnectionFactory.buildManager(qb.buildQuery());
		List<Object> params = new ArrayList<>();
		params.add(id);
		try {
			ResultSet rs = cm.executeWithParameters(params);
			rs.next();
			return buildTransaction(rs);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Transaction> getTransactionsByUserId(Integer id) {
		QueryBuilder qb = new QueryBuilder(Transaction.class, QueryBuilder.SELECT_WHERE);
		qb.customWhereClause("where user_id = ?");

		ConnectionManager cm = ConnectionFactory.buildManager(qb.buildQuery());
		List<Object> params = new ArrayList<>();
		params.add(id);
		try {
			ResultSet rs = cm.executeWithParameters(params);
			List<Transaction> results = new ArrayList<>();
			while (rs.next()) {
				results.add(buildTransaction(rs));
			}
			return results;
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Transaction> getTransactionsByAccountId(Integer id) {
		QueryBuilder qb = new QueryBuilder(Transaction.class, QueryBuilder.SELECT_WHERE);
		qb.customWhereClause("where to_account = ? or from_account = ?");

		ConnectionManager cm = ConnectionFactory.buildManager(qb.buildQuery());
		List<Object> params = new ArrayList<>();
		params.add(id);
		params.add(id);
		try {
			ResultSet rs = cm.executeWithParameters(params);
			List<Transaction> results = new ArrayList<>();
			while (rs.next()) {
				results.add(buildTransaction(rs));
			}
			return results;
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private static void updateTransaction(Transaction t, ResultSet rs) throws SQLException {
		t.setAmount(rs.getDouble("amount"));
		t.setMessage(rs.getString("message"));
		t.setDate(rs.getString("t_date"));
		t.setFromAccount(rs.getInt("from_account"));
		t.setToAccount(rs.getInt("to_account"));
		t.setUser(rs.getInt("user_id"));
	}

	private Transaction buildTransaction(ResultSet rs) throws SQLException {
		Transaction t = new Transaction();
		updateTransaction(t, rs);
		return t;
	}

	@Override
	public boolean deleteTransactionsByAccountId(Integer id) {
		QueryBuilder qb = new QueryBuilder(Transaction.class, QueryBuilder.DELETE);
		qb.customWhereClause("where to_account = ? or from_account = ?");
		ConnectionManager cm = ConnectionFactory.buildManager(qb.buildQuery());
		List<Object> params = new ArrayList<>();
		params.add(id);
		params.add(id);
		try {
			cm.executeWithParameters(params);
			return true;
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
