package com.java.sprintQaClass25;

class Vehicle {
	//data-members
	int numOfWheels = 4;
	
	Vehicle(int noOfWheels){
		this.numOfWheels = noOfWheels;
	}
	
	//method
	public void run() {
		System.out.println("vehicle is running....");
	}

}

class Car extends Vehicle{
	String name;
	
	Car(String name,int noOfWheels){
		super(noOfWheels);
		this.name = name;
	}
	void display() {
		System.out.println(this.name);
		System.out.println(super.numOfWheels);
	}
	
	void playMusic() {
		super.run();
	}
}
public class VehicleTesting{
	
	public static void main(String[] args) {
		Car c1 = new Car("BMW",5);
		c1.display();
		c1.playMusic();
	}
}