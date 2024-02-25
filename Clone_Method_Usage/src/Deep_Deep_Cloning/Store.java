package Deep_Deep_Cloning;

public class Store
{
     private int sid;
     private String sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Store [sid=" + sid + ", sname=" + sname + "]";
	}
	public Store(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
     
}


