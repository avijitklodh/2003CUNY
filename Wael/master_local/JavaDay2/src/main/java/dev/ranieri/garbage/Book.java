package dev.ranieri.garbage;

public class Book {

	// fields
	public String title;
	public int pages;
	
	public static String defintion = "A book is something you can read";
	
	// constructor
	public Book(String title, int pages){
		this.title = title;
		this.pages = pages;
	}
	
	
	// method
	public void describeSelf() {
		System.out.println("I am a book title : " + this.title);
	}
	
	// finalize is a method that get called on an object when the it is garbage collected
	// NEVER USE FINALIZE
	
	@Override
	public void finalize() {
		System.out.println("The book " + this.title + " was garbage collected");
	}
}
