package com.java.sprintQaClass19;

public class House {

	public static void main(String[] args) {
		
		String typeOfPizza = "Panner";
		
		int quantity = 10;
		
		//function call
		
		String pizzaOutPut;
		pizzaOutPut = deliverPizza(typeOfPizza,quantity);
		
		System.out.println(pizzaOutPut);
		
	}

	static String deliverPizza(String typeOfPizza, int quantity) {
		
		
		System.out.println("1. You have ordered pizza of type " + typeOfPizza);
		System.out.println("Quantity = "+quantity);
		
		String output = "Pizza deleivered with quantity"+ quantity;
		return output;
	}
	
	
}
