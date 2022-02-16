package com.java.sprintQaClass14;

public class Array {

	public static void main(String[] args) {
		
		int marks[];    //declaration of array
		marks = new int[4];
		
		int studentMarks[] = new int[4];  //declaration and instantiation
		
		studentMarks[0] = 10;
		studentMarks[1] = 20;
		studentMarks[2] = 55;
		studentMarks[3] = 34;
		
		//System.out.println(studentMarks[1]);
		
		int len = studentMarks.length;
		System.out.println("Length of array = "+ len);
		
		for(int i=0 ; i < studentMarks.length ; i++) {
			
			System.out.println(studentMarks[i]);
		}
		
		// Add all elements in array eg: 10 + 20 + 55 + 34 
		int sum =0;
		for(int x=0; x < studentMarks.length ; x++) {
			sum = sum + studentMarks[x];
		}
		System.out.println("Sum is "+ sum);
		
		
		
		
	}

}
