package Introduction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jd {

	public static void main(String[] args) {
		try {
			 
			   Class c = Class.forName("com.mysql.cj.jdbc.Driver");
			   //System.out.println(c);
			   
			   Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/rad","root","root");
			    System.out.println(con);
		   }
		   catch(Exception e){
			   e.printStackTrace(); 
		   }
	}

}
