package FileTODB30_12_2023_Aggregate_Functions;

public class Employee {
	
	private double maxesal;
	private double minsal;
	private double avgsal;
	private double sumsal;
	private int eid;
	private String ename;
	private double esal;
	private String edesg;
	
	
	 
	@Override
	public String toString() {
		return "Employee [maxesal=" + maxesal + ", minsal=" + minsal + ", avgsal=" + avgsal + ", sumsal=" + sumsal
				+ ", eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edesg=" + edesg + "]";
	}

 
	
	
	
	public Employee(double maxesal, double minsal, double avgsal, double sumsal, int eid, String ename, double esal,
			String edesg) {
		super();
		this.maxesal = maxesal;
		this.minsal = minsal;
		this.avgsal = avgsal;
		this.sumsal = sumsal;
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.edesg = edesg;
	}

 
	
	public double getMaxesal() {
		return maxesal;
	}


	public void setMaxesal(double maxesal) {
		this.maxesal = maxesal;
	}


	public double getMinsal() {
		return minsal;
	}


	public void setMinsal(double minsal) {
		this.minsal = minsal;
	}


	public double getAvgsal() {
		return avgsal;
	}


	public void setAvgsal(double avgsal) {
		this.avgsal = avgsal;
	}


	public double getSumsal() {
		return sumsal;
	}


	public void setSumsal(double sumsal) {
		this.sumsal = sumsal;
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

	public String getEdesg() {
		return edesg;
	}

	public void setEdesg(String edesg) {
		this.edesg = edesg;
	}

 
	
	 

}
