package com.java.sprintQaClass26;

class Vehicle{
	void run() {
		System.out.println("Vehicle is running");
	}
}
class Car extends Vehicle{
	
	void run() {
		System.out.println("Car is running");
	}
	void fillFuel() {
		System.out.println("Fuel needed");
	}
}
public class VehicleTesting {

	public static void main(String[] args) {
		//1
		Vehicle v1 = new Vehicle();   //Parent ref = Parent object
		v1.run();
		//2
		Car c1 = new Car();         //Child ref =  Child object
		c1.run();
		//3
		Vehicle v2 = new Car();     //Parent ref = Child object
		v2.run();        //Object is of Car class so run method of Car will called.
						//v2 can call only common methods between parent and child
		//v2.fillFuel();  //error because it is not a common/overridden method between parent and child
		
		//4
		//Car c2 = new Vehicle();   //Child ref = Parent object not allowed.
	}

}
