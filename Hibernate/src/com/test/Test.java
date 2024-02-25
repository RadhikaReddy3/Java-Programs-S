package com.test;

import controller.empDao;
import pojo.employee;

public class Test {

	public static void main(String[] args) {
  
     employee e = new employee();
     empDao d = new empDao();
      e.setEid(1);
      e.setEname("abc");
      e.setEsal(345.6);
      e.setEdes("se");
       
      //d.savedata(e);
      //d.updatedata();
      //d.deletedata();
     //d.getByAll();
     //d.getAllselect();
      //d.getAllwhere();
      //d.getAllwheredynamic(2, 800.00);
      //d.updateselect(3,367.5,"mred");
      //d.deleteusinghql("ghi");
      //d.orderby();
      
      //************AGGREGATE FUNCTIONS[COUNT,AVG,MAX,MIN,SUM,GROUPBY, ORDERBY(ASC,DESC), HAVING AFTER THIS JOINS]**********************
      //d.orderby();
      //d.count();
      //d.max();
      //d.min();
      //d.sum();
      d.getAllagg();
      //d.groupby();
      //d.groupbyandorderby();
      

	}

}
