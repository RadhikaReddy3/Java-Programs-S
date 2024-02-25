package com.slokam;

public class Nestedswitchrestuarant {

	public static void main(String[] args) {
		 //String ftype="veg";
		 //String forder="frice";
		 String ftype="non-veg";
		 String forder="cbir";
		 //String ftype="veg";
		 //String forder="fricee";
		 //String ftype="non-veg";
		 //String forder="cbirr";
		 //String ftype="veg";
		 //String forder="frice";
		 //String ftype="non-vegg";
		 //String forder="cbir";
		 
		 switch(ftype) {
		 case"veg":System.out.println("Please order only veg items");
		       switch(forder) {
		       case "paneer":System.out.println("forder is ready---"+forder);
		       break;
		       case "frice":System.out.println("forder is ready---"+forder);
		       break;
		       case "srice":System.out.println("forder is ready---"+forder);
		       break;
		       default:System.out.println("Sorry not interested");
		       break;
		       }
		 break;
		 case"non-veg":System.out.println("Please order only non-veg items");
		 switch(forder) {
	       case "cbir":System.out.println("forder is ready---"+forder);
	       break;
	       case "mbir":System.out.println("forder is ready---"+forder);
	       break;
	       case "fbir":System.out.println("forder is ready---"+forder);
	       break;
	       default:System.out.println("Sorry not interested");
	       break;
	       } 
		 break;
		 default:System.out.println("Sorry no orders");
		 break;
		 
		 
		 }

	}

}
