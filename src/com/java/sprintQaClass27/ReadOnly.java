package com.java.sprintQaClass27;

public class ReadOnly {
	
	private String accountNumber;
	private String accountName;
	private int balance = 1000;
	private int age = 30;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public int getBalance() {
		return balance;
	}
	public int getAge() {
		return age;
	}
	
	
}
