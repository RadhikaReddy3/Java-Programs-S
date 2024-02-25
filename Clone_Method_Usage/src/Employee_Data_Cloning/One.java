package Employee_Data_Cloning;

public class One {

	public static void main(String[] args) {
		 
		EmployeeM e = new EmployeeM(101,"Siva",500.90,new DepartmentM(1001, "IT"));
		
		System.out.println("Before Clone---"+e);
		EmployeeM e1 = e.clone();
		System.out.println("After Clone---"+e);
		
		
		System.out.println("After changes in cloned object");
		
		
		
		e1.setEsal(70000.00);
		e1.getDp().setDname("Non IT");
		System.out.println("Original object---"+e);
		 
		System.out.println("Cloned object---"+e1);
		
		

	}

}
