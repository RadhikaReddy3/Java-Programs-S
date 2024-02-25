package com.product;
 

public class Test {

	public static void main(String[] args) {
    product s = new product ();
		s.setPid(1);
		s.setPname("bis");
		s.setPprice(56.9);

		pdtDao g = new pdtDao();
		g.savedata(s);

	}

}
