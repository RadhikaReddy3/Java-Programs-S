package com.cisco;

public class One {
	public One() {
		System.out.println("Default Constructor");
	}
	public One(int sid) {
	 System.out.println("One Arg constructor: "+sid);	
	}
	public One(int sid,String sname) {
		System.out.println("Two Arg Constructor: "+sid+"---"+sname);
	}

	public static void main(String[] args) {
		 //One k = new One();
         //One n = new One(12);
         //One g = new One(13,"Radhika");
         
	}

}

