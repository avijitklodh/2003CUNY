package dev.patel.breakoutactivity;

import java.util.LinkedList;
import java.util.List;

public abstract class CreditCard {
	
	public String owner;
	public double rewardPoints;
	public int limit;
	public int balance;
	
	

	public CreditCard(String owner, int rewardPoints, int limit) {
		super();
		this.owner = owner;
		this.rewardPoints = rewardPoints;
		this.limit = limit;
		
	}

	public List<String> purchaseList = new LinkedList<String>();
	
	public abstract void purchase(Item item);
	
	

}
