package com.codego.stackdemo;

public class Person {
	String name;
	String address;
	
	public Person(String Name, String Address) {
		this.name = Name;
		this.address = Address;
	}
	
	public String displayInfo() {
		return this.name + "-" + this.address;
	}
	

}
