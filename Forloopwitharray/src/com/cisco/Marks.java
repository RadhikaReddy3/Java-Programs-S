package com.cisco;

public class Marks {

	public static void main(String[] args) {
		int tmarks = 100;  
		int[] marks = {45,56,78,33,34,45};
		int sum =0;
		int pass_count = 0;
		int fail_count = 0;
		
		for (int i=0; i <= marks.length-1; i=i+1) {
			
			sum=sum + marks[i]; 
			
			if(marks[i]>35) {
				System.out.println("Passed and marks is :"+"At index "+i+" [marks] :"+marks[i]+"/"+tmarks);
				pass_count++;
			}
			else {
				System.out.println("Failed and marks is: "+"At index "+i+" [marks] :"+marks[i]+"/"+tmarks);
				fail_count++;
			}
			
		  
			
		}
		 System.out.println("No.of subjects passed by student: "+pass_count);
		 System.out.println("No.of subjects failed by student: "+fail_count);
		 System.out.println("Total Marks: "+sum+"/600");
		 
		 //For Percentage
		 double Per = (sum/marks.length);
		 System.out.println("Percentage: "+Per);
		 
		 //For Grade
		 if(Per==100) {
			 System.out.println("Grade: Outstanding");
		 }
		 else if(Per<=99&&Per>=90) {
			 System.out.println("Grade: A+");
		 }
		 else if(Per<=89&&Per>=75) {
			 System.out.println("Grade: A");
		 }
		 else if(Per<=74&&Per>=60) {
			 System.out.println("Grade: B+");
		 }
		 else if(Per<=59&&Per>=40) {
			 System.out.println("Grade: B+");
		 }
		 else if(Per<=40&&Per>=30) {
			 System.out.println("Grade: C");
		 }
		 else if(Per<=29&&Per>=20) {
			 System.out.println("Grade: D");
		 }
		 
		  
		
	}

}
