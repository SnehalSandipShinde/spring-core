package com.prowings.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	
	int id;
	String name;
	Address address;
	
	List<String> subject;
	Set<Long> mobileNumbers;
	Map<String, Integer> subjectWiseMarks;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, Address address, List<String> subject, Set<Long> mobileNumbers,
			Map<String, Integer> subjectWiseMarks) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.subject = subject;
		this.mobileNumbers = mobileNumbers;
		this.subjectWiseMarks = subjectWiseMarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Setter for id invoked");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {

		System.out.println("Setter for name invoked");
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setter for address invoked");
		this.address = address;
	}

	public List<String> getSubject() {
		return subject;
	}

	public void setSubject(List<String> subject) {
		System.out.println("Setter for subject invoked");
		this.subject = subject;
	}

	public Set<Long> getMobileNumbers() {
		return mobileNumbers;
	}

	public void setMobileNumbers(Set<Long> mobileNumbers) {
		System.out.println("Setter for mobileNumbers invoked");
		this.mobileNumbers = mobileNumbers;
	}

	public Map<String, Integer> getSubjectWiseMarks() {
		return subjectWiseMarks;
	}

	public void setSubjectWiseMarks(Map<String, Integer> subjectWiseMarks) {
		System.out.println("Setter for subjectWiseMarks invoked");
		this.subjectWiseMarks = subjectWiseMarks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", subject=" + subject
				+ ", mobileNumbers=" + mobileNumbers + ", subjectWiseMarks=" + subjectWiseMarks + "]";
	}

	
	
}
