package com.java.sprintQaClass07;

public class SwitchExamplePart2 {
	
	// input -> morning, evening, night
	//output -> good morning, good evening, good night
	public static void main(String args[]) {
		
		String dayType = "abc";
		
		
		switch(dayType) {
		
		case "morning":
			System.out.println("Good morning");
			break;
		case "evening":
			System.out.println("Good evening");
			break;
			
		case "night":
			System.out.println("Good night");
			break;
			
			default:
				System.out.println("Please enter correct input");
			
		}
		
		
		
	}	

}
