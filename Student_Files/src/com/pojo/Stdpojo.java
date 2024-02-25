package com.pojo;

public class Stdpojo {

	
	private int sid;
    private String sname;
	private int sage;
	private double smarks;
	
	
	
	public Stdpojo() {
		
	}
	
	 public Stdpojo(int sid, String sname, int sage, double smarks) {
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.smarks = smarks;
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

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public double getSmarks() {
		return smarks;
	}

	public void setSmarks(double smarks) {
		this.smarks = smarks;
	}

		 
	 
		 

	}


