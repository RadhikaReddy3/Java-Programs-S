package com.pojo;

import javax.persistence.Entity;
@Entity
public class Customer extends User {
     
	 
	 
	  
	 private String cname;
	 private String cloc;
	 
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCloc() {
		return cloc;
	}
	public void setCloc(String cloc) {
		this.cloc = cloc;
	}
	 

}
