package com.wipro;

import java.sql.Date;
import java.sql.Time;
import java.time.DayOfWeek;

public class ProductEntity {
	
	private Integer pid;
	private String pname;
	private Date pde;
	private String dw;
	private Time pdt;
	public ProductEntity(Integer pid, String pname, Date pde, String dw, Time pdt) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pde = pde;
		this.dw = dw;
		this.pdt = pdt;
	}



	 
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

	public Date getPde() {
		return pde;
	}

	public void setPde(Date pde) {
		this.pde = pde;
	}

	public String getDw() {
		return dw;
	}

	public void setDw(String dw) {
		this.dw = dw;
	}

	public Time getPdt() {
		return pdt;
	}

	public void setPdt(Time pdt) {
		this.pdt = pdt;
	}

	 
	
	public ProductEntity() {
		
	}
	 
}
