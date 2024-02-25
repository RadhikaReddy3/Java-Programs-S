package com.cisco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentService {
	@Autowired
      private StudentDao sd;
      public void save(StudentEntity se) {
  		System.out.println("We are in Controller save started");
  		sd.save(se);
  		System.out.println("We are in Controller save completed");
  	}

}
