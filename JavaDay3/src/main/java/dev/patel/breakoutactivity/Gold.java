package dev.patel.breakoutactivity;



public class Gold extends CreditCard{


	public static int totalGold = 0;
	
	public Gold(String owner, int rewardPoints, int limit) {
		super(owner, rewardPoints, limit);
		this.balance =0;
		
	}

	@Override
	public void purchase(Item item) {
		
		if((balance + item.price) < limit) {
			
			this.rewardPoints += item.price * .05;
			purchaseList.add(item.name);
			balance += item.price;
		}
		else
			System.out.println("Insufficient credit balance");


	}

	@Override
	public String toString() {
		return "Gold " + totalGold++ + " [owner=" + owner + ", rewardPoints=" + rewardPoints + ", purchaseList=" + purchaseList + "]";
	}



}
