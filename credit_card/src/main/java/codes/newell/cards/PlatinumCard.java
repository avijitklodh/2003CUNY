package codes.newell.cards;

import codes.newell.items.Item;
import codes.newell.rewardcategories.Shopping;
import codes.newell.rewardcategories.Travel;

public class PlatinumCard extends CreditCard {

	public PlatinumCard(String owner) {
		// Platinum Card owners receive a free 10000 points!
		// What does that get you? Who knows!
		super(owner, 10000);
	}

	@Override
	void purchase(Item item) {
		if (item instanceof Travel) {
			this.rewardPoints += Math.round(item.getPrice()) * 6;
		} else if (item instanceof Shopping) {
			this.rewardPoints += Math.round(item.getPrice()) * 12;
		} else {
			this.rewardPoints += Math.round(item.getPrice()) * 3;
		}
		this.purchases.add(item);
	}

}
