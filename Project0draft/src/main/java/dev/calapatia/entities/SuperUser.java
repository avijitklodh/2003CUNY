package dev.calapatia.entities;

import java.util.ArrayList;
import java.util.List;

public class SuperUser {
	
	// Primary key
	private int superUserId;
	
	private String username;
	
	private String password;
	
	List<BankAccount> accounts = new ArrayList<BankAccount>();
	
	//Foreign Key
	private int userId;

	public int getSuperUserId() {
		return superUserId;
	}

	public void setSuperUserId(int superUserId) {
		this.superUserId = superUserId;
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

	public List<BankAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "SuperUser [superUserId=" + superUserId + ", username=" + username + ", password=" + password
				+ ", accounts=" + accounts + ", userId=" + userId + "]";
	}
	
	

	



	

	

}
