package com.java.sprintQaClass23;

public class Holiday {
	
	String destination;
	int noOfDays;
	int budget;
	static String hotel="Grand";
	
	//1st constructor
	Holiday(){
		this.noOfDays = 5;
		this.budget = 2000;
	}
	
	//2nd constructor
	Holiday(String destination){
		
		this.destination = destination;
	}
	static void changeHotelName() {
		hotel= "Hilton";
	}
	void display() {
		System.out.println(destination+" "+ noOfDays+" "+ budget+" "+ hotel);
	}

	void todoList() {
		System.out.println("Visit cafes");
	}
	
	void packing() {
		System.out.println("packing done");
	}
}
