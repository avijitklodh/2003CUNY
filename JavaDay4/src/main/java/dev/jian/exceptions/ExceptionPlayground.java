package dev.jian.exceptions;

public class ExceptionPlayground {

	public static void main(String[] args) {
		
		// Exceptions are throw (orrur) whenever your code executes with an "unhappy path
		// of execution". Your code could be executed as you wanted
		// Exception should be handle by the program
		// You should have code that is a contigency (backup) in case an exception occurs
		// ex UserNotFound, InvalidIput, IndexOutOfBounds
		
		// Errors are catstrophic failures that you should not try to handle
		// OutOfMemory, StackOverFlow, VirtualRegisterFailure
		
		try {
			int a = 10;
			int b = 0;
			int result = a / b;
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}finally {
			System.out.println("This will always execute");
		}
	}

}
