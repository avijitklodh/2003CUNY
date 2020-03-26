package dev.rivera.card;

public class CardPlayground {

	public static void main(String[] args) {
		GCard c1 = new GCard();
		PCard c2 = new PCard();
		Item i1 = new Item(1000,"Gas");
		Item i2 = new Item(15,"Food");
		c1.purchase(i1);
		c2.purchase(i2);
		System.out.println("This is how many points c1 has " + c1.rewardPoints);
		System.out.println("This is how many points c2 has " + c2.rewardPoints);
		c1.viewList();
		
	}

}
