package com.cisco;

public class student {
	
	private int sid;
	private String sname;
	private double sage;
	
	//If you remove this constructor you cant execute second part in Stest.java
	public student() 
	{
		System.out.println("Default Constructor");
	}
	/*public student(int id, String name, double age, String dept) {
		System.out.println("Arg constructor: "+id);
		System.out.println("Arg constructor: "+name);
		System.out.println("Arg constructor: "+age);
		System.out.println("Arg constructor: "+dept);//Only constructor called but object initialization not done,if done also we are not knowing
	}*/

	 
	public student(int sid, String sname, double sage) {
		System.out.println("arg constructor");
		this.sid=sid;
		this.sname=sname;
		this.sage= sage;
	}
	
	public int getSid() {
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
