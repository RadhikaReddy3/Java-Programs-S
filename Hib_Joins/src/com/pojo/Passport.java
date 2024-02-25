package com.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passport {

	 @Id
	 @GeneratedValue
	 private int ppid;
	@Override
	public String toString() {
		return "Passport [ppid=" + ppid + ", pnum=" + pnum + ", pexp=" + pexp + "]";
	}
	private String pnum;
     private String pexp;
	 public int getPpid() {
		return ppid;
	}
	public void setPpid(int ppid) {
		this.ppid = ppid;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public String getPexp() {
		return pexp;
	}
	public void setPexp(String pexp) {
		this.pexp = pexp;
	}
 
	
	 

}
