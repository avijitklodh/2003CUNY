package dev.calapatia.entities;

public class BankAccount {
	
	// Primary key
	private int bankAccountId;
	private double balance;
	private double amount;
	
	//foreign key
	private int userId;


	


	public int getBankAccountId() {
		return bankAccountId;
	}





	public void setBankAccountId(int bankAccountId) {
		this.bankAccountId = bankAccountId;
	}





	public double getBalance() {
		return balance;
	}





	public void setBalance(double balance) {
		this.balance = balance;
	}





	public double getAmount() {
		return amount;
	}





	public void setAmount(double amount) {
		this.amount = amount;
	}





	public int getUserId() {
		return userId;
	}





	public void setUserId(int userId) {
		this.userId = userId;
	}





	@Override
	public String toString() {
		return "BankAccount [bankAccountId=" + bankAccountId + ", balance=" + balance + ", amount=" + amount
				+ ", userId=" + userId + "]";
	}

	

}
