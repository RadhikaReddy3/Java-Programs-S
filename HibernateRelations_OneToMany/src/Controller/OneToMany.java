package Controller;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import Pojo.Person;

import Pojo.*;
import java.util.List;
import java.util.ArrayList;

public class OneToMany {
	
	public void savedata() {
		
		Session r = getCon.con();
		Transaction t = r.beginTransaction();
		Person p = new Person();
		p.setPid(3);
		p.setPage(23);
		p.setPname("hij");
		p.setPqua("MTECH");
		
		/*Passport k = new Passport();
		k.setPtnum("FG123P");
		k.setPexp("2070");*/
		
		List<Mobile> d =new ArrayList<>();
		d.add(new Mobile(6428948476l,"vodo"));
		d.add(new Mobile(786278368264l,"docomo"));
		d.add(new Mobile(67249827428l,"idea")); 
		 
		p.setMb(d);
		//p.setPt(k);
		r.save(p);
		t.commit();
		r.close();
	}
	
	public void getbyId(int pid) {
		Session r = getCon.con();
		 
		Person p = (Person) r.get(Person.class, pid);
		System.out.println(p.getPid()+", "+p.getPage()+", "+p.getPqua());
		
		
		Passport n = p.getPt();
		if(n!=null) {
			 System.out.println(n.getPtid()+","+n.getPtnum()+","+n.getPexp());
		 }
		 else {
			 System.out.println("No Passport");
		 }
		 List<Mobile> mo =p.getMb();
		 if(mo!=null) {
			 for(Mobile m:mo) {
				 System.out.println(m.getMid()+", "+m.getMnum()+", "+m.getMsim());
			 }
		 }
		 else {
			 System.out.println("No Mobile");
		 }
	}

	public void getAll() {
         Session r = getCon.con();
		
		 Transaction t = r.beginTransaction();
		 Query q=r.createQuery("from Person");
		 
		 List<Person> data =q.list();
		 
		 for(Person p:data) {
			 System.out.println(p.getPid()+", "+p.getPage()+", "+p.getPqua());
			 
			 Passport n = p.getPt();
			 if(n!=null) {
				 System.out.println(n.getPtid()+","+n.getPtnum()+","+n.getPexp());
			 }
			 else {
				 System.out.println("No Passport");
			 }
			 List<Mobile> mo =p.getMb();
			 if(mo!=null) {
				 for(Mobile m:mo) {
					 System.out.println(m.getMid()+", "+m.getMnum()+", "+m.getMsim());
				 }
			 }
			 else {
				 System.out.println("No Mobile");
			 }
			 
			 System.out.println("-----------Next---------------");
		 }
	}
	
	public void updatedata(int pid) {
		Session r = getCon.con();
		Transaction t = r.beginTransaction(); 
		Person p = (Person) r.get(Person.class, pid);
		 List<Mobile> mo =p.getMb();
		 
		 for(Mobile n:mo) {
			 if(n.getMsim().equals("airtel")) {
				 n.setMnum(9876543210l);
			 }
			 
		 }
          r.update(p);
          t.commit();
          r.close();
	}
	
	public void deletedata(int pid) {
		Session r = getCon.con();
		Transaction t = r.beginTransaction(); 
		Person p = (Person) r.get(Person.class, pid);
		 
          r.delete(p);
          t.commit();
          r.close();
	}
	public static void main(String[] args) {
		 
		OneToMany m = new OneToMany();
		 m.savedata();
		//m.getbyId(1);
	   //m.getAll();
      //m.updatedata(2);
     //m.deletedata(2);
	}

}
