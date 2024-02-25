package How_to_create_custom_immutable_class;

public class department {
	
	private int did;
	private String dname;
	@Override
	public String toString() {
		return "department [did=" + did + ", dname=" + dname + "]";
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




	 
	
	
	
	
	public department(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	 

}
