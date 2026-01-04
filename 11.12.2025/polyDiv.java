
JAVA CODE FOR FINDING POLYDIV VALUE


//12 17 12:26
// 6513 base 8
// 3 * 8^0 +  1	*8^1 + 5 * 8^2 + 6 * 8^3
// 6513 base 7
// 3 * 7^0 +  1	* 7^1 + 5 * 7^2 + 6 * 7^3


class polyDiv
{
    public static int anybase_to_deci (int anybase , int base)
    {
	    int copy_anyBase;
		int digit;
		int basePower;
		int res;
		
		// populate
		copy_anyBase = anybase;
		// priming
		basePower  = 1;
		res = 0;
		// process
		while ( copy_anyBase != 0 )
		{
		digit = copy_anyBase % 10;
		res = res + digit * basePower;
		copy_anyBase /= 10;
		basePower *= base;
		}
		return res;
		
		
		
		
		
    }	
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
			  if ( anybase_to_deci(myconValue,base) % digit == 0 )
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
	    int base ;
		for ( base = 2; base <= 10; base+=2)
		{
		     System.out.printf("Base %d Solution(s)\n", base);
		     polyDiv ( base );
			 System.out.printf("\n\n");
			 
			 }
	}
}
