package com.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passport {

	 @Id
	 @GeneratedValue
	 private int ppid;
	 private String pnum;
     private String pexp;
     
	@Override
	public String toString() {
		return "Passport [ppid=" + ppid + ", pnum=" + pnum + ", pexp=" + pexp + "]";
	}
     
     @OneToOne(cascade=CascadeType.ALL)
     private Person pers;
	 
	 public Person getPers() {
		return pers;
	}
	public void setPers(Person pers) {
		this.pers = pers;
	}
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
