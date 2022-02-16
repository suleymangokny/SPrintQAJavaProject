package com.java.sprintQaClass18;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		
		int array[] = {45,23,78,90,10,87,36};
		
		int evenNumbers[] = new int[array.length];
		
		int oddNumbers[] = new int[array.length];
		
		//Output -> 45,23,87
		
		for(int i=0;i<array.length;i++) {
			if(array[i] % 2 ==0) {
				evenNumbers[i]=array[i];	
			}
			else {
				oddNumbers[i] = array[i];
			}
		}
		System.out.println("Even numbers are *********");
		for(int n:evenNumbers) {
			if(n>0) {
				System.out.println(n);
			}
			
		}
		System.out.println("Odd numbers are *********");
		for(int n:oddNumbers) {
			if(n>0) {
				System.out.println(n);
			}
			
		}
		

	}

}
