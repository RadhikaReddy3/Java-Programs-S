package com.pojo;

public class Patient {
	
	private int pid;
	private String pname;
	private int page;
	private Adhar ad;
	private ContactDetails[]cd;
	private Doctor[]doc;
	private FoodandBev[] fb;
	private Lab[] lb;
	
	public Patient() {
		
	}
	
	public Patient(int pid, String pname, int page, Adhar ad, ContactDetails[] cd, Doctor[] doc, FoodandBev[] fb,
			Lab[] lb) {
		 
		this.pid = pid;
		this.pname = pname;
		this.page = page;
		this.ad = ad;
		this.cd = cd;
		this.doc = doc;
		this.fb = fb;
		this.lb = lb;
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
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public Adhar getAd() {
		return ad;
	}
	public void setAd(Adhar ad) {
		this.ad = ad;
	}
	public ContactDetails[] getCd() {
		return cd;
	}
	public void setCd(ContactDetails[] cd) {
		this.cd = cd;
	}
	public Doctor[] getDoc() {
		return doc;
	}
	public void setDoc(Doctor[] doc) {
		this.doc = doc;
	}
	public FoodandBev[] getFb() {
		return fb;
	}
	public void setFb(FoodandBev[] fb) {
		this.fb = fb;
	}
	public Lab[] getLb() {
		return lb;
	}
	public void setLb(Lab[] lb) {
		this.lb = lb;
	}
	 

}
