package com.pojo;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Product {
	
	@Embedded
	@EmbeddedId
	private Vendor ve;
	private String pname;
	private double pprice;
	private String ploc;
	
	
	@Override
	public String toString() {
		return "Product [ve=" + ve + ", pname=" + pname + ", pprice=" + pprice + ", ploc=" + ploc + "]";
	}
	 
	
	
	public Vendor getVe() {
		return ve;
	}
	public void setVe(Vendor ve) {
		this.ve = ve;
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
	public String getPloc() {
		return ploc;
	}
	public void setPloc(String ploc) {
		this.ploc = ploc;
	}
	 
	

}
