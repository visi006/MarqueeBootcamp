// state 00000000000000000000000000000000
// mask  00000000000000000010000000000000
// STATE 00000000000000000010000000000000
import java.util.Scanner;
class pangram
{
	public static void main( String [] parameters )
	{
		String str;
		int str_ind;
		Scanner kbrd = new Scanner ( System.in );
		int state;
		state = 0;
		char ch;
		int pos;
		int mask;
        // populate
		str = kbrd.nextLine();
        // priming
        state  = 0;
		for( str_ind = 0; str_ind < str.length(); str_ind++)
		{
		   ch = str.charAt(str_ind);
		   pos = ch - 97; // ch -'a'
		   mask = 1 << pos;
		   state |= mask;
		}
		// 00000011111111111111111111111111
		// 0000 0011 1111 1111 1111 1111 1111 1111
		if ( state == 0x03FFFFFF)
		   System.out.println("PANGRAM");
        else
           System.out.println("NOT PANGRAM");		
	}
}
