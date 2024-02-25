package D_27_12_2023;

public class EmpPojo {
	
	
	
	 private int eid;
	 private String ename;
	 private double esal;
	 private String edes;
	 
	 
	 @Override
	public String toString() {
		return " eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edes=" + edes + " ";
	}
	 

	 public EmpPojo() {
		 
	 }
	 
	 public EmpPojo(int eid, String ename, double esal, String edes) {
			super();
			this.eid = eid;
			this.ename = ename;
			this.esal = esal;
			this.edes = edes;
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
	 
	 

}
