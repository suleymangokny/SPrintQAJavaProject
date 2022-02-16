package com.java.sprintQaClass11;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		
		// +,-,*,/ -> Output a+b, a-b,a*b,a/b
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String choice;
		
		do {
		System.out.println("Please enter + for addition");
		System.out.println("Please enter - for subtract");
		System.out.println("Please enter * for multiplication");
		System.out.println("Please enter / for division");
		String operation = sc.next();
		
		switch(operation) {
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
			
		case "/":
			if(a>0 && b>0) {
				System.out.println(a/b);
			}else {
				System.out.println("Division by zero not possible");
			}
			
			break;
		}
		System.out.println("Do you want to continue. press yes to continue");
		
		choice = sc.next(); //2
		
		}while(choice.equals("yes")); //false
		

	}

}
