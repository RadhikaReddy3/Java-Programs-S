package com.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

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
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "percou",
	           joinColumns = {@JoinColumn(name = "fkcid")},
	           inverseJoinColumns = {@JoinColumn(name = "fkpid")})
	private List<Person> per;
	
	public List<Person> getPer() {
		return per;
	}
	public void setPer(List<Person> per) {
		this.per = per;
	}
	
	
}
