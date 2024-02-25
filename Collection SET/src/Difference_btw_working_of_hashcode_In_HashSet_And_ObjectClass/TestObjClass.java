//This Program is for Object Class HashCode Working



package Difference_btw_working_of_hashcode_In_HashSet_And_ObjectClass;

public class TestObjClass {

	public static void main(String[] args) {
		 Employee e = new Employee(1,"Siva",754.23);
		 /*e.setEid(1);
		 e.setEname("Siva");
		 e.setEsal(754.23);*/
		 
		 Employee e1 = new Employee(2,"Ram",774.23);
		 /*e1.setEid(2);
		 e1.setEname("Ram");
		 e1.setEsal(774.23);*/
		 //e=e1;
		 System.out.println(e.hashCode());
		 System.out.println(e1.hashCode());
		// e=e1;
		 System.out.println(e.equals(e1));
		 System.out.println(e==e1);
		 System.out.println(e+"\n"+e1);

	}

}
