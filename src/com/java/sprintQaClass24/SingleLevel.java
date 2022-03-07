package com.java.sprintQaClass24;

class Animal1 {
	
	public void eat() {
		System.out.println("Eating....");
	}
	
}

class Dog1 extends Animal1{
	
	public void bark() {
		System.out.println("barking....");
	}
}
public class SingleLevel {

	public static void main(String[] args) {
		
		Animal1 a1 = new Animal1();
		a1.eat();
		
		Dog1 d1 = new Dog1();
		d1.bark();
		d1.eat();

	}

}
