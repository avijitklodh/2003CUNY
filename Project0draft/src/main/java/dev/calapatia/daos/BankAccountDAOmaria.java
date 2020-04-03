package dev.calapatia.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dev.calapatia.entities.BankAccount;
import dev.calapatia.utils.ConnectionUtil;







public class BankAccountDAOmaria implements BankAccountDAO {

	@Override
	public BankAccount createAccount(BankAccount account) {
		try(Connection conn = ConnectionUtil.createConnection()){
			String sql = "INSERT INTO Project0.BANKACCOUNT VALUES (?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setInt(1, 0);
			ps.setInt(2, account.getBalance());
			ps.setInt(3, account.getUserId());
			ps.execute();
			
			ResultSet rs = ps.getGeneratedKeys();
			rs.next();// gets first record
			
			int key = rs.getInt("STUDENT_ID");
			account.setBankAccountId(key);
			return account;		
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public BankAccount getBankAccountById(int id) {
		
		try(Connection conn = ConnectionUtil.createConnection()){
			String sql = "SELECT * FROM BANKACCOUNT WHERE BANK_ACCOUNT_ID = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();			
			rs.next();
			
			BankAccount account = new BankAccount();			
			account.setBankAccountId(rs.getInt("BANK_ACCOUNT_ID"));
			account.setBalance(rs.getInt("BALANCE"));
			account.setUserId(rs.getInt("USER_ID"));
			
			return account;			
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<BankAccount> getAllBankAccount() {
		try(Connection conn = ConnectionUtil.createConnection()){
			String sql = "SELECT * FROM BANKACCOUNT";
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			
			List<BankAccount> accounts = new ArrayList<BankAccount>();
			
			while(rs.next()) {
				
				BankAccount account = new BankAccount();			
				account.setBankAccountId(rs.getInt("BANK_ACCOUNT_ID"));
				account.setBalance(rs.getInt("BALANCE"));
				account.setUserId(rs.getInt("USER_ID"));
				accounts.add(account);
				
			}
			
			return accounts;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<BankAccount> getAllBankAccountByUserId(int id) {
	
		try(Connection conn = ConnectionUtil.createConnection()){
			String sql = "SELECT * FROM BANKACCOUNT WHERE USER_ID = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			
			List<BankAccount> accounts = new ArrayList<BankAccount>();
			
			while(rs.next()) {
				
				BankAccount account = new BankAccount();			
				account.setBankAccountId(rs.getInt("BANK_ACCOUNT_ID"));
				account.setBalance(rs.getInt("BALANCE"));
				account.setUserId(rs.getInt("USER_ID"));
				accounts.add(account);
				
			}
			
			return accounts;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public BankAccount updateBankAccount(BankAccount account) {
		return account;
//try(Connection conn = ConnectionUtil.createConnection()){
//			
//			String sql = "UPDATE Project0.BANKACCOUNT SET BANK_ACCOUNT_ID = ?, BALANCE = ? WHERE USER_ID = ?";
//			PreparedStatement ps = conn.prepareStatement(sql);
//			ps.setInt(1, account.getBankAccountId());
//			ps.setInt(2, account.getBalance());
//			ps.setInt(3, account.getUserId());
//			ps.execute();
//			
//			return account;
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//			return null;
//		}
	}

	@Override
	public boolean deleteAccount(BankAccount account) {
		try(Connection conn = ConnectionUtil.createConnection()){
			String sql = "DELETE FROM BANKACCOUNT WHERE BANK_ACCOUNT_ID = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, account.getBankAccountId());
			boolean success = ps.execute();
			
			return success;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

}
