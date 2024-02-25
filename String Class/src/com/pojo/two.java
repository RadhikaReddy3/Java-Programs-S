package com.pojo;

public class two {

	public static void main(String[] args) {
		 
		String s = new String("Siva Kumar123");
		String s1 = new String("Siva SKumar123");
		String s2 = s1.trim();
		
		String s3 = new String("ABCDS");
		String s4 = new String("abcd");
		//char s2= s.charAt(0);
		//System.out.println(s2);
		System.out.println(s.charAt(2));
		System.out.println(s.compareTo(s2));//if true it returns 0
		System.out.println(s.compareTo(s1));//if false it returns any value -ve or +ve
		System.out.println(s3.compareToIgnoreCase(s4));//if true returns 0
		System.out.println(s1.contains(s));//returns true or false
		System.out.println(s1.endsWith("3"));//returns true or false
		System.out.println(s1.startsWith("S"));//returns true or false
		System.out.println(s1.isEmpty());//returns true or false
		System.out.println(s3.replace("S", "u"));
		System.out.println(s3.substring(1,5));
		System.out.println(s1.lastIndexOf("S"));

	}

}
