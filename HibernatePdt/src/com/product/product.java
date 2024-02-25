package com.product;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class product {

	@Id
	@GeneratedValue
	private int pid;
	private String pname;
	private double pprice;
	
	
	@Override
	public String toString() {
		return "product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
	}
	 
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPprice() {
		return pprice;
	}
	public void setPprice(double pprice) {
		this.pprice = pprice;
	}
	 
	 

	 

}
