package com.java.sprintQaClass05;

public class LadderIfElsePart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int billAmount;
		
		billAmount = 200;
		
		double discount;
		double finalPrice;
		
		// billAmount > 1000 -> 15% discount
		// billAmount > 700 -> 10% discount
		// billAmount > 500 -> 5% discount
		
		if(billAmount > 1000) {
			
			discount = 0.85;
			finalPrice = billAmount * discount;
			System.out.print("Final Price is "+ finalPrice);
		}
		else if(billAmount >700) {
			
			discount = 0.9;
			finalPrice = billAmount * discount;
			System.out.print("Final Price is "+ finalPrice);
		}
		else if( billAmount > 500) {
			discount = 0.95;
			finalPrice = billAmount * discount;
			System.out.print("Final Price is "+ finalPrice);
		}
		else {
			finalPrice = billAmount;
			System.out.print("Final Price is "+ finalPrice);
		}
		
		

	}

}
