package Throw;

import java.io.IOException;

public class InsufficientFunds extends IOException{
	
	//Creation of Compiletime or Checked exception which need to be handled

	public InsufficientFunds(String msg) {
		System.out.println(msg);
	}
}
