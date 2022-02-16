package com.java.sprintQaClass11;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		
		int num1 = sc.nextInt(); //100
		int num2 = sc.nextInt();  //200
		
		double d = sc.nextDouble();
		
		String s = sc.next();
		int sum = num1 +num2;
		System.out.println("Sum is "+sum);
		
	}

	
}
