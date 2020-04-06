package codes.newell.entities;

import java.time.LocalDateTime;

public class Transaction {
	private int id;
	private double amount;
	private String message;
	private LocalDateTime t_date = LocalDateTime.now();
	private int from_account;
	private int to_account;
	private int customer_id;

	public Transaction() {
	}

	public Transaction(double amount, String message) {
		this.amount = amount;
		this.message = message;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getDate() {
		return t_date;
	}

	public void setDate(LocalDateTime date) {
		this.t_date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFromAccount() {
		return from_account;
	}

	public void setFromAccount(int fromAccount) {
		this.from_account = fromAccount;
	}

	public int getToAccount() {
		return to_account;
	}

	public void setToAccount(int toAccount) {
		this.to_account = toAccount;
	}

	public int getUser() {
		return customer_id;
	}

	public void setUser(int user) {
		this.customer_id = user;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", amount=" + amount + ", message=" + message + ", date=" + t_date
				+ ", fromAccount=" + from_account + ", toAccount=" + to_account + ", user=" + customer_id + "]";
	}

}
