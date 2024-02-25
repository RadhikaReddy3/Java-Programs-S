package com.slokam;

import java.io.FileReader;

public class All {

	public static void main(String[] args) {
		int totcount=0; String totco ="";
		int  SmallCount = 0; String SmallCh="";
		int  CapitalCount = 0; String Capitalch="";
		 int NoCount = 0; String Nocount="";
		 int SpecialCount = 0; String Speco="";
		try { 
			FileReader fr = new FileReader("E:\\Slokam Files\\slo.txt");
		 
			for(int i=fr.read();i!=-1;i=fr.read()) {
				
				 
				char c=(char)i;
				totcount++;
				totco+=c;
				
				if(i>=65&&i<=90) 
				{
				 CapitalCount++;
				 Capitalch+=c; 
			    }
				if(i>=97&&i<=122) 
				{
				 SmallCount++;
				  SmallCh+=c;
				 
			    }
				if(i>=48&&i<=57) 
				{
					  NoCount++;
					  Nocount+=c;
					 
				}
				
				if((i>=32&&i<=47)||(i>=58&&i<=64)||(i>=91&&i<=96)||(i>=123&&i<=126)) {
					  SpecialCount++;
					  Speco+=c;
				}
		     
			}
			 
			System.out.println(" ");
			System.out.println("Total count: "+totcount+"\n"+"Total Characters: "+totco+"\n");
			System.out.println("Total_Count of Small characters :"+SmallCount+"\n"+"Small Characters: "+SmallCh+"\n");
			System.out.println("Total_Count of Capital characters :"+CapitalCount+"\n"+"Capital Characters: "+Capitalch+"\n");
		    System.out.println("Total_Count of numbers: "+NoCount+"\n"+"Numbers: "+ Nocount+"\n");
		    System.out.println("Total_Count of numbers: "+SpecialCount+"\n"+"Special Characters: "+Speco+"\n");
			fr.close();
		}
			catch(Exception e) {
				System.out.println("Exception");
			}


	}

}

/*package com.slokam;

import java.io.FileReader;

public class All {

    public static void main(String[] args) {
        int totcount = 0;
        int SmallCount = 0;
        int CapitalCount = 0;
        int NoCount = 0;
        int SpecialCount = 0;

        String smallLetters = "";
        String capitalLetters = "";

        try {
            FileReader fr = new FileReader("E:\\Slokam Files\\slo.txt");

            for (int i = fr.read(); i != -1; i = fr.read()) {

                totcount++;
                char c = (char) i;

                if (Character.isUpperCase(c)) {
                    CapitalCount++;
                    capitalLetters += c;
                } else if (Character.isLowerCase(c)) {
                    SmallCount++;
                    smallLetters += c;
                } else if (Character.isDigit(c)) {
                    NoCount++;
                } else if ((i >= 32 && i <= 47) || (i >= 58 && i <= 64) || (i >= 91 && i <= 96) || (i >= 123 && i <= 126)) {
                    SpecialCount++;
                }

            }

            System.out.println("Capital Letters: " + capitalLetters);
            System.out.println("Small Letters: " + smallLetters);
            System.out.println("Total count: " + totcount);
            System.out.println("Total_Count of Small characters :" + SmallCount + "\n");
            System.out.println("Total_Count of Capital characters :" + CapitalCount);
            System.out.println("Total_Count of numbers: " + NoCount);
            System.out.println("Total_Count of special characters: " + SpecialCount);
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}*/

