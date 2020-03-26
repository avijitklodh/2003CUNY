package dev.rivera.card;

import java.util.List;

public abstract class CreditCard {
	String owner;
	double rewardPoints;
	List<Item> l;

	public abstract void purchase(Item i);
}
