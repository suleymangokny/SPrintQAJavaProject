package com.java.sprintQaclass13;

public class NestedLoopExample1 {

	public static void main(String[] args) {
		
		for(int i = 1 ; i<=4 ; i++) {  //outer loop - no of rows
			
			for(int j=1 ; j<=4;j++) {  //inner loop - no of columns
				System.out.print(i);   //modify content
			}
			System.out.println();
		}

	}

}
