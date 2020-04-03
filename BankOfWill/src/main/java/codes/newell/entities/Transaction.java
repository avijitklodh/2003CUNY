package codes.newell.entities;

import java.time.LocalDateTime;

public class Transaction {
	private String id;
	private BankCurrency amount;
	private String message;
	private LocalDateTime date = LocalDateTime.now();
	private String fromAccount;
	private String toAccount;
	private String user;

	public Transaction() {
	}

	public Transaction(String amount, String message) {
		this.amount = new BankCurrency(amount);
		this.message = message;
	}

	public BankCurrency getAmount() {
		return amount;
	}

	public void setAmount(BankCurrency amount) {
		this.amount = amount;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	public String getToAccount() {
		return toAccount;
	}

	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", amount=" + amount + ", message=" + message + ", date=" + date
				+ ", fromAccount=" + fromAccount + ", toAccount=" + toAccount + ", user=" + user + "]";
	}

}
