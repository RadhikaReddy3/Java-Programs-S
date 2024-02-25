package TreeMap;

public class Dept  {
	private int did;
	private String dname;
	private String dloc;
	
	
	@Override
	public String toString() {
		return  "did=" + did + ", dname=" + dname + ", dloc=" + dloc + "";
	}
	 
	public Dept(int did, String dname, String dloc) {
		super();
		this.did = did;
		this.dname = dname;
		this.dloc = dloc;
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
	public String getDloc() {
		return dloc;
	}
	public void setDloc(String dloc) {
		this.dloc = dloc;
	}
	 


}
