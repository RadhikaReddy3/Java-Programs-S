package Class14_15_12_2023;

public class Min_Value_And_Position {

	public static void main(String[] args) {

          int arr[]= {8,3,5,-1,2,0,6,1};
          
          int min=arr[0];
          int pos=0;
          
          for(int i=0;i<arr.length;i++) {
        	  if(min>arr[i]) {//8>8,8>3,3>5,3>-1,-1>2,-1>0,-1>6,-1>1.....
        		  int temp=arr[i];
        		  arr[i]=min;
        		  min=temp;
        		  pos=i;
        	  }
          }
          System.out.println(min);
          System.out.println(pos);

	}

}
