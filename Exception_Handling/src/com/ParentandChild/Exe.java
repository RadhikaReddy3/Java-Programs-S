package com.ParentandChild;

public class Exe extends T {
	Exe(String msg){
		super(msg);
		
		
	}
public static void main(String[] args) {
	
	 Exe r = new Exe("Parent of Exe");
     // Display the name of the parent class directly
	 System.out.println("Parent class of Exe: " +  Err.class.getSuperclass().getSimpleName());
     //System.out.println("Parent class of Exe: " + T.class.getSimpleName());
     System.out.println("Hii"); 
	 

}
}