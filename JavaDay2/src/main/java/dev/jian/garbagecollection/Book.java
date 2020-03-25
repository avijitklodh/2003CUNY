package dev.jian.garbagecollection;

public class Book {

	// Fields
	public String title;
	public int pages;
	
	public static String definition = "A book is something you can read";
	
	// Constructor
	public Book(String title, int pages){
		this.title = title;
		this.pages = pages;
	}
	
	
	// Method
	public void describeSelf() {
		System.out.println("I am a book title : " + this.title);
	}
	
	// Finalize is a method that get called on an object when it is garbage collected
	// NEVER USE FINALIZE
	
	@Override
	public void finalize() {
		System.out.println("The book " + this.title + " was garbage collected");
	}
}
