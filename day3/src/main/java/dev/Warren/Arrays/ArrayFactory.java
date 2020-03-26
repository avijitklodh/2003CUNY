package dev.Warren.Arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayFactory {
	
	/**
	 * This factory gives you an optimized array.
	 * If you need fast retrieval, input 0,
	 * for fast insertion input any other number.
	 * @param choice
	 * @return List*/
	public static <T> List <T>getList(int choice) {
		if(choice == 0) return new ArrayList<T>();
		else return new LinkedList<T>();
		
		
	}

}
