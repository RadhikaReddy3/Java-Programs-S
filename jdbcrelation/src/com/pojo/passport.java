package com.pojo;

public class passport {
	
	 private int ptid;
	 private String ptnum;
	 private String pexpdate;
	 
	 
	 @Override
	public String toString() {
		return "passport [ptid=" + ptid + ", ptnum=" + ptnum + ", pexpdate=" + pexpdate + "]";
	}
	 

	 public int getPtid() {
		return ptid;
	}
	public void setPtid(int ptid) {
		this.ptid = ptid;
	}
	public String getPtnum() {
		return ptnum;
	}
	public void setPtnum(String ptnum) {
		this.ptnum = ptnum;
	}
	public String getPexpdate() {
		return pexpdate;
	}
	public void setPexpdate(String pexpdate) {
		this.pexpdate = pexpdate;
	}
	 
}
