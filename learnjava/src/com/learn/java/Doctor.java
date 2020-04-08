package com.learn.java;

public class Doctor {
	
	String kidname= "Saranya";
	
	String parentskeptname()
	{
		System.out.println("Parents Kept name: "  + kidname);
		return kidname;
			}
public static void main(String [] args)
{
	Doctor d = new Doctor();
String dr= d.parentskeptname();
	System.out.println("Name in doctor certificate: " +dr);
}
	
}