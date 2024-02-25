package com.Tuesday;

public class Person {
	private int pid;
	private String pname;
	private double psal;
	private Adhar ad;
	private Mobile[] mob;
	public Person() {
		System.out.println("Def Constructor");
	}
	
	public Person(int pid, String pname, double psal, Adhar ad, Mobile[] mob) {
		 
		System.out.println("Five Arg Constructor");
		this.pid = pid;
		this.pname = pname;
		this.psal = psal;
		this.ad = ad;
		this.mob = mob;
	}
	 
	
	
	public Adhar getAd() {
		return ad;
	}
	public void setAd(Adhar ad) {
		this.ad = ad;
	}
	public Mobile[] getMob() {
		return mob;
	}
	public void setMob(Mobile[] mob) {
		this.mob = mob;
	}
	 
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPsal() {
		return psal;
	}
	public void setPsal(double psal) {
		this.psal = psal;
	}
	 
	

}
