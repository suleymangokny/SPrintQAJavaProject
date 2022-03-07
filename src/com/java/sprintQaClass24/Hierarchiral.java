package com.java.sprintQaClass24;

class Animal3{
	void eat() {
		System.out.println("Eating....");
	}
}

class Dog3 extends Animal3{
	void bark() {
		System.out.println("Barking...");
	}
}

class Cat extends Animal3{
	
	void meaw() {
		System.out.println("Meawing....");
	}
}
public class Hierarchiral {

	public static void main(String[] args) {
		Dog3 d1 = new Dog3();
		d1.eat();
		d1.bark();
		//d1.meaw();    
		
		Cat c1 = new Cat();
		c1.eat();
		c1.meaw();
		//c1.bark();
		
	}

}
