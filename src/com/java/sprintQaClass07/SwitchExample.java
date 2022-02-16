package com.java.sprintQaClass07;

public class SwitchExample {

	public static void main(String[] args) {
		
		// 0-9 and print in english
		// 4 print Four
		//5 print five
		
		int num = 4;   //100-109
		
		switch(num) {
		case 0:
			System.out.println("Zero");
			break;   // it will come out switch block
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
			
		default:    //handle invalid inputs
			System.out.println("Please enter in range 0-9");
		}
		
		
		
	}

}
