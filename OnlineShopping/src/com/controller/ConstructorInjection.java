package com.controller;

import com.slokam.Customer;
import com.slokam.Order;
import com.slokam.Productdet;
import com.slokam.vendordata;

public class ConstructorInjection {

	public static void main(String[] args) {
		
		Customer c = new Customer(1, "siva",456456,"hyd","phonepay");
		vendordata[] nutsv = {new vendordata(1,"tata","tatatan","tatapan","tataindia","200"),new vendordata(2,"reliance","hyd","56.55","tan","pan")};
		vendordata[] bisv = {new vendordata(3,"nestle","hyd","96.55","tan","pan"),new vendordata(4,"rel","hyd","56.55","tan","pan")};
		
		
		
		Productdet p1= new Productdet(1,"nuts",34.0,3.0,12.0,5.0,nutsv);
		Productdet p2= new Productdet(2,"choc",56.0,4.0,12.0,5.0,bisv);
		Productdet[]pro= {p1,p2};
		
		Order o = new Order(1,"hyd",c,pro);

		System.out.println("--order data--"+"\n");
		System.out.println(o.getOid()+" "+o.getOloc()+"\n");
		System.out.println("Customerinfo"+"\n");
		Customer ch = o.getCu();
		System.out.println(ch.getCid()+" "+ch.getCname()+" "+ch.getCphno()+" "+ch.getCloc()+" "+ch.getCtrans()+"\n");
	    System.out.println("Customer Order Product");
	    Productdet[] m= o.getPro();
	    for(int i=0;i<=m.length-1;i++) {
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
