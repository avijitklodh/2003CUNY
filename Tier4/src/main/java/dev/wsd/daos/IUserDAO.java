package dev.wsd.daos;

import java.sql.SQLException;
import java.util.Set;

 
import dev.wsd.entities.*;

/**
 * @author Admin
 * @version 1.0
 * @created 07-Apr-2020 8:56:24 AM
 */
public interface IUserDAO {

	public User save(User user);

	public Set<User> findall() throws SQLException;

	public User findUserById(int id);

	public boolean update(User user);

	public boolean deleteById(int id);

}