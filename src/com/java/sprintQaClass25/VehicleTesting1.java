package com.java.sprintQaClass25;

class Vehicle1{
	
	void run() {
		System.out.println("1. Vehicle is running.....");
	}
	
}
class Car1 extends Vehicle1{
	
	void run() {
		System.out.println("2. Car is running....");
	}
	
}
class Bike1 extends Vehicle1{
	
	void run() {
		System.out.println("Bike is running....");
	}
	
}
public class VehicleTesting1 {

	public static void main(String[] args) {

		
		Bike1 b1 = new Bike1();
		b1.run();
	}

}
