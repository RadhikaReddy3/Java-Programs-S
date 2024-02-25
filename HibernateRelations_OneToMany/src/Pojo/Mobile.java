package Pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Mobile {
	
	@Id
	@GeneratedValue
	private int mid;
	private long mnum;
	private String msim;
	
	
	public Mobile() {
		
	}
	
	
	public Mobile( long mnum, String msim) {
		 
		this.mnum = mnum;
		this.msim = msim;
	}
	 
	
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public long getMnum() {
		return mnum;
	}
	public void setMnum(long mnum) {
		this.mnum = mnum;
	}
	public String getMsim() {
		return msim;
	}
	public void setMsim(String msim) {
		this.msim = msim;
	}
	 

}
