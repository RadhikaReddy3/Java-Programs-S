package Different_Methods_Usage;

import java.util.Arrays;

public class Employee {

	
	
	private int eid;
	private String ename;
	 private double esal;
	 private String edes;
	 private Department dep;
	 private Mobiles[] mob;
	 
	 
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edes=" + edes + ", dep=" + dep
				+ ", mob=" + Arrays.toString(mob) + "]";
	}


	 
	
	  
	 
	 
	 
	public Employee(int eid, String ename, double esal, String edes, Department dep, Mobiles[] mob) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.edes = edes;
		this.dep = dep;
		this.mob = mob;
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


	public Department getDep() {
		return dep;
	}


	public void setDep(Department dep) {
		this.dep = dep;
	}


	public Mobiles[] getMob() {
		return mob;
	}


	public void setMob(Mobiles[] mob) {
		this.mob = mob;
	}


 
	 
	 
	 
	 
	 
	 
	 
	 
	  

	}


