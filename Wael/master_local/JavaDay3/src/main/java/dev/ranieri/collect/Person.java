package dev.ranieri.collect;

public class Person implements Comparable<Person> {
	
	String name;
	int age;
	int height;
	
	public Person(String name, int age, int height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + "]";
	}

	// if this object is less than the object you compare it to return -1
	// if this object is greater than the object you compare it to return 1
	// if the objects are the same return 0
	public int compareTo(Person p) {
	
		// in Java if your if statement is only one line you do not need curly brackets
		
		if(this.age < p.age)
			return -1;
		
		if(this.age > p.age)
			return 1;
			
		return 0;
	}
	
	
}
