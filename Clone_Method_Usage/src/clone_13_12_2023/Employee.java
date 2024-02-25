package clone_13_12_2023;

 

public class Employee implements Cloneable {
	private int eid;
	private String ename;
	private String eloc;
	private Dept dep;
	
	public Employee() {
		
	}
	public Employee(int eid, String ename, String eloc, Dept dep) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eloc = eloc;
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eloc=" + eloc + ", dep=" + dep + "]";
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





	public Dept getDep() {
		return dep;
	}





	public void setDep(Dept dep) {
		this.dep = dep;
	}





	 
	
	 


	 
	public Employee Clone() throws CloneNotSupportedException   {
		Employee p = null;
		
		p = (Employee)super.clone();
		Dept d = new Dept(p.getDep().getDid(),p.getDep().getDname(),p.getDep().getDhead());
		
		p.setDep(d);
		 
			p=(Employee) super.clone();
		 
		
		
		 return p;
		
		
	}
	 
	  

}
