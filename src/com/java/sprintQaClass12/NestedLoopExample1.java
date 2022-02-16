package com.java.sprintQaClass12;

public class NestedLoopExample1 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {    //outer loop for number of rows in output
			
			for(int j=1;j<=i;j++) { //inner loop is for columns
				
				System.out.print(j); //print statement will modify content
			}
			System.out.println();
			
		}
		
	}

}
