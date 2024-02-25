package Hierarchical_Inheritance;

public class Login {
	public boolean submit(String username,String Password) {
		if(username.equals(Password)) {
			System.out.println("Login Sucess");
		
			return true; 	
		}
		 
	else
	{
		
		System.out.println("Login failed");
		return false;
	}

}

}
