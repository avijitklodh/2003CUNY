package dev.wael.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import dev.wael.beans.Donut;
import dev.wael.beans.Jelly;

@Component
@Configuration
public abstract class DonutConfig {

	public DonutConfig() {
		// TODO Auto-generated constructor stub
	}

	@Bean
	public Donut strawberryDonut() {
		//constrcutor injecion 
		Donut ew = new Donut("Strawberry", 1.99, new Jelly("straeberry"));
		return ew;

	}

	@Bean
	public Jelly strawberryJam() {
		Jelly j = new Jelly();
		j.setFlavor("straeberry");
		return j;
	}
	@Bean
	public Donut cocoDonut()
	{
		//setter injecion 
		Donut d = new Donut();
		d.setCost(4.2);
		d.setJelly(new Jelly("Coco"));
		d.setName("Coco");
		return d;
	}
	 
	
}
