package com.slokam;

public class vendordata {
	
	private int vid;
	private String vname;
	private String vloc;
	private String vprice;
	private String vtan;
	private String vpan;
	
	
	public vendordata() {
		
	}
	public vendordata(int vid, String vname, String vloc, String vprice, String vtan, String vpan) {
		 
		this.vid = vid;
		this.vname = vname;
		this.vloc = vloc;
		this.vprice = vprice;
		this.vtan = vtan;
		this.vpan = vpan;
	}
	 
	
	
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getVloc() {
		return vloc;
	}
	public void setVloc(String vloc) {
		this.vloc = vloc;
	}
	public String getVprice() {
		return vprice;
	}
	public void setVprice(String vprice) {
		this.vprice = vprice;
	}
	public String getVtan() {
		return vtan;
	}
	public void setVtan(String vtan) {
		this.vtan = vtan;
	}
	public String getVpan() {
		return vpan;
	}
	public void setVpan(String vpan) {
		this.vpan = vpan;
	}
	 
	 
	
	 

}
