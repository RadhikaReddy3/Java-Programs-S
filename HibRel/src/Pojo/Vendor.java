package Pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Vendor {
	
	
	public Vendor() {
		
	}
	@Id
	@GeneratedValue
	private int vid;
	public Vendor(String vname, String vloc) {
		super();
		 
		this.vname = vname;
		this.vloc = vloc;
		 
	}
	private String vname;
	private String vloc;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "itfid")
	private List<Items> it;
	
	
	 
	 
	
	
	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getVloc() {
		return vloc;
	}

	public void setVloc(String vloc) {
		this.vloc = vloc;
	}

	public List<Items> getIt() {
		return it;
	}

	public void setIt(List<Items> it) {
		this.it = it;
	}

 
	
	
	 
	 
	
	 
 

}
