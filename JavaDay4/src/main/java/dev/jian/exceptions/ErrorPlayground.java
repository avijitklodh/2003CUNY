package dev.jian.exceptions;

public class ErrorPlayground {

	public static void main(String [] args) {
		
		try {
			a();
		}catch(Throwable t) {	// Really bad code
			System.out.println("Infinite");
		}
		
		
	}
	
	
	public static void a() {
		a();
	}
	
}
