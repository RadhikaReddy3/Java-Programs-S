package com.slokam;

public class StudentMarks {

	public static void main(String[] args) {//Execution starts from main method
		 int marks;
		 //marks = 34;
		 //marks = 36;
		 //marks =50;
		 //marks = 70;
		 marks = 90;
		 
	if (marks<=35) {
		System.out.println("Fail");
	}
	if (marks>=36&&marks<50) {
		System.out.println("Pass");
	}
	if (marks>=50&&marks<70) {
		System.out.println("second class");
	}
	if (marks>=70&&marks<90) {
		System.out.println("First class");
	}
	if (marks>=90&&marks<=100) {
		System.out.println("Distinction");
	}
	
	  
	}

}
