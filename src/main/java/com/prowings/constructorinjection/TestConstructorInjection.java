package com.prowings.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructorInjection {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ConstructorInjectionContextConfig.xml");
		
		Employee emp = ctx.getBean(Employee.class);
		
		System.out.println(emp);
	}

}
