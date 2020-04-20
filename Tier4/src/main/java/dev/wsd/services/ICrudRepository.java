package dev.wsd.services;

import java.sql.SQLException;
import java.util.Set;
 
import dev.wsd.entities.*;
 
public interface ICrudRepository   {

	public User save(User user);

	public Set<User> findall() throws SQLException;

	public User findUserById(int id);

	public boolean update(User user);

	public boolean deleteById(int id);

}