package How_to_create_custom_immutable_class;

public class Etest {

	public static void main(String[] args) {
		
		String s = new String("siva");
		String s1= s.concat("kumar");
		System.out.println("Before concante in String Class: "+s);
		System.out.println("After concate in string Class: "+s1);
		
		System.out.println("--------------------------------");
		department d = new department(1,"cse");
		 
		
		Employee e = new Employee(1,"siva",56.7,"se",d);
		Employee r = e.setEid(12);
	    
		System.out.println("Employee Id:"+e.getEid()+"\n"+"Employee Name:"+e.getEname()+"\n"+"Employee Salary:"+e.getEsal()+"\n"+"Employee Designation:"+e.getEdesg()+e.getDep().getDid()+e.getDep().getDname());
		 
	
		System.out.println("Employee Id:"+r.getEid()+"\n"+"Employee Name:"+r.getEname()+"\n"+"Employee Salary:"+r.getEsal()+"\n"+"Employee Designation:"+r.getEdesg()+"\n");
		
		 Employee e1 = new Employee(1, "Ram", 3567.768, "jd",new department(1,"ece"));
			Employee e2 = new Employee("The God");
			// Concatenating two instances
			Employee k = e1.concat(e2);
			System.out.println("Before concate:"+"\n"+e1+"\n");
			System.out.println("After concate:"+"\n"+k+"\n");
			System.out.println(e1==e2);
        
	}

}
