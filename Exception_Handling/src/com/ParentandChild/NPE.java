package com.ParentandChild;

public class NPE extends RTE{
	NPE(String msg){
		super(msg);
		
		
	}
public static void main(String[] args) {
	
	 NPE e = new NPE("Parent of NPE");
     // Display the name of the parent class directly
     System.out.println("Parent class of NPE: " + RTE.class.getSimpleName());
     System.out.println("Hii"); 
	 
}}
