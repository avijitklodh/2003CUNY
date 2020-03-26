package dev.warren.creditcards;

import dev.warren.abstraction.Person;

public class CreditPlayground {

	public static void main(String[] args) {
		CreditCard visa = new PlatinumCard(new Person("Imani",23, 687));
//		System.out.println(visa.rewardPoints);
//		System.out.println(visa.owner);
//		System.out.println(visa.purchases);
		visa.purchase(new Item(221.17, "chair"));
		visa.purchase(new Travel(2324.19, "First Class flight to Morocco"));
//		for(Item i : visa.purchases) {
//			System.out.println(i);
//		}
//		System.out.println(visa.rewardPoints);
		//System.out.println(((PlatinumCard)visa).limit);
		System.out.println(visa);
		
		
		CreditCard mc = new CrystalCard(new Person("Jorji", 46, 875),0);
//		System.out.println(mc.rewardPoints);
//		System.out.println(mc.owner);
//		System.out.println(mc.purchases);
		mc.purchase(new Food(35.99, "Pizza Hut"));
		mc.purchase(new Entertainment(235.76, "Broadway Show: Sister Act"));
		mc.purchase(new Item(15.99, "Umbrella"));
//		for(Item i : mc.purchases) {
//			System.out.println(i);
//		}
		System.out.println(mc);
//		System.out.println(mc.rewardPoints);
		
		
		
		
		
		
		
		
		
		

	}

}//class closure
