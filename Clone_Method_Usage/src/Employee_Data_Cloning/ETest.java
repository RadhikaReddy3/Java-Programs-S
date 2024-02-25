package Employee_Data_Cloning;

public class ETest {

	public static void main(String[] args) {
		Department d = new Department();
		d.setDid(101);
		d.setDname("IT");
		Employee e = new Employee();
		e.setEid(1);
		e.setEname("Siva");
		e.setEsal(50000.00);
		e.setEdes("se");
		e.setDep(d);
		System.out.println("Original object: "+e);

	    Employee e1 = new Employee();
	    e1=(Employee)e.Clone();
	    
	    System.out.println("Cloned object: "+e1);
	    
	    e1.setEname("RAM");
	    e1.getDep().setDname("SOFTWARE");
	    System.out.println("\n"+"Testing Either while it is successfully cloned or not"+"\n");
	    System.out.println("Before Cloning: "+e);
	    System.out.println("After Cloning: "+e1);
	}

}
