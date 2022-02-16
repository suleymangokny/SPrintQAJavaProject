package com.java.sprintQaClass10;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		//factorial of 5 = 5! = 5*4*3*2*1
		//7! = 7*6*5*4*3*2*1
		
		int fact=1;
		for(int w = 5; w >= 1 ; w--) {
			fact = fact * w;  
			
		}

		System.out.println(fact);
		
		
	}

}
