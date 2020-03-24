package dev.ranieri.passbyvalue;

import dev.ranieri.garbage.Book;

public class PassPlayground {
	
	public static void main(String[] args) {
		
		// Java is 100% pass by value
		// whenever you pass in a variable to a method 
		// the value within that variable is copied and passed in
		// not the value itself
		
		int x = 100;
		makeZero(x);
		System.out.println(x);
		
		Book b = new Book("Frankenstein",100);
		// passes in a value that is the memory address of the book
		removeTitle(b); // go to location in memory 121
		b.describeSelf();
		
		deleteBook(b);
		System.gc();
		
		
		b = null;
		//System.out.println(b.title);
		System.out.println(b.defintion);
		
	}
	
	public static void makeZero(int num) {
		num = 0;
	}
	
	public static void removeTitle(Book book) {
		// goes to that location in memory and removes the title
		book.title = "";
	}

	public static void deleteBook(Book book) {
		book = null; // tears up the note saying where to go
	}
	
	
	
	
	
}
