package com.vyaire;

public class STest {

	public static void main(String[] args) {

		Student s = new Student();
		s.setSid(1);
		s.setSname("ram");	
		s.setSfee(40.00);
		String[]courses= {"Java","AWS","JDBC"};
		s.setCourse(courses);
		
		  
		 
		int sid=s.getSid();
		System.out.println("Student ID: "+sid);
		String sname = s.getSname();
		System.out.println("Student name: "+sname);
		double sfee = s.getSfee();
		System.out.println("Student fee: "+sfee);
		String[]scou =s.getScou();
		for(int i =0;i<=scou.length-1;i=i+1) {
			System.out.println(scou[i]);
		}
		

	}

}
