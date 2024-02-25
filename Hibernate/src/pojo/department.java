package pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class department {
	
	@Id
	@GeneratedValue
	private int did;
	private String dname;
	private String dloc;
	private long dphno;
	
	
	public department() {
		
	}
	
	
	public department(int did, String dname, String dloc, long dphno) {
		super();
		this.did = did;
		this.dname = dname;
		this.dloc = dloc;
		this.dphno = dphno;
	}
 
	
	
	
	
	@Override
	public String toString() {
		return "did=" + did + ", dname=" + dname + ", dloc=" + dloc + ", dphno=" + dphno + "";
	}
	 
	
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDloc() {
		return dloc;
	}
	public void setDloc(String dloc) {
		this.dloc = dloc;
	}
	public long getDphno() {
		return dphno;
	}
	public void setDphno(long dphno) {
		this.dphno = dphno;
	}
	 

}
