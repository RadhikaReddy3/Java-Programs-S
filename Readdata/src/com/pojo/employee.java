package com.pojo;

public class employee {
	private int eid;
	private String ename;
	private int eage;
	private double esal;
	private String edes;
	
	
	public employee() {
		
	}
	 
	
	public employee(int eid, String ename, int eage, double esal, String edes) {
		 
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
		this.esal = esal;
		this.edes = edes;
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


	public int getEage() {
		return eage;
	}


	public void setEage(int eage) {
		this.eage = eage;
	}


	public double getEsal() {
		return esal;
	}


	public void setEsal(double esal) {
		this.esal = esal;
	}


	public String getEdes() {
		return edes;
	}


	public void setEdes(String edes) {
		this.edes = edes;
	}


	 
	
	
	 
	 

	 

}
