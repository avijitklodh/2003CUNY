package codes.newell.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import codes.newell.entities.Account;
import codes.newell.utilities.ConnectionFactory;
import codes.newell.utilities.ConnectionManager;
import codes.newell.utilities.QueryBuilder;

public class AccountDAOdb implements AccountDAO {

	@Override
	public Account getAccountById(Integer id) {
		QueryBuilder<Account> qb = new QueryBuilder<>(new Account(), QueryBuilder.SELECT_WHERE);

		ConnectionManager cm = ConnectionFactory.buildManager(qb.buildQuery());
		List<Object> params = new ArrayList<>();
		params.add(id);
		try {
			ResultSet rs = cm.executeWithParameters(params);
			rs.next();
			return buildAccount(rs);
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
	public List<Account> getAllAccounts() {
		QueryBuilder<Account> qb = new QueryBuilder<>(new Account(), QueryBuilder.SELECT_ALL);
		ConnectionManager cm = ConnectionFactory.buildManager(qb.buildQuery());

		try {
			ResultSet rs = cm.executeWithParameters(new ArrayList<>());
			List<Account> results = new ArrayList<>();
			while (rs.next()) {
				results.add(buildAccount(rs));
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
	public List<Account> getAccountsByUserId(Integer id) {
		QueryBuilder<Account> qb = new QueryBuilder<>(new Account(), QueryBuilder.SELECT_WHERE);
		qb.customWhereClause("inner join user_account on id = account_id and user_id = ?");

		ConnectionManager cm = ConnectionFactory.buildManager(qb.buildQuery());
		List<Object> params = new ArrayList<>();
		params.add(id);
		try {
			ResultSet rs = cm.executeWithParameters(params);
			List<Account> results = new ArrayList<>();
			while (rs.next()) {
				results.add(buildAccount(rs));
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
	public Account createAccount(Account account) {
		// (first_name, last_name, username, password_hash, is_super)
		QueryBuilder<Account> qb = new QueryBuilder<>(account, QueryBuilder.CREATE);
		ConnectionManager cm = ConnectionFactory.buildManager(qb.buildQuery());
		List<Object> params = new ArrayList<>();
		params.add(account.getBalance());
		params.add(account.getNickname());
		try {
			ResultSet rs = cm.executeWithParameters(params);
			rs.next();
			updateAccount(account, rs);
			return account;
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
	public Account updateAccount(Account account) {
		QueryBuilder<Account> qb = new QueryBuilder<>(account, QueryBuilder.UPDATE);
		ConnectionManager cm = ConnectionFactory.buildManager(qb.buildQuery());
		List<Object> params = new ArrayList<>();
		params.add(account.getBalance());
		params.add(account.getNickname());
		params.add(account.getId());
		try {
			ResultSet rs = cm.executeWithParameters(params);
			rs.next();
			updateAccount(account, rs);
			return account;
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
	public boolean deleteAccountById(Integer id) {
		QueryBuilder<Account> qb = new QueryBuilder<>(new Account(), QueryBuilder.DELETE);
		ConnectionManager cm = ConnectionFactory.buildManager(qb.buildQuery());
		try {
			cm.executeWithParameter(id);
			return true;
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	private void updateAccount(Account account, ResultSet rs) throws SQLException {
		account.setId(rs.getInt("id"));
		account.setBalance(rs.getDouble("balance"));
		account.setNickname(rs.getString("nickname"));
	}

	private Account buildAccount(ResultSet rs) throws SQLException {
		Account account = new Account();
		updateAccount(account, rs);
		return account;
	}

}
