package Different_Methods_Usage;

public class ToString {

	public static void main(String[] args) {
		 
	
		ToString t = new ToString();
		System.out.println("Class: "+t.getClass().getName());
	 
		int hashcode = t.hashCode();
		System.out.println("Hashcode: "+Integer.toHexString(hashcode));
		System.out.println("Changing to ToString:"+t.getClass().getName()+"@Slokam@"+Integer.toHexString(hashcode));//For Changing Name @
		System.out.println(t);//Object Reference gives toString
		System.out.println(t.toString());//Object Reference and toString are same

	}

}
