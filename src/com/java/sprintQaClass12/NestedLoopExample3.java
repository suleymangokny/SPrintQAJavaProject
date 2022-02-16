package com.java.sprintQaClass12;

public class NestedLoopExample3 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			
			for(int j=5;j>=i;j--) {
				System.out.print("*");  //you can try printing i and j
			}
			System.out.println();
			
		}
	}

}
