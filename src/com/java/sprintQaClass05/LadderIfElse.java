package com.java.sprintQaClass05;

public class LadderIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Example 2 -> 0-Sunday, 1-Monday......,6-Saturday
				int num = 100;
				
				if(num == 0) {
					System.out.print("Sunday");
				}
				else if(num ==1) {
					System.out.print("Monday");
				}
				else if(num==2) {
					System.out.print("Tuesday");
				}
				else if(num == 3)
				{
					System.out.print("Wednesday");
				}
				else if(num ==4) {
					System.out.print("Thrusday");
				}
				else if(num == 5) {
					System.out.print("Friday");
				}
				else if(num==6) {
					System.out.print("Saturday");
				}
				else {
					System.out.print("Please enter num");
				}

		
	}

}
