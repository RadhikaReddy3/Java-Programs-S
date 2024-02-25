package D_27_12_2023;

public class StdPojo {
	
	private int sid;
	private String sname;
	private double smarks;
	private long sm;
	
	
	@Override
	public String toString() {
		return "StdPojo [sid=" + sid + ", sname=" + sname + ", smarks=" + smarks + ", sm=" + sm + "]";
	}
	 
	public StdPojo() {
		
	}
	
	public StdPojo(int sid, String sname, double smarks, long sm) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
		this.sm = sm;
	}
 
	
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
	public double getSmarks() {
		return smarks;
	}
	public void setSmarks(double smarks) {
		this.smarks = smarks;
	}
	public long getSm() {
		return sm;
	}
	public void setSm(long sm) {
		this.sm = sm;
	}
 
	
	

}
