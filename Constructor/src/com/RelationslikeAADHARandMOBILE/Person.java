package com.RelationslikeAADHARandMOBILE;

public class Person {
	public Person() {
		
	}
	
	public Person(int pid, String pname, double psal, AADHAR adr, Mobile[] mob) {
		
		this.pid = pid;
		this.pname = pname;
		this.psal = psal;
		this.adr = adr;
		this.mob = mob;
	}

	private int pid;
	private String pname;
	private double psal;
	private AADHAR adr;
	private Mobile[] mob;
	
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
	public AADHAR getAdr() {
		return adr;
	}
	public void setAdr(AADHAR adr) {
		this.adr = adr;
	}
	public Mobile[] getMob() {
		return mob;
	}
	public void setMob(Mobile[] mob) {
		this.mob = mob;
	}
}
 
	 