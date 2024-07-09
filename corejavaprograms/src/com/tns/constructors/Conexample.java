package com.tns.constructors;

public class Conexample {
	Conexample(){
		System.out.println("default");
	}
	Conexample(int i){
		System.out.println("welcome");
	}
	Conexample(int i, int j){
		System.out.println("hello world");
	}
	Conexample(int i, String n){
		System.out.println("differen type");
	}
	public static void main(String args[]) {
		Conexample c=new Conexample();
		Conexample c1=new Conexample(6);
		Conexample c2=new Conexample(0,"t");
	}

}
