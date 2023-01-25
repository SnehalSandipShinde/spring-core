package com.prowings.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CounstructorAmbiguityTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ConstructorAmbiguityContextConfig.xml");
		
		CounstructorAmbiguity ca = ctx.getBean("const", CounstructorAmbiguity.class);
		
	}
}
