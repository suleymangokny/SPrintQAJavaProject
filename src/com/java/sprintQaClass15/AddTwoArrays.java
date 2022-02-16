package com.java.sprintQaClass15;

public class AddTwoArrays {

	public static void main(String[] args) {
		
		int arr1[] = {1,3,5,7};
		int arr2[] = {2,4,6,8};
		
		int arr3[]=new int[4];
		
		for(int i=0;i<arr1.length;i++) {
		
			arr3[i]=arr1[i]+arr2[i];
		}
		
		for(int n:arr3) {
			System.out.println(n);
		}
		
		

	}

}
