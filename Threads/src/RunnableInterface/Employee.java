package RunnableInterface;

public class Employee {
	
	
	
	
	public Employee() {
		
	}
	private int eid;
    private String ename;
	 

    @Override
   	public String toString() {
   		return "Employee [eid=" + eid + ", ename=" + ename + "]";
   	}
    
    
	 public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	 
	

}
