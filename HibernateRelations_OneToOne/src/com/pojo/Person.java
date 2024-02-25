package com.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.*;
 

@Entity
public class Person {
	
	@Id
	@GeneratedValue
	private int pid;
	 
	private String pname;
	private int page;
	private String pqual;
	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name = "fkpid") 
	 
	private Passport ppt;
	
	 
	
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
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getPqual() {
		return pqual;
	}
	public void setPqual(String pqual) {
		this.pqual = pqual;
	}
	public Passport getPpt() {
		return ppt;
	}
	public void setPpt(Passport ppt) {
		this.ppt = ppt;
	}
	 
	

}
