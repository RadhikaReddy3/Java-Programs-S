package com.pojo;

import javax.persistence.Entity;

@Entity 
public class Developer {

  public void doWork() {
		
		System.out.println("Developer Work started");
		System.out.println("Developer Work completed");
		
	}
}
