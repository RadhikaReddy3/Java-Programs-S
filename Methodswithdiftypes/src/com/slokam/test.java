package com.slokam;

public class test {

	public static void main(String[] args) {
		System.out.println("Execution of m1 method:"+"\n"); 
		Slkstd v = new Slkstd();
		v.m1();
		
		System.out.println("                                                         "+"\n"+"                                                         "+"\n"+"                                                         ");
		
		System.out.println("Execution of m2 method:"+"\n");
		v.m2(95, "siva");
		System.out.println("                                                         "+"\n"+"                                                         "+"\n"+"                                                         ");

		System.out.println("Execution of m3 method:"+"\n");
		double[] m = {56,78,90,56,67,89};
		String[] su= {"Tel","hin","eng","mat","sci","soc"};
		v.m3(m, su);
		
		System.out.println("                                                         "+"\n"+"                                                         "+"\n"+"                                                         ");
		
		System.out.println("Execution of m4 method:"+"\n");
		Student stu = new Student();
		stu.sid=1;
		stu.sname="Radhika";
		double[]ma = {45,56,67,78,89,90};
		stu.marks=ma;
		String[] sub= {"Tel","hin","eng","mat","sci","soc"};
		stu.subj=sub;
		v.m4(stu);
		
		//Student[] n ={};for(int i=0;i<std.marks.length;i++) {
		 

		}
	
		

	}


