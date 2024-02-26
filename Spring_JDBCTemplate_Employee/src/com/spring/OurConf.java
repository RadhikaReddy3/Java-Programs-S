package com.spring;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
@Configuration
@ComponentScan
public class OurConf {

	@Bean
	public DataSource datasource() {
		
		BasicDataSource ds = new BasicDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/emp");
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
		
	}
	@Bean
	public JdbcTemplate jdbctemplate( ) {
		
		//DataSource dse = datasource();
		//return new Jdbctemplate(dse);
		return new JdbcTemplate(datasource()); 
		
	}
	
}
