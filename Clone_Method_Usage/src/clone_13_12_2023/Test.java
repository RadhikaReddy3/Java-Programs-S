package clone_13_12_2023;

public class Test {

	public static void main(String[] args) {
		 
		Test t = new Test();
		Dept d = new Dept(1,"CSE","abc");
		Employee e = new Employee(1,"Siva","Hyd",d);
		
		System.out.println("Shallow Cloning Original Object: "+e);
        
		Employee e1 = new Employee();
		 try {
			e1=e.Clone();
		} catch (CloneNotSupportedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		e1.setEloc("Knr");
		System.out.println("Shallow Cloning Cloned Object: "+e1);
		
		System.out.println("Deep Cloning-----------"+"\n\n");
		
		System.out.println("Before Deep Cloning: "+ e);
		e1.getDep().setDhead("Lilly");
		System.out.println("After Deep Cloning: "+e1);
		
	}

}
