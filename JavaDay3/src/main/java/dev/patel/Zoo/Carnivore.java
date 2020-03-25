package dev.patel.Zoo;

//1.can create is-a relation
//2. granting the ability to do something
public interface Carnivore {
	
	//All variables in an interface are public static final
	//even if you donot put pubkbic static final
	public static final String description = "A carnovire is a creature that only eat meat";

	public void eatMeat();
}
