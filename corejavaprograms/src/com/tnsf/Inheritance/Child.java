package com.tnsf.Inheritance;

public class Child extends Father{
String cycle="pink";
String car="audi";
//super.car();
public static void main(String args[]) {
	Child c=new Child();
	System.out.println(c.car);
	System.out.println(c.car1);
	System.out.println(c.cycle);
System.out.println(c.money);
}
}


