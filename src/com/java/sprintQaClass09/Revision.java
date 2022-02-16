package com.java.sprintQaClass09;

public class Revision {

	public static void main(String[] args) {
		
		int age = 13;
		String votingCardAvailable = "no";
		
		if(age >= 18) {
		
			if(votingCardAvailable == "yes") {
				System.out.println("1.Eligible to vote");
			}
			else {
				System.out.println("2. You dont have card");
			}
		}
		else {
			System.out.println("3. Age is less than 18");
		}
		
	}

}
