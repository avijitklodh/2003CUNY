/**
 * @author Tiffanyw
 * 
 * */
package dev.warren.creditcards;


import dev.warren.abstraction.Person;


public class PlatinumCard extends CreditCard {
	private double limit;



	public PlatinumCard(Person owner) {
		super(owner, 100);
		limit = 10000.00;
		
	}
	
	
	
	

	@Override
	public String toString() {
		return "PlatinumCard [limit=" + limit + ", owner=" + owner + ", rewardPoints=" + rewardPoints + ", purchases="
				+ purchases + "]";
	}





	@Override
	public void purchase(Item thing) {
		if(thing.price < limit) {

			if(thing instanceof Rewardable) {
				rewardPoints+= Math.floor(thing.price);
				purchases.add(thing);
				limit -= thing.price;

			} else if (thing instanceof DoubleRewardable ){
				rewardPoints += Math.floor(thing.price) * 2;
				purchases.add(thing);
				limit -= thing.price;
			}else if (thing instanceof TripleRewardable){
				rewardPoints += Math.floor(thing.price) * 3;
				purchases.add(thing);
				limit -= thing.price; 
			}
			else {purchases.add(thing);	limit -= thing.price;}
		}
		else {System.out.println("Not enough credit");}

	}
}//class closure
