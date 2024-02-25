package Introduction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class testPreparedStatement {
	public   void saveddata() {
		try {
			   Class c = Class.forName("com.mysql.cj.jdbc.Driver");
			   
			   Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/rad","root","root");
			       
			      PreparedStatement s =con.prepareStatement("insert into apple.sk values(104,'tsh','ba')");
			      int d =s.executeUpdate();
			     System.out.println("No of rows inserted: "+d);
		   }
		   catch(Exception e){
			   e.printStackTrace(); 
		   }
	}

	public static void main(String[] args) {
		 
		testPreparedStatement t = new testPreparedStatement();
		t.saveddata();

	}

}
