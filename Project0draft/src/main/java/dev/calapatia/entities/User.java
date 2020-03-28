package dev.calapatia.entities;

import java.util.HashSet;
import java.util.Set;

public class User {
	
	// Primary key
	private int userId;
	
	private String username;
	
	private String password;
	
	Set<BankAccount> accounts = new HashSet<BankAccount>();

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<BankAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<BankAccount> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", accounts=" + accounts
				+ "]";
	}
	

}
