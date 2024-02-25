//FOR DYNAMIC INSERTION OF DATA WITH SCANNER CLASS

package Introduction;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class dynamictest_PreparedStatement1 {

	public void saveddata(int sid, String sname, String squal) {
		try {
			   Class c = Class.forName("com.mysql.cj.jdbc.Driver");
			   
			   Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/rad","root","root");
			       
			      PreparedStatement s =con.prepareStatement("insert into apple.sk values(?,?,?)");
			      s.setInt(1, sid);
			      s.setString(2, sname);
			      s.setString(3, squal);
			      int d =s.executeUpdate();
			     System.out.println("No of rows inserted: "+d);
		   }
		   catch(Exception e){
			   e.printStackTrace(); 
		   }
	}

	public static void main(String[] args) {
		dynamictest_PreparedStatement1 q = new dynamictest_PreparedStatement1();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter student id: ");
        int sid =s.nextInt();
        System.out.println("Enter student name: ");
        String sname =s.next();
        System.out.println("Enter student Qualification: ");
        String squal =s.next();
		q.saveddata(sid,sname,squal);
		 
	    s.close();

	}

	}


