package com.java.sprintQaClass18;

public class ReverseArray {

	public static void main(String[] args) {
		
		int array[] = {10,20,30,40};
		
		//print array in reverse
		
		int revArray[] = new int[array.length];
		int j=0;
		for(int i=array.length-1;i>=0;i--) {
			
			revArray[j] = array[i];
			j++;
		}
		for(int r:revArray) {
			System.out.println(r);
		}
	}

}
