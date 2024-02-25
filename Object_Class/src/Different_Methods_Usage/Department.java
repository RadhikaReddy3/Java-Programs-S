package Different_Methods_Usage;

public class Department {
	
	
	
	private int did;
	private String dname;
	private String dhead;
	
	
	@Override
	public String toString() {
		return "did=" + did + ", dname=" + dname + ", dhead=" + dhead +  " ";
	}
	 
	
	public Department(int did, String dname, String dhead) {
		super();
		this.did = did;
		this.dname = dname;
		this.dhead = dhead;
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
	public String getDhead() {
		return dhead;
	}
	public void setDhead(String dhead) {
		this.dhead = dhead;
	}
	 

}
