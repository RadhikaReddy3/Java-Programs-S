package com.RelationslikeAADHARandMOBILE;

public class Student {
	
	private int sid;
	private String Sname;
	private double smarks;
	private pancard pa;
	private Address[] ad;
	
	public Student() {
		System.out.println("Def constructor");
	}
	public Student(int sid, String sname, double smarks, pancard pa, Address[] ad) {
		 
		this.sid = sid;
		Sname = sname;
		this.smarks = smarks;
		this.pa = pa;
		this.ad = ad;
	}
	 
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public double getSmarks() {
		return smarks;
	}
	public void setSmarks(double smarks) {
		this.smarks = smarks;
	}
	public pancard getPa() {
		return pa;
	}
	public void setPa(pancard pa) {
		this.pa = pa;
	}
	public Address[] getAd() {
		return ad;
	}
	public void setAd(Address[] ad) {
		this.ad = ad;
	}
	 

}
