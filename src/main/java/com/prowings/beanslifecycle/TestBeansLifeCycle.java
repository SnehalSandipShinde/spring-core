package com.prowings.beanslifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeansLifeCycle {

	public static void main(String[] args) 
	{
		
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("BeansLifiCycleApplicationContext.xml");
		
		Vehical vcl = ctx.getBean(Vehical.class);
		
		System.out.println(vcl);
		
		ctx.close();
	}
}
