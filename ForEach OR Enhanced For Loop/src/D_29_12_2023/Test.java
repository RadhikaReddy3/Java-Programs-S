package D_29_12_2023;

public class Test {

	public static void main(String[] args) {
		 String s[] = {"ab","bc","cd","de","ef"}; 

		 for(String str:s) 
		 {
			 System.out.println(str);
		 }
		 
		 int i[]= {12,23,34,56,90};
		 for(int k:i) {
			 System.out.println(k);
		 }
		 
		 Employee emp1 = new Employee(1,"abc",34,90.9);
		 Employee emp2 = new Employee(2,"def",45,70.9);
		 Employee emp3= new Employee(3 ,"ghi",56,60.9);
		 Employee emp4 = new Employee(4,"jkl",78,50.9);
		 Employee emp5 = new Employee(5,"mno",90,30.9);
		 
		 Employee data[]= {emp1,emp2,emp3,emp4,emp5};
		 for(Employee empl:data) {
			 System.out.println(empl);
		 }
	}

}
