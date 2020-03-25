package dev.jian.zoo;


// 1. can create an is-a relationship
// 2. granting the ability to do something

// applies
// interfaces often end in able runnable, flyable
public interface Carnivore {

	// All variables in an interface are public static and final
	// even if you do not put public static final
	public static final String description = "A carnivore is a creature that can only eat meat";
	
	public void eatMeat();
	
}
