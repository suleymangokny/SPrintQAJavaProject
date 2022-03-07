package com.java.sprintQAClass28;

public class DateTesting {

	public static void main(String[] args) {
		
		Date d1 = new Date(14,2,2022);
		
		d1.display();
		
		Date d2 = new Date(0,0,0);
		
		d2.setMonth(1);
		d2.setDay(1);
		d2.setYear(2022);
		
		d2.display();
		
		System.out.println(d2.getMonth());

	}

}
