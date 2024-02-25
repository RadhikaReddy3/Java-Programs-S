package com.slokam;

public class Order {
	private int oid;
	private String oloc;
	private Customer cu;
	private Productdet[]pro;
	
	public Order() {
		
	}
	public Order(int oid, String oloc, Customer cu, Productdet[] pro) {
		this.oid = oid;
		this.oloc = oloc;
		this.cu = cu;
		this.pro = pro;
	}
	 
	
	
	 
	public Productdet[] getPro() {
		return pro;
	}
	public void setPro(Productdet[] pro) {
		this.pro = pro;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOloc() {
		return oloc;
	}
	public void setOloc(String oloc) {
		this.oloc = oloc;
	}
	public Customer getCu() {
		return cu;
	}
	public void setCu(Customer cu) {
		this.cu = cu;
	}
	 
	

}
