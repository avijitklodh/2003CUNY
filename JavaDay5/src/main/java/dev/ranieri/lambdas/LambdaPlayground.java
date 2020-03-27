package dev.ranieri.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaPlayground {

	public static void main(String[] args) {
		
		// functional programming is storing code as a variable
		// Java achieves functional programming through the use of lambdas
		
		//               the lambda itself is an object
		Calculable add = (a, b) -> {	
			System.out.println("I am adding your numbers together");			
			return a+b;};
			
		Calculable subtract = (a,b)->{
			System.out.println("I am subtracting your numbers");
			return a-b;
		};
		
		List<Calculable> mathMethods = new ArrayList<Calculable>();
		mathMethods.add(add);
		mathMethods.add(subtract);
		
		mathMethods.get(0).calculate(80, 71);
		
		System.out.println(add.calculate(30.4, 40.3));
		
		List<String> strings = new ArrayList<String>();
		strings.add("Chair");
		strings.add("Headphones");
		strings.add("Football");
		
		//Imperative
		for(String s : strings) {
			System.out.println(s);
		}
		
		// functional
		// you are passing in what TO DO to each thing in the list
		// inbuilt lambda function in Java
		Consumer<String> print = (s) ->{System.out.println(s);};
		Consumer<String> megaModifier = (s) ->{System.out.println("Mega "  + s);};
		
		
		
		// callback function, a function that is passed as a parameter 
		// 1st pass chair into  (s) ->{System.out.println(s);}; as s
		// 2nd pass headphones into  (s) ->{System.out.println(s);}; as s
		strings.forEach(megaModifier);
	
		
//		strings.removeIf((word) ->{
//			if(word.startsWith("H")) {
//				return true;
//			}else {
//				return false;
//			}
//		});
		
//		System.out.println(strings);
		
	}
	
}
