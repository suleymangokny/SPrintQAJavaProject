package com.java.sprintQaClass12;

public class NestedLoop {

	public static void main(String[] args) {
		
		
		//Week 1 -> day 1 day2 day 3 day 4.....day 7  
		//Week 2 -> day 1 day2 day 3 day 4.....day 7 
		//Week 3 -> day 1 day2 day 3 day 4.....day 7 
		
		for(int i=1 ; i<=3 ; i++) {
		
			System.out.println("Week "+i);
			
			for(int j=1;j<=7;j++) {
				System.out.println("Day "+j);
			}
				
		}

	}

}
