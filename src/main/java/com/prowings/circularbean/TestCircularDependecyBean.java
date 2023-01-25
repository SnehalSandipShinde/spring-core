package com.prowings.circularbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCircularDependecyBean {

	public static void main(String[] args) 
	{
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(CircularDependecyBeanConfig.class);
		FirstClass first = appContext.getBean(FirstClass.class);
		
		System.out.println(first);
	}
}
