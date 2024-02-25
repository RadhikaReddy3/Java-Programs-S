package com.cisco;

public class Studenttest {

	public static void main(String[] args) {
		 Student s = new Student();
		 s.sname = "Radhika Reddy";
		 s.sid = 1;
		 s.sage = 21;
		 s.scourse = "Java";
		 
		 System.out.println("Student Name: "+s.sname);
		 System.out.println("Student ID: "+s.sid);
		 System.out.println("Student Age: "+s.sage);
		 System.out.println("Student course: "+s.scourse);
		 System.out.println("Student Address: "+s);
		 System.out.println("---------------------------Next Student Details---------------------------");

		 Student s1 = new Student();
		 s1.sname = "Lalitha Reddy";
		 s1.sid = 2;
		 s1.sage = 43;
		 s1.scourse = "Spring";
		 
		 System.out.println("Student Name: "+s1.sname);
		 System.out.println("Student ID: "+s1.sid);
		 System.out.println("Student Age: "+s1.sage);
		 System.out.println("Student course: "+s1.scourse);
		 System.out.println("Student Address: "+s1);
		 System.out.println("---------------------------Next Student Details---------------------------");
   
		 Student s2 = new Student();
		 s2.sname = "Surotham Reddy";
		 s2.sid = 3;
		 s2.sage = 50;
		 s2.scourse = "Spring boot";
		 
		 System.out.println("Student Name: "+s2.sname);
		 System.out.println("Student ID: "+s2.sid);
		 System.out.println("Student Age: "+s2.sage);
		 System.out.println("Student course: "+s2.scourse);
		 System.out.println("Student Address: "+s2);
	}

}
