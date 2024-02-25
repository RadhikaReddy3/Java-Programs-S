package com.m;

public class Employee {
	private int eid;
	private String ename;
	private double esal;
	private Department[] dep;
	
	
	public Department[] getDep() {
		return this.dep;
	}
	public void setDep(Department[] dep) {
		this.dep = dep;
	}
	public  void  setEid(int id) {
		this.eid = id;
		}
	public int getEid() {
		return this.eid;
		
	}
	public void setEname(String name){
		this.ename = name;
	}
	
	public String getEname() {
		return this.ename;
		
	}
	public void setEsal(double sal){
		this.esal = sal;
	}
	
	public double getEsal() {
		return this.esal;
		
	}

}
