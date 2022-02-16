package com.java.sprintQaClass04;

public class Assignment2 {
	
	
	public static void main(String args[]) {
		
		// 1. Take two variables with name as price and quantity. Give any value.
		
		// 2. Declare variable with name amountToBePaid. Assign value as product of price and quantity  ( a * b)
		
		int price = 10;
		int quantity = 3;
		
		int amountToBePaid;
		
		amountToBePaid = price * quantity;
		
		// 3. if amountToBePaid is greater than 100 then print "You will get discount" else then "Shop more to get discount"
		
		if(amountToBePaid  > 100 ) {
			System.out.println("You will get discount");
		}
		else {
			System.out.println("Shop more to get discount");
		}
	
		
	}

}
