package com.prowings.constructorinjection;

public class CounstructorAmbiguity {
	
	int i;
	int j;
	
//	public CounstructorAmbiguity(int i, String j) {
//		super();
//		System.out.println("int int");
//		this.i = i;
////		this.j = j;
//		this.j = Integer.parseInt(j);
//	}
	
//	public CounstructorAmbiguity(double i, double j) {
//		super();
//		System.out.println("double double");
//		this.i = (int) i;
//		this.j = (int) j;
//	}
	
	public CounstructorAmbiguity(double i, int j) {
		super();
		System.out.println("double int");
		this.i = (int) i;
		this.j = (int) j;
	}

	public CounstructorAmbiguity(int i, double j) {
		super();
		System.out.println("int double");
		this.i = (int) i;
		this.j = (int) j;
	}
	public CounstructorAmbiguity(Number i, Number j) {
		super();
		System.out.println("Number Number");
		this.i = (int) i;
		this.j = (int) j;
	}
	
//	public CounstructorAmbiguity(String i, int j) {
//		super();
//		System.out.println("String String");
//		this.i = Integer.parseInt(i);
////		this.j = Integer.parseInt(j);
//		this.j = j;
//	}
	

}
