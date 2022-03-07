package com.java.sprintQaClass25;

class Animal{
	int noOflegs = 4;
	
	Animal(){
		System.out.println("1. Animal const");
	}
	void eat() {
		System.out.println("2. Animal is eating....");
	}
	
}
class Dog extends Animal{
	
	Dog(){
		super();
	}
	void display() {
		System.out.println("3. "+super.noOflegs);
		super.eat();
	}
}

public class AnimalTesting {

	public static void main(String[] args) {
	 Dog d1 = new Dog();
	 d1.display();

	}

}
