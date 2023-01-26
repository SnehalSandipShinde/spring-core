package com.prowings.beansscope;

import com.prowings.beans.Address;

public class Person {

	Address address;

	Department dept;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Address address, Department dept) {
		super();
		this.address = address;
		this.dept = dept;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Person [address=" + address + ", dept=" + dept + "]";
	}

}
