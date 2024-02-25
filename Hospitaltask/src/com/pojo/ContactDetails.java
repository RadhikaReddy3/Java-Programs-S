package com.pojo;

public class ContactDetails {
	
	public ContactDetails() {
		
	}
	public ContactDetails(int cdid, String cname, long cphone) {
		 
		this.cdid = cdid;
		this.cname = cname;
		this.cphone = cphone;
	}
	private int cdid;
	private String cname;
	private long cphone;
	
	public int getCdid() {
		return cdid;
	}
	public void setCdid(int cdid) {
		this.cdid = cdid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getCphone() {
		return cphone;
	}
	public void setCphone(long cphone) {
		this.cphone = cphone;
	}
	 
	
}