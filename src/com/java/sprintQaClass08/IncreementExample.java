package com.java.sprintQaClass08;

public class IncreementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		
		int y;
		System.out.println("************* Post increment *****************");
		
		y = x++; //First Value of x is assigned to y so y=10
		//and then value of x is incremented so x=11
	
		System.out.println("x is "+x);
		
		System.out.println("y is "+y);
		
		System.out.println("************* Pre increment *****************");
		
		y= ++x; //Value of x is incremented first so x=12 
		//and then assign to variable y so y=12
		
		System.out.println("x is "+x);
		
		System.out.println("y is "+y);
	}

}
