package com.test;

import controller.depDao;
import pojo.department;

public class Testde {

	public static void main(String[] args) {
		department e = new department();
	     depDao d = new depDao();
	      e.setDid(1);
	      e.setDname("abc");
	      e.setDloc("KNR");
	      e.setDphno(985418411l);
	       
	      //d.savedata(e);
	     // d.getByID(1);
	    //d.updatedata();
	   //d.deletedata();
	   //d.getByAll();
	   d.getAllBySelect();
	   

	}

}
