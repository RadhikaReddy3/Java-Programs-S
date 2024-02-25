package Constructor;

public class mobiles {
	
	public int mid;
	public String mname;
	public String msim;
	
	public mobiles(int mid, String mname, String msim) {
		this.mid = mid;
		this.mname = mname;
		this.msim = msim;
	}
	 
	
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMsim() {
		return msim;
	}
	public void setMsim(String msim) {
		this.msim = msim;
	}
	 

}
