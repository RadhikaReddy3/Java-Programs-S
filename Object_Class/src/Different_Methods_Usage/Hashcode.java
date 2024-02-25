package Different_Methods_Usage;

public class Hashcode {

	public static void main(String[] args) {
		 
		/*Hashcode t = new Hashcode();
		
		Hashcode t1 = new Hashcode();
		System.out.println(t.getClass());
		System.out.println(t.hashCode());
		
		System.out.println(t.getClass());
		System.out.println(t1.hashCode());*/
		
		
		
        Hashcode t = new Hashcode();
		
		Hashcode t1 = new Hashcode();
		t=t1;
		System.out.println(t.getClass());
		System.out.println(t.hashCode());
		System.out.println(t.equals(t1));
		System.out.println(t==t1);
		
		// dot equals and double equals are performing same operation
		
		System.out.println(t.getClass());
		System.out.println(t1.hashCode()); 

	}

}
