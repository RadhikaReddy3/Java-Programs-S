package com.pojo;

public class Employee {
	
	private int eid;
	private String ename;
	private double esal;
	private String edesg;
	
	
	public Employee() {
		
	}
	public Employee(int eid, String ename, double esal, String edesg) {
		 
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.edesg = edesg;
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
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public String getEdesg() {
		return edesg;
	}
	public void setEdesg(String edesg) {
		this.edesg = edesg;
	}
	 

}
