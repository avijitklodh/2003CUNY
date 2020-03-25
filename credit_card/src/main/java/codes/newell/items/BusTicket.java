package codes.newell.items;

import codes.newell.rewardcategories.Travel;

public class BusTicket extends Item implements Travel {

	public BusTicket(double price) {
		super("bus ticket", price);
	}

}
