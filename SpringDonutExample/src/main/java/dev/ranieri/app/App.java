package dev.ranieri.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ranieri.beans.Box;
import dev.ranieri.beans.Donut;
import dev.ranieri.configs.AppConfig;
import dev.ranieri.configs.DonutConfig;

public class App {
	
	
	public static void main(String[] args) {
		
		// You can think of the application as an everything factory. The old name was bean factory
		ApplicationContext ac = new AnnotationConfigApplicationContext(DonutConfig.class);
				
//		Box a = ac.getBean("singletonBox", Box.class);
//		Box b = ac.getBean("singletonBox", Box.class);
//		Box c = ac.getBean("singletonBox", Box.class);
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		
//		a.setValue(50);
//		System.out.println(b.getValue());
//		
//		Box d = ac.getBean("protoBean",Box.class);
//		Box e = ac.getBean("protoBean",Box.class);
//		Box f = ac.getBean("protoBean",Box.class);
//		System.out.println(d);
//		System.out.println(e);
//		System.out.println(f);
		
		Donut d1 = ac.getBean("bostonKremeDonut",Donut.class);
		System.out.println(d1);
	}

}
