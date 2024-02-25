package Constructor;

public class Person {
	private int pid;
	private String pname;
	private int page;
    private VoterID vo;
    private mobiles[] mob;
    
    
	public Person(int pid, String pname, int page, VoterID vo, mobiles[] mob) {
		this.pid = pid;
		this.pname = pname;
		this.page = page;
		this.vo = vo;
		this.mob = mob;
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
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public VoterID getVo() {
		return vo;
	}
	public void setVo(VoterID vo) {
		this.vo = vo;
	}
	public mobiles[] getMob() {
		return mob;
	}
	public void setMob(mobiles[] mob) {
		this.mob = mob;
	}
	 
}
