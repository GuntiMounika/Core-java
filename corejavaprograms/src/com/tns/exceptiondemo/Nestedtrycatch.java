package com.tns.exceptiondemo;

public class Nestedtrycatch {
public static void check() {
	String str="tns";
	int Slength=str.length();
	System.out.println("String length"+str.length());
	String anotherString=null;
	int y=6;
	try {
		try {
			System.out.println(str.charAt(y));
		}
		catch(StringIndexOutOfBoundsException Ex) {
			System.out.println("String IndexOutOfBounds Exception "+Ex.getMessage());
		}
		
		System.out.println("String length "+anotherString.length());
	}
		catch(NullPointerException npe) {
			System.out.println("exception thrown"+npe.getMessage());
		}
	
}
}
