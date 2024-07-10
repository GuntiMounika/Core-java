package com.tns.exceptiondemo;
import java.util.Scanner;
public class Testdemo {
	public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("enter rollno:");
int rollno=sc.nextInt();
if(rollno<0) {
	throw new ArithmeticException("roll canot negative");
}
else {
	System.out.println("valid rollno:");
}
}
}