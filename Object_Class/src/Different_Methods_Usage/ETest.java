package Different_Methods_Usage;

public class ETest  {

	public static void main(String[] args) {
		
		Mobiles m1 = new Mobiles(123,9988776655L,"Jio");
		Mobiles m2 = new Mobiles(124,9687776455L,"Airtel");
		Mobiles[] n = {m1,m2};
		 
		Employee t = new Employee(1,"siva",123.333,"se",new Department(101,"CSE","HOD"),n);
		
		System.out.println(t.toString());
		System.out.println(t);
		//System.out.println(t.toString());//t or t.toString() in any way you call
	}

}
