package D_27_12_2023;

import java.sql.SQLException;
import java.util.ArrayList;

public class STest {

	public static void main(String[] args) throws SQLException {
	 StdController d = new StdController();
	// d.savedata(new StdPojo(1,"siva",23.3,92732848923l));
	// d.UpdateData(3,"sita", 95.5);
	//d.DeleteData(8);
	//d.getById(1);
	 /*StdPojo data=d.getbyId(1);
	 System.out.println(data);*/
	 
	 
	 ArrayList<StdPojo> data1 = d.getAll();
	 System.out.println(data1);

	}

}
