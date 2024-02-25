package TreeSet;

public class employee implements Comparable<employee> {
	
	private int eid;
	private String ename;
	 private double esal;
	 
	 
	 @Override
	public String toString() {
		return  "eid=" + eid + ", ename=" + ename + ", esal=" + esal +  "";
	}
	 

	 public employee(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
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
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}


	@Override
	public int compareTo(employee o) {
		 Integer e1=this.eid;
		 Integer e2=o.eid;
		return e1.compareTo(e2);
	}
	 
}
