package NonPrimitiveDatatypes;

public class Child extends Parent {
	//public Dept m1()
	public Employee m1() {
		System.out.println("Hi m1 from Parent");
		
		Employee e1 = new Employee();
		e1.setEid(2);
		e1.setEname("ram");
		e1.setEsal("78232.23");
		e1.setDid(101);
		e1.setDname("IT");
		e1.setDloc("Hyd");
		
		return e1;
		}

	public Parent m2() 
	{
		System.out.println("Hi m2 from  Child");
		Child g = new Child();
		
		//Parent h = new Parent();
		return g;
		
	}
	public static void main(String[] args) {
		 Child c = new Child();
		 c.m1();
		 c.m2();
		 
		 Parent p = new Parent();
		 p.m1();
		 p.m2();
		 

	}

}