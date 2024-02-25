package com.slokam;

public class Studentmarksifelseif {

	public static void main(String[] args) {
		int marks;
		 //marks = 34;
		 //marks = 36;
		 marks =50;
		 //marks = 70;
		// marks = 90;
	/*if(marks>35) {
		System.out.println("Topper");
	}*/
	if (marks<=35) {
		System.out.println("Fail");
	}
	else if (marks>=36&&marks<50) {
		System.out.println("Pass");//else if stops the execution when condition is true
	}
	else if (marks>=50&&marks<70) {
		System.out.println("second class");
	}
	else if (marks>=70&&marks<90) {
		System.out.println("First class");
	}
	else if (marks>=90&&marks<=100) {
		System.out.println("Distinction");
	}
	
	System.out.println("End Result is above Mentioned");  
	}



	}


