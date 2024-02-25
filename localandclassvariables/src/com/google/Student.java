package com.google;

public class Student {
	//class variables
	int sid;
	String sname;
	float smarks;
	char sgender;
	boolean sresult;
	String scourse;
	double sage;
	String sschl = "GEMS";
	
	public static void main(String[] args) {
		//Local Variable
				/*byte sid;
				sid = 123;
				System.out.println(sid);*/
		 
		Student s = new Student();
		System.out.println(s.sid);
		System.out.println(s.sname);
		System.out.println(s.smarks);
		System.out.println(s.sgender);
		System.out.println(s.sresult);
		System.out.println(s.scourse);
		System.out.println(s.sage);
		System.out.println(s.sschl);
		
		System.out.println("-----------------------------Next-------------------------------");
		Student s1 = new Student();
		s1.sid = 1;
		s1.sname = "Lalitha";
		s1.smarks = 95.9999999999999f;
		s1.sgender = 'F';
		s1.sresult = true;
		s1.scourse = "Java with cloud";
		s1.sage = 21.999999999999999999;
	
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.smarks);
		System.out.println(s1.sgender);
		System.out.println(s1.sresult);
		System.out.println(s1.scourse);
		System.out.println(s1.sage);
		System.out.println(s1.sschl);
		System.out.println("-----------------------------Next Student-------------------------------");
		 
		
	}
	

}
