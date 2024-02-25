package com.pojo;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Vendor implements Serializable{
	
	private int pid;
	private int vid;
	
	@Override
	public String toString() {
		return "Vendor [pid=" + pid + ", vid=" + vid + "]";
	}
 
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	 
	

}
