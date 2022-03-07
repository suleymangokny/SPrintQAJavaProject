package com.java.sprintQaClass21;

class Bank {
	
	int balance;
	String accountName;
	int accountNumber;
	String accountType;
	
	Bank(int balance, String accountName){
		this.balance = balance;
		this.accountName = accountName;
	}


	void deposit(int amount) {
		System.out.println(accountName+" has deposited "+amount);
	}
	
	void withdraw(int amount) {
		System.out.println(accountName+" has withdrawn "+amount);
	}


	public static void main(String[] args) {
		
		//constructor will set initial values for objects
		Bank b1 = new Bank(100,"Alex");
		System.out.println(b1.balance);
		System.out.println(b1.accountName);
	
	}
}