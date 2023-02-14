package com.prowings.annotations;

import org.springframework.beans.factory.annotation.Value;

public class AnimalCategory {

	@Value("dog")
	String categoryName;

	public AnimalCategory() {
		super();
	}

	public AnimalCategory(String categoryName) {
		super();
		this.categoryName = categoryName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "AnimalCategory [categoryName=" + categoryName + "]";
	}
	
	
}
