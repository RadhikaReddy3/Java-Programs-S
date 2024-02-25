package Class16_19_12_2023;

public class Sum_Of_1_To_100 {

	public static void main(String[] args) {
	
		int value = sum(0,0);
		System.out.println(value);

	}
	public static int sum(int value,int acc) {
		acc=acc+value;
		value++;
		if(value<=100) {
			acc=sum(value,acc);
				
			}
		return acc;
		}
	}


