package com.cisco;

public class Student {
	
	private Integer sid;
	 
	private String sname;
	private Double smarks;
	private Integer sage;
	
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", smarks=" + smarks + ", sage=" + sage + "]";
	}
	
	public Student() {
		
	}
	
	public Student(Integer sid, String sname, Double smarks, Integer sage) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
		this.sage = sage;
	}
	 
	
	
	
	
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Double getSmarks() {
		return smarks;
	}
	public void setSmarks(Double smarks) {
		this.smarks = smarks;
	}
	public Integer getSage() {
		return sage;
	}
	public void setSage(Integer sage) {
		this.sage = sage;
	}
	 
	

}
