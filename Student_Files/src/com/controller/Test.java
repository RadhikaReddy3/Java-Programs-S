package com.controller;
import java.util.Scanner;
import com.pojo.Stdpojo;
public class Test {

	public static void main(String[] args) {
	    Stdpojo std = new Stdpojo();
		Scanner s = new Scanner(System.in);
		
		FileDao f = new FileDao();
		System.out.println("Enter Student ID: ");
		 
		std.setSid(s.nextInt());
		
		System.out.println("Enter Student Name: ");
		 
		std.setSname(s.next());
		System.out.println("Enter Student Age: ");
		std.setSage(s.nextInt());
		System.out.println("Enter Student Marks: ");
		std.setSmarks( s.nextDouble());
		
	     s.close();
		 f.insert(std);
	 
		

	}

}
