package codes.newell.entities;

import java.time.LocalDateTime;

public class Transaction {
	private String id;
	private double amount;
	private String message;
	private LocalDateTime t_date = LocalDateTime.now();
	private String from_account;
	private String to_account;
	private String customer_id;

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFromAccount() {
		return from_account;
	}

	public void setFromAccount(String fromAccount) {
		this.from_account = fromAccount;
	}

	public String getToAccount() {
		return to_account;
	}

	public void setToAccount(String toAccount) {
		this.to_account = toAccount;
	}

	public String getUser() {
		return customer_id;
	}

	public void setUser(String user) {
		this.customer_id = user;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", amount=" + amount + ", message=" + message + ", date=" + t_date
				+ ", fromAccount=" + from_account + ", toAccount=" + to_account + ", user=" + customer_id + "]";
	}

}
