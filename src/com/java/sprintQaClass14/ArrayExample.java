package com.java.sprintQaClass14;

public class ArrayExample {

	public static void main(String[] args) {
		// apple, grapes, mango, banana, peach
		
		//declare and initialize 
		//store values
		//Print the length of array
		//print the array

		String fruits[] = new String[5];
		
		fruits[0]="apple";
		fruits[1]="grapes";fruits[2]="mango";fruits[3]="banana";fruits[4]="peach";
		
		System.out.println(fruits.length);
		for(int i=0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
		System.out.println(fruits[7]);
	}

}
