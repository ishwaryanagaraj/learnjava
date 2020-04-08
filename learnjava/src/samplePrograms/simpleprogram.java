package samplePrograms;

public class simpleprogram {
	
			//data declaration
	
	int Branchcode = 123;
	float date = 12.924563456f;
	double amount= 15.125468787744d;
	char initial = 'N';
    String name = "ishwarya";
    long balance = 13264597835654656l;      
    byte booknum = 23;
               
		//method decleration
	
	public void getBankdetails()
	{
	System.out.println("Account details: \n  Branchcode 123 \n date 12.798546231 \n");
	}
	
	  // main and function calling
	
	public static void main (String args[])
	{
		simpleprogram b = new simpleprogram();
		b.getBankdetails();
	}
}

	

	
	





