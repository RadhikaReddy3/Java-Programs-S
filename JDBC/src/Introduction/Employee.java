package Introduction;

public class Employee {
	
	private int eid;
	private String ename;
	private String eloc;
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eloc=" + eloc + "]";
	}
	 
	
	
	public Employee(){
		
	}
	
	public Employee(int eid, String ename, String eloc) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eloc = eloc;
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
	public String getEloc() {
		return eloc;
	}
	public void setEloc(String eloc) {
		this.eloc = eloc;
	}
	 
	

}
