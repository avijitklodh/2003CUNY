package dev.patel.garbagecollection;

public class Book {
	
	//fields
	public String title;
	public int pages;
	
	//constructor
	public Book(String title, int pages){
		this.title = title;
		this.pages = pages;
	}
	
	//method
	public void describeSelf() {
		System.out.println("I am a book title: " + this.title);
	}
	
	//finalize is a method that gets called on an object when it is garbage collected
	//Never use Finalize
	
	@Override
    protected void finalize() 
    {
		System.out.println("The book " + this.title + " was garbage collected");
    }

}
