package com.tns.exceptiondemo;

import java.util.Scanner;

public class undefined {
  private static int age;
  static void validate() throws Age{
	  Scanner sc=new Scanner(System.in);
		  System.out.println("enter age");
		  int age=sc.nextInt();
		  if(age<18)
			  throw new Age("invalid age");
			  else
				  System.out.println("vote");
  }
		public static void main(String args[]) {
			try {
			undefined.validate();
		}
		catch(Age e) {
			System.out.println("caught"+e.getMessage());
		}
		}
  }
 
 
