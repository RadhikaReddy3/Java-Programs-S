package D_27_12_2023;

public class PdtPojo {
	private int pid;
	private String pname;
	private double pprice;
	private boolean pd;
	
	public PdtPojo(int pid, String pname, double pprice, boolean pd) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
		this.pd = pd;
	}

	@Override
	public String toString() {
		return "pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", pd=" + pd + " ";
	}
	
	public PdtPojo() {
		
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

	public double getPprice() {
		return pprice;
	}

	public void setPprice(double pprice) {
		this.pprice = pprice;
	}

	public boolean isPd() {
		return pd;
	}

	public void setPd(boolean pd) {
		this.pd = pd;
	}

	 
}
