package dev.ranieri.crediassignment;

public class NoobCard extends CreditCard{
	
	
	NoobCard(String owner){
		super(owner,0);
	}

	@Override
	public void makePurchase(Item item) {
		this.rewardPoints = this.rewardPoints + (item.price *.01);
		this.purchases.add(item);
	}

}
