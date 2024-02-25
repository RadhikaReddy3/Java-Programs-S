package Inheritance;

public class Hparent {

	public boolean submit(String uname, String pwd) {
		if(uname.equals(pwd)) {
		System.out.println("Login sucess");
		return true;
	}
		else {
			System.out.println("Invalid Credientals");
			return false;
		}
}
}