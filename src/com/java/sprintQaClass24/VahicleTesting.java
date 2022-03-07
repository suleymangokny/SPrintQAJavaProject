package com.java.sprintQaClass24;

public class VahicleTesting {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		
		v1.start(); //parent object so we can call parent method
		
		Car c1 = new Car();
		
		c1.start(); //child object since inheritance , we can call parent method
		
		c1.playMusic(); //child object calling child method
		
		
		}

}
