package com.Tuesday;

public class Student {
	
	
	private int sid;
	private String sname;
	private double sage;
	
	public Student() {
		System.out.println("Default Constructor");
	}
	
	public Student(int sid, String sname, double sage) {
		System.out.println("Three Argumented Constructor");
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
	}
	 
	
	
	public int getSid()
	{
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getSage() {
		return sage;
	}
	public void setSage(double sage) {
		this.sage = sage;
	}
	 

}
