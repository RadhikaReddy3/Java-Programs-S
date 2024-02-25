package com.vyaire;

public class emp {
	private int eid;
	private String ename;
	private int esal;
	public emp() {
		System.out.println("def constructor");
	}
	
	public emp(int eid) {
		System.out.println("one arg constructor");
		this.eid =eid;
	}
	
	public emp(int eid,String ename) {
		System.out.println("two arg constructor");
		this.eid =eid;
		this.ename =ename;
	}
	
	public emp(int eid, String ename, int esal) {
	 
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
 
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	 

}
