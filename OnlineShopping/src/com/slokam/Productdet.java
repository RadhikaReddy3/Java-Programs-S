package com.slokam;

public class Productdet {
	 
	public Productdet(int pid, String pname, double pprice, double pvat, double pgst, double pdis, vendordata[] ven) {
		
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
		this.pvat = pvat;
		this.pgst = pgst;
		this.pdis = pdis;
		this.ven = ven;
	}
	
	private int pid;
	private String pname;
	private double pprice;
	private double pvat;
	private double pgst;
	private double pdis;
	private vendordata[] ven; 
	 
    public Productdet() {
		
	}
	

	public vendordata[] getVen() {
		return ven;
	}
	public void setVen(vendordata[] ven) {
		this.ven = ven;
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
	public double getPvat() {
		return pvat;
	}
	public void setPvat(double pvat) {
		this.pvat = pvat;
	}
	public double getPgst() {
		return pgst;
	}
	public void setPgst(double pgst) {
		this.pgst = pgst;
	}
	public double getPdis() {
		return pdis;
	}
	public void setPdis(double pdis) {
		this.pdis = pdis;
	}
	 
	 
	
	 
	

}
