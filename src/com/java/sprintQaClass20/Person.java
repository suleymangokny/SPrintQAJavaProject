package com.java.sprintQaClass20;

public class Person {

	//data members
	String name;
	int age;
	char gender;
	
	//methods
	void eat(){
		System.out.println(name + " eating");
	}
	
	void sleep() {
		System.out.println(name +" Sleeping");
	}
	
	void work() {
		System.out.println(name +" Working");
	}
	
	void displayObject() {
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Gender = "+gender);
	}
}
