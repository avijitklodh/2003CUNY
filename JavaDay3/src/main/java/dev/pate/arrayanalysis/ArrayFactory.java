package dev.pate.arrayanalysis;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayFactory {
	
	
	//Design patterns are common software conventions for solving factory design patterns
	//Factory is designed to return you an implementation of an interface or a subclass of a generic class
	//Abstract a way your choice of how to select or create an object
	/**
	 * This method will return an optimized array for your need
	 * If you need fast retrival put in a 0
	 * If you need fast insertion put anything else
	 * @param choice
	 * @return
	 */
	public static<T> List<T> getList(int choice) {
		
		if(choice == 0) {
			return new ArrayList<T>();
		}
		else 
			return new LinkedList<T>();
		
	}

}
