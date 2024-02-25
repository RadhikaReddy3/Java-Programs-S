package com.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class mobile {
	
	@Id
	@GeneratedValue
	private int mid;
	private long mnum;
	private String msim;
	
	
	
	@Override
	public String toString() {
		return "mobile [mid=" + mid + ", mnum=" + mnum + ", msim=" + msim + "]";
	}
	 
	
	
	public mobile() {
		
	}
	@ManyToOne(cascade =CascadeType.ALL)
	private Person pm;
	
	public Person getPm() {
		return pm;
	}



	public void setPm(Person pm) {
		this.pm = pm;
	}



	public mobile( long mnum, String msim) {
		 
		this.mnum = mnum;
		this.msim = msim;
	}
	 
	
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public long getMnum() {
		return mnum;
	}
	public void setMnum(long mnum) {
		this.mnum = mnum;
	}
	public String getMsim() {
		return msim;
	}
	public void setMsim(String msim) {
		this.msim = msim;
	}
	 

}
