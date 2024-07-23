package com.tns.practice;

import java.util.Scanner;

public class Helloworld {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int n=sc.nextInt();
	if(n==0) {
		System.out.println("number is zero");
	}
		else
		{
			System.out.println("not zero");
		}
	}
}

