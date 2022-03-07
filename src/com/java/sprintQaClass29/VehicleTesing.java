package com.java.sprintQaClass29;

public class VehicleTesing {

	public static void main(String[] args) {
	
		//Vehicle v1 = new Vehicle();
		//not allowed, cannot create objects for abstract class
		
		/*Car hondacity = new Car();
		hondacity.run();
		hondacity.checkFuel(false);
		hondacity.changeGear();
		
		//Parent ref = child obj (allowed)
		Vehicle v1 = new Bike();
		v1.run();     //can access only common/overriden methods
		v1.checkFuel(true);  //can access Parent's methods */
		
		Car c1 =  new Car();
		System.out.println("*****************");
		Car c2 = new Car(200,"Black");
		System.out.println(c2.colour);
		System.out.println(c2.speed);
		
	}

}
