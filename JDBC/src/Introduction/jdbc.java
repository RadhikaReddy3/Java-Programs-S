package Introduction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*public class jdbc {

   public static void main(String[] args) {
	   /*
	    * Class itself is a class and returntype is a class 
	  *connection is a interface
	 * create statement - return type is statement
	 * statement is meant for static query - two methods executeupdate,executequery
	 * executeupdate - return type int  - we can perform insert update delete
	 * executequery - return type resultset - select query..
	 * prepared statement meant for dynamic query - 
	 * forName - throws class not found exception - it is a static method
	 * DriverManager it is a class
	 * getConnection - throws sql exception - it is a static method
	 * 
	*/
	  /* try {
		   Class c = Class.forName("com.mysql.cj.jdbc.Driver");
		   System.out.println(c);
		   
		   Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/rad","root","root");
		      Statement s=con.createStatement();
		      System.out.println("Create Statement: "+s);
		      System.out.println(con.prepareStatement("testrelation"));
		      System.out.println(con.prepareCall("testrelation"));
		   System.out.println(con);
	   }
	   catch(Exception e){
		   e.printStackTrace(); 
	   }
	   
   }*/
   
public class jdbc {

	   public static void main(String[] args) {
		  
		   try {
			   Class c = Class.forName("com.mysql.cj.jdbc.Driver");
			   System.out.println(c);
			   
			   Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/rad","root","root");
			      Statement s=con.createStatement();
			      int d =s.executeUpdate("insert into apple.sk values(105,'Gsh','Pa')");
			   System.out.println("No.of rows inserted: "+ d);
		   }
		   catch(Exception e){
			   e.printStackTrace(); 
		   }
		    
	   }
}
