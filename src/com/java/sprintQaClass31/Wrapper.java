package com.java.sprintQaClass31;

public class Wrapper {

	public static void main(String[] args) {
		
		int  i = 10;
		
		Integer i1 = new Integer(20);

		System.out.println(i);
		System.out.println(i1);
		
		i1= i;  //autoboxing
		
		
		Integer k = new Integer(100);
		int z = k;    //unboxing
		System.out.println(k);
	}

}
