package com.prowings.beansscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPersonScope {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("PersonApplicationContext.xml");
		
		Person p = ctx.getBean("person", Person.class);
		
		Person p1 = ctx.getBean("person", Person.class);
		
		System.out.println("Persons Scope:-"+(p == p1));
		
		System.out.println("Department Scope:-"+(p.dept == p1.dept));//singleton 
		
		System.out.println("Address Scope:-"+(p.address == p1.address));
		
		System.out.println(p);
		
	}

}
