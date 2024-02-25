package com.wipro;

public class STest {

	public static void main(String[] args) {
		 Student s = new Student();
		 System.out.println("Address of s: "+s);
		 
		 Student t = new Student(1);
		 System.out.println("Student Id:"+t.getSid());
		 
		 Student u = new Student(2,"Radhika");
		 System.out.println("Student Id:"+u.getSid()+"--"+"Student Name:"+u.getSname());
		 
		 
		 Student v = new Student(3,"Lucky",33.56); 
		 System.out.println("Student Id:"+v.getSid()+"---"+"Student Id:"+v.getSname()+"--"+"Student Age:"+v.getSage());
	}

}
