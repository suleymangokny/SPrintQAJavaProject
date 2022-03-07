package com.java.sprintQaClass29;

 class Rectangle extends Shape{

	 int length;
	 int breadth;
	 
	 Rectangle(){
		 System.out.println("Rectangle constr");
	 }
	 
	 Rectangle(String colour, int length, int breadth){
		 super(colour);
		 this.length = length;
		 this.breadth = breadth;
	 }
	 
	 void draw() {
		 System.out.println("Rectangle is drawn");
	 }
}
class Circle extends Shape{

	int radius;
	Circle(){
		System.out.println("Circle const");
	}
	Circle(String colour, int radius){
		super(colour);
		this.radius = radius;
	}
	@Override
	void draw() {
		System.out.println("Circle is drawn");
		
	}
	
}