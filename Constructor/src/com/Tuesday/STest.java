package com.Tuesday;

public class STest {

	public static void main(String[] args) {
		Student s = new Student();
		
		s.setSid(2);
		s.setSname("Lucky");
		s.setSage(23.43);
		
		
		System.out.println(s.getSid()+"---"+s.getSname()+"---"+s.getSage());
		
		Student s1 = new Student(1,"Radhika",113.23);
		System.out.println(s1.getSid()+"---"+s1.getSname()+"---"+s1.getSage());

		
	}

}
