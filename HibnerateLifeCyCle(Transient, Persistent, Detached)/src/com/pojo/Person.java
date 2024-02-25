package com.pojo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import java.util.List;
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

@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name = "fkpersid")
private List<mobile> mob;
@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(name = "percou",
           joinColumns = {@JoinColumn(name = "fkpid")},
           inverseJoinColumns = {@JoinColumn(name = "fkcid")})
private List<course> cou;
public Person() {
	
}	 
	public Person(int pid, String pname, int page, String pqual, Passport ppt, List<mobile> mob, List<course> cou) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.page = page;
		this.pqual = pqual;
		this.ppt = ppt;
		this.mob = mob;
		this.cou = cou;
	}
	
	
	/*@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", page=" + page + ", pqual=" + pqual + ", ppt=" + ppt + ", mob="
				+ mob + ", cou=" + cou + "]";
	}*/	
	
	@Override 
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", page=" + page + ", pqual=" + pqual + "]";
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


	 
	 


	 

	 

}
