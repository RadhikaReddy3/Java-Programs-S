package Pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	@GeneratedValue
	private int pid;
	private String pname;
	private int page;
	private String pqua;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fkpid")
	private Passport pt;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "mkfid")
	private List<Mobile> mb;
	
	
	
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

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getPqua() {
		return pqua;
	}

	public void setPqua(String pqua) {
		this.pqua = pqua;
	}

	public Passport getPt() {
		return pt;
	}

	public void setPt(Passport pt) {
		this.pt = pt;
	}

	public List<Mobile> getMb() {
		return mb;
	}

	public void setMb(List<Mobile> mb) {
		this.mb = mb;
	}

 
}
