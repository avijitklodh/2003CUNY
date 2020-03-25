package codes.newell.cards;

import codes.newell.items.Bread;
import codes.newell.items.BusTicket;
import codes.newell.items.Cheese;
import codes.newell.items.Miche;
import codes.newell.items.PlaneTicket;
import codes.newell.items.Winnimere;

public class PurchasePlayground {

	public static void main(String[] args) {
		PlatinumCard rich = new PlatinumCard("Richie Rich");
		rich.purchase(new PlaneTicket(1000));
		rich.purchase(new Miche());
		rich.purchase(new Winnimere());
		PeasantCard peasant = new PeasantCard("Who Cares");
		peasant.purchase(new BusTicket(65));
		peasant.purchase(new Cheese());
		peasant.purchase(new Bread());

		rich.viewPurchases();
		peasant.viewPurchases();

	}

}
