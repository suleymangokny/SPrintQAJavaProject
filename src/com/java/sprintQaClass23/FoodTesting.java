package com.java.sprintQaClass23;

public class FoodTesting {

	public static void main(String[] args) {
		
		Food f1 = new Food();  //no parameter

		f1.display();
		
		Food f2 = new Food("pasta",300,"Italian");
		f2.display();
		
		Food f3 = new Food("pizza",500,"Italian");
		f3.display();
		
		Food f4 = new Food("Hamburger",250,"Italian");
		f4.display();
		
		f4.displayOrder();
		
	}

}
