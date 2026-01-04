
JAVA CODE FOR FINIDNG POLYDIV NUMBER USING HELPER FUNCTION

//12 17 12:26
class polyDiv_10
{
    private static void pd_helper ( boolean [] used, int base, int conValue, int digit)
	{
	if ( digit == base )
	{
	    System.out.println( conValue );
		return;
	}
	// enumerate all the choices 1 to 9
	    int checkDigit;
		int myconValue;
		for( checkDigit = 1; checkDigit < base; checkDigit ++)
		{
		   if ( used [ checkDigit ] == false)
		   {
		      myconValue = conValue * 10 + checkDigit;
			  if ( myconValue % digit == 0 )
			  {
			    used [ checkDigit ] = true;
				pd_helper( used, base, myconValue , digit+1);
		used [ checkDigit ] = false;
			  }
		   }
		}
	}
    public static void polyDiv ( int base )
	{
	   // arm
	   
	   // set an envi
	   boolean [] used = new boolean [ base ];
	   // call helper - recursive, pass, initiate
	   
	   pd_helper ( used, base, 0, 1);
	}
	public static void main( String [] parameters )
	{
		polyDiv ( 10 );
	}
}
