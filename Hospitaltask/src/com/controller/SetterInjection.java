package com.controller;
import com.pojo.Patient;
import com.pojo.Adhar;
import com.pojo.ContactDetails;
import com.pojo.Doctor;
import com.pojo.FoodandBev;
import com.pojo.Lab;
public class SetterInjection {

	public static void main(String[] args) {
		 Patient p = new Patient();
		 p.setPid(1);
		 p.setPname("siva");
		 p.setPage(23);
		 
		 Adhar a = new Adhar();
		 a.setAid(1);
		 a.setAnum("234asd");
		 a.setAloc("scd");
		 p.setAd(a);
		 
		 ContactDetails c = new ContactDetails();
		 c.setCdid(1);
		 c.setCname("Lokesh");
		 c.setCphone(56456);
		 
		 ContactDetails c1 = new ContactDetails();
		 c1.setCdid(2);
		 c1.setCname("Rajesh");
		 c1.setCphone(76786);
		 
		 ContactDetails[] cd= {c,c1};
		 p.setCd(cd);
		 
		 Doctor d = new Doctor();
		 d.setDid(1);
		 d.setDname("rose");
		 d.setDfee(3000);
		 
		 Doctor d1 = new Doctor();
		 d1.setDid(2);
		 d1.setDname("sravani");
		 d1.setDfee(2000);
		 
		 Doctor d2 = new Doctor();
		 d2.setDid(3);
		 d2.setDname("sampath");
		 d2.setDfee(5000);
		 
		 Doctor doc[] = {d,d1,d2};
		 p.setDoc(doc);
		 
		 Lab l = new Lab();
		 l.setLid(1);
		 l.setLtestname("covid");
		 l.setLtestfee(800);
		 
		 
		 Lab l1 = new Lab();
		 l1.setLid(2);
		 l1.setLtestname("sugar");
		 l1.setLtestfee(150);
		 
		 Lab l2 = new Lab();
		 l2.setLid(3);
		 l2.setLtestname("bp");
		 l2.setLtestfee(50);
		 
		 Lab la[] = {l,l1,l2};
		 
		 p.setLb(la);
		 
		 FoodandBev f =new FoodandBev();
		 f.setFbid(1);
		 f.setFood("chapathi");
		 f.setFprice(80);
		 
		 FoodandBev f1 =new FoodandBev();
		 f1.setFbid(2);
		 f1.setFood("bread");
		 f1.setFprice(40);
		 
		 
		 FoodandBev f2 =new FoodandBev();
		 f2.setFbid(3);
		 f2.setFood("idli");
		 f2.setFprice(60);
		 
		 FoodandBev[] fo = {f,f1,f2};
		 p.setFb(fo);
		 
		 
		 System.out.println("----------Patient Details---------------"+"\n");
		 System.out.println(p.getPid()+"  "+p.getPname()+"  "+p.getPage());
		 System.out.println("\n"+"----------Patient Adhar Details--------"+"\n");
		 System.out.println(p.getAd().getAid()+"  "+p.getAd().getAnum()+"  "+p.getAd().getAloc());
		 
		 System.out.println("\n"+"----------Patient Contact Details----------"+"\n");
		 ContactDetails []cde= p.getCd();
		 for(int i=0;i<cde.length;i++) {
			 System.out.println(cde[i].getCdid()+"  "+cde[i].getCname()+"  "+cde[i].getCphone());
		 }
		 System.out.println("\n"+"-------------Patient Lab Details---------------"+"\n");
		 Lab[] li = p.getLb();
		 
		 for(int i=0;i<li.length;i++) {
			 System.out.println(li[i].getLid()+"  "+li[i].getLtestname()+"  "+li[i].getLtestfee());
		 }
		 
		 System.out.println("\n"+"-----------Patient Doctor Details----------------"+"\n");
		 Doctor [] doct = p.getDoc();
		 for(int i=0;i<doct.length;i++) {
			 System.out.println(doct[i].getDid()+"  "+doct[i].getDname()+"  "+doct[i].getDfee());
		 }
		 
		 System.out.println("\n"+"------------Patient Food Details---------------"+"\n");
		 FoodandBev[] fv = p.getFb();
		 for(int i=0;i<fv.length;i++) {
			 System.out.println(fv[i].getFbid()+"  "+fv[i].getFood()+"  "+fv[i].getFprice());
		 }
		 
		 long labFeeSum = 0;
	        double foodBillSum = 0;
	        long doctorsFeeSum = 0;

	        // Calculate the sum of lab fees
	        Lab[] labs = p.getLb();
	        for (int i = 0; i < labs.length; i++) {
	            labFeeSum += labs[i].getLtestfee();
	        }

	        // Calculate the sum of food bills
	        FoodandBev[] foodBills = p.getFb(); 
	         for (int i = 0; i < foodBills.length; i++) { 
	         
	            foodBillSum += foodBills[i].getFprice();    	           
	            //foodBillSum = foodBillSum + foodBills[i].getFprice();
	            
	        }

	        // Calculate the sum of doctors fees
	        Doctor[] doctors = p.getDoc();
	        for (int i = 0; i < doctors.length; i++) {
	            doctorsFeeSum += doctors[i].getDfee();
	            //doctorsFeeSum = doctorsFeeSum+doctors[i].getDfee();
	        }

	        // Calculate the total sum of all bills
	        long totalBills = labFeeSum + Math.round(foodBillSum) + doctorsFeeSum;
           
	        System.out.println("-----------Patient Total Bill------------");
	        System.out.println("\nTotal Lab Fees: " + labFeeSum);
	        System.out.println("Total Food Bills: " + foodBillSum);
	        System.out.println("Total Doctors Fees: " + doctorsFeeSum);
	        System.out.println("Total Sum of All Bills: " + totalBills);
	   
		 
		 
		  
    }
}




































	 
/*The Math.round function is used to round a double value to the nearest whole 
 * number, which is often needed when working with financial calculations or 
 * situations where you need an integer result. In the context of calculating
 *  the sum of financial amounts like food bills, it's essential to round the 
 *  double values to prevent the loss of precision that can occur due to 
 *  floating-point arithmetic.*/

/*
 
long labFeeSum = 0;
double foodBillSum = 0;
long doctorsFeeSum = 0;

// Calculate the sum of lab fees
for (Lab lab : p.getLb()) {
    labFeeSum += lab.getLtestfee();
}

// Calculate the sum of food bills
for (FoodandBev foodBill : p.getFb()) {
    foodBillSum += foodBill.getFprice();
}

// Calculate the sum of doctors' fees
for (Doctor doctor : p.getDoc()) {
    doctorsFeeSum += doctor.getDfee();
}

// Calculate the total sum of all bills
long totalBills = labFeeSum + Math.round(foodBillSum) + doctorsFeeSum;

System.out.println("\nTotal Lab Fees: " + labFeeSum);
System.out.println("Total Food Bills: " + foodBillSum);
System.out.println("Total Doctors' Fees: " + doctorsFeeSum);
System.out.println("Total Sum of All Bills: " + totalBills);*/