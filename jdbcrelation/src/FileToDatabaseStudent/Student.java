package FileToDatabaseStudent;

public class Student {
	
	 private int sid;
	 private String sname;
	 private int sage;
	 private double smarks;
	 
	 public Student() {
		 
	 }
	
	 public Student(int sid, String sname, int sage, double smarks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.smarks = smarks;
	}
	 
	
	 @Override
	public String toString() {
		return " sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", smarks=" + smarks + " ";
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
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public double getSmarks() {
		return smarks;
	}
	public void setSmarks(double smarks) {
		this.smarks = smarks;
	}
	 

}