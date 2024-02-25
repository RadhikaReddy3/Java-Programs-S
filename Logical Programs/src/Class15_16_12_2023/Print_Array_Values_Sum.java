package Class15_16_12_2023;

public class Print_Array_Values_Sum {

	public static void main(String[] args) {
		int arr[]= {8,3,5,-1,2,0,6,1};
        int acc=sum(arr,0,0);
        System.out.println(acc);

	}
	public static int sum(int arr[],int index, int acc) {
		acc=acc+arr[index];
		index++;
		if(index<arr.length) {
		acc=sum(arr,index,acc);
		
	}
		return acc;
	 
		
}

}
