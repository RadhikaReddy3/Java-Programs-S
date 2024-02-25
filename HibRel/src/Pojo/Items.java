package Pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Items {
	
	@Id
	@GeneratedValue
	private int iid;
	public Items( String iname, String iexp, String iddate) {
		super();
		 
		this.iname = iname;
		this.iexp = iexp;
		this.iddate = iddate;
	}
	private String iname;
	private String iexp;
	private String iddate;
 
	 
	
	
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public String getIexp() {
		return iexp;
	}
	public void setIexp(String iexp) {
		this.iexp = iexp;
	}
	public String getIddate() {
		return iddate;
	}
	public void setIddate(String iddate) {
		this.iddate = iddate;
	}
	 

}
