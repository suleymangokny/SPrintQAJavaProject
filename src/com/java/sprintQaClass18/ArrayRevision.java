package com.java.sprintQaClass18;

public class ArrayRevision {

	public static void main(String[] args) {
		
		//One way to create array
		int marks[] = new int[4]; 
		
		marks[0] =10;
		marks[1] = 20;
		marks[2] = 30;
		marks[3]=40;
		
		for(int i=0;i<marks.length;i++) {
			
			System.out.println(marks[i]);
			
		}
		
		//2nd way of creating an array
		int numbers[] = {100,200,300,400};
		
		for(int n:numbers) {
			System.out.println(n);
		}

	}

}
