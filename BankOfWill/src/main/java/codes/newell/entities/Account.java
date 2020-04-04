package codes.newell.entities;

public class Account {

	private String id;
	private BankCurrency balance = new BankCurrency();
	private String nickname;

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

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", nickname=" + nickname + "]";
	}

}
