package dev.jian.passbyvalue;

import dev.jian.garbagecollection.Book;

public class PassPlayground {

	public static void main(String [] args) {
	
		// Java is 100% pass by value
		// whenever you pass in a variable to a method
		// the value within that variable is copied and passed in
		// not the value itself
		
		int x = 100;
		makeZero(x);
		System.out.println(x);	// Still 100
		
		Book b = new Book("Frankenstein", 100);
		// passes in a value that is the memory address of the book
		removeTitle(b);	// ******** go to location in memory 121
		b.describeSelf();
		
		deleteBook(b);
		System.gc();
		
		b = null;
		System.out.println(b.definition);
	}
	
	public static void makeZero(int num) {
		num = 0;
	}
	
	public static void removeTitle(Book book) {
		// goes to that location in memory and removes the title
		book.title = "";
	}
	
	public static void deleteBook(Book book) {
		book = null;	// tears up the note saying where to go
	}
	
	
	
	
	
	
	
}
