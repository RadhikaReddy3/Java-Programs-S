package com.RelationslikeAADHARandMOBILE;

public class Mobile {
	
	public Mobile() {
		
	}
 
	public Mobile(int mid, String msim, long mno) {
		 
		this.mid = mid;
		this.msim = msim;
		this.mno = mno;
	}
	
	private int mid;
	private String msim;
	private long mno;
	
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMsim() {
		return msim;
	}
	public void setMsim(String msim) {
		this.msim = msim;
	}
	public long getMno() {
		return mno;
	}
	public void setMno(long mno) {
		this.mno = mno;
	}
	 

}