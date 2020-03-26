package dev.rivera.card;

import java.util.LinkedList;

public class GCard extends CreditCard implements Gold {

	public GCard() {
super();
l = new LinkedList<Item>();}

	public void purchase(Item i) {
		{
			double rewardRate;
			double Points;
		
				if(i.getName().equals("Gas")) {
					rewardRate = .03;
					Points=i.getPrice() *rewardRate;
					rewardPoints+=Points;
					l.add(i);
				}
				if(i.getName().equals("Food")) {
					rewardRate = .02;
					Points=i.getPrice() *rewardRate;
					rewardPoints+=Points;
					l.add(i);
				}if(i.getName().equals("miscellaneous")) {
					rewardRate = .01;
					Points=i.getPrice() *rewardRate;
					rewardPoints+=Points;
					l.add(i);
				}
			
		}
	}

	public void viewList() {
		for(Item item:l) {
			System.out.println("Purchased " + item.getName() + "for " + item.getPrice());
		}
		
	}
	
}
