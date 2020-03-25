package dev.jian.bank;

public class Chase extends CreditCard{
	Chase(String owner){
		this.owner = owner;
		this.bankName = "Chase";
		this.rewardPoints = 0;
		this.balance = 0;
		this.limit = 1000;
	}

	@Override
	public void purchase(Item i) {
		int temp = balance + i.price;
		if(temp > limit)
			System.out.println(this.owner + "(Chase): Your current balance is " + this.balance + ". It's out of your credit card limit " + this.limit);
		else {
			this.history.add(i);
			this.rewardPoints += i.price * 0.2;	// Rate could be different
			this.balance += i.price;
			System.out.println(this.owner + "(Chase): You purchased something with price " + i.price);
		}
	}
	
	@Override
	public void showHistory() {
		for(Item i : this.history) {
			System.out.println(i);
		}
	}
}
