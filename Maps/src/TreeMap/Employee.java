package TreeMap;

public class Employee implements Comparable<Employee> {
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edes=" + edes +  "]";
	}


	private int eid;
	private String ename;
	private double esal;
	private String edes;
	 
	public Employee(int eid, String ename, double esal, String edes) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.edes = edes;
		 
	}


	 
	 

	 
	
 


	 
	 

	 
	public Employee() {
		
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

    

    @Override
	public int compareTo(Employee o) {
		  
    	 /*String s = this.ename;
    	 String s1 = o.ename;
    	return s.compareTo(s1);*/
		return  this.ename.compareTo(o.ename);
	}
	
    

	  
	
	
}
