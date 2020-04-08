package com.learn.java;


public class Return {
	
	int mymark = 100;
	
	int markigot()
	{
		System.out.println("mark i got " + mymark);
		return mymark; 
	}

	public static void main (String [] args)
	{
		Return r = new Return();
		int fullmark= r.markigot();
		System.out.println("got mark" + fullmark);
		
	}
	
}
