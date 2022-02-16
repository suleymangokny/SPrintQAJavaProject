package com.java.sprintQaClass06;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String username, password -> Login successful
		// if username 
			//if password 
					//Login successful
			//Password incorrect
		//username incorrect
		
		String username = "test"; 
		String password = "test1";
		
		String dbUsername = "test";
		String dbPassword = "test123";
		
		if(username == dbUsername) {
			
			if(password == dbPassword) {
				System.out.println("Login successful");
			}else {
				System.out.println("Password incorrect");
			}
		}else {
			System.out.println("Username incorrect");
		}
		

	}

}
