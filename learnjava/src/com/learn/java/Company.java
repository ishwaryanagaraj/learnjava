package com.learn.java;


public class Company {

	//data
	
   String companyname;
   int employeeid;
   String employeename;
   
   void getdata()
   {
	   System.out.println("POfi technologies");
	   System.out.println("ish, abc, new, test");
	   System.out.println("1 2 3 4");
	   System.out.println("1.ish\n 2.abc\n 3.new\n 4.test");
	   
   }
   
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
	Company  com = new Company();
		
	//com.companyname = "Pofi technologies";
	//com.employeeid = 01;
	//com.employeename = "Ish";
	//com.employeename = "abc";
	com.getdata();
	//System.out.println(com.companyname+ " "  +com.employeeid+ " " +com.employeename);
	
			}
}

