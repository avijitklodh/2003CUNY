package dev.warren.abstraction;

public class Person {
	String name;
	int age;
	int creditScore;
	public Person(String name, int age, int creditScore) {
		super();
		this.name = name;
		this.age = age;
		this.creditScore = creditScore;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", credit score=" + creditScore + "]";
	}
//	public int compareTo(Person p) {
//		int result;
//		if(this.age < p.age) result = -1;
//		else if(this.age > p.age) result = 1;
//		else result = 0;
//		return result;
//	}
	
	

}
