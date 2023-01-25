package com.prowings.constructorinjection;

import com.prowings.beans.Address;

public class Employee {
	
	int id;
	String name;
	String dept;
	Address address;
	
	public Employee() {
		super();
		System.out.println("No-arg Constructor invoked by constructor-arg dependecy");
	}
	
	public Employee(int id, String name, String dept, Address address) {
		super();
		System.out.println("All-arg Constructor invoked by constructor-arg dependecy");
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.address = address;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", address=" + address + "]";
	}


}
