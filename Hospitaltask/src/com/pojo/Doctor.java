package com.pojo;

public class Doctor {
	
	
	private int did;
	private String dname;
	private long dfee;
	
	public Doctor() {
		
	}
	public Doctor(int did, String dname, long dfee) {
		 
		this.did = did;
		this.dname = dname;
		this.dfee = dfee;
	}
	 
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public long getDfee() {
		return dfee;
	}
	public void setDfee(long dfee) {
		this.dfee = dfee;
	}
	 
	

}
