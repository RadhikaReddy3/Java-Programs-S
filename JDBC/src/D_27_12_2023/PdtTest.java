package D_27_12_2023;

import java.sql.SQLException;
import java.util.ArrayList;

public class PdtTest {

	public static void main(String[] args) throws SQLException {
	 
		PdtController pdt = new PdtController();
		//pdt.savedata(new PdtPojo(1,"cho",100.0,true));
		//pdt.savedata(new PdtPojo(2,"bis",20.0,false));
        //pdt.updatedata(2,"shoes", 1000.0);
		//pdt.deletedata(2);
		//pdt.getById(1);
		
		
		/*PdtPojo data=pdt.getbyId(1);
		System.out.println(data);*/
		
		ArrayList<PdtPojo>data1=pdt.getAll();
         System.out.println(data1);
         
	}

}
