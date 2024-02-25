package com.slokam;

public class Etestt {
	Employee m1() {
		Employee e = new Employee();
		e.eid=1;
		e.ename= "Radhika";
		e.esal=33.33;
		e.edesig="java developer";
		return e;
	}
	Employee [] m2() {
		Employee e = new Employee();
		e.eid=1;
		e.ename= "Radhika";
		e.esal=33.33;
		e.edesig="java developer";
		
		Employee e1 = new Employee();
		e1.eid=2;
		e1.ename= "lucky";
		e1.esal=53.33;
		e1.edesig="software developer";
		
		Employee [] d = {e,e1};
		return d;
	}

	public static void main(String[] args) {
		 Etestt t = new Etestt();
		 Employee d = t.m1();
		 System.out.println(d.eid);
		 System.out.println(d.ename);
		 System.out.println(d.esal);
		 System.out.println(d.edesig);
		 
		 System.out.println("-----Array of employee objects method execution----");
		 
		 Employee [] e=t.m2();
		 for(int i=0;i<e.length;i++) {
			 System.out.println(e[i].eid);
			 System.out.println(e[i].ename);
			 System.out.println(e[i].esal);
			 System.out.println(e[i].edesig);
			 System.out.println("----next employee---");
		 }

	}

}
