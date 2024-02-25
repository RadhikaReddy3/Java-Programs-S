package com.B;
import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 
		 System.out.println("Telugu Marks: ");
		 int tm = s.nextInt();
		 if(tm<=34) {
			 System.out.println("Pass or Fail: Fail");
		 }
		 else {
			 System.out.println("Pass or Fail: Pass");
		 }
		 System.out.println("Hindi Marks: ");
		 int hm = s.nextInt();
		 if(hm<=34) {
			 System.out.println("Pass or Fail: Fail");
		 }
		 else {
			 System.out.println("Pass or Fail: Pass");
		 }
		 System.out.println("English Marks: ");
		 int em = s.nextInt();
		 if(em<=34) {
			 System.out.println("Pass or Fail: Fail");
		 }
		 else {
			 System.out.println("Pass or Fail: Pass");
		 }
		 System.out.println("Maths Marks: ");
		 int mm = s.nextInt();
		 if(mm<=34) {
			 System.out.println("Pass or Fail: Fail");
		 }
		 else {
			 System.out.println("Pass or Fail: Pass");
		 }
		 System.out.println("Science Marks: ");
		 int sm = s.nextInt();
		 if(sm<=34) {
			 System.out.println("Pass or Fail: Fail");
		 }
		 else {
			 System.out.println("Pass or Fail: Pass");
		 }
		 System.out.println("Social Marks: ");
		 int som = s.nextInt();
		 if(som<=34) {
			 System.out.println("Pass or Fail: Fail"+"\n");
		 }
		 else {
			 System.out.println("Pass or Fail: Pass"+"\n");
		 }
		/* if(tm>=35) {
			 System.out.println("Passed");
			 if(hm>=35) {
				 System.out.println("Passed"); 
				 if(em>=35) {
					System.out.println("Passed");
					if(mm>=35) {
						System.out.println("Passed");
						if(sm>=35) {
							System.out.println("Passed");
							if(som>=35) {
								System.out.println("Passed");
								double totm = tm+hm+em+mm+sm+som;
								System.out.println("Total Marks: "+totm);
								System.out.println("Percentage: "+(totm/6));
								
							}
							else {
								System.out.println("Failed");
							}
						}
						else {
							System.out.println("Failed");
						}
					}
					else {
						System.out.println("Failed");
					}
				 }
				 else {
					 System.out.println("Failed");
				 }
			 }
			 else {
				 System.out.println("Failed");
			 }
		 }
		 else {
			 System.out.println("Failed");
		 }
			*/double totm = tm+hm+em+mm+sm+som;
			System.out.println("Total Marks : "+totm+"/600.0"+"\n");
			System.out.println("Percentage: "+(totm/6)+"\n");

		  
		  
		 
		 
		 
		 if(tm>=35&&hm>=35&&em>=35&&mm>=35&&sm>=35&&som>=35) {
			 System.out.println("Pass or Fail: Overall Pass"+"\n");
		 }
		 else
		 {
			 System.out.println("Pass or Fail: Overall Fail"+"\n");
		 }
         s.close();
	}

}
