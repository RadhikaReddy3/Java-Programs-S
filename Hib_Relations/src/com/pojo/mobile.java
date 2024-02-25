package com.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class mobile {
	@Id
	@GeneratedValue
	private Integer mid;
	private String msim;
	private Long mnum;
	
	
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMsim() {
		return msim;
	}
	public void setMsim(String msim) {
		this.msim = msim;
	}
	public Long getMnum() {
		return mnum;
	}
	public void setMnum(Long mnum) {
		this.mnum = mnum;
	}
	 
	@Override
	public String toString() {
		return "mobile [mid=" + mid + ", msim=" + msim + ", mnum=" + mnum + "]";
	}
	public mobile(Integer mid, String msim, Long mnum) {
		super();
		this.mid = mid;
		this.msim = msim;
		this.mnum = mnum;
	}
	public mobile() {
		
	}
	

}

