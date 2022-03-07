package com.java.sprintQaClass26;

public class Airport {

	public static void main(String args[]) {
		
		Airport a1 = new Airport();
		
		Flight f1 = new TurkishAirlines();
		a1.scheduleAndFly(f1);
		
		Flight f2 = new Indigo();
		a1.scheduleAndFly(f2);
		
		Flight f3 = new Delta();
		a1.scheduleAndFly(f3);
	}
	
	public void scheduleAndFly(Flight f) {
		System.out.println("Flight is scheduled");
		f.fly();
	}
	
}

