package com.java.sprintQaClass24;

public class CalculatorTesting {

	public static void main(String[] args) {
	
		BasicCalculator bs = new BasicCalculator();
		
		bs.sum(5, 6);
		
		AdvanceCalculator ad = new AdvanceCalculator();
		
		ad.multiply(3, 4);
		
		ad.sum(2,1);
		
		System.out.println(bs.i);
		System.out.println(ad.i);
	}

}
