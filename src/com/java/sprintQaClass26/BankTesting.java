package com.java.sprintQaClass26;


class HSBCBank extends Bank{
	
	int balance = 2000;

	
	public void displayInterestRate() {
		System.out.println("6%");
	}
	
	public void calculate() {
		System.out.println("calculating....");
	}
}
class CityBank extends Bank{
	
	int balance = 5000;
	@Override
	public void displayInterestRate() {
		System.out.println("8%");
	}
	
	
	public void withdraw() {
		System.out.println(balance-10);
	}
}


public class BankTesting{
	
	public static void main(String args[]) {
		//1 Parent ref =  parent obj
		Bank b1 = new Bank();
		b1.displayInterestRate();
		
		//2 Child ref = Child obj
		HSBCBank h1 =  new HSBCBank();
		h1.displayInterestRate();
		h1.calculate();
		
		//3 Parent ref = Child obj
		Bank b2 = new HSBCBank();
		b2.displayInterestRate();
		//b2.calculate();
		
		//4. Chid ref = Parent obj    -> not allowed
		//HSBCBank h2 = new Bank();
		//h2.displayInterestRate();
		}
	
}