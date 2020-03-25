package dev.mahmed.assignment;

import java.util.LinkedList;
import java.util.List;

public abstract class CreditCard {
	
	String owner;
	int rewardPoints = 0;
	int balance;
	String doubleReward;
	String tripleReward;
	
	List<Item> items = new LinkedList<Item>();
	
	public CreditCard(String name) {
		this.owner = name;
	};
	
	public void purchase(Item item) {
		if (this.balance >= item.price) {
			items.add(item);
			addPoints(item);
			this.balance -= item.price;
			System.out.println("Purchase made... Your new balance is " + this.balance + " and you've been rewarded " + this.rewardPoints + " points.");
		} else
			System.out.println("Purchase declined...");
	};
	
	public void addPoints(Item item) {
		if (item.type == this.doubleReward)
			rewardPoints += 4;
		else if (item.type == this.tripleReward) 
			rewardPoints += 6;
		else
			rewardPoints += 2;	
	};
	
	public void showHistory() {
		System.out.println("Hello " + this.owner + ". Here is your purchase history: ");
		System.out.printf("%14s%14s\n", "Item","Price");
		System.out.println("----------------------------");
		for (Item i : items) {
			System.out.printf("%14s%14d\n", i.name, i.price);
		}
		System.out.println();
	}
	
	public void showInfo() {
		System.out.println("Here is your info, " + this.owner + "...");
		System.out.println("You currently have a balance of " + this.balance + " and " + this.rewardPoints + " reward points.");
		System.out.println();
	}

}
