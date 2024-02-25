package com.relationsAADHARandMobile;

public class Person {
	
	private int pid;
	private String pname;
	private int page;
	
	private Adharcard det;//one person contains only one Aadhar card 
	private Mobile[] mob;//one person contains more than one mobile phone
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
	public Adharcard getDet() {
		return det;
	}
	public void setDet(Adharcard det) {
		this.det = det;
	}
	public Mobile[] getMob() {
		return mob;
	}
	public void setMob(Mobile[] mob) {
		this.mob = mob;
	}

}
