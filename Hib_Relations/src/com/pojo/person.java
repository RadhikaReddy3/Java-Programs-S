package com.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class person {
	@Id
	@GeneratedValue
	private Integer pid;
	private String pname;
	private Double pmarks;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fkppid")
	private passport pasp;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fkpersid")
	private List<mobile> mob;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "percou",
	           joinColumns = {@JoinColumn(name = "fkpid")},
	           inverseJoinColumns = {@JoinColumn(name = "fkcid")})
	private List<course> cou;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Double getPmarks() {
		return pmarks;
	}
	public void setPmarks(Double pmarks) {
		this.pmarks = pmarks;
	}
	public passport getPasp() {
		return pasp;
	}
	public void setPasp(passport pasp) {
		this.pasp = pasp;
	}
	public List<mobile> getMob() {
		return mob;
	}
	public void setMob(List<mobile> mob) {
		this.mob = mob;
	}
	public List<course> getCou() {
		return cou;
	}
	public void setCou(List<course> cou) {
		this.cou = cou;
	}
	@Override
	public String toString() {
		return "person [pid=" + pid + ", pname=" + pname + ", pmarks=" + pmarks + ", pasp=" + pasp + ", mob=" + mob
				+ ", cou=" + cou + "]";
	}
	public person(Integer pid, String pname, Double pmarks, passport pasp, List<mobile> mob, List<course> cou) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pmarks = pmarks;
		this.pasp = pasp;
		this.mob = mob;
		this.cou = cou;
	}
	public person() {
		
	}
	

}
