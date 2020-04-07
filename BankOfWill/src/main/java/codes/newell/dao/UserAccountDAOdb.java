package codes.newell.dao;

import java.util.ArrayList;
import java.util.List;

import codes.newell.utilities.ConnectionFactory;
import codes.newell.utilities.ConnectionManager;

public class UserAccountDAOdb implements UserAccountDAO {

	@Override
	public boolean AddUserAccount(Integer userId, Integer accountId) {
		String query = "Insert into user_account (user_id, account_id) values (?, ?)";
		ConnectionManager cm = ConnectionFactory.buildManager(query);
		List<Object> params = new ArrayList<>();
		params.add(userId);
		params.add(accountId);
		try {
			cm.executeWithParameters(params);
			return true;
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean RemoveUserAccount(Integer userId, Integer accountId) {
		String query = "Delete from user_account where user_id = ? and account_id = ?";
		ConnectionManager cm = ConnectionFactory.buildManager(query);
		List<Object> params = new ArrayList<>();
		params.add(userId);
		params.add(accountId);
		try {
			cm.executeWithParameters(params);
			return true;
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean removeAccount(Integer accountId) {
		String query = "Delete from user_account where account_id = ?";
		ConnectionManager cm = ConnectionFactory.buildManager(query);
		List<Object> params = new ArrayList<>();
		params.add(accountId);
		try {
			cm.executeWithParameters(params);
			return true;
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

}
