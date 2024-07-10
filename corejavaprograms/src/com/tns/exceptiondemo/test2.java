package com.tns.exceptiondemo;

public class test2 {
public static void main(String args[]) {
try {
	System.out.println(100/0);
}
catch(NullPointerException e) {
	System.out.println("hello");
}
finally {
	System.out.println("welcome");
}
}
}

