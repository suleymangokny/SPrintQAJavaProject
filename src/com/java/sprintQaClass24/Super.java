package com.java.sprintQaClass24;

class Animal{
	
	Animal(){
		System.out.println("Animal constructor");
	}
}

class Dog extends Animal{
	
	Dog(){
		System.out.println("Dog constructor");
	}
}

class Puppy1 extends Dog{
	Puppy1(){
		System.out.println("Puppy constructor");
	}
}
public class Super {

	public static void main(String[] args) {
		
		Puppy1 p1 = new Puppy1();
	}

}
