package com.ParentandChild;

public class Err extends T {
	  Err(String msg){
		super(msg);
		
		
	}
public static void main(String[] args) {
	
	 Err e = new Err("Parent of Err");
     // Display the name of the parent class directly
     System.out.println("Parent class of Err: " +  Err.class.getSuperclass().getSimpleName());
     //System.out.println("Parent class of Exe: " + T.class.getSimpleName());
     
     System.out.println("Hii"); 
	 
	  
}
}