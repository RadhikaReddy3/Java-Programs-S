package com.cisco;

public class DatatypesRange {

	public static void main(String[] args) {
		  byte m[]= {12, 34,56,78,90};
		  System.out.println(m);
		  System.out.println(m[0]);
		  System.out.println(m[1]);
		  System.out.println(m[2]);
		  System.out.println(m[3]);
		  System.out.println(m[4]);
		  System.out.println("-------------------------------------------------------------------");
          
		  m[0] = 90;
		  m[1] = 98;
		  m[2] = 97;
		  m[3] = 96;
		  m[4] = 95;
		  
		  System.out.println(m);
		  System.out.println(m[0]);
		  System.out.println(m[1]);
		  System.out.println(m[2]);
		  System.out.println(m[3]);
		  System.out.println(m[4]);
		  
		  System.out.println("-------------------------------------------------------------------");
		  
		  byte n[] = new byte[5];
		  n[0] = 90;
		  n[1] = 98;
		  n[2] = 97;
		  n[3] = 96;
		  n[4] = 95;
		  
		  System.out.println(n);
		  System.out.println(n[0]);
		  System.out.println(n[1]);
		  System.out.println(n[2]);
		  System.out.println(n[3]);
		  System.out.println(n[4]);
		  System.out.println("-------------------------------------------------------------------");
		  System.out.println("-------------------------------------------------------------------");
		  System.out.println("-------------------------------------------------------------------");
		  
		  
		  String na[] = {"ram","sita","hanuman","laxman"};
		  System.out.println(na);
		  System.out.println(na[0]);
		  System.out.println(na[1]);
		  System.out.println(na[2]);
		  System.out.println(na[3]);
		  
		
		  System.out.println("-------------------------------------------------------------------");
		  
		  String ma[] = new String[5];
		  ma[0] = "Radhika";
		  ma[1] = "Lalitha";
		  ma[2] = "Surotham reddy";
		  ma[3] = "Nithin";
		  ma[4] = "Bhavani";
		  System.out.println(ma);
		  System.out.println(ma[0]);
		  System.out.println(ma[1]);
		  System.out.println(ma[2]);
		  System.out.println(ma[3]);
		  System.out.println(ma[4]);
		  
		  
		  
		  
		  }

	}

