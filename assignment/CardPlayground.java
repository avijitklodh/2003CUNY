package dev.mahmed.assignment;

public class CardPlayground {

	public static void main(String[] args) {
		CreditCard card1 = new ObsidianCard("Mohammed");
		
		Item metrocard = new Item(105, "metrocard", "travel");
		Item book = new Item(3, "book", "education");
		Item iphone = new Item(800, "iphone", "utility");
		
		card1.purchase(metrocard);
		card1.purchase(book);
		card1.purchase(iphone);
		card1.showHistory();
		card1.showInfo();

		CreditCard card2 = new IvoryCard("Adam");
		card2.purchase(book);
		card2.purchase(book);
		card2.purchase(book);
		card2.purchase(iphone);
		card2.purchase(book);
		card2.purchase(book);
		card2.purchase(metrocard);
		card2.showHistory();
		card2.showInfo(); 
		
	}

}
