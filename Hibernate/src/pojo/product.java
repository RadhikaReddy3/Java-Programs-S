package pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class product {
	@Id
	@GeneratedValue
	private int pid;
	private String pname;
	private double pprice;
	private boolean pde;
	
	
	public product() 
	{
		
	}
	public product(int pid, String pname, double pprice, boolean pde) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
		this.pde = pde;
	}
 
	
	
	@Override
	public String toString() {
		return "pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", pde=" + pde +  "";
	}
	 
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPprice() {
		return pprice;
	}
	public void setPprice(double pprice) {
		this.pprice = pprice;
	}
	public boolean isPde() {
		return pde;
	}
	public void setPde(boolean pde) {
		this.pde = pde;
	}
	 
	

}
