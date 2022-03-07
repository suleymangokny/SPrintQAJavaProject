package com.java.sprintQaClass22;

public class Student {

	
	//object/instance variables
	String name;
	int rollNo = 0;
	
	//class/static variables
	static String schoolName = "SprintQa";   //ABC
	static int studentCount=0;
	
	
	//2nd constructor
	Student(String nameFromUser){   //local variable
		this.name=nameFromUser;     //this represent current object
		rollNo = rollNo +1; 	
		studentCount++;
	}
	
	static void printSchoolName() {
		System.out.println(Student.schoolName);
	}
	
	static void changeName() {
		schoolName = "ABC";
	}
	void display() {
		
		System.out.println("Name = "+name+" Roll no "+rollNo+" SchoolName "+ schoolName);
	}

	
}
