package samplePrograms;

public class Studentdetails {

	// data decleration
	
	int rollno = 01;
	String name = "ish";
	
	//user defind method
	
	void getstudentinfo() {
	
	System.out.println(" student details "  +  name );
	}
	
	//stand alone declaration
	public static void main(String [] args)
	{
		Studentdetails ss = new Studentdetails();
				ss.getstudentinfo();
	}
	
}
