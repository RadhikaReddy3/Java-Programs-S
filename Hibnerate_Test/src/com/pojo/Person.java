package com.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@UpdateTimestamp
@XmlTransient
public class Person {
	
	 
	
	
	private int pid;
	private String pname;
	private double psal;
	private Date date;
	
	
	public Person(int pid, String pname, double psal, Date date) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.psal = psal;
		this.date = date;
	}
	 
    public Person() {
		
	}
	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", psal=" + psal + ", date=" + date + "]";
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
	public double getPsal() {
		return psal;
	}
	public void setPsal(double psal) {
		this.psal = psal;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	 

}
