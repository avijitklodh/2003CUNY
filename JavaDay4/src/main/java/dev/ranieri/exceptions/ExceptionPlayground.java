package dev.ranieri.exceptions;

public class ExceptionPlayground {
	
	public static void main(String[] args) {
		
		// Exceptions are thrown (occur) whenever your code executes with an "unhappy path of execution"
		// your code could be executed as you wanted
		// Exceptions should be handled by the program 
		// you should have code that is a contingency (backup) in case an exception occurs
		// ex UserNotFound, InvalidInput, IndexOutOfBounds
		
		// Errors are catastrophic failures that you should not try to handle
		// OutOfMemory, StackOverflow, VirtualRegisterFailure

		
		try {
			int a = 10;
			int b = 0;
			//int result = a/b;
		}catch(ArithmeticException exception) { // exception object
			exception.printStackTrace();
			System.out.println("You tried to divide by 0 >:[");
			
		}finally {
			System.out.println("This will always execute");
		}
		
		
	}

}
