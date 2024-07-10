package com.tns.exceptiondemo;

public class Implementingrunnable implements Runnable {
public static void main(String args[]) {
	Implementingrunnable r=new Implementingrunnable();
	Thread t=new Thread(r);
	t.start();
}
public void run() {
	System.out.println("Implementingrunnable");
}
}
