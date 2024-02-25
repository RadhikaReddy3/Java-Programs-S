
public class Shoppingbill {

	public static void main(String[] args) {
		 int sbill = 10000;
		 double gst = 20.7;
		 double dis = 30.5;
		 double  gstv = (sbill/100)*gst;
		 System.out.println(gstv);
		 double disv =(sbill/100)*dis;
		 System.out.println("gstv:"+gstv);
		 System.out.println("disv:"+disv);
		 double fbill = (sbill+gstv)-disv;
		 System.out.println("fbill:"+fbill);

	}

}
