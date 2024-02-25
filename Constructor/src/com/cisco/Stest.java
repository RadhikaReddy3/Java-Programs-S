package com.cisco;

public class Stest {
	 
	

	public static void main(String[] args) {
		
		//student c = new student(1,"rosy",56.55,"eee");//Only constructor called but object initialization not done,if done also we are not knowing
		 
		//Constructor intialization to object
		student b = new student(1,"ram",75.5);
		System.out.println(b.getSid());
		System.out.println(b.getSname());
		System.out.println(b.getSage());
		
		
		//Object-Intialized through setter methods 
		student s = new student();
		s.setSid(2);
		s.setSname("siva");
		s.setSage(56.76);
		
		System.out.println(s.getSid());
		System.out.println(s.getSname());
		System.out.println(s.getSage());

	}

}
