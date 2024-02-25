package Class14_15_12_2023;

public class Min_Value_Position {

	public static void main(String[] args) {
        int arr[]= {8,3,5,-1,2,0,6,1};
        int pos=0;
        
        for(int i=0;i<arr.length;i++) {
        	if(arr[pos]>arr[i]) {//8>8,8>3,3>5,5>-1,-1>2,2>0,0>6,6>1
        		pos=i;
        	}
        }
              System.out.println(pos);

	}

}
