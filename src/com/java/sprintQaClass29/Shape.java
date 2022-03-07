package com.java.sprintQaClass29;

public abstract class Shape {
	
	String colour;
	
	Shape(){
		System.out.println("Shape constructor");
	}

	Shape(String colour){
		this.colour = colour;
	}
	
	abstract void draw();
	
}


