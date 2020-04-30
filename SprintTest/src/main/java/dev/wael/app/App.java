package dev.wael.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.wael.beans.Box;
import dev.wael.beans.Donut;
import dev.wael.configs.BeanConfig;
import dev.wael.configs.DonutConfig;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new AnnotationConfigApplicationContext(BeanConfig.class);
		Box a = ac.getBean("getSingletonBox", Box.class);
		Box b = ac.getBean("getSingletonBox", Box.class);
		Box c = ac.getBean("getProtoBean", Box.class);
		Box d = ac.getBean("getProtoBean", Box.class);
		a.setVal(34);
		c.setVal(80);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		ApplicationContext acc = new AnnotationConfigApplicationContext(DonutConfig.class);
		Donut donut = acc.getBean("strawberryDonut", Donut.class);
		Donut donut2 = acc.getBean("cocoDonut", Donut.class);
		System.out.println(donut);
	}

}
