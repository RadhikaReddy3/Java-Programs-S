package FileTodb_30_12_2023_AggregateFunctions;

 

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;

	public class connection {
		
		
	public void savedata() {
			
			try {
				
				Class c = Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/relate","root", "root");
				System.out.println(con);
				//PreparedStatement ps = con.prepareStatement("select count(*) from relate.employee;");
				//PreparedStatement ps = con.prepareStatement("select sum(esal) from relate.employee;");
				PreparedStatement ps = con.prepareStatement("select count(*) from relate.employee;");
				ResultSet rs = ps.executeQuery();
		        while(rs.next()) {
		            int count = rs.getInt(1);
		            System.out.println("Count of records in employee table: " + count);
		        }
		        con.close(); 
				}catch(Exception e){
				e.printStackTrace();
			}
		}

		public static void main(String[] args) {
			connection t = new connection();
			t.savedata();

		}

	}
