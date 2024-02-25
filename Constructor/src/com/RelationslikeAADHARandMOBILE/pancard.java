package com.RelationslikeAADHARandMOBILE;

public class pancard {
	private int pid;
	private String pnum;
	private String pname;
	
	public pancard() {
		System.out.println("def constructor");
	}
	
	public pancard(int pid, String pnum, String pname) {
	 
		this.pid = pid;
		this.pnum = pnum;
		this.pname = pname;
	}
	 
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	 

}
