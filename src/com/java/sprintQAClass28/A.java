package com.java.sprintQAClass28;

public class A {
	
	void area(int a, int b) {
		System.out.println(a*b);
	}

	void area(int a) {
		System.out.println(a*a);
	}
	public static void main(String[] args) {

		A obj = new A();
		obj.area(2);
		obj.area(3,5);
	}

}
