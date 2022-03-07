package com.java.sprintQaClass27;

public class Circle {

	private int radius;
	
	//1
	Circle(){
		this.radius = 1;
	}
	
	//2
	Circle(int radius){
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}
	
	public double area() {
		double area = 3.14*radius*radius;
		return area;
	}
}
