package com.java.sprintQaClass15;

public class TwoDArray {

	public static void main(String[] args) {
		
		int twoD[][] = new int[3][3];
		
		int twoDarray[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(twoDarray[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
