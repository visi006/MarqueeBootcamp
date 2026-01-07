import java.util.Scanner;
class keith
{
	private static int numberOfDigits ( int num )
	{
		   int copy_num;
		   int nod_num; // number Of Digits in num
		   // for ( initial SETUP; check GOOD; alter the SETUP)
		   // { process }
        for( copy_num = num, nod_num = 0; copy_num!=0; copy_num/=10)
        {
			nod_num++;
        }			
		return nod_num;
	}
	public static void main( String [] parameters )
	{
		 Scanner kbrd = new Scanner ( System.in );
		 int num;
		 num = kbrd.nextInt();
		 int nod_num;
		 int sum;
		 nod_num = numberOfDigits( num );
		 int [] digits = new int [ nod_num + 1 ];
		 int digits_ind;
		 int copy_num;
		 int digit;
		 int si; // sum index
		 int li; // leaving index
		 si = nod_num;
		 li = 0;
		 copy_num = num;
		 digits_ind = nod_num - 1;
		 while ( copy_num != 0 )
		 {
		     digit = copy_num % 10;
			 digits [ digits_ind ] = digit;
			 digits [ si ] += digit;
			 copy_num /= 10;
			 digits_ind --;
		 }
		 sum = 0;
		 while ( digits [ si ] < num )
		 {
		     sum = 2 * digits [ si ] - digits [ li ];
			 si+=1;
			 if ( si == (nod_num+1))
			 {
			     si = 0;
			 }
			 digits [ si ] = sum;
			 li++;
			 if ( li == (nod_num +1))
			 {
			    li = 0;
			 }
		 }
		 if ( digits [ si ] == num )
		    System.out.println("Keith");
	      else 
             System.out.println("NOT");		  
		 
		 
		 
		 
		 
	}
}
