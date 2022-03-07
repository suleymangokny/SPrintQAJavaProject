package com.java.sprintQaClass23;

public class Food {
	
	//data members
	String item;
	int price;
	int quantity;
	String cuisine;
	static int noOfOrders=0;
	
	static String cafe = "SprintQa";
	
	//1
	Food(){
		noOfOrders++;
	}
	
	//2
	Food(String item,int price){
		this.item=item;
		this.price = price;
		
	}
	//3
	Food(String item,int price,String cuisine){
		this(item,price);
		this.cuisine = cuisine;
		noOfOrders++;
	}
	
	void displayOrder() {
		System.out.println(noOfOrders);
	}
	
	
	//methods
	void delivery(int quantityFromUser) {
		if(quantityFromUser > 5) {
			System.out.println("Home delivery is possible");
		}
		else {
			System.out.println("Home delivery not possible");
		}
		
	}
	
	void totalBill() {
		int totalBill = price*quantity;
		System.out.println(totalBill);
	}
	
	void display() {
		System.out.println("Item = "+item+" Price = "+price+" Quantity "+quantity+" Cuisine "+cuisine);
	}

}
