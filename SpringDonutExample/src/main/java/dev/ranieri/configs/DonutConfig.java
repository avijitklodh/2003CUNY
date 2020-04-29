package dev.ranieri.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import dev.ranieri.beans.Donut;
import dev.ranieri.beans.Jelly;

@Component
@Configuration
public class DonutConfig {
	
	@Bean
	public Donut strawberryDonut() {
	// when we create a donut we should fulfill its dependcies
	// this process is called dependency injection (can be done in any language or framework)
	// there are three ways to do it
	// 1. constructor injection, using the class's constructor to fulfill dependencies	
		return new Donut("Strawberry Swirl", 2.75, this.strawberryJam());
	}
	
	@Bean
	public Donut bostonKremeDonut() {
	// 	2. setter injection
		// use the classes setters to fulfill the dependencies
		Donut d = new Donut();
		d.setName("Boston Kreme Donut");
		d.setCost(3.25);
		d.setJelly(this.kremeJam());
	
		// 3. interface injection
		// its impossible to do in spring
		return d;
			
	}
	
	@Bean
	public Jelly strawberryJam() {
		
		Jelly strawberry = new Jelly();
		strawberry.setFlavor("Strawberry");
		return strawberry;
	}
	
	@Bean
	public Jelly kremeJam() {
		Jelly jelly = new Jelly();
		jelly.setFlavor("Kreme");
		return jelly;
	}
	
	

}
