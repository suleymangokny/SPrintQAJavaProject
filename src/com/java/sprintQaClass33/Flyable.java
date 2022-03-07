package com.java.sprintQaClass33;

interface Flyable {
 void fly();
}
interface Vehicle extends Flyable{
	void fuelCheck();
}
class Aeroplane implements Vehicle{

	@Override
	public void fly() {
		System.out.println("plane is flying");
	}

	@Override
	public void fuelCheck() {
		System.out.println("Fuel needed");
	}
	
}
class Bird implements Flyable, Vehicle{

	@Override
	public void fuelCheck() {
		System.out.println("Not needed");
	}

	@Override
	public void fly() {
		System.out.println("Bird is flying");
	}
	
}