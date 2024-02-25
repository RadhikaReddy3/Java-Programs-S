package FileToDatabase;

import java.util.List;

public class testdata {

	public static void main(String[] args) throws Exception {
		 DaoFilereader df = new DaoFilereader();
         List<Employee>emp = df.datafromfile();
         /*for(Employee e:emp) {
        	 System.out.println(e);
         }
         */
         //Up to here reading data from file completed
         
         //Sending read data to database from here
         
         DaodataSaveOperation db = new DaodataSaveOperation();
         if(emp!=null) {
        	 System.out.println("Sava the data to database");
        	 db.saveddata(emp);
        	 System.out.println("Save completed");
         }
         else {
        	 System.out.println("Something went wrong");
         }
	}

}
