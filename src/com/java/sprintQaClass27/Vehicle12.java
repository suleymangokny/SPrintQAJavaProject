package com.java.sprintQaClass27;

 class Vehicle12 {
	
	 protected int noOfWheels = 2;

	  void display() {
		System.out.println(noOfWheels);
	}
}

class Car extends Vehicle12{
	
	void display() {
		System.out.println(super.noOfWheels);
	}
}