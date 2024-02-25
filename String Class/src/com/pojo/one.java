package com.pojo;

public class one {
	
	
//Working how will it happens we will check- when you call one method that method can call another method but same return types
	/*public String trim(String s) {
		return s.trim();
	}
	public String toUppertrim(String s) {
		String h = trim(s);
		return h.toUpperCase();
		//return h.toLowerCase();
	}
	
	public static void main(String[] args)
	{
	     one h = new one();
	     String m = h.toUppertrim("   sivaKumar   ");
	     System.out.println(m);
	
	}*/

	public static void main(String[] args) {
	//Internally string class performs above operations by java in optimized way 
		String s1 ="Siva";
		String s2 = new String("  Siva Kumar  ");
		System.out.println(s1);
		System.out.println(s2);
		int s3=s1.length();
		System.out.println(s3);  
		int s4=s2.length();
		System.out.println(s4);
		System.out.println(s2.trim());
		System.out.println(s2.toLowerCase().trim());	
		System.out.println(s2.toUpperCase().trim());

	}

}
