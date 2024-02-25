package com.controller;
import com.slokam.*;
public class SetterInjection {

	public static void main(String[] args) {
	
		
		 
		
		Order o = new Order();
		o.setOid(1);
		o.setOloc("hyd");
		
		
		Customer c = new Customer();
		c.setCid(1);
		c.setCname("siva");
		c.setCphno(563764387);
		c.setCtrans("Phonepay");
		o.setCu(c);
		
		
		vendordata v = new vendordata();
        v.setVid(1);
        v.setVname("nestle");
        v.setVloc("Uk");
        v.setVprice("234");
        v.setVtan("556AA");
        v.setVpan("645DFGD");
         
        vendordata v1 = new vendordata();
        v1.setVid(2);
        v1.setVname("reliance");
        v1.setVloc("Ind");
        v1.setVprice("210");
        v1.setVtan("556Aa");
        v1.setVpan("645DFsD");
         
        vendordata v2 = new vendordata();
        v2.setVid(3);
        v2.setVname("Tata");
        v2.setVloc("Ind");
        v2.setVprice("210");
        v2.setVtan("556Aa");
        v2.setVpan("645DFsD");
        
        vendordata v3 = new vendordata();
        v3.setVid(4);
        v3.setVname("Birla");
        v3.setVloc("Ind");
        v3.setVprice("214");
        v3.setVtan("556Aa");
        v3.setVpan("645DFsD");
        
        
        
        vendordata [] ven= {v,v1};
        vendordata[] ve = {v2,v3};
        
        
        

		Productdet p1= new Productdet();
		p1.setPid(1);
		p1.setPname("nuts");
		p1.setPprice(34.0);
		p1.setPvat(12.0);
		p1.setPgst(5.0);
		p1.setPdis(10);
		p1.setVen(ven);//we can set diiferent 2 ,2
		 
		Productdet p2= new Productdet();
		p2.setPid(2);
		p2.setPname("choc");
		p2.setPprice(56.0);
		p2.setPvat(12.0);
		p2.setPgst(5.0);
		p2.setPdis(10);
		p2.setVen(ve);//we can set diiferent 2 ,2
		//p2.setVen(ven); //we can put same also
		Productdet[]pro= {p1,p2};
        o.setPro(pro);
        
         
        
        
        
        
		System.out.println("----order data----"+"\n");
		System.out.println(o.getOid()+" "+o.getOloc()+"\n");
		System.out.println("Customerinfo"+"\n");
		Customer ch = o.getCu();
		System.out.println(ch.getCid()+" "+ch.getCname()+" "+ch.getCphno()+" "+ch.getCloc()+" "+ch.getCtrans()+"\n");
	    System.out.println("Customer Order Product");
	    Productdet[] m= o.getPro();
	    for(int i=0;i<m.length;i++) {
	    	System.out.println("\n"+"-----Product Details-----"+"\n");
	    	System.out.println(m[i].getPid()+" "+m[i].getPname()+" "+m[i].getPprice()+" "+m[i].getPvat()+" "+m[i].getPgst()+" "+m[i].getPdis()+"\n");
	    	 
	    	vendordata[] vd = m[i].getVen();
	    	
	    	System.out.println("Vendor data");
	    	for(int h=0;h<=vd.length-1;h++) {
	    		System.out.println(vd[h].getVid()+" "+vd[h].getVname()+" "+vd[h].getVloc()+" "+vd[h].getVprice()+" "+vd[h].getVpan()+" "+vd[h].getVtan());
	    	}
	    }
		 
		  
	}

}









/*package com.controller;
import com.slokam.*;

public class SetterInjection {

	public static void main(String[] args) {
		Order o= new Order();
		o.setOid(1);
		o.setOloc("hyd");
		Customer c = new Customer();
		c.setCid(101);
		c.setCloc("rajesh");
		c.setCphno(9876543210L);
		c.setCloc("hyd");
		c.setCtrans("phonepay");
		o.setCu(c);
	     vendordata n = new vendordata();
	     n.setVid(201);
	     n.setVname("tata");
	     n.setVloc("srnagar");
	     n.setVprice("234.45");
	     n.setVtan("phonepay");
	     n.setVpan("nuts@123");
	     
	     vendordata n1 = new vendordata();
	     n1.setVid(202);
	     n1.setVname("reliance");
	     n1.setVloc("amerpet");
	     n1.setVprice("46.56");
	     n1.setVtan("gpay");
	     n1.setVpan("nuts@129");
	     vendordata[] nuts = { n, n1};
	     
	     vendordata b = new vendordata();
	     b.setVid(203);
	     b.setVname("nestel");
	     b.setVloc("scd");
	     b.setVprice("34.45");
	     b.setVtan("phonepay");
	     b.setVpan("bisc@123");
	     
	     
	     vendordata b1 = new vendordata();
	     b1.setVid(204);
	     b1.setVname("tata");
	     b1.setVloc("srnagar");
	     b1.setVprice("234.45");
	     b1.setVtan("phonepay");
	     b1.setVpan("nuts@123");
	     
	     vendordata[] bisc = {b,b1};
	     
	     Productdet p = new Productdet();
	     p.setPid(1001);
	     p.setPname("nuts");
	     p.setPprice(34.25);
	     p.setPvat(1000);
	     p.setPgst(5);
	     p.setPdis(10);
	     p.setVen(nuts);
	     
	     
	     Productdet p1 = new Productdet();
	     p1.setPid(1002);
	     p1.setPname("bisc");
	     p1.setPprice(46.56);
	     p1.setPvat(1300);
	     p1.setPgst(7);
	     p1.setPdis(15);
	     p1.setVen(bisc);
	     
	     Productdet[] pro = {p,p1};
	     
	     o.setPro(pro);
	     
	     System.out.println("------------------------order details --------------------");
			System.out.println("order id "+o.getOid());
			System.out.println("order location "+o.getOloc());
			
			System.out.println("------------------------customer details --------------------");
			
			Customer ch = o.getCu();
			System.out.println("customer id "+ch.getCid());
			System.out.println("customer name "+ch.getCname());
			System.out.println("customer number "+ch.getCphno());
			System.out.println("customer loction "+ch.getCloc());
			System.out.println("customer transation "+ch.getCtrans());
			
			System.out.println("------------------------Product details --------------------");
			
			Productdet[] m = o.getPro();
			
			for(int i=0; i<=m.length-1; i++) {
				
				
				System.out.println("\n"+"product id "+m[i].getPid());
				System.out.println("product name "+m[i].getPname());
				System.out.println("product price "+m[i].getPprice());
				System.out.println("product vat "+m[i].getPvat());
				System.out.println("product gst"+m[i].getPgst());
				System.out.println("product dis"+m[i].getPdis());
				System.out.println("\n"+"---Vendor details---"+"\n");
				vendordata[] v= m[i].getVen();
				for(int h=0; h<=v.length-1; h++) {
					System.out.println("vendor id " +v[h].getVid());
					System.out.println("vendor name " +v[h].getVname());
					System.out.println("vendor price " +v[h].getVprice());
					System.out.println("vendor tan " +v[h].getVtan());
					System.out.println("vendor pan " +v[h].getVpan());
				}
			
				
			}
	}
}*/

