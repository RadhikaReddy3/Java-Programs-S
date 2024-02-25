package Employee_Data_Cloning;

public class EmployeeM implements Cloneable {
	
	
	
	
	private int eid;
	private String ename;
	private double esal;
	private DepartmentM dp;
	
	public EmployeeM(int eid, String ename, double esal, DepartmentM dp) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.dp = dp;
	}
	
	@Override
	public String toString() {
		return " eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", dp=" + dp ;
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
	public DepartmentM getDp() {
		return dp;
	}
	public void setDp(DepartmentM dp) {
		this.dp = dp;
	}
	 

	
	
	public EmployeeM clone() {
		
		EmployeeM obj = null;
		try {
			obj = (EmployeeM)super.clone();//super.clone() ante naku vache object employee object
		    
			DepartmentM d = new DepartmentM(obj.getDp().getDid(),obj.getDp().getDname());
			obj.setDp(d);
		
		
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
}
