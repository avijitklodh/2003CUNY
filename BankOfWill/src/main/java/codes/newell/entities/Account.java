package codes.newell.entities;

public class Account {

	private String id;
	private BankCurrency balance = new BankCurrency();

	public Account() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BankCurrency getBalance() {
		return balance;
	}

	public void setBalance(BankCurrency balance) {
		this.balance = balance;
	}
}
