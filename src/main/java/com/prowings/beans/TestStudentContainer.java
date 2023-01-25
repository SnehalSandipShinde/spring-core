package com.prowings.beans;

import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudentContainer 
{

	public static void main(String[] args) 
	{
		
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContextConfig.xml");
		
		Student st1 = (Student) ctx.getBean("std1");	//method of BeanFactory Interface
		Student st = ctx.getBean("std1",Student.class);// To aviod typecasting

		
		int count = ctx.getBeanDefinitionCount();
		
		System.out.println("Count of bean= "+ count);
		
		 System.out.println("Contains Beans:-"+ ctx.containsBean("std1"));
		 
		 System.out.println("beans contains definiton:-" +ctx.containsBeanDefinition("std2"));
		 
		System.out.println("beans Equality for singleton:-"+(st1 == st));
		System.out.println(st);
		
		Address add1 = ctx.getBean(Address.class);
		
		Address add2 = ctx.getBean(Address.class);
		
		System.out.println("Address Bean Equality for prototype:-"+( add1 == add2));//its prototype

		Properties myProp = ctx.getBean("myConfiguration",Properties.class);
		
		System.out.println(myProp);
		
	}
}
