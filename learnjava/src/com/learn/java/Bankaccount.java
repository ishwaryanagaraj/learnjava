package com.learn.java;

public class Bankaccount 
{

	Long  accountnumber = 12345690l;
	long accountbalance = 12000l;
	String name = "ish";
	
	 void getmybalance()
	 {
		System.out.println("My account balance is "  +accountbalance+  " " +accountnumber+ " " +name);
		//a+""+b+""+c
	
}

	 public static void main (String args[])
	 {
		
		 Bankaccount bb = new Bankaccount();
		 bb.getmybalance();
		 
	 }
}


