package com.cisco;

public class Employee {

	private int eid;
	private String ename;
	private double esal;
	private Department[] de;
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
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public Department[] getDe() {
		return de;
	}
	public void setDe(Department[] de) {
		this.de = de;
	}
	
}
