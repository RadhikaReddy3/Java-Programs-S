package Employee_Data_Cloning;

public class Department implements Cloneable{
	
	private int did;
	private String dname;
	
	
	@Override
	public String toString() {
		return " did=" + did + ", dname=" + dname + "";
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
	 
	/*public Object Clone(){
		Department de = null;
		 
		try {
			   de = (Department)super.clone();
			   
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
	
		}
		return de;
	}*/
	
	public Object Clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
