
public class Reverseastring {

	public static void main(String[] args) {
		 // 1) Using + (string concatenation) operator
         //str = ABCD (TO reverse this string we need to find length of string so we are going to use length method and charAt method along with concatenation operator
		String str = "ABCD";
		///1.String rev = "";
		
		/*
		 //firstly we will find length of string(ABCD)
		 
		///int len = str.length();//4
		//if we want to specify any character from string use below charAt method
		//str.charAt(0)
		for(int i=len-1;i>=0;i--)//3,2(i value decreases[i--]),1,0,-1
		{
		/* Iam starting from end that is 3;Checking it is >= 0;Everytime Iam decreasing i value that means we need to reverse direction */
	          ///rev = rev + str.charAt(i);//D,C,B,A
	          /*we are already having str variable we are extracting index value(last value actually) using charAt method */
	          /*Now what this expression do is from the string it will extract character which is there in inside in the position(i)and add that value in to rev var
		}
		///System.out.println("Reversed String: "+rev);*/
	

		
		
	//2. Using character array(now the string is converted in to character Array that means each and every character I will separate and I will store all the characters in character array
	
	/*char a[] = str.toCharArray();//toCharArray() method converts string in to multiple parts(characters)Now ABCD will be stored inside char a[](character array) then how will it work internally means this is going to create a character array like stack of 4 boxes inside it allocate 4 locations it will add ABCD from top from this character array we need to read values from end for that we need to write index(0,1,2,3) 
    int len = a.length;//4
    
    for(int i=len-1;i>=0;i--)//3,2,1,0,-1
    {
    	rev=rev+a[i];//D,C,B,A
    }
    System.out.println("Reversed String: "+rev);*/
		
		
		
		
		
    //3. Using String Buffer class 
		
    StringBuffer sb = new StringBuffer(str);
    System.out.println("Reversed String: "+sb.reverse());
}
}