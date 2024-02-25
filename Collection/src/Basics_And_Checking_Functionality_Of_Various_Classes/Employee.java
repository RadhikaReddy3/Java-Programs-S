package Basics_And_Checking_Functionality_Of_Various_Classes;

public class Employee {
	
	private int eid;
	private String ename;
	private double esal;
	private long ephno;
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", ephno=" + ephno + "]";
	}
	 
	
	
	public Employee(int eid, String ename, double esal, long ephno) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.ephno = ephno;
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
	public long getEphno() {
		return ephno;
	}
	public void setEphno(long ephno) {
		this.ephno = ephno;
	}
	 

}
