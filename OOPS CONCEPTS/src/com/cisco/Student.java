package com.cisco;

public class Student {
	
	
	private int sid;
	private String sname;
	private double smarks;
    private Course[] cou;
    
    
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
	public double getSmarks() {
		return smarks;
	}
	public void setSmarks(double smarks) {
		this.smarks = smarks;
	}
	public Course[] getCou() {
		return cou;
	}
	public void setCou(Course[] cou) {
		this.cou = cou;
	}
	 
    
}
