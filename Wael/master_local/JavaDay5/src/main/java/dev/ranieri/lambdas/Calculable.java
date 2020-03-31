package dev.ranieri.lambdas;

//functional interfaces are interfaces with only a single method
@FunctionalInterface
public interface Calculable {
	
	// you will be passing around behavior rather than state
	double calculate(double num1, double num2);

}
