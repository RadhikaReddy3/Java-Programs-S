package com.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

 
import com.pojo.Product;
 
import com.pojo.Vendor;
public class CompositeTest {

	public static void savemethod() {
		SessionFactory sf = GetSessionFactory.con();
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		Product h = new Product();
		h.setPname("TV");
		h.setPprice(56.7);
		h.setPloc("Hyd");
		Vendor j = new Vendor();
		j.setPid(1);
		j.setVid(1);
		h.setVe(j);
		
		s.save(h);
		t.commit();
		s.close();	
	}
 
	
	public void updatedata(int pid, int vid)
	{
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Vendor v = new Vendor();
		v.setPid(pid);
		v.setVid(vid);
		Product p =(Product)s.get(Product.class,v);
	    p.setPname("cherry");
        
		 
	    s.update(p);
	    t.commit();
		s.close();
		
}
	
	public static void getAll() {
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
		Query q =s.createQuery("from Product");
		List<Product> d=q.list();
		
		for (Product p : d) {
			System.out.println(p);
		}
		
		
	}
	public static void getByid(int pid, int vid) {
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
		Vendor v = new Vendor();
		v.setVid(vid);
		v.setPid(pid);
		Product p =(Product) s.get(Product.class, v);
		System.out.println(p);
		s.close();
	}
	



	public static void main(String[] args) {
		CompositeTest n = new CompositeTest();
		//n.savemethod();
		//n.updatedata(1, 1);
		//n.getAll();
		n.getByid(1, 1);
	}

}
