package com.java.sprintQaClass31;

 class Vehicle{
	
	final void display() {
		System.out.println("Vehicle is displayed");
	}
}

class Car extends Vehicle{
	//final methods cannot be overriden
	 /*void display() {
		System.out.println("Car is displayed");
	}*/
}

public class FinalRevision {

	public static void main(String[] args) {
		
		final int Months_IN_YEAR = 12;
		
		
	}

}
