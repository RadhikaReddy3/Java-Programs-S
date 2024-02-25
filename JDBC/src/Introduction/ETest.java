package Introduction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ETest {


		public void saveddata(Employee e1) {
			try {
				   Class c = Class.forName("com.mysql.cj.jdbc.Driver");
				   
				   Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/rad","root","root");
				      
				      PreparedStatement s =con.prepareStatement("insert into apple.sk values(?,?,?)");
				       s.setInt(1, e1.getEid());
				       s.setString(2, e1.getEname());
				       s.setString(3, e1.getEloc());
				      int d =s.executeUpdate();
				     System.out.println("No of rows inserted: "+d);
			   }
			   catch(Exception e){
				   e.printStackTrace(); 
			   }
		}

		public static void main(String[] args) {
		 ETest q = new ETest();
		 Employee p = new Employee();
			Scanner s = new Scanner(System.in);
			System.out.println("Enter employee id: ");
	        int eid =s.nextInt();
	        System.out.println("Enter employee name: ");
	        String ename =s.next();
	        System.out.println("Enter employee location: ");
	        String eloc =s.next();
	        
	        p.setEid(eid);
	        p.setEname(ename);
	        p.setEloc(eloc);
			q.saveddata(p);
			 
		    s.close();

		}


	}


