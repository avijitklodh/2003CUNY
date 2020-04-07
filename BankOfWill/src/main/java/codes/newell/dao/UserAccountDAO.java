package codes.newell.dao;

public interface UserAccountDAO {
	boolean AddUserAccount(Integer userId, Integer accountId);

	boolean RemoveUserAccount(Integer userId, Integer accountId);

	boolean removeAccount(Integer accountId);
}
