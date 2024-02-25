package pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class passport {
	@Id
	@GeneratedValue
	private int ptid;
	private String pnum;
	private String pexp;
	
	
	public int getPtid() {
		return ptid;
	}
	public void setPtid(int ptid) {
		this.ptid = ptid;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public String getPexp() {
		return pexp;
	}
	public void setPexp(String pexp) {
		this.pexp = pexp;
	}
	 

}
