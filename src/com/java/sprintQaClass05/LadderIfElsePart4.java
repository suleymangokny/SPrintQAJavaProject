package com.java.sprintQaClass05;

public class LadderIfElsePart4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if balance is > 500 -> rateOfInterest is 0.8  -> finalBalance
		// if balance is > 400 -> rateOfInterest is 0.7
		//if balance is > 300 -> rateOfInterest is 0.6
		//if balance is > 100 -> rateOfInterest is 0.2
		//else 

		int balance = 5000;
		double rateOfInterest;
		double finalBalance;
		
		if(balance > 500) {
			rateOfInterest = 0.8;
			finalBalance = balance * rateOfInterest;
			System.out.println(finalBalance);
			
		}
		else if(balance > 400) {
			rateOfInterest = 0.7;
			finalBalance = balance * rateOfInterest;
			System.out.println(finalBalance);
			
		}
		else if(balance > 300) {
			rateOfInterest = 0.6;
			finalBalance = balance * rateOfInterest;
			System.out.println(finalBalance);
			
		}
		else if(balance > 100) {
			rateOfInterest = 0.2;
			finalBalance = balance * rateOfInterest;
			System.out.println(finalBalance);
			
		}
		else {
			System.out.println(balance);
		}
		
		
		
		
	}

}
