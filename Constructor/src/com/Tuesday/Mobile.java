package com.Tuesday;

public class Mobile {
	public int mid;
	public String msim;
	public long mnum;
	
	
	
	public Mobile() 
	{
		System.out.println("def constructor");
	}
	
	public Mobile(int mid, String msim, long mnum) {
		 System.out.println("----Mobile phones 3 Argumented constructor---");
		this.mid = mid;
		this.msim = msim;
		this.mnum = mnum;
	}
	 
	
	
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
	public long getMnum() {
		return mnum;
	}
	public void setMnum(long mnum) {
		this.mnum = mnum;
	}
	 

}