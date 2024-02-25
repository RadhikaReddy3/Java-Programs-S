package Pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Product {
	
	@Id
	@GeneratedValue
	private int pid;
	private String pname;
	private double pprice;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "vkfid")
	private List<Vendor> ven;
	
	
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

	public List<Vendor> getVen() {
		return ven;
	}

	public void setVen(List<Vendor> ven) {
		this.ven = ven;
	}

 
	
	
	
	 

}
