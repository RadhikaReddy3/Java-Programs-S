package com.slokam;

public class Customer {
	private int cid;
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public long getCphno() {
		return cphno;
	}

	public void setCphno(long cphno) {
		this.cphno = cphno;
	}

	public String getCloc() {
		return cloc;
	}

	public void setCloc(String cloc) {
		this.cloc = cloc;
	}

	public String getCtrans() {
		return ctrans;
	}

	public void setCtrans(String ctrans) {
		this.ctrans = ctrans;
	}

 

	private String cname;
	private long cphno;
	private String cloc;
	private String ctrans;
	 
	
	
	
	public Customer() {
		
	}
	
	public Customer(int cid, String cname, long cphno, String cloc, String ctrans ) {
		 
		this.cid = cid;
		this.cname = cname;
		this.cphno = cphno;
		this.cloc = cloc;
		this.ctrans = ctrans;
		 
	}
	 
	
	 
}
