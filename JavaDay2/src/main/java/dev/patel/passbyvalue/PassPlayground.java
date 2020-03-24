package dev.patel.passbyvalue;

import dev.patel.garbagecollection.Book;

public class PassPlayground {
	
	public static void main(String[] args) {
		
		//Java is 100% pass by value
		//Whwnever you pass in a variable to a method
		//the value within that variable is copied and passed in 
		//not the value itself
		
		int x = 100;
		makeZero(x);
		System.out.println(x);
		
		Book b = new Book("Frankenstein", 100);
		//passes in a value that is the memory address of the book
		removeTitle(b);
		b.describeSelf();
		
		deleteBook(b);
		System.gc();
	}
	
	private static void removeTitle(Book book) {
		//goes to that location in a value that is the memory address of the book
		book.title = "";
		
	}

	private static void makeZero(int num) {
		num = 0;
		
	}
	
	public static void deleteBook(Book book) {
		book = null;
	}

	

}
