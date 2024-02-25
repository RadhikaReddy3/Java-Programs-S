package com.cisco;

public class StudentEntity {
	
	
	private Integer sid;
	private String sname;
	private double smarks;
	private long sphone;
	
	
	public StudentEntity() {
		
	}
	
	 
	
	
	@Override
	public String toString() {
		return "sid=" + sid + ", sname=" + sname + ", smarks=" + smarks + ", sphone=" + sphone ;
	}

	 
	
	
	public StudentEntity(Integer sid, String sname, double smarks, long sphone) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
		this.sphone = sphone;
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
	public double getSmarks() {
		return smarks;
	}
	public void setSmarks(double smarks) {
		this.smarks = smarks;
	}
	public long getSphone() {
		return sphone;
	}
	public void setSphone(long sphone) {
		this.sphone = sphone;
	}




 
	 

}
