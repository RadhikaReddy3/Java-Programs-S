package pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class passport {
    @Id
    @GeneratedValue
	private int ptid;
	private String ptnum;
	private String pexp;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "fkpid")
	private person per;
	
	
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
	public person getPer() {
		return per;
	}
	public void setPer(person per) {
		this.per = per;
	}
	 
}
