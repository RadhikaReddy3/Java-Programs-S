package NonPrimitiveDatatypes;

public class Parent {
	public Employee m1() {
		System.out.println("Hi m1 from Parent");
		Dept t = new Dept();
		t.setDid(12);
		t.setDname("Non it");
		t.setDloc("SCD");
		
		
		
		Employee e1 = new Employee();
		e1.setEid(1);
		e1.setEname("siva");
		e1.setEsal("78232.23");
		e1.setDid(101);
		e1.setDname("IT");
		e1.setDloc("Hyd");
		
		return e1;
		//return t;
	}
		public Parent m2() 
		{
			System.out.println("Hi m2 from parent");
			Child g = new Child();
			return g;
			
		}
	}


