package com.java.sprintQaClass14;

public class TwoD {

	public static void main(String[] args) {
		int array[][] = new int[3][4];
							// rows //columns
		
		array[0][2]= 3;
		array[1][3]= 1;
		System.out.println(array[0][2]);
		
		int secondArray[][]= {{10,20,3,0}, {6,4,1,1}, {7,5,8,2}};
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<4;j++) {
				System.out.print(secondArray[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
