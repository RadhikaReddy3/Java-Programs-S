package Employee_Data_Cloning;

public class DepartmentM {
	private int did;
	private String dname;
	
	
	
	
	
	public DepartmentM(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	 
	
	
	
	 @Override
	public String toString() {
		return " did=" + did + ", dname=" + dname ;
	}
	 
	 
	 
	 public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	 
}
