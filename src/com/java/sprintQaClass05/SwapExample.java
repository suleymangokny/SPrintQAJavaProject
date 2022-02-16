package com.java.sprintQaClass05;

public class SwapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String glass1 = "milk";
		
		String glass2 = "beer";
		
		//after swapping glass1 = beer and glass2 = milk
		
		String glass3;
		
		glass3 = glass1;    //milk
		glass1 = glass2;    //beer
		glass2 = glass3;   //milk;
		
		System.out.print("Glass 1 has "+ glass1 + " and Glass 2 has "+ glass2);
		

	}

}
