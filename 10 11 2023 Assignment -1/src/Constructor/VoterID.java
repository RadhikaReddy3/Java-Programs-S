package Constructor;

public class VoterID {
	
	public int vid;
	public String vname;
	public String vloc;
	
	public VoterID(int vid, String vname, String vloc) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.vloc = vloc;
	}
	 
	
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getVloc() {
		return vloc;
	}
	public void setVloc(String vloc) {
		this.vloc = vloc;
	}
	 

}
