package dev.rivera.card;

import java.util.LinkedList;

public class PCard extends CreditCard implements Platinum{

	public PCard() {
		super();
		l = new LinkedList<Item>();
	}

	@Override
	public void purchase(Item i) {
		{
			double rewardRate;
			double Points;
			
			
				if(i.getName().equals("Gas")) {
					rewardRate = .05;
					Points=i.getPrice() *rewardRate;
					rewardPoints+=Points;
					l.add(i);
				}
				if(i.getName().equals("Food")) {
					rewardRate = .04;
					Points=i.getPrice() *rewardRate;
					rewardPoints+=Points;
					l.add(i);
				}if(i.getName().equals("miscellaneous")) {
					rewardRate = .03;
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
