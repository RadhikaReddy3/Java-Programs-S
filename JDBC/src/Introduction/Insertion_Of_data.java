package Introduction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insertion_Of_data {

	public static void main(String[] args) {
		try {
			   Class c = Class.forName("com.mysql.cj.jdbc.Driver");
			   
			   Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/rad","root","root");
			      Statement s=con.createStatement();
			      
			     int h=s.executeUpdate("insert into apple.sk values(1,'siva','bcom')");
			    System.out.println("No of rows inserted: "+h);
		   }
		   catch(Exception e){
			   e.printStackTrace(); 
		   }
		   
	   

	}

}
