package com.slokam;

import java.util.Scanner;

public class Smarks {

	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 System.out.println("Please Enter name of student:");
	 String sn = s.next();
	 System.out.println("Name of the student:"+sn+"\n");
	 
	 System.out.println("Please enter Hall ticket No of student:");
	 String sh = s.next();
	 System.out.println("Hallticket No of the student:"+sh+"\n");
	 System.out.println("Please enter the Subject marks of student"+"\n");
	 
	 System.out.println("Enter Telugu marks:");
	 int telugu = s.nextInt();
	 System.out.println("Telugu Marks: "+telugu+"\n");
	 
	 System.out.println("Enter Hindi marks:");
	 int hindi = s.nextInt();
	 System.out.println("Hindi Marks: "+hindi+"\n");
	 
	 System.out.println("Enter English marks:");
	 int english = s.nextInt();
	 System.out.println("English Marks: "+english+"\n");
	 
	 System.out.println("Enter Maths marks:");
	 int maths = s.nextInt();
	 System.out.println("Maths Marks: "+maths+"\n");
	 
	 System.out.println("Enter Science marks:");
	 int Science = s.nextInt();
	 System.out.println("Science Marks: "+Science+"\n");
	 
	 System.out.println("Enter Social marks:");
	 int Social = s.nextInt();
	 System.out.println("Social Marks: "+Social+"\n");
	 
	 double Stotal = (telugu+hindi+english+maths+Science+Social);
	 System.out.println("Total Marks: "+Stotal+"\n");
	 
	 double per = Stotal/6;
	 System.out.println("Percentage: "+per+"\n");
	 
	 System.out.println(sn+" grade is mentioned below");
	 
//Use If else if for finding grade	
	 
	 if(per<50) 
	 {
       System.out.println(sn+" got C grade");	 
	 }
	 else if(per>=50&&per<60) {
		 System.out.println(sn+" got B grade");	 
	 }
	 else if(per>=60&&per<70) {
		 System.out.println(sn+" got B+ grade");	 
	 }
	 else if(per>=70&&per<80) {
		 System.out.println(sn+" got A grade");	 
	 }
	 else if(per>=80&&per<90) {
		 System.out.println(sn+" got A+ grade");	 
	 }
	 else if(per>=90&&per<=100) {
		 System.out.println(sn+" got O grade");	 
	 }
	 else {
		 System.out.println("No grader");
	 }
	      
	 s.close();
	}

}


















 