
public class Powbill {

	public static void main(String[] args) {
		 //variable declaration
		 double pu, cu, units, price, fbill;
		 //variable intialization
		 pu = 600;
		 cu = 800;
		 units = cu - pu;
		 price = 4.5;
		 fbill = (units *price);
		 System.out.println("No of previous units---"+pu);
		 System.out.println("No of current units---"+cu);
		 System.out.println("No of units consumed---"+units);
		 System.out.println("Each unit price---"+price);
		 System.out.println("final bill---"+fbill);

	}

}
