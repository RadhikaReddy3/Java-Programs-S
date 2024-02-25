package clone_13_12_2023;

public class Dept {

	 
	 
		private int did;
		private String dname;
		private String dhead;
		
		
		public Dept() {
		}
			
		@Override
		public String toString() {
			return "Dept [did=" + did + ", dname=" + dname + ", dhead=" + dhead + "]";
		}

		public int getDid() {
			return did;
		}

		public void setDid(int did) {
			this.did = did;
		}

		public String getDname() {
			return dname;
		}

		public void setDname(String dname) {
			this.dname = dname;
		}

		public String getDhead() {
			return dhead;
		}

		public void setDhead(String dhead) {
			this.dhead = dhead;
		}

		 
		
		public Dept(int did, String dname, String dhead) {
			super();
			this.did = did;
			this.dname = dname;
			this.dhead = dhead;
		}
		
		
		public Object Clone() throws CloneNotSupportedException {
		 return super.clone(); 
		

	}

}
