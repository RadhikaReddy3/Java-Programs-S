package Encapsulation;

public class ETest {

	public static void main(String[] args) {
		 
		 Employee e = new Employee();
		 e.setEid(111);
		 e.setEname("Radhika");
		 e.setEsal(50000.6426);
		 
		 Eproject r = new Eproject();
		 r.setPid(1);
		 r.setPname("abcd");
		 r.setPdom("ML");
		 
		 Eproject r1 = new Eproject();
		 r1.setPid(2);
		 r1.setPname("fgbcd");
		 r1.setPdom("AI");
		 
		 Eproject[] t = {r,r1};
		 e.setEp(t);
		 
		 System.out.println(e.getEid()+"  "+e.getEname()+"  "+e.getEsal());
		 
		 Eproject[] g =  e.getEp();
		 for(int i=0; i<g.length; i++) 
		 {
			 System.out.println(g[i].getPid()+" "+g[i].getPname()+" "+g[i].getPdom());
		 }
	}

}
