package wsd.dev.zoo;

 abstract class Animal implements Species {
	 @Override
	public void printtype() {
		// TODO Auto-generated method stub
		
	}
	public String species ;
	int age;
	public Animal() {
		super();//this do nothing it just call object here because there is no parent 
		System.out.println("Animal");
	}
	public Animal(String species , int age) {
		super();
		this.age =age;
		
		// TODO Auto-generated constructor stub
	}
	
	public abstract void makeSound() ;
	@Override
	public String toString() {
		return "Animal [species=" + species + ", age=" + age + "]";
	}
 
 

}
