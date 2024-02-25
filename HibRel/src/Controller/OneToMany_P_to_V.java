package Controller;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Pojo.*;
import java.util.*;

public class OneToMany_P_to_V {
	
	public void savedata() {
		Session r = getCon.con();
		Transaction t=r.beginTransaction();
		
		Product p = new Product();
		p.setPid(1);
		p.setPname("IPHONE");
		p.setPprice(1.5);
		
	     List<Vendor> ve = new ArrayList<>();
	     ve.add((new Vendor("ABC","HYD")));
	     ve.add((new Vendor("DEF","SCD")));
	     ve.add((new Vendor("GHI","KNR")));
	     
	     p.setVen(ve);
	     
		 
		 r.save(p);
		 t.commit();
		 r.close();
		 	
	}
	
	public void getbyId(int pid) {
		Session r = getCon.con();
		Transaction t = r.beginTransaction();
		
		Product k =(Product)r.get(Product.class,pid);
		System.out.println(k.getPid()+","+k.getPname()+","+k.getPprice());
		
		 
		
		List<Vendor> ve = k.getVen();
		if(ve!=null) {
			for(Vendor ven:ve) {
				System.out.println(ven.getVid()+","+ven.getVname()+","+ven.getVloc());
			}
		}
		else {
			System.out.println("No Vendors for this product");
		}	
	}
	
	 
	
	public void getAll() {
		Session r = getCon.con();
		Transaction t=r.beginTransaction();
		Query d =r.createQuery("from Product");
		List<Product>data =d.list();
		
		for(Product k:data) {
			System.out.println(k.getPid()+","+k.getPname()+","+k.getPprice());
			
			List<Vendor> ve = k.getVen();
			if(ve!=null) {
				for(Vendor ven:ve) {
					System.out.println(ven.getVid()+","+ven.getVname()+","+ven.getVloc());
				}
			}
			else {
				System.out.println("No Vendors for this product");
			}
			 
			
			 
		}
		 
	}
	public void update(int pid) {
		Session r = getCon.con();
		Transaction t =r.beginTransaction();
		 Product p=(Product)r.get(Product.class, pid);
		 List<Vendor> v =p.getVen();
		
		for(Vendor ve: v) {
			 if(ve.getVloc().equals("KNR")) {
				 ve.setVname("Jai");
			 }
		}
		
		r.update(p);
		t.commit();
		r.close();
	}
	public void delete(int pid) {
		Session r = getCon.con();
		Transaction t =r.beginTransaction();
		 Product p=(Product)r.get(Product.class, pid);
		 
		
		r.delete(p);
		t.commit();
		r.close();
	}
	
	
	public void getbyv(String vname) {
		Session s = getCon.con();
		Query q=s.createQuery("SELECT v FROM Vendor v WHERE v.vname = :vendorName");
		
		List<Object[]> g =q.list();
		for(Object [] o:g) {
			System.out.println(o[0]+"---"+o[1]+"----"+o[2]);
		}
		s.close();
		
	}

	public static void main(String[] args) {
		 OneToMany_P_to_V o = new OneToMany_P_to_V();
		 //o.savedata();
		// o.getbyId(1);
		   //o.getAll();
		 //o.update(1);
		 //o.delete(5);
		  

	}

}
