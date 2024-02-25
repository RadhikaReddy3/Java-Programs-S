package StringLiteralsAndStringClassIntroduction;

public class STest {

	public static void main(String[] args) {
		
		//Literals
		String s1="ram";
		String s2="laxman";
		String s3="ram";
		System.out.println("--------String Literals---------"); 
		System.out.println("s1==s2: "+(s1==s2));
		System.out.println("s1.equals(s2): "+s1.equals(s2));
		System.out.println("s1==s3: "+(s1==s3));
	    System.out.println("s1.equals(s3): "+s1.equals(s3));
	    
	    //String Class
	    
	    System.out.println("---------String Class----------");
	    String s4 = new String("ram");
	    String s5 = new String("laxman");
	    String s6 = new String("ram");
	    System.out.println("s4==s5:"+(s4==s5));
	    System.out.println("s4.equals(s5): "+s4.equals(s5));
		System.out.println("s4==s6: "+(s4==s6));
	    System.out.println("s4.equals(s6): "+s4.equals(s6));
	    
	    //Literals & String Class
	    System.out.println("-------Literals & String Class-----------");
	    System.out.println("s1==s4: "+(s1==s4));
	    System.out.println("s1.equals(s4)"+s1.equals(s4));
	    System.out.println("s1==s5: "+(s1==s5));
	    System.out.println("s1.equals(s5): "+s1.equals(s5));

	    System.out.println("----Concatentation of String literals----");
	    //Concatentation of String literals
	    String s7="krishna";
	    System.out.println(s1.concat(s7));
	    
	    //Concatentation of String Class
	    
	    System.out.println("----Concatentation of String Class---");
	    //s4.concat("The God");
	    //System.out.println(s3);
	    
	    String s8=s4.concat(" The God");
	    System.out.println(s8);
	}

}
