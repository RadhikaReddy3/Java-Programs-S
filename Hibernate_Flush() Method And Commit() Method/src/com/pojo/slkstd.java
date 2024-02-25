package com.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class slkstd {
	
	@Id
	@GeneratedValue
	private Integer sid; 
	private String sname;
	private Integer sage;
	private String squal;
	private double smarks;
	
	
	@Override
	public String toString() {
		return "slkstd [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", squal=" + squal + ", smarks=" + smarks
				+ "]";
	}
	
	
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getSage() {
		return sage;
	}
	public void setSage(Integer sage) {
		this.sage = sage;
	}
	public String getSqual() {
		return squal;
	}
	public void setSqual(String squal) {
		this.squal = squal;
	}
	public double getSmarks() {
		return smarks;
	}
	public void setSmarks(double smarks) {
		this.smarks = smarks;
	}
	 

}
