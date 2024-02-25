package com.m;

public class Test {

	public static void main(String[] args) {
		Employee r = new Employee();
		r.setEid(101);
		r.setEname("Ram");
		r.setEsal(45999.90);
		Department department1 = new Department();
        department1.setDdeg("Master's");
        department1.setDsector("Finance");
	    
        Department department2 = new Department();
        department2.setDdeg("Bachelor's");
        department2.setDsector("Engineering");
		
        Department[] d = {department1,department2};
        r.setDep(d);
        System.out.println("Employee id .........."+r.getEid());
        System.out.println("Employee name .........."+r.getEname());
        System.out.println("Employee salary .........."+r.getEsal());
        
        Department[] data = r.getDep();
        for(int i = 0; i<=data.length-1; i = i+1) {
        	System.out.println("Deg: " +(data[i].getDdeg()));
            System.out.println("Sectors: " +(data[i].getDsector()));

	}

}}
