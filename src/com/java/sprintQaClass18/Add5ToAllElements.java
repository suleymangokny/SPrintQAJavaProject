package com.java.sprintQaClass18;

public class Add5ToAllElements {

	public static void main(String[] args) {
		
		int array[] = {10,20,30,40};
		
		//Output -> 15,25,35,45

		int newArray[] = new int[4];
		for(int i=0;i<array.length;i++) {
			
			newArray[i] = array[i]+5;
			
		}
		
		for(int n:newArray) {
			System.out.println(n);
		}
	}

}
