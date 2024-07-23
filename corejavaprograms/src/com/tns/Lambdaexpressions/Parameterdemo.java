package com.tns.Lambdaexpressions;

public class Parameterdemo {
public static void main(String args[]) {
	Cube c=(a)->{return (a*a*a);};
	System.out.println("cube:"+c.calculate(5));
}
}
