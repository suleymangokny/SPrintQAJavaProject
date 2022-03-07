package com.java.sprintQaClass33;

abstract class Animal {

	Animal(){
		System.out.println("Animal const");
	}
	abstract void eat();
	abstract void makeSound();
}
class Cat extends Animal{

	Cat(){
		System.out.println("Cat constr");
	}
	@Override
	void eat() {
		System.out.println("Cat is eating");
	}

	@Override
	void makeSound() {
		System.out.println("cat meow");
	}
	
}
class Dog extends Animal{

	Dog(){
		System.out.println("Dog constr");
	}
	@Override
	void eat() {
		System.out.println("Dog is eating");
	}

	@Override
	void makeSound() {
		System.out.println("Dog barks");
	}
	
}