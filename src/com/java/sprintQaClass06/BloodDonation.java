package com.java.sprintQaClass06;

public class BloodDonation {

	public static void main(String[] args) {
		
		//if age > 18 
			//if weight > 50 -> Donate blood
			//under-weight
		//under age
		
		int age = 6, weight = 25;
		
		if(age > 18) {
			
			if(weight > 50) {
				
				System.out.println("Donate Blood");
			}else {
				System.out.println("You are under weight");
			}
			
		}
		else {
			System.out.println("You are under age");
		}
		
	}

}
