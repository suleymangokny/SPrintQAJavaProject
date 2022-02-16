package com.java.sprintQaClass15;

public class EvenNumbersInArray {

	public static void main(String[] args) {
		
		int array[]=new int[5];
		int evenArray[] = new int[3];
		
		for(int i=0;i<array.length;i++) {
			array[i] = 10 + i;
		}
		System.out.println("Array is ************");
		for(int a:array) {
			System.out.println(a);
		}
		
		
		System.out.println("Even numbers in array is ************");
		int j=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]%5==0) {
				evenArray[j]=array[i];
				j++;
			}
		}
		for(int even:evenArray) {
			System.out.println(even);
		}
	}

}
