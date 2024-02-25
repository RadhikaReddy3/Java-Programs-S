package com.cisco;

public class Etest {

	public static void main(String[] args) {
		 Employee e = new Employee();
		 e.setEid(123);
		 e.setEname("Radhika");
		 e.setEsal(5.55);
		 
		 Department d = new Department();
		 d.setDno(33);
		 d.setDname("CSE");
		 d.setDran(150);
		 
		 Department d1 = new Department();
		 d1.setDno(34);
		 d1.setDname("ECE");
		 d1.setDran(155);
		 
		 Department[] data = {d,d1};
		 e.setDe(data);
		 
		 
		 
		 System.out.println(e.getEid());
		 System.out.println(e.getEname());
		 System.out.println(e.getEsal());
		 Department[] c= e.getDe();
		 
		 for(int i=0;i<c.length;i++) {
			 
		 
		 
		 System.out.print(c[i].getDno()+" ");
		 System.out.print(c[i].getDname()+" ");
		 System.out.println(c[i].getDran());
		 
		 }

	}

}
