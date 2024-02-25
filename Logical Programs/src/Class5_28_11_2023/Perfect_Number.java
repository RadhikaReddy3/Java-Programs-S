package Class5_28_11_2023;

public class Perfect_Number {

	public static void main(String[] args) {
 
	    int num = 496;
 
		int div=0;
		for(int i=1;i<=(num)/2;i++) 
		{
			if(num%i==0) 
			{
				System.out.print(i+",");
				div = div+i;
			}
			
		}
	 System.out.println("\n");
		//System.out.println(div);
		
		if(num==div) {
			System.out.println(div+" is Perfect No");
		}
		else {
			System.out.println(div+" is Not Perfect No");
		}
		 

	}

}
