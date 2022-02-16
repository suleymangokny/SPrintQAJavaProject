package com.java.sprintQaClass07;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		
		// input +,-,*,/
		//output a+b,a-b,a*b,a/b
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a= sc.nextInt();
		int b = sc.nextInt();
		int choice;
		String operator;
		
		do {
		System.out.println("+ for add");
		System.out.println("- for subtract");
		System.out.println("* for multiply");
		System.out.println("/ for division");
		
		
		 operator = sc.next();
		
		
		switch(operator) {
		
		case "+":
			System.out.println("Result is "+ (a+b));
			break;
			
		case "-":
			System.out.println("Result is "+ (a-b));
			break;
		case "*":
			System.out.println("Result is "+ (a*b));
			break;
		case "/":
			if(a>0 && b>0) {
				System.out.println("Result is "+ (a/b));
			}else {
				System.out.println("Division by 0  not possible");
			}
			break;
			
			default:
				System.out.println("Not case matching");
			
		}
		System.out.println("To continue press 1");
		choice = sc.nextInt();
		}while(choice == 1);
		
		
		
	}

}
