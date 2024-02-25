//PRACTICE 


package Controller;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Pojo.Person;
import Pojo.Mobile;
import Pojo.Passport;
import java.util.*;
public class OM {
	public void savedata() {
		Session g = getCon.con();
		Transaction t = g.beginTransaction();
		
		Person p = new Person();
		p.setPname("Ram");
		p.setPage(100);
		p.setPqua("MCA");
		
		Passport q = new Passport();
		q.setPtnum("AB123C");
		q.setPexp("2056");
		p.setPt(q);
		
		List<Mobile> mo = new ArrayList<>();
		mo.add(new Mobile(9274881973l,"dcomo"));
		mo.add(new Mobile(7626157831l,"idea"));
		mo.add(new Mobile(67365378168l,"Jio"));
		p.setMb(mo);
		
		g.save(p);
		t.commit();
		g.close();
	}
	
	public void getbyId(int pid) {
		Session r = getCon.con();
		Transaction t = r.beginTransaction();
		
		Person k =(Person)r.get(Person.class, pid);
		System.out.println(k.getPid()+","+k.getPname()+","+k.getPqua());
		
		Passport m=k.getPt();
		if( m !=null) {
			
			System.out.println(m.getPtid()+","+m.getPtnum()+","+m.getPexp());
			
		}
		
		else {
			System.out.println("No Passport");
		}
		
		List<Mobile> mo = k.getMb();
		if(mo!=null) {
			for(Mobile mob:mo) {
				System.out.println(mob.getMid()+","+mob.getMnum()+","+mob.getMsim());
			}
		}
		else {
			System.out.println("No Mobile");
		}	
	}
	
	public void getAll() {
		Session r = getCon.con();
		Transaction t=r.beginTransaction();
		Query d =r.createQuery("from Person");
		List<Person>data =d.list();
		
		for(Person k:data) {
			System.out.println(k.getPid()+","+k.getPname()+","+k.getPqua());
			
			Passport m=k.getPt();
			if( m !=null) {
				
				System.out.println(m.getPtid()+","+m.getPtnum()+","+m.getPexp());
				
			}
			
			else {
				System.out.println("No Passport");
			}
			
			List<Mobile> mo = k.getMb();
			if(mo!=null&& !mo.isEmpty()) {
				for(Mobile mob:mo) {
					System.out.println(mob.getMid()+","+mob.getMnum()+","+mob.getMsim());
				}
			}
			else {
				System.out.println("No Mobile");
			}	
		}
		 
	}
	
	public void update(int pid) {
		Session r = getCon.con();
		Transaction t=r.beginTransaction();
		
		Person p=(Person)r.get(Person.class, pid);
		List<Mobile> mob =p.getMb();
		for(Mobile mo: mob) {
			if(mo.getMsim().equals("airtel")) {
				
				 mo.setMnum(765432197l);
			}
		}
		r.update(p);
		t.commit();
		r.close();
	}
	
	public void delete(int pid) {
		Session r = getCon.con();
		Transaction t=r.beginTransaction();
		
		Person p=(Person)r.get(Person.class, pid);
		 
		r.delete(p);
		t.commit();
		r.close();
	}

	public static void main(String[] args) {
		 OM j = new OM();
		 //j.savedata();
		 //j.getbyId(1);
		 j.getAll();
		 //j.update(1);
		 //j.delete(6);
		 

	}

}







/*The use of mo.isEmpty() is to check whether the list of mobiles (mo) is empty. In Java, the isEmpty() method is a part of the List interface, and it returns true if the list contains no elements; otherwise, it returns false.

Here's the logic breakdown:

mo != null: Checks if the list reference (mo) is not null.
!mo.isEmpty(): Checks if the list is not only not null but also not empty.
Without the mo.isEmpty() check, the condition mo != null would be true even if the list is empty. By adding mo.isEmpty(), you ensure that the block of code inside the if statement is executed only when the list is not null and not empty.

If the list is null, it means there are no mobiles associated with the person. If the list is not null but empty, it also means there are no mobiles associated with the person. In both cases, you want to print the "No Mobile" message.*/