package com.prowings.circularbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class FirstClass {

	private SecondClass sc;

	public FirstClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public FirstClass(@Lazy SecondClass sc) {
		super();
		System.out.println("in First Class Constructor");
		this.sc = sc;
	}

	public SecondClass getSc() {
		return sc;
	}

//	@Autowired
	public void setSc(SecondClass sc) {
		System.out.println("in First Class Setter");
		this.sc = sc;
	}

}
