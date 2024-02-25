package Constructor;

public class Test {

	public static void main(String[] args) {
		
		 
		 mobiles m = new mobiles(1,"abc","jio");
		 mobiles m1 = new mobiles(2,"affc","bsnl");
		 mobiles [] d = {m,m1};
		 
		 Person p = new Person(1,"abc",21,new VoterID(1,"def","Hyd"),d);
		 
		 System.out.println(p.getPid()+"\n"+p.getPname()+"\n"+p.getPage()+"\n"); 
		 System.out.println(p.getVo().getVid()+"\n"+p.getVo().getVname()+"\n"+p.getVo().getVloc()+"\n");
		 mobiles [] e = p.getMob();
		 
		 for(int i=0; i<e.length;i++)
		{
			 System.out.println(e[i].mid+"\n"+e[i].mname+"\n"+e[i].msim);
		 }

	}

}
