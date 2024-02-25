package com.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pojo.Address;
 
public class OneClassIntoTwoTables {
	
	
	public static void savemethod() {
		SessionFactory sf = GetSessionFactory.con();
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		Address p = new Address("Hyd","srnagar","1234","scd","aa","1234");
		s.save(p);
		t.commit();
		s.close();
	}
	
	public static void GETBYID(int aid) {
		
		SessionFactory sf = GetSessionFactory.con();
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		Address l =(Address)s.get(Address.class, aid);
		System.out.println(l);
		
	}
	public void getById1(int pid) {
	    SessionFactory sf = GetSessionFactory.con();
	    Session d = sf.openSession();
	    Address p = (Address) d.get(Address.class, pid);

	    if (p != null) {
	        if (p.getPlocation() != null && p.getPstreet() != null && p.getPphone() != null) {
	        	System.out.println("Physical Address: ");
	            System.out.println("Location: " + p.getPlocation());
	            System.out.println("Street: " + p.getPstreet());
	            System.out.println("Phone: " + p.getPphone());
	        } else {
	            System.out.println("No Physical Address ");
	             
	        }

	        if (p.getMlocation() != null && p.getMstreet() != null && p.getMphone() != null) {
	            System.out.println("Mailing Address: ");
	            System.out.println("Location: " + p.getMlocation());
	            System.out.println("Street: " + p.getMstreet());
	            System.out.println("Phone: " + p.getMphone());
	        } else {
	            System.out.println("No Mailing Address ");
	            
	        }
	    } else {
	        System.out.println("No Address Found");
	    }
	    d.close();
	}
	public void getById2(int pid) {
	    SessionFactory sf = GetSessionFactory.con();
	    Session d = sf.openSession();
	    Address p = (Address) d.get(Address.class, pid);

	    if (p != null) {
	        if (p.getPlocation() != null || p.getPstreet() != null || p.getPphone() != null) {
	            System.out.println("Physical Address: ");
	            if (p.getPlocation() != null) {
	                System.out.println("Location: " + p.getPlocation());
	            }
	            if (p.getPstreet() != null) {
	                System.out.println("Street: " + p.getPstreet());
	            }
	            if (p.getPphone() != null) {
	                System.out.println("Phone: " + p.getPphone());
	            }
	        } else {
	            System.out.println("No Physical Address");
	        }

	        if (p.getMlocation() != null || p.getMstreet() != null || p.getMphone() != null) {
	            System.out.println("Mailing Address: ");
	            if (p.getMlocation() != null) {
	                System.out.println("Location: " + p.getMlocation());
	            }
	            if (p.getMstreet() != null) {
	                System.out.println("Street: " + p.getMstreet());
	            }
	            if (p.getMphone() != null) {
	                System.out.println("Phone: " + p.getMphone());
	            }
	        } else {
	            System.out.println("No Mailing Address");
	        }
	    } else {
	        System.out.println("No Address Found");
	    }

	    d.close();
	}


	public static void getByName(String  plocation) {
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
		Query p =s.createQuery("select a.pphone , a.pstreet from Address a where plocation =:plocation");
		p.setParameter("plocation",plocation);
		
		/*List<Address> Adr =p.list();
		for(Address em: Adr) {
			System.out.println(em);
		}*/
		
		List<Object[]> Adr =p.list();
		for(Object[] em: Adr) {
			System.out.println(em[0]+", "+em[1]);
		}
		
	}
	public void updatedata(int aid)
	{
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
	    Address p =(Address)s.get(Address.class, aid);
	    p.setPlocation("cherry");
        
		
		 
		p.setPphone("123456");
		p.setMlocation("KNR");
		p.setMphone("7890");
		p.setMstreet("hk");
		
	    s.update(p);
	    t.commit();
		s.close();
		
}
	
	public void delete(int aid) {
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Address p = (Address) s.get(Address.class, aid);
	    s.delete(p);
	    
	    t.commit();
	    s.close();
	}
	public void getByAll() {
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
		Query q=s.createQuery("from Address");
		List<Address> Ad =q.list();

		for(Address k:Ad) {
			System.out.println(k);
		}

		 
		}


	public static void main(String[] args) {
		 
		OneClassIntoTwoTables n = new OneClassIntoTwoTables();
		//n.savemethod();
		//n.GETBYID(3);
		//n.getById1(1);
		//n.getByName("fr");
		//n.updatedata(3);
		n.getByAll();
		//n.delete(6);
		

	}

}
