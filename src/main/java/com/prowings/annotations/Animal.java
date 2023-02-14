package com.prowings.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Animal {

	@Value("10")
	int id;
	
//	@Value("Cat")
	AnimalCategory type;

	public Animal() {
		super();
		System.out.println("No-arg Constructor for AnimalCategory invoked");

	}

	@Autowired
	public Animal(AnimalCategory type) {
		super();
		System.out.println("Constructor for AnimalCategory invoked");
		this.type = type;
	}

	public Animal(int id, AnimalCategory type) {
		super();
		this.id = id;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AnimalCategory getType() {
		return type;
	}

	public void setType(AnimalCategory type) {
		System.out.println("setter invoked for animalcategory...");
		this.type = type;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", type=" + type + "]";
	}

	@PostConstruct
	public void init()
	{
		System.out.println("initi() method invoked in animal");
	}

	@PreDestroy
	public void destroy()
	{
		System.out.println("destroy() method invoked in animal");
	}
	
}
