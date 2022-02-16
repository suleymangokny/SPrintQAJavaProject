package com.java.sprintQaClass05;

public class LadderIfElsePart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// marks > 80 -> A+
		//marks > 70 -> A
		//marks > 60 -> B
		//marks >50 -> C

		
		int marks = 60;
		
		if(marks > 80) {
			System.out.print("Grade is A+");
		}
		else if(marks >= 70 && marks < 80) {
			System.out.print("Grade is A");
		}
		else if(marks >= 60 && marks < 70) {
			System.out.print("Grade is B");
		}
		else if(marks > 50) {
			System.out.print("Grade is C");
		}
		else {
			System.out.print("FAIL");
		}
		
	}

}
