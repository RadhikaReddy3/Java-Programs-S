package Using_18_feature_for_calling_methodsInThreads_separately;

public class Slokam extends One {

	
	
	public void m1() {
		System.out.println("hello Hii Welcome");
	}
	
	
	
	public static void main(String[] args) {
		//1st way of calling m1 method
		/*Slokam s = new Slokam();
		s.m1();*/
		
		Slokam s = new Slokam() {
		public void m1() {
			System.out.println("hello");
		}

	};
	s.m1();

}}
