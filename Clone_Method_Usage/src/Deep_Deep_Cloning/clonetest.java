package Deep_Deep_Cloning;
public class clonetest {

public static void main(String[] args) 
{
	     
	    Department d1 = new  Department(1,"IT",new Store(1011,"product"));
	    
        employee e = new employee();
        e.setEid(1);
        e.setEname("radhika");
        e.setEsal(45.67);
        e.setEdesg("se");
        e.setDept(d1);
        
        System.out.println(e);
        
        
          employee e1  = e.clone();
          System.out.println(e1);
          
          
          System.out.println("after changing.....");
          
          e1.setEname("punnam");
          e1.setEsal(8000.45);
          e1.getDept().setDid(102);
          e1.getDept().setDname("Non IT");
          e1.getDept().getStr().setSname("management");
          System.out.println(e);
          System.out.println(e1);



        
      
        

        
       
        
        



}

}


