package dev.jian.bank;

import java.util.ArrayList;
import java.util.List;

public abstract class CreditCard {
	public String owner;
	public int rewardPoints;
	public List<Item> history= new ArrayList<Item>();
	public String bankName;
	public int balance;
	public int limit;
	
	public abstract void purchase(Item i);
	public abstract void showHistory();
}
