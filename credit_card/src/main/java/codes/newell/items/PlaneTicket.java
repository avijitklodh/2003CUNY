package codes.newell.items;

import codes.newell.rewardcategories.Travel;

public class PlaneTicket extends Item implements Travel {

	public PlaneTicket(double price) {
		super("plane ticket", price);
	}
}
