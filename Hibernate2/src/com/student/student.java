package com.student;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
@Entity

public class student {
 
	@Id
	@GeneratedValue
	private int sid;
	private String sname;
	private double smarks;
	private String sloc;
	
	
	@Override
	public String toString() {
		return "sid=" + sid + ", sname=" + sname + ", smarks=" + smarks + ", sloc=" + sloc + "";
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
	public String getSloc() {
		return sloc;
	}
	public void setSloc(String sloc) {
		this.sloc = sloc;
	}
	 

}
