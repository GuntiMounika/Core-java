package com.tns.exceptiondemo;

public class Test {
	public static void main(String args[]) {
try {
	System.out.println("Welcome");
}
catch(Exception e) {
	System.out.println("exception");
} finally {
	System.out.println("main");
}
}
}