package com.java.sprintQaClass20;

public class PersonTesting {

	public static void main(String[] args) {
		
		//className objectName = new className()
		Person  p1 = new Person();
		
		p1.name = "Aziz";
		p1.age = 32;
		p1.gender = 'M';
		
		p1.displayObject();
		
		p1.eat();
		
		p1.work();
	
		Person p2 = new Person();
		
		p2.name = "Saleha";
		p2.age = 25;
		p2.gender = 'F';
		
		p2.displayObject();
		
		p2.sleep();
	}

}
