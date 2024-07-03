package com.tns.scannerclass;

public class TaxCalculation{
Person p=new Person();
	public void Calculatetax() {
		
if(p.getIncome()<=1600) {
	p.setTax(0);
	}
else if(p.getIncome()>1600 && p.getIncome()<30000) {
	p.setTax(5);
}
	else {
		p.setTax(10);
	}
}
}
