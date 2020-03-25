package codes.newell.cards;

import java.util.ArrayList;

import codes.newell.items.Item;

public abstract class CreditCard {
	String owner;
	int rewardPoints;
	ArrayList<Item> purchases = new ArrayList<Item>();

	CreditCard(String owner, int rewardPoints) {
		this.owner = owner;
		this.rewardPoints = rewardPoints;
	}

	abstract void purchase(Item item);

	void viewPurchases() {
		System.out.println(this.owner + " has made the following purchases:");
		for (Item item : this.purchases) {
			System.out.printf("%s for $%.2f dollars\n", item.getName(), item.getPrice());
		}
		System.out.println("You have accrued " + this.rewardPoints + " reward points.\n\n");
	}
}