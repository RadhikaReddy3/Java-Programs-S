package SingleLevel_Inheritance;

public class Test {

	public static void main(String[] args) {
		child s = new child();
		s.m1();
		s.m2();
		parent v = new parent();
		v.m2();
		parent b = new child();
		b.m2();

	}

}
