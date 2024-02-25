package com.wipro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

 

@Component
public class ProductController {
	@Autowired
	private ProductService ss;
	
	public void save(ProductEntity se) {
		System.out.println("We are in Controller save started");
	    ss.save(se);
	    System.out.println("ProductDetails:"+se);
		System.out.println("We are in Controller save completed");
	}

}
