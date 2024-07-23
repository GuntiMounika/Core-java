package com.tns.practice;
class father{
	void eat() {
	System.out.println("biryani");
	}
}
public class Child extends father {
void eat() {
	System.out.println("pizza");
}
	public static void main(String args[]) {
		Child c=new Child();
		c.eat();
}
}
