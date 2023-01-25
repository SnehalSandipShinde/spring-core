package com.prowings.circularbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecondClass {
	
	private FirstClass fc;

	@Autowired
	public SecondClass(FirstClass fc) {
		super();
		System.out.println("in Second Class Constructor");
		this.fc = fc;
	}

	public FirstClass getFc() {
		return fc;
	}
	
//	@Autowired
	public void setFc(FirstClass fc) {
		System.out.println("in Second Class Setter....");
		this.fc = fc;
	}
	
	

}
