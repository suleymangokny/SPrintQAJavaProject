package com.java.sprintQaClass07;

public class Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( true || false || !(false) && true && false || false);
		
		//if age < 50 
			//if income > 3000 -> tax = 2.5  //1
			//if income < 1000 -> tax = 1.5  //2
		//No tax
		
		int age = 65, income = 90;
		
		if( age < 50) {
			
			if(income > 3000 ) {
				System.out.println("Tax is 2.5");
			}
			else if (income < 1000) {
				System.out.println("Tax is 1.5");
			}
			else if(income > 1000 && income <3000) {
				System.out.println("Tax is 2");
			}
			
		}else {
			System.out.println("No tax");
		}

	}

}
