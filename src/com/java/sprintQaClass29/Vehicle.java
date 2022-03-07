package com.java.sprintQaClass29;

//If one method is abstract then class has to be abstract
//An abstract class can have abstract (run)  as well as non-abstract methods (checkFuel)
public abstract class Vehicle {
	
	String colour;
	
	Vehicle(){
		System.out.println("Vehicle constructor");
	}
	Vehicle(String colour){
		this.colour = colour;
	}
	
	//Abstract methods do not have method body. 
	abstract void run() ;
	
	void checkFuel(boolean isFuelNeeded) {
		if(isFuelNeeded) {
			System.out.println("Please refill");
		}
		else {
			System.out.println("Good to go");
		}
	}

}
