package com.slokam;

import java.util.Scanner;

public class Restuarant {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 System.out.println("What type of food you preferred:");
         String ftype = s.next();
         System.out.println("ftype---"+ftype+"\n");
         
         System.out.println("can you place the order:");
         String forder = s.next();
         System.out.println("forder---"+forder+"\n");
         
         System.out.println("Please place order quantity:");
         int ocount = s.nextInt();
         System.out.println("Focount---"+ocount+"\n");
         
         
      switch(ftype) {
       case "veg":System.out.println("Please order veg items--");
                   switch(forder) {
                   case "paneer":System.out.println("Your food order is ready:"+forder);
                       switch(ocount) {
                       case 1: System.out.println("Focount:"+ocount+"\n");
                       break;
                       case 2: System.out.println("Focount"+ocount+"\n");
                       break;
                       case 3: System.out.println("Focount"+ocount+"\n");
                       break;
                       default: System.out.println("Focount is not provided"+"\n");
                       break;
                        
                   }
                   break;
                   case "vbir":System.out.println("Your food order is ready"+"\n");
                        switch(ocount) {
                        case 1: System.out.println("Focount: "+ocount+"\n");
                        break;
                        case 2: System.out.println("Focount: "+ocount+"\n");
                        break;
                        case 3: System.out.println("Focount: "+ocount+"\n");
                        break;
                        default: System.out.println("Focount is not provided: "+"\n");
                        break;
                        }
                   default:System.out.println("Your food order is not ready"+"\n");
                   }
                   break;
      case "non-veg":System.out.println("Please order non-veg items"+"\n");
          switch(forder) {
          case "cbir":System.out.println("Your food order is ready: "+forder+"\n");
              switch(ocount) {
              case 1: System.out.println("Focount: "+ocount+"\n");
              break;
              case 2: System.out.println("Focount: "+ocount+"\n");
              break;
              case 3: System.out.println("Focount: "+ocount+"\n");
              break;
              default: System.out.println("Focount is not provided"+"\n");
              break;
               
          }
          break;
          case "mbir":System.out.println("Your food order is ready"+"\n");
               switch(ocount) {
               case 1: System.out.println("Focount: "+ocount+"\n");
               break;
               case 2: System.out.println("Focount: "+ocount+"\n");
               break;
               case 3: System.out.println("Focount: "+ocount+"\n");
               break;
               default: System.out.println("Focount is not provided"+"\n");
               break;
               }
          break;
          default:System.out.println("Your food order is not ready"+"\n");
          break;
          }
       break;
      default:System.out.println("Sorry No orders are taken"+"\n");
      break;
      }
      System.out.println("Thankyou Visit Again");
	  s.close();
	}
}
      
      
                   
          
          
      
         
         
         


