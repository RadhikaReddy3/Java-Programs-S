package com.m;

public class Test1 {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.setSid(1);
		stu.setSname("manju");
		stu.setSfee(45090.89);
		
		Course c = new Course();
        c.setCid(101);
        c.setCname("java");
        c.setCduration(80);
        Course c1 = new Course();
        c1.setCid(102);
        c1.setCname("Mysql");
        c1.setCduration(60);
        Course[] cou = {c, c1};
        stu.setScou(cou);


		
		int sid = stu.getSid();
		System.out.println("Student id = "+sid);
		String sname = stu.getSname();
		System.out.println("Student name = "+sname);
		double sfee = stu.getSfee();
		System.out.println("Student fee = "+sfee);
		
		Course[] scou = stu.getScou();
        System.out.println("Student Courses: ");
        for(int i=0; i<=scou.length-1; i=i+1) {
        	System.out.println("Course id "+scou[i].getCid()+"  Course Name  "+scou[i].getCname()+"  Course Duration  "+scou[i].getCduration());
        	
        }


	}

}
