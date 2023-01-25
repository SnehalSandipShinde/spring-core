package com.prowings.beans;

public class Address 
{
	
	String cityName;
	String stateName;
	int pinCode;
	
	public Address() {
		super();
	}
	
	public Address(String cityName, String stateName, int pinCode) {
		super();
		this.cityName = cityName;
		this.stateName = stateName;
		this.pinCode = pinCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", stateName=" + stateName + ", pinCode=" + pinCode + "]";
	}
	
}
