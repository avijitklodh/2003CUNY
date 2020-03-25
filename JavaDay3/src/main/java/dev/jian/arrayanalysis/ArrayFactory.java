package dev.jian.arrayanalysis;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayFactory {
	
	
	// Design patterns are common software conventions for solving 
	//recurring problems in developmment
	// Factory is designed to return you an implementation of an interfaces or
	// or sub class of a generic class
	// Abstract away your choice of how make select or create an object
	/**
	 * This method will return you an optimized array for your needs
	 * If you need fast retrieval put in a 0
	 * If you need fast insertion put in anything else
	 * @param choice
	 * @return
	 */
	public static<T> List<T> getList(int choice) {
		
		if(choice == 0) {
			return new ArrayList<T>();
		}else {
			return new LinkedList<T>();
		}
		
	}

}
