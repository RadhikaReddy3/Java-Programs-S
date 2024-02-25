package com.wipro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

 

@Component
public class ProductService {
	@Autowired
    private ProductDao sd;
    public void save(ProductEntity se) {
		System.out.println("We are in Controller save started");
		sd.save(se);
		System.out.println("We are in Controller save completed");
	}

}
