package D_27_12_2023;

import java.sql.SQLException;
import java.util.ArrayList;

public class ETest {

	public static void main(String[] args) throws SQLException   {
		 EmpController d = new EmpController();
		 //d.savedata(new EmpPojo(2,"siva",6.9,"hyd"));
		 //d.updatedata(1, "Ram", 90.9);
		 //d.deletedata(2);
		 
		 
		 //d.getById(1);
		 /*EmpPojo data =d.getbyId(1);
		 System.out.println(data);*/
		 
		 ArrayList<EmpPojo> data1= d.getAll();
		 System.out.println(data1);
		 
		 
		  

	}

}
