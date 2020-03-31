package dev.ranieri.crediassignment;

import java.util.ArrayList;
import java.util.List;

public abstract class CreditCard {
	
	String owner;
	double rewardPoints;
	List<Item> purchases = new ArrayList<Item>();
	

	public CreditCard(String owner, double rewardPoints) {
		this.owner = owner;
		this.rewardPoints = rewardPoints;
	}

	public abstract void makePurchase(Item item);

	@Override
	public String toString() {
		return "CreditCard [owner=" + owner + ", rewardPoints=" + rewardPoints + ", purchases=" + purchases + "]";
	}
		
}
