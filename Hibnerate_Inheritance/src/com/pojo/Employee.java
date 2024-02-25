package com.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee extends User {
	 
	 
	private String ename;
	private String eloc;
	
	
	 
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEloc() {
		return eloc;
	}
	public void setEloc(String eloc) {
		this.eloc = eloc;
	}
 
	

}
