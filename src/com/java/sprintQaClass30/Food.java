package com.java.sprintQaClass30;

public abstract class Food {
	
	String foodItem;
	
	Food(String foodItem){
		this.foodItem = foodItem;
	}
	
	abstract void eat();
	
	void display() {
		System.out.println("I am a foodie");
	}
}

class HealthyFood extends Food{

	HealthyFood(String foodItem){
		super(foodItem);
	}
	
	@Override
	void eat() {
		System.out.println("eat healthy food");
		
	}
	
}
