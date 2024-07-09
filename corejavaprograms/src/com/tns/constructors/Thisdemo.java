package com.tns.constructors;

public class Thisdemo {
int  rollno=786;
String sname="kr";
Thisdemo(int rollno,String sname){
	this.rollno=rollno;
	this.sname=sname;
}
	void show(){
	System.out.println("rollno:"+rollno+"sname"+sname);
	}

public static void main(String args[]) {
	Thisdemo d=new Thisdemo(16,"mounika");
	Thisdemo d1=new Thisdemo(17,"dharika");
	d.show();
	d1.show();
}
}
