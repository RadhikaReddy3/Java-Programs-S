package com.test;
import pojo.product;
import controller.*;
public class Testpdt {

	public static void main(String[] args) {
		 
		product e = new product();
		 pdtDao d = new pdtDao();
	      e.setPid(1);
	      e.setPname("abc");
	      e.setPprice(35.7);
	      e.setPde(false);
	       
	      //d.savedata(e);
	      //d.getByID(1);
	      //d.updatedata();
	      //d.deletedata();
	     d.getByAll();

	}

}
