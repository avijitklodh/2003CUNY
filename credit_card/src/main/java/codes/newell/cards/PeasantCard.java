package codes.newell.cards;

import codes.newell.items.Item;
import codes.newell.rewardcategories.Grocery;
import codes.newell.rewardcategories.Travel;

public class PeasantCard extends CreditCard {

	public PeasantCard(String owner) {
		super(owner, 0);
	}

	@Override
	void purchase(Item item) {
		if (item instanceof Grocery) {
			this.rewardPoints += Math.round(item.getPrice()) * 3;
		} else if (item instanceof Travel) {
			// Peasants shouldn't be traveling.
			this.rewardPoints += Math.round(item.getPrice()) * -1;
		} else {
			this.rewardPoints += Math.round(item.getPrice());
		}
		this.purchases.add(item);
	}

}
