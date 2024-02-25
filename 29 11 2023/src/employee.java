
public class employee {

	public employee() {
		
	}
	private int eid;
	private String ename;
	private double esal;
	
	
	@Override
	public String toString() {
		return "employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
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
	
	protected void finalize() throws Throwable{
		System.out.println("Sucessfully garbage collected object removed");
	}
	
}
