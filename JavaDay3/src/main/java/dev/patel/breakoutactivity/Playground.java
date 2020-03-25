package dev.patel.breakoutactivity;

public class Playground {

	public static void main(String[] args) {

		//items
		Item item1 = new Item("Laptop", 999.99);
		Item item2 = new Item("Tablet", 799.99);
		Item item3 = new Item("Tv", 2000);
		Item item4 = new Item("Phone", 1399.99);
		
		
		//gold1
		CreditCard gold = new Gold("Nirav", 0, 5000);
		gold.purchase(item1);
		gold.purchase(item4);
		System.out.println(gold.toString() + "\n");


		//gold2
		CreditCard gold2 = new Gold("Manan", 0,2500);
		gold2.purchase(item2);
		gold2.purchase(item3);
		System.out.println(gold2.toString() + "\n");

		//Platnum1
		CreditCard platinum = new Platinum("Meet", 500, 5000);
		platinum.purchase(item1);
		platinum.purchase(item3);
		System.out.println(platinum.toString() + "\n");


		//gold2
		CreditCard platinum1 = new Platinum("Alex", 500, 1500);
		platinum1.purchase(item2);
		platinum1.purchase(item4);
		System.out.println(platinum1.toString() + "\n");

	}

}
