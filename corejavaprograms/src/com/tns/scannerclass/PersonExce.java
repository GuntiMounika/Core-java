package com.tns.scannerclass;

import java.util.Scanner;

public class PersonExce {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("name");
	String name=sc.nextLine();
	System.out.println("income:");
	int Income=sc.nextInt();
Person pp=new Person();
pp.setName(name);
pp.setIncome(Income); 


Taxcal t=new Taxcal();
t.Calculatetax(pp);
System.out.println("after modification:");
System.out.println(pp);


	
	
}
}
