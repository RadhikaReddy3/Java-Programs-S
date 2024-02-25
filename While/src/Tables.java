
public class Tables {

	public static void main(String[] args) {
 
		int i=1;
		int j=1;
		
		while(i<=10) {
			System.out.println("Main loop Started"+"  "+"Tableno: "+i);
			while(j<=10) {
				System.out.println(i+"*"+j+"="+(i*j));
				j=j+1;
			}
			i=i+1;
			j=1;
			System.out.println("Main loop ended");
						
		
		//Tables from 10 to 1 in total reverse order
		/*int i =10;
		int j =10;
		
		while(i>=1) {
			System.out.println("Mloop Started:"+"  "+"Table no:"+i);
			while(j>=1) {
				System.out.println(i+"*"+j+"="+(i*j));
				j=j-1;
			}
			i=i-1;
			j=10;
			System.out.println("Main loop ended");
			}*/
		
		
	/*	//Tables from 1 to 20 in reverse order 
		int i =1;
		int j =1;
			while(i<=20) {
				j =20;      
				System.out.println("Mloop Started:"+"  "+"Table no:"+i);
				while(j>=1) {
					System.out.println(i+"*"+j+"="+(i*j));
					j=j-1;
				}
				i=i+1;
				System.out.println("Main loop ended");
		}*/
		}
		
	}
}


