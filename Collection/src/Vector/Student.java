package Vector;

public class Student {
	
	private int sid;
	private String sname;
	private double smarks;
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", smarks=" + smarks + "]";
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


	 
	
	
	public Student(int sid, String sname, double smarks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
	}
	 
	

}
