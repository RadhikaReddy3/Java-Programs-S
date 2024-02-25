package com.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name ="Physicaladdress")
@SecondaryTable(name = "Mailingaddress")
public class Address {
	
	 
	@Id
	@GeneratedValue
	private int aid;
	
 
	@Column(table ="Physicaladdress")
	private String plocation;
	@Column(table ="Physicaladdress")
	private String pstreet;
	@Column(table ="Physicaladdress")
	private String pphone;
	
	@Column(table ="Mailingaddress")
	private String mlocation;
	@Column(table ="Mailingaddress")
	private String mstreet;
	@Column(table ="Mailingaddress")
	private String mphone;
	 
	
	public Address(String plocation, String pstreet, String pphone, String mlocation, String mstreet, String mphone) {
		super();
		this.plocation = plocation;
		this.pstreet = pstreet;
		this.pphone = pphone;
		this.mlocation = mlocation;
		this.mstreet = mstreet;
		this.mphone = mphone;
	}
	
	
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", plocation=" + plocation + ", pstreet=" + pstreet + ", pphone=" + pphone
				+ ", mlocation=" + mlocation + ", mstreet=" + mstreet + ", mphone=" + mphone + "]";
	}
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getPlocation() {
		return plocation;
	}
	public void setPlocation(String plocation) {
		this.plocation = plocation;
	}
	public String getPstreet() {
		return pstreet;
	}
	public void setPstreet(String pstreet) {
		this.pstreet = pstreet;
	}
	public String getPphone() {
		return pphone;
	}
	public void setPphone(String pphone) {
		this.pphone = pphone;
	}
	public String getMlocation() {
		return mlocation;
	}
	public void setMlocation(String mlocation) {
		this.mlocation = mlocation;
	}
	public String getMstreet() {
		return mstreet;
	}
	public void setMstreet(String mstreet) {
		this.mstreet = mstreet;
	}
	public String getMphone() {
		return mphone;
	}
	public void setMphone(String mphone) {
		this.mphone = mphone;
	}
	 
	public Address() {
		
	}
	
	

}
