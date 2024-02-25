package com.cisco;

public class StudentPojo {
	
	private int sid;
	private String sname;
	private double smarks;
	private int sage;
	@Override
	public String toString() {
		return "StudentPojo [sid=" + sid + ", sname=" + sname + ", smarks=" + smarks + ", sage=" + sage + "]";
	}
	 
	
	public StudentPojo() {
		
	}
	public StudentPojo(int sid, String sname, double smarks, int sage) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
		this.sage = sage;
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
	public double getSmarks() {
		return smarks;
	}
	public void setSmarks(double smarks) {
		this.smarks = smarks;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	 

}
