package com.pojo;

public class Lab {
	private int Lid;
	private String Ltestname;
	private long ltestfee;
	
	public Lab() {
		
	}
	
	public Lab(int lid, String ltestname, long ltestfee) {
		Lid = lid;
		Ltestname = ltestname;
		this.ltestfee = ltestfee;
	}
	 
	
	
	public int getLid() {
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	public String getLtestname() {
		return Ltestname;
	}
	public void setLtestname(String ltestname) {
		Ltestname = ltestname;
	}
	public long getLtestfee() {
		return ltestfee;
	}
	public void setLtestfee(long ltestfee) {
		this.ltestfee = ltestfee;
	}
	 

}
