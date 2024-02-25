package com.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class emp {
	
	@Id
	@GeneratedValue
	private int eid;
	private String ename;
	private double esal;
	private long ephno;
	
	@Override
	public String toString() {
		return "emp [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", ephno=" + ephno + "]";
	}
 
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public long getEphno() {
		return ephno;
	}
	public void setEphno(long ephno) {
		this.ephno = ephno;
	}
	 
	
	

}
