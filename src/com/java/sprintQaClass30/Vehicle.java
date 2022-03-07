package com.java.sprintQaClass30;

public interface Vehicle {

	int noOfWheels=0;  //public static final
	
	 void run();	//public abstract
	 
}
class Car implements Vehicle{
	
	 int noOfWheels = 4;
	
	 public void run() {
		 System.out.println(Vehicle.noOfWheels);
		System.out.println("car is running");
	}
}
class Bike implements Vehicle{
	
	public void run() {
		System.out.println("Bike is running");
	}
}