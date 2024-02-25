package FileToDatabase;

public class Employee {
	
	 
	 private int eid;
	 private String ename;
	 private int eage;
	 private double esal;
	 
	 
	 @Override
	public String toString() {
		return " eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", esal=" + esal + " ";
	}
	public Employee() {
		
	}
	 public Employee(int eid, String ename, int eage, double esal) {
			super();
			this.eid = eid;
			this.ename = ename;
			this.eage = eage;
			this.esal = esal;
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
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	 

}
