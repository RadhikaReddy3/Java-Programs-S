package com.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class course {
	@Id
	@GeneratedValue
	private Integer cid;
	private String cname;
	private Double cfee;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Double getCfee() {
		return cfee;
	}
	public void setCfee(Double cfee) {
		this.cfee = cfee;
	}
	public course(Integer cid, String cname, Double cfee) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cfee = cfee;
	}
	public course() {
		
	}
	@Override
	public String toString() {
		return "course [cid=" + cid + ", cname=" + cname + ", cfee=" + cfee + "]";
	}
	
	
}

