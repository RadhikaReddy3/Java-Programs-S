package How_to_create_custom_immutable_class;

public final class Employee {
	//How_to_create_custom_immutable_class?
	//Declaring my class as final
	//private properties
	//No setters
	//Constructor will be initialized
	private int eid;
	private String ename;
	private double esal;
	private String edesg;
	private department dep;
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edesg=" + edesg + ", dep=" + dep
				+ "]";
	}


	 
	
	 // Concatenation method
    public Employee concat(Employee other) {
        // Creating a new instance with the concatenated value
        String newValue = this.ename + other.getEname();
        return new Employee(this.eid,newValue,this.esal,this.edesg,this.dep);
    }
    public Employee(String ename) {
		this.ename = ename;
	}


	 
	public Employee(int eid, String ename, double esal, String edesg, department dep) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.edesg = edesg;
		this.dep = dep;
	}


 
	
	
	 

	public void setDep(department dep) {
		this.dep = dep;
	}

	public Employee setEid(int eid) {
		
		return new Employee(eid,  this.ename, this.esal, this.edesg, this.dep);
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}



	public void setEsal(double esal) {
		this.esal = esal;
	}



	public void setEdesg(String edesg) {
		this.edesg = edesg;
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public double getEsal() {
		return esal;
	}

	public String getEdesg() {
		return edesg;
	}
	

	public department getDep() {
		return dep;
	}

}
