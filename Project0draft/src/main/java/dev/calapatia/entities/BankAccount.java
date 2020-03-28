package dev.calapatia.entities;

public class BankAccount {
	
	// Primary key
	private int bankAccountId;
	private int balance;
	
	//foreign key
	private int userId;

	public int getBankAccountId() {
		return bankAccountId;
	}

	public void setBankAccountId(int bankAccountId) {
		this.bankAccountId = bankAccountId;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "BankAccount [bankAccountId=" + bankAccountId + ", balance=" + balance + ", userId=" + userId + "]";
	}

}
