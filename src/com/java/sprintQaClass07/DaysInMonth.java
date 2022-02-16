package com.java.sprintQaClass07;

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//input "Jan","Feb","Mar" 
		//output "Days are 31"

		String month = "Nov";
		switch(month) {
		case "Jan":
		case "Mar":
		case "May":
		case "Jul":
		case "Aug":
		case "Oct":
		case "Dec":
			System.out.println("Daya are 31");
			break;
			
		case "Feb":
			System.out.println("Daya are 28");
			break;
		
			
		case "Apr":
		case "Jun":
		case "Sep":
		case "Nov":
			System.out.println("Daya are 30");
			break;
		
			default:
				System.out.println("Month invalid");

		
		}
		
	}

}
