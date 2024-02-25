package Deep_Deep_Cloning;

public class Department implements Cloneable
{
    private int did;
    private String dname;
    private Store str;
    public Department()
    {
    	
    }
    
	public Department(int did, String dname, Store str) {
		super();
		this.did = did;
		this.dname = dname;
		this.str = str;
	}

	public int getDid() 
	{
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", str=" + str + "]";
	}

	public Store getStr() {
		return str;
	}

	public void setStr(Store str) {
		this.str = str;
	}

	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	   public Department clone() 
	   {
	       Department dp = null;
	       try {
	        dp = (Department)super.clone();
	        Store s = new Store(dp.getStr().getSid(),dp.getStr().getSname()); 
	         dp.setStr(s);
	       }
	       catch(CloneNotSupportedException e)
	       {
	       	System.out.println(e);
	       }
	       return dp;
	   }
	
	
}

