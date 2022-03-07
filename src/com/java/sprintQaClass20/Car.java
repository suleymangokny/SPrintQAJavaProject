package com.java.sprintQaClass20;

public class Car {
	
	//data members
	String model;
	String colour;
	int speed;
	boolean isFuelNeeded;
	
	Car(){
		this.speed = 200;
		this.colour = "Black";
	}
	
	Car(int speed, String colour, String model){
		this.speed=speed;
		this.colour= colour;
		this.model=model;
	}
	
	
	Car(int speed,String colour, String model, boolean isFuelNeeded){
		
		this(speed,colour,model);
		this.isFuelNeeded = isFuelNeeded;
		
		
	}
	//methods
	void drive() {
		System.out.println("Car can drive at max speed = "+speed);
	}
	
	void refillFuel() {
		if(isFuelNeeded) {
			System.out.println("Please refill");
		}else {
			System.out.println("Sufficient fuel");
		}
		
	}
	
	void displayObject() {
		System.out.println("Car model is "+model+" with colour "+colour+" and speed "+speed +" Fuel"+ isFuelNeeded);
	}

}
