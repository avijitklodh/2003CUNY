package dev.warren.creditcards;


import java.util.ArrayList;
import java.util.List;

import dev.warren.abstraction.Person;

public abstract class CreditCard {
	Person owner;
	int rewardPoints;
	List<Item> purchases = new ArrayList<Item>();
	
	
	
	public CreditCard(Person owner, int rewardPoints) {
		super();
		this.owner = owner;
		this.rewardPoints = rewardPoints;
		
	}



	public abstract void purchase(Item thing);



	@Override
	public String toString() {
		return "CreditCard [owner=" + owner + ", rewardPoints=" + rewardPoints + ", purchases=" + purchases + "]";
	}
	
	
	
	
	
	

}
