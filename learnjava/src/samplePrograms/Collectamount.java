package samplePrograms;

import java.util.function.ToDoubleBiFunction;

public class Collectamount

{
//data declare
	
	int Tobecollected = 10000;
	
// user defined method

int amounttobecolected()
{
System.out.println ("amount "  +  Tobecollected);	
return Tobecollected;
}



// standard declartion

public static void main(String [] args)
{
	Collectamount grandson = new Collectamount();
int amount=	grandson.amounttobecolected();
System.out.println(" to receive " +amount);

}
}


