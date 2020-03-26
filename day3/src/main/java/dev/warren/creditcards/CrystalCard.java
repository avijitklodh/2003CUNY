package dev.warren.creditcards;

import dev.warren.abstraction.Person;

public class CrystalCard extends CreditCard{

	public CrystalCard(Person owner, int rewardPoints) {
		super(owner, rewardPoints);
		
	}
	
	@Override
	public void purchase(Item thing) {
		if(thing instanceof Rewardable) {
			rewardPoints+= Math.ceil(thing.price);
			purchases.add(thing);
		} else if (thing instanceof DoubleRewardable ){
			rewardPoints += Math.ceil(thing.price) * 2;
			purchases.add(thing);
		}else if (thing instanceof TripleRewardable){
			rewardPoints += Math.ceil(thing.price) * 3;
			purchases.add(thing);
		}
		else {
			rewardPoints += Math.ceil(thing.price) * 6;
			purchases.add(thing);	
		}	
	}

}//class closure
