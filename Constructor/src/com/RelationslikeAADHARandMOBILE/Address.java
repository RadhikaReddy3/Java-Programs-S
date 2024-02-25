package com.RelationslikeAADHARandMOBILE;

public class Address {
	
	private int aid;
	private String ploc;
	private String nloc;
	
	public Address() {
		System.out.println("Def Address Constructor");
	}
	
	public Address(int aid, String ploc, String nloc) {
		 
		this.aid = aid;
		this.ploc = ploc;
		this.nloc = nloc;
	}
 
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getPloc() {
		return ploc;
	}
	public void setPloc(String ploc) {
		this.ploc = ploc;
	}
	public String getNloc() {
		return nloc;
	}
	public void setNloc(String nloc) {
		this.nloc = nloc;
	}
	 
	

}
