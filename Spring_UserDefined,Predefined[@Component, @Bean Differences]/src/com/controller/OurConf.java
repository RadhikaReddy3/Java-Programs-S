package com.controller;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.pojo.*;

@Configuration
@ComponentScan("com.pojo")
public class OurConf {
	
	//PREDEFINED CLASSES
	
	@Bean
	public ArrayList getAll() {
		
		ArrayList k = new ArrayList();
		k.add("siva");
		k.add("ram");
		
		return k;
	}
	
	@Bean
	public String getdata() {
		
		String st = new String("manju");
		 
		return st;
	}
	
	
	
	//USERDEFINED CLASSES
	@Bean
	public Manager ma() {
		Manager man = new Manager();
		return man;
	}
	
	@Bean
	public TeamLead tl() {
		TeamLead tm = new TeamLead();
		return tm;
	}
 
	@Bean
	public Developer de() {
		Developer dev = new Developer();
		return dev;
	}

}