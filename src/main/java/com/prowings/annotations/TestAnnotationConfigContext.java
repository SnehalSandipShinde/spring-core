package com.prowings.annotations;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationConfigContext {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("AnnotationApplicationContext.xml");
		
		Animal animal = ctx.getBean("animal11" , Animal.class);
		
		Animal animal1 = ctx.getBean("animal" , Animal.class);
		
		System.out.println(animal);
		
		System.out.println(animal1);
		
		ctx.close();
		
	}

}
