package com.tns.interfacedemo;

public class Demo implements child {
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show");
	}

	//public void print() {
		//System.out.println("print");
	//}
	//public void show() {
		//System.out.println("show");
	//}
	public static void main(String args[]) {
Demo d=new Demo();
	d.show();
	d.print();
}
	}

	