package wsd.dev.zoo;

public class ZooPlayground {
	public  static void main(String [] args)
	{
		Species.printName();
		
		  Animal animal= new Animal() {
		  
		  @Override public void makeSound() { // TODO Auto-generated method stub
		  System.out.println("Animal [species=" + species + ", age=" + age + "]");
		  
		  }

		@Override
		public void getCount() {
			// TODO Auto-generated method stub
			
		}
		   };
		  
		  animal.makeSound();
		  animal.printtype();
		 
	}

}
