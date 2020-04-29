package dev.ranieri.configs;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import dev.ranieri.beans.Box;

// All of these annotations uses reflection to read your code
// reflection is the ability for you to write code that can read and edit itself at runtime 
// read your field names and values, generate new methods on the fly etc...


@Component // this annotation is necessary for Spring to read this class to help generate the container
@Configuration // Configuration is a stereotype which defines what type of component it is
// this class is designed to be read as a definition for beans
public class AppConfig {
	
	@Bean // this getBox method defines a bean in the container 
	// in this case it is a box object that has the value 100
	@Scope (value = ConfigurableBeanFactory.SCOPE_SINGLETON) // singletons are beans that only get created once
	// every time you request this bean you get the same exact object
	//singleton is the default scope
	public Box singletonBox() {		
		return new Box(100);
	}
	
	@Bean
	@Scope (value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) //prototypes you can have as many instances as you need
	public Box protoBean() {
		Box b = new Box();
		b.setValue(70);
		return b;		
	}

}
