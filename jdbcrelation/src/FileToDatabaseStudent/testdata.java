package FileToDatabaseStudent;

import java.util. List;

import FileToDatabase.DaodataSaveOperation;
public class testdata {

	public static void main(String[] args) throws Exception {
		 
		DaoFileReader dr = new DaoFileReader();
       List<Student>stu= dr.datafromfile();
       
       /*for(Student stud:stu) {
    	   System.out.println(stud);
       }*/
       
     //Up to here reading data from file completed
       
       //Sending read data to database from here
       
       DaodataSaveOperation1 db = new DaodataSaveOperation1();
       if(stu!=null) {
    	   System.out.println("Save the data to database");
    	   db.saveddata(stu);
      	 System.out.println("Save completed");
       }
       else {
    	   System.out.println("Something went wrong");
       }
       
	}

}
