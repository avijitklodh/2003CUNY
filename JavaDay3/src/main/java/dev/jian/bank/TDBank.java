package dev.jian.bank;

public class TDBank extends CreditCard{
	
	TDBank(String owner){
		this.owner = owner;
		this.bankName = "TDBank";
		this.rewardPoints = 0;
		this.balance = 0;
		this.limit = 500;
	}

	@Override
	public void purchase(Item i) {
		int temp = balance + i.price;
		if(temp > limit)
			System.out.println(this.owner + "(TDBank): Your current balance is " + this.balance + ". It's out of your credit card limit " + this.limit);
		else {
			this.history.add(i);
			this.rewardPoints += i.price * 0.2;	// Rate could be different
			this.balance += i.price;
			System.out.println(this.owner + "(TDBank): You purchased something with price " + i.price);
		}
	}
	
	@Override
	public void showHistory() {
		for(Item i : this.history) {
			System.out.println(i);
		}
	}
}
