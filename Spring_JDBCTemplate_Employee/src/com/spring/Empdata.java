package com.spring;

public class Empdata {
	public Empdata() {
		
	}
	
	public int eid;
	public String ename;
	public int eage;
	public String equal;
	
	
	@Override
	public String toString() {
		return "Empdata [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", equal=" + equal + "]";
	}
 
	
	
	
	public Empdata(int eid, String ename, int eage, String equal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
		this.equal = equal;
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
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	public String getEqual() {
		return equal;
	}
	public void setEqual(String equal) {
		this.equal = equal;
	}
	 
	
	 

}
