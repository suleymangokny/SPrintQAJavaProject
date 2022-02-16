package com.java.sprintQaClass06;

public class FoodDelivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isRestaurantOpen = true;
		boolean isOrderPlaced = false;
		boolean isOrderDelivered = false;
		
		if(isRestaurantOpen) {
			
			if(isOrderPlaced) {
				
				if(isOrderDelivered) {
					System.out.println("Happy Client");
					
					
				}
				else {
					System.out.println("Order not delivered");
				}
				
			}
			else {
				System.out.println("Order not placed");
			}
			
		}
		else {
			System.out.println("Restaurant is closed");
			
		}

	}

}
