package RTE;

public class userLogin {
	String username ="Siva";
	String password ="Slokam";
	
	
	public  void Login(String un, String pwd) throws Eithernulloremptynotaccepted {
		
		System.out.println(un);
		System.out.println(pwd);
		if(un!=null&&pwd!=null) {
			
			if(un.equals(username)&&pwd.equals(password)) {
				System.out.println("Successfully Loggedin");
			}
			else {
				System.out.println("Invalid Crendiatals");
			}
		}
		else {
			throw new Eithernulloremptynotaccepted("please check the data");
		}
	}

	public static void main(String[] args) throws Eithernulloremptynotaccepted {
		 userLogin p = new userLogin();
		 p.Login("Siva","Slokam");
		

	}

}
