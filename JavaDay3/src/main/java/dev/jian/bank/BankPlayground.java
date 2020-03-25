package dev.jian.bank;

public class BankPlayground {

	public static void main(String [] args) {
		
		TDBank t = new TDBank("Jian");
		Chase c = new Chase("Jian");
		
		Item ps = new Item("PlayStation", 300);
		Item sw = new Item("Switch", 200);
		Item bx = new Item("XBox", 100);
		
		t.purchase(ps);
		t.purchase(sw);
		t.purchase(bx);
		t.purchase(ps);
		t.purchase(sw);
		t.purchase(bx);
		t.showHistory();
		System.out.println(t.rewardPoints);
		
		c.purchase(bx);
		c.purchase(sw);
		c.purchase(ps);
		c.purchase(bx);
		c.purchase(sw);
		c.purchase(ps);
		c.showHistory();
		System.out.println(c.rewardPoints);
	}
}
