package com.java.sprintQaClass14;

public class PrintIndexOfTarget {

	public static void main(String[] args) {
		
		//46, 34, 78, 10, 39, 20
		
		//target element => 39
		//Output -> Print the index of target element number  4
		
		int numbers[]= {46,34,78,10,39,20};
		
		int targetElement = 46;
		
		for(int i =0; i<numbers.length;i++) {
			if(targetElement == numbers[i]) {
				System.out.println(i);
				
			}
			
		}
		

	}

}
