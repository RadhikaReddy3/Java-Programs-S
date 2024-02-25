package com.pojo;

import javax.persistence.Embeddable;

@Embeddable
public class Two {
	
	public  Two() {
		
	}
	
	
	private String tname;
	 
	private String tloc;
	
	
	
	@Override
	public String toString() {
		return "Two [tname=" + tname + ", tloc=" + tloc + "]";
	}
	public Two(String tname, String tloc) {
		super();
		this.tname = tname;
		this.tloc = tloc;
	}
	
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTloc() {
		return tloc;
	}
	public void setTloc(String tloc) {
		this.tloc = tloc;
	}
	 
	

}
