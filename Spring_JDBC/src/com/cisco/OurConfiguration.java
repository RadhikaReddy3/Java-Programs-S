package com.cisco;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cisco")
public class OurConfiguration {
	
	@Bean
	public DataSource datasource() {
		
		BasicDataSource bd = new BasicDataSource();
		bd.setDriverClassName("com.mysql.cj.jdbc.Driver");
		bd.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		bd.setPassword("root");
		bd.setUsername("root");
		return bd;
	}

	 
}