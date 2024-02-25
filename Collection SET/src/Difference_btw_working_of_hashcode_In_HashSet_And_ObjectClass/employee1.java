package Difference_btw_working_of_hashcode_In_HashSet_And_ObjectClass;

import java.util.Objects;

public class employee1 implements Comparable<employee1> {
	private int eid;
	private String ename;
	private double esal;
	

	@Override
	public int hashCode() {
		System.out.println("Employee Class Hashcode");
		return Objects.hash(eid, ename, esal);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Employee Class .equals ");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		employee1 other = (employee1) obj;
		return eid == other.eid && Objects.equals(ename, other.ename)
				&& Double.doubleToLongBits(esal) == Double.doubleToLongBits(other.esal);
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

 
	
	@Override
	public String toString() {
		return "employee1 [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	 
	public employee1(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	 

	@Override
	public int compareTo(employee1 o) {
		Integer a = this.eid;
		Integer b = o.eid;
		return a.compareTo(b);
		//return Double.compare(this.esal, o.esal);
	}
	 

}
