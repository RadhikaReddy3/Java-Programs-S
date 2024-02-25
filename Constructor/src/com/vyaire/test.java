package com.vyaire;

public class test {

	public static void main(String[] args) {
		 emp p = new emp();
		 emp q = new emp(12);
		 emp r = new emp(13,"lucky");
		 emp s = new emp(13,"lucky",56);
		 
		 System.out.println(p);
		 System.out.println(q.getEid());
		 System.out.println(r.getEid()+"---"+r.getEname());
		 System.out.println(s.getEid()+"---"+s.getEname()+"---"+s.getEsal());
		 

	}

}
