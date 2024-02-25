package com.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class passport {
	@Id
	@GeneratedValue
	private Integer ppid;
	private String pnum;
	private String pexpdate;
	
	
	public Integer getPpid() {
		return ppid;
	}
	public void setPpid(Integer ppid) {
		this.ppid = ppid;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public String getPexpdate() {
		return pexpdate;
	}
	public void setPexpdate(String pexpdate) {
		this.pexpdate = pexpdate;
	}
	public passport(Integer ppid, String pnum, String pexpdate) {
		super();
		this.ppid = ppid;
		this.pnum = pnum;
		this.pexpdate = pexpdate;
	}
	public passport() {
		
	}
	@Override
	public String toString() {
		return "passport [ppid=" + ppid + ", pnum=" + pnum + ", pexpdate=" + pexpdate + "]";
	}
	
	
	
}
