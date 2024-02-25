package Pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passport {
	
    @Id
    @GeneratedValue
	private int ptid;
	private String ptnum;
	private String pexp;
	
	
	public int getPtid() {
		return ptid;
	}
	public void setPtid(int ptid) {
		this.ptid = ptid;
	}
	public String getPtnum() {
		return ptnum;
	}
	public void setPtnum(String ptnum) {
		this.ptnum = ptnum;
	}
	public String getPexp() {
		return pexp;
	}
	public void setPexp(String pexp) {
		this.pexp = pexp;
	}
	 

}
