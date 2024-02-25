package com.controller;
import com.pojo.Patient;
import com.pojo.Adhar;
import com.pojo.ContactDetails;
import com.pojo.Doctor;
import com.pojo.FoodandBev;
import com.pojo.Lab;

public class ConstructorInjection {

	public static void main(String[] args) {
		
		ContactDetails c = new ContactDetails(1,"lokesh",56456);
		ContactDetails c1 = new ContactDetails(2,"Rajesh",76786);
		ContactDetails [] con= {c,c1};
		
		Doctor d = new Doctor(1,"rose",3000);
		Doctor d1 = new Doctor(2,"sravani",2000);
		Doctor d2 = new Doctor(3,"sampath",5000);
		Doctor [] doc= {d,d1,d2};
		
		FoodandBev f = new FoodandBev(1,"chapathi",80);
		FoodandBev f1 = new FoodandBev(2,"bread",40);
		FoodandBev f2 = new FoodandBev(3,"idli",60);
		FoodandBev[]fd= {f,f1,f2};
		
		Lab l = new Lab(1,"covid",800);
		Lab l1 = new Lab(2,"sugar",150);
		Lab l2 = new Lab(3,"bp",50);
		Lab[] la= {l,l1,l2};
		 
		Patient p = new Patient(1,"siva", 23, new Adhar(1,"234asd","scd"),con,doc, fd,la);

		
		System.out.println("----------Patient Details---------------"+"\n");
		 System.out.println(p.getPid()+"  "+p.getPname()+"  "+p.getPage());
		 System.out.println("\n"+"------------Patient Adhar Details--------------"+"\n");
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
	            //labFeeSum = labFeeSum+labs[i].getLtestfee();
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
