package com.java.sprintQaClass24;

class Animal2{
	void eat() {
		System.out.println("Eating....");
	}
}
class Dog2 extends Animal2{
	
	void bark() {
		System.out.println("Barking....");
	}
}
class Puppy extends Dog2{
	
	void cry() {
		System.out.println("Crying");
	}
}

public class Multilevel {

	public static void main(String[] args) {
		Animal2 a1 = new Animal2();
		
		Dog2 d1 = new Dog2();
		Puppy p1 = new Puppy();
		p1.eat();   //eat method from Grandparent
		p1.bark();   // bark method from parent
		p1.cry();    //cry method is from its own class
	}

}
