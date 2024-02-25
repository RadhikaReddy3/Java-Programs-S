package com.ParentandChild;

public class T {

	T(String msg){
		super();
		
		
	}
public static void main(String[] args) {
	
	 T e = new T("Parent of Err");
     // Display the name of the parent class directly
     System.out.println("Parent class of T: " +  T.class.getSuperclass().getSimpleName());
     System.out.println("Hii");  

}
}