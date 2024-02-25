package com.vyaire;

public class S1Test {

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.setSid(1);
		s1.setSname("ram");	
		s1.setSfee(40.00);
		
		 Course c = new Course();
		 c.setCid(1);
		 c.setCname("java");
		 c.setCdur("6months");
		 
		 Course c1 = new Course();
		 c1.setCid(2);
		 c1.setCname("AWS");
		 c1.setCdur("7months");
		 
		 Course[] cd= {c,c1};
		s1.setCourse(cd);
		
		  
		 
		int sid=s1.getSid();
		System.out.println("Student ID: "+sid);
		String sname = s1.getSname();
		System.out.println("Student name: "+sname);
		double sfee = s1.getSfee();
		System.out.println("Student fee: "+sfee);
		 
		Course[] cou=s1.getCourse();
		System.out.println("---Course Details------");
		for(int i=0;i<cou.length;i++) {
		System.out.println(cou[i].getCid()+"---"+cou[i].getCname()+"---"+cou[i].getCdur());	
		}

	}

}
