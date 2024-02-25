package com.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

@Entity
@Table(name = "abc")
public class AadharCard {
	
	@Id
	@GeneratedValue
	@Column(nullable = false)
	private Integer aid;
	 
	 
	@Override
	public String toString() {
		return "AadharCard [aid=" + aid + ", anum=" + anum + ", aname=" + aname + ", aaddress=" + aaddress
				+ ", Version=" + Version + "]";
	}
	 
    @Column(updatable = false)
     
	private String anum;
    @Column(insertable = false, length = 10)
    @Transient
	private String aname;
    @Column(updatable = false)
	private String aaddress;
	 
	 
	@Version
	@Column(insertable = false)
	private Long Version;
	
	
	 
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAnum() {
		return anum;
	}
	public void setAnum(String anum) {
		this.anum = anum;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAaddress() {
		return aaddress;
	}
	public void setAaddress(String aaddress) {
		this.aaddress = aaddress;
	}
	 

}