package com.java.sprintQaClass04;

public class IfElse {
	
	public static void main(String args[]) {
		
		//Example - 1
		boolean isRaining = false;
		
		if(isRaining) {
			System.out.println("Use umbrella");
		}
		else {
			System.out.println("lets go to the beach");
			
		}
		
		 //Example - 2 
		
		String signal = "green";
		
		// >= <= > < == !=      -> True/false
		if(signal == "red") {
			System.out.println("STOP");
			
		}
		else {
			
			System.out.println("Drive Safe");
		}
		
		double k = 0.3;
		int j = (int)k;
		
	}

}
