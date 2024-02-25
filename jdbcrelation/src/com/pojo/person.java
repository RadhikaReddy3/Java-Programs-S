package com.pojo;

public class person {

	    private int pid;
		private String pname;
		private int page;
		private String pqual;
		 
	 @Override
	public String toString() {
		return "person [pid=" + pid + ", pname=" + pname + ", page=" + page + ", pqual=" + pqual + "]";
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
	 

}
