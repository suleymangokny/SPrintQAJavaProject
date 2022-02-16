package com.java.sprintQaClass05;

public class LadderIfElsePart3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
				String operation = "$";
				int a = 50 ;
				int b = 10;
				// if input + -> output => a+b
				// -  -> a-b
				// * -> a*b
				// / -> a/b

				if(operation == "+") {
					System.out.println(a+b);
				}
				else if(operation == "-") {
					System.out.println(a-b);
				}
				else if(operation == "*") {
					System.out.println(a*b);
				}
				else if(operation == "/") {
					System.out.println(a/b);
				}
				else {
					System.out.println("Please enter correct input");
				}
				
	}

}
