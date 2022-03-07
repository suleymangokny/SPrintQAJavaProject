package com.java.sprintQaClass29;

public class Car extends Vehicle{
	
	int speed;
	
	Car(){
		System.out.println("Car constructor");
	}
	Car(int speed, String colour){
		super(colour);
		this.speed = speed;
	}
	
	
	// Child class has to implement abstract methods
	void run() {
		System.out.println("Car is running");
	}
	
	void changeGear() {
		System.out.println("Gear is changed");
	}

}
