package com.java.sprintQaClass27;

public class Bank {
	
	private String accountNumber = "1001";
	private String accountName;
	private int balance;
	private int age = 30;
	private String phoneNumber;
	
	
	public int getBalance() {
		return balance;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

}
