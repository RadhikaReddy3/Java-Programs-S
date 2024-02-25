package com.controller;
import java.io.File; 
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		 
       Filedata s =  null;
        
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Press 1 to print All Student Details");
       System.out.println("Press 2 to print Btech details of Student");
       System.out.println("Press 3 to print Mtech details of Student");
      
       int select =sc.nextInt();
       System.out.println(select);
       //s= new Studentdata();
       //s.getalldata();
        
       Filedata f;
       
       switch(select) {
       
       case 1:
    	   f=new Studentdata();
    	   f.getalldata();
    	   
    	 //s= new Studentdata();
           //s.getalldata();
    	   break;
    	   
       case 2:
    	   f=new Btechdata();
    	   f.getalldata();
    	   
    	   //s=new Btechdata();
    	   //s.getalldata();
    	   
    	   break;
    	   
       case 3:
    	   f=new Mtech();
    	   f.getalldata(); 
    	   
    	   //s=new Mtech();
    	   //s.getalldata();
    	   break;
    	   
       default:
    	   System.out.println("no option");
       
       
       }
      
       
       

	}

}
