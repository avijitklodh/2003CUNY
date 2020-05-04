package dev.wsd.daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dev.wsd.collections.*;
import dev.wsd.entities.*;

import dev.wsd.utils.*;

/**
 * @author Admin
 * @version 1.0
 * @created 07-Apr-2020 8:56:23 AM
 */
public class AccountDAOmaria {

	public AccountDAOmaria() {

	}

	public static IAccountDAO AccountDAOImplementaion = new IAccountDAO() {

		/**
		 * 
		 * @param userAccount
		 */
		public UserAccount openAccount(UserAccount userAccount) {
			// INSERT INTO banksysdb.tbl_userAccount (UserId, AccountNum, AccountTypeId,
			// CreateDate, CurrentBalance, IsActive) VALUES(NULL, NULL, 0, curdate(), 0,
			// b'1');

			try (Connection con = DBConnectionUtil.openCon();
					PreparedStatement ps = con.prepareStatement(
							"INSERT INTO banksysdb.tbl_userAccount (UserId, AccountNum, AccountTypeId, CurrentBalance) VALUES(?, ?, ?, ?)",
							Statement.RETURN_GENERATED_KEYS);) {

				ps.setInt(1, userAccount.getUser().getId());
				ps.setString(2, userAccount.getAccountNum());
				ps.setInt(3, userAccount.getAccountType().getId());
				ps.setInt(4, userAccount.getCurrentBalance());
				ps.execute();
				ResultSet rs = ps.getGeneratedKeys();
				rs.next();// gets first record

				int id = rs.getInt("ID");
				userAccount.setId(id);
				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {

			}

			return userAccount;
		}

		/**
		 * 
		 * @param userAccount
		 */
		public UserAccount closeAccount(UserAccount userAccount) {
			// UPDATE banksysdb.tbl_userAccount SET UserId=NULL, AccountNum=NULL,
			// AccountTypeId=0, CreateDate=curdate(), CurrentBalance=0, IsActive=b'1' WHERE
			// ID=0;

			try (Connection con = DBConnectionUtil.openCon();
					PreparedStatement statement = con
							.prepareStatement("UPDATE banksysdb.tbl_userAccount SET IsActive= ? WHERE ID= ? ");) {

				statement.setBoolean(1, false);
				statement.setInt(2, userAccount.getId());
				statement.execute();
				statement.close();

			} catch (SQLException e) {

				e.printStackTrace();
			} finally {

			}
			return userAccount;
		}

		/**
		 * 
		 * @param userAccount
		 */
		public UserAccount updateAccount(UserAccount userAccount) {
			return null;
		}

		/**
		 * 
		 * @param val
		 */

		/**
		 * 
		 * @param userid
		 */
		public UserAccountCollection<UserAccount> getAccountsByUserId(int userid) {
			// SELECT ID, UserId, AccountNum, AccountTypeId, CreateDate, CurrentBalance,
			// IsActive FROM banksysdb.tbl_userAccount;

			UserAccount useracc = null;
			AccountType accType = null;
			UserAccountCollection<UserAccount> accountcollection = new UserAccountCollection<UserAccount>();
			try (Connection con = DBConnectionUtil.openCon();
					PreparedStatement ps = con.prepareStatement(
							"select * from banksysdb.tbl_userAccount where UserId = ? AND  IsActive=  1 ");) {
				ps.setInt(1, userid);
				ResultSet rs = ps.executeQuery();

				while (rs.next()) {
					User user = UserDAOmaria.UserDAOImplementaion.getUserById(rs.getInt("UserId"));
					useracc = new UserAccount();
					useracc.setId(rs.getInt("ID"));
					useracc.setUser(user);
					useracc.setAccountNum(rs.getString("AccountNum"));
					accType = new AccountType();
					accType = DataDAO.DataServiceImplementaion.getAccountTypeById(rs.getInt("AccountTypeId"));
					useracc.setAccountType(accType);
					useracc.setCreateDate(rs.getDate("CreateDate"));
					useracc.setCurrentBalance(rs.getInt("CurrentBalance"));
					useracc.setActive(rs.getBoolean("IsActive"));
					accountcollection.add(useracc);

				}

				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {

			}
			return accountcollection;
		}

		/**
		 * 
		 * @param accountId
		 */
		public UserAccount getAccountById(int accountId) {
			// SELECT ID, UserId, AccountNum, AccountTypeId, CreateDate, CurrentBalance,
			// IsActive FROM banksysdb.tbl_userAccount;

			UserAccount useracc = null;
			AccountType accType = null;
			try (Connection con = DBConnectionUtil.openCon();
					PreparedStatement ps = con.prepareStatement(
							"select * from banksysdb.tbl_userAccount where ID = ? AND  IsActive=  1 ");) {
				ps.setInt(1, accountId);
				ResultSet rs = ps.executeQuery();

				while (rs.next()) {
					User user = UserDAOmaria.UserDAOImplementaion.getUserById(rs.getInt("UserId"));
					useracc = new UserAccount();
					useracc.setId(rs.getInt("ID"));
					useracc.setUser(user);
					useracc.setAccountNum(rs.getString("AccountNum"));
					accType = new AccountType();
					accType = DataDAO.DataServiceImplementaion.getAccountTypeById(rs.getInt("AccountTypeId"));
					useracc.setAccountType(accType);
					useracc.setCreateDate(rs.getDate("CreateDate"));
					useracc.setCurrentBalance(rs.getInt("CurrentBalance"));
					useracc.setActive(rs.getBoolean("IsActive"));

				}

				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {

			}
			return useracc;
		}

		/**
		 * 
		 * @param accountNum
		 */
		public UserAccount getUserByAccountNum(String accountNum) {
			return null;
		}

		@Override
		public int updateAccountBalance(float val, int accountId) {
			int effectedrow = 0;
			try (Connection con = DBConnectionUtil.openCon();
					PreparedStatement statement = con
							.prepareStatement("UPDATE banksysdb.tbl_userAccount SET CurrentBalance= ? WHERE ID= ? ");) {

				statement.setFloat(1, val);
				statement.setInt(2, accountId);
				effectedrow = statement.executeUpdate();
				statement.close();

			} catch (SQLException e) {

				e.printStackTrace();
			} finally {

			}
			return effectedrow;
		}
	};

}