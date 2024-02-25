package com.pojo;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class One {

	@Id
	@GeneratedValue
	private int oid;
	private String oname;
	private String oloc;
	@Embedded
	private Two to;
	
	public One() {
		
	}
	@Override
	public String toString() {
		return "One [oid=" + oid + ", oname=" + oname + ", oloc=" + oloc + ", to=" + to + "]";
	}
	public One(String oname, String oloc, Two to) {
		super();
		this.oname = oname;
		this.oloc = oloc;
		this.to = to;
	}
 
	
	
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public String getOloc() {
		return oloc;
	}
	public void setOloc(String oloc) {
		this.oloc = oloc;
	}
	public Two getTo() {
		return to;
	}
	public void setTo(Two to) {
		this.to = to;
	}
	 
	
	

}
