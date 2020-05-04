
package dev.wsd.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import dev.wsd.collections.*;
import dev.wsd.entities.*;
import dev.wsd.utils.DBConnectionUtil;

/**
 * @author Admin
 * @version 1.0
 * @created 07-Apr-2020 8:56:24 AM
 */
public class DataDAO {

	public DataDAO() {

	}

	public static IDataDAO DataServiceImplementaion = new IDataDAO() {

		@Override
		public TransTypeCollection<TransactionType> getTransactionTypes() {
			// TODO Auto-generated method stub
			// SELECT ID, TransName, Effect FROM banksysdb.tbl_transactionType;

			TransactionType transType = null;
			TransTypeCollection<TransactionType> transTypeColl = new TransTypeCollection<TransactionType>();
			try (Connection con = DBConnectionUtil.openCon();
					PreparedStatement ps = con.prepareStatement("SELECT * FROM banksysdb.tbl_transactionType");) {

				ResultSet rs = ps.executeQuery();

				while (rs.next()) {

					transType = new TransactionType();
					transType.setId(rs.getInt("ID"));
					transType.setTransName(rs.getString("TransName"));
					transType.setEffect(rs.getBoolean("Effect"));
					transTypeColl.add(transType);
				}

				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {

			}
			return transTypeColl;

		}

		@Override
		public AccountTypeCollection<AccountType> getAccountTypes() {
			// TODO Auto-generated method stub
			// SELECT ID, TypeName FROM banksysdb.tbl_accountType;

			AccountType accType = null;
			AccountTypeCollection<AccountType> typeCollection = new AccountTypeCollection<AccountType>();
			try (Connection con = DBConnectionUtil.openCon();
					PreparedStatement ps = con
							.prepareStatement("SELECT ID, TypeName FROM banksysdb.tbl_accountType");) {

				ResultSet rs = ps.executeQuery();

				while (rs.next()) {

					accType = new AccountType();
					accType.setId(rs.getInt("ID"));

					accType.setTypeName(rs.getString("TypeName"));

					typeCollection.add(accType);

				}

				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {

			}
			return typeCollection;

		}

		@Override
		public AccountType getAccountTypeById(int id) {
			// TODO Auto-generated method stub
			AccountType accType = null;

			try (Connection con = DBConnectionUtil.openCon();
					PreparedStatement ps = con
							.prepareStatement("SELECT ID, TypeName FROM banksysdb.tbl_accountType where ID = ? ");) {
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();

				while (rs.next()) {

					accType = new AccountType();
					accType.setId(rs.getInt("ID"));

					accType.setTypeName(rs.getString("TypeName"));

				}

				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {

			}
			return accType;
		}

		@Override
		public TransactionType getTransactionTypeById(int id) {
			// TODO Auto-generated method stub
			TransactionType transType = null;

			try (Connection con = DBConnectionUtil.openCon();
					PreparedStatement ps = con
							.prepareStatement("SELECT * FROM banksysdb.tbl_transactionType where ID = ? ");) {
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();

				while (rs.next()) {

					transType = new TransactionType();
					transType.setId(rs.getInt("ID"));
					transType.setTransName(rs.getString("TransName"));
					transType.setEffect(rs.getBoolean("Effect"));

				}

				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {

			}
			return transType;
		}

		@Override
		public ArrayList<Department> getAllDepartments() {
			// TODO Auto-generated method stub
			ArrayList<Department> departments = new ArrayList<Department>();

			try (Connection con = DBConnectionUtil.openCon();
					PreparedStatement ps = con.prepareStatement("SELECT * FROM banksysdb.tbl_department ");) {

				ResultSet rs = ps.executeQuery();

				while (rs.next()) {

					Department dep = new Department();
					dep.setId(rs.getInt("ID"));
					dep.setName(rs.getString("name"));
					dep.setLocation(rs.getString("location"));
					departments.add(dep);
				}

				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {

			}
			return departments;
		}

		@Override
		public Department getDepartmentById(int id) {
			// TODO Auto-generated method stub
			Department dep = new Department();

			try (Connection con = DBConnectionUtil.openCon();
					PreparedStatement ps = con.prepareStatement("SELECT * FROM banksysdb.tbl_department where ID=?");) {
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {

					dep.setId(rs.getInt("ID"));
					dep.setName(rs.getString("name"));
					dep.setLocation(rs.getString("location"));

				}

				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {

			}
			return dep;
		}
	};

}