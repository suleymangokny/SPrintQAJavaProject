package com.java.sprintQaClass27;

public class CircleTesting {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(5);


		System.out.println(
				"Circle with radius "+c1.getRadius()+
				" is having area "+c1.area());
		
		System.out.println(
				"Circle with radius "+c2.getRadius()+
				" is having area "+c2.area());
	}

}
