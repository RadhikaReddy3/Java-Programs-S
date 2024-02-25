package com.ParentandChild;

public class RTE extends Exe {
	RTE(String msg){
		super(msg);
		
		
	}
public static void main(String[] args) {
	
	 RTE e = new RTE("Parent of Err");
     // Display the name of the parent class directly
     System.out.println("Parent class of RTE: " + Exe.class.getSimpleName());
     System.out.println("Hii"); 
	 
}}
