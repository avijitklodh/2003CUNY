package dev.patel.breakoutactivity;

public class Platinum extends CreditCard{
	
	public static int totalPlatinum = 0;
	public Platinum(String owner, int rewardPoints, int limit) {
		super(owner, rewardPoints, limit);

	}

	@Override
	public void purchase(Item item) {
		
		if((balance+item.price) < limit) {
			this.rewardPoints += item.price * .1;
			purchaseList.add(item.name);
			balance += item.price;
		}
		else
			System.out.println("Insufficient credit balance");
		
	}

	@Override
	public String toString() {
		return "Platinum " + totalPlatinum++ +" [owner=" + owner + ", rewardPoints=" + rewardPoints + ", purchaseList=" + purchaseList + "]";
	}
	
	

}
