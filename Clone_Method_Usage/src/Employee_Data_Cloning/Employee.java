package Employee_Data_Cloning;

public class Employee implements Cloneable{


	private int eid;
	 private String ename;
	 private double esal;
	 private String edes;
	 private Department dep;
	

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edes=" + edes + ", dep=" + dep + "]";
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


	public Department getDep() {
		return dep;
	}


	public void setDep(Department dep) {
		this.dep = dep;
	}
  
	
	  
	/*public Object  Clone(){
		 
		Employee em = null;
		
		try {
			
			 em = (Employee) super.clone();
			em.dep=(Department) dep.Clone();
			  
			 
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
	
		}
		return em;
	}*/
	
	public Object  Clone(){
		 
		Employee em = null;
		
		try {
			
			 em = (Employee) super.clone();
			//em.dep=(Department) dep.Clone();
			em.setDep((Department)this.getDep().Clone());  
			 
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
	     //return null;
		}
		return em;
	
	

}}
