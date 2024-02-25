package com.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EmpHib")
public class Employee {
	@Id
	@GeneratedValue
	private int eid;
	private String ename;
	private double esal;
	private String edes;
	private String eloc;
	
	
	public Employee() {
		
	}
	
	public Employee(int eid, String ename, double esal, String edes, String eloc) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.edes = edes;
		this.eloc = eloc;
	}

	public int getEid() {
		return eid;
	}



	public void setEid(int eid) {
		this.eid = eid;
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public double getEsal() {
		return esal;
	}



	public void setEsal(double esal) {
		this.esal = esal;
	}



	public String getEdes() {
		return edes;
	}



	public void setEdes(String edes) {
		this.edes = edes;
	}



	public String getEloc() {
		return eloc;
	}



	public void setEloc(String eloc) {
		this.eloc = eloc;
	}



	 
	
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edes=" + edes + ", eloc=" + eloc
				+ "]";
	}
 
	
	

}
