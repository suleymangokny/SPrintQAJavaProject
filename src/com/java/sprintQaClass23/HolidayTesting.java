package com.java.sprintQaClass23;

public class HolidayTesting {

	public static void main(String[] args) {
		

		
		Holiday.changeHotelName();
		System.out.println(Holiday.hotel);
		
		Holiday h1 = new Holiday("Bali");
		h1.display();
		
		Holiday h2 = new Holiday("Paris");
		h2.display();
		
	}

}
