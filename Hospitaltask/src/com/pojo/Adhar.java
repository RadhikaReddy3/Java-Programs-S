package com.pojo;

public class Adhar {
	
	
	
	
	private int aid;
	private String anum;
	private String aloc;
	
	public Adhar() {
		
	}
	public Adhar(int aid, String anum, String aloc) {
		 
		this.aid = aid;
		this.anum = anum;
		this.aloc = aloc;
	}
	 
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnum() {
		return anum;
	}
	public void setAnum(String anum) {
		this.anum = anum;
	}
	public String getAloc() {
		return aloc;
	}
	public void setAloc(String aloc) {
		this.aloc = aloc;
	}
	 

}
