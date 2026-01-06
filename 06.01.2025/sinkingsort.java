// cin >> num1 >> num2 >> num3;
//    cin >> num2 >> num3;
//        cin >> num3;
// istream_with_assign & operator >> ( istream_with_assign & cin, int &);

import java.util.Scanner;
import java.util.Random;
class sinking
{
   private static void swap ( int [] arr, int pos1, int pos2 )
   {
       int temp;
	   temp = arr [ pos1 ];
	   arr [ pos1] = arr[ pos2 ];
	   arr [ pos2 ] = temp;
   }
   private static void print ( int [] arr )
   {
	   System.out.println();
	   int arr_ind;
	   for ( arr_ind = 0; arr_ind < arr.length; arr_ind ++)
		   System.out.printf("%d ", arr [ arr_ind ] );
	   System.out.println();
	   
	   
   }
   
    private static int [] sinkingSort ( int [] data )
    {
	   int pass;
	   int cmp_ind;
	   int data_size = data.length;
	   
	   for( pass = 0; pass < data_size - 2; pass ++)
	   {
	      for( cmp_ind = 0; cmp_ind < data_size - (pass  + 1); cmp_ind ++)
		  {
		     if ( data [ cmp_ind ]  > data [ cmp_ind + 1])
			    swap ( data, cmp_ind , cmp_ind + 1);
		  }
	   }
		return data;
    }	
	public static void main( String [] parameters )
	{
		Scanner kbrd = new Scanner ( System.in  );
		String sortStr = "Sinking";
		int  noe; // number of elements
		noe = kbrd.nextInt();
	    int [] arr = new int [ noe ];
		Random rnd = new Random();
		int arr_ind;
		int value;
		for( arr_ind = 0; arr_ind < noe; arr_ind++)
		{
		   value = rnd.nextInt( 1000 );
		   arr [ arr_ind ] = value;
		}
	//	print( arr );
		long begin_process = System.currentTimeMillis();
		sinkingSort ( arr );
		long stop_process  = System.currentTimeMillis();
		
	//	print( arr );
		double duration = ( stop_process - begin_process ) / 1000.0;
		System.out.printf("%s Sort Algo %d data Size %.3f is Duration", sortStr, noe, duration);
	}
}

