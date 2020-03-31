package dev.ranieri.crediassignment;

public class DiamondCard extends CreditCard {
	
	DiamondCard(String owner){
		super(owner,1000);
	}

	@Override
	public void makePurchase(Item item) {
		
		this.rewardPoints = this.rewardPoints + (item.price *.05);
		this.purchases.add(item);
	}

}
