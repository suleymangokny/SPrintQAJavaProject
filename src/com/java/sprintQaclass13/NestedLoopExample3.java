package com.java.sprintQaclass13;

public class NestedLoopExample3 {

	public static void main(String[] args) {
		
		for(int i =1;i <=5 ;i++) {
			
			for(int j=5 ; j >=i; j--) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
