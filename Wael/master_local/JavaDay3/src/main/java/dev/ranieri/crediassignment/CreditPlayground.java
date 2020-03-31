package dev.ranieri.crediassignment;

public class CreditPlayground {

	public static void main(String[] args) {
		
		
		Item soda = new Item("Coca Cola", 9.99);
		Item skyrim = new Item("Skyrim",59.99);
		Item lawnchair = new Item("LawnChair",20.00);
		
		
		CreditCard c = new NoobCard("Adam");
		
		c.makePurchase(lawnchair);
		c.makePurchase(skyrim);
		c.makePurchase(soda);
		c.makePurchase(skyrim);
		
		System.out.println(c);
		
	}
}
