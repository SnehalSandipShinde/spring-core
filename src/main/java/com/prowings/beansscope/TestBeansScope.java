package com.prowings.beansscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeansScope {
	
	public static void main(String[] args) 
	{
		//instantiate container
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ScopeApplicationContextConfig.xml");
		
		Car cr = ctx.getBean(Car.class);
		
		Car cr1 = ctx.getBean(Car.class);
		
		System.out.println(cr == cr1);//if beans scope is singleton then O/P:true(by deafult)
		
		System.out.println("Car's bean equality:-"+ (cr == cr1));//if beans scope is prototype then O/P:false
		
		System.out.println(cr);

		System.out.println("Engine equality:-"+(cr1.getEngine() == cr.getEngine()));//bean of engine is singleton
	
		System.out.println(cr1.getEngine().getType());
		
		Engine eng1 = ctx.getBean("engine", Engine.class);
		
		Engine eng2 = ctx.getBean("engine", Engine.class);
		
		System.out.println("Engine bean equality:-"+ (eng1 == eng2));
	}

}
