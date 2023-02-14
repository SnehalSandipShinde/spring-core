package com.prowings.beanslifecycle;

public class Vehical {

	int id;
	String companyName;

	
//	public Vehical() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	public Vehical(int id, String companyName) {
		super();
		this.id = id;
		this.companyName = companyName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Vehical [id=" + id + ", companyName=" + companyName + "]";
	}

	public void myInit() {
		System.out.println("Vehicals init method called...");
	}
	
	public void myDestroy()
	{
		System.out.println("Vehicals destroy method called");
	}
}
