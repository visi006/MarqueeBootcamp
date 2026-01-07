import java.util.Scanner;
// 11.37
// 12.11 
import java.util.Random;
class quickSort
{
    public static void print( int [] arr )
	{
	   int arr_ind;
	   for( arr_ind = 0; arr_ind < arr.length; arr_ind++)
           System.out.printf("%03d ", arr [ arr_ind ] );
        System.out.println();	   
	}
	private static void swap ( int [] arr, int pos1, int pos2 )
	{
		int temp;
		temp = arr [ pos1 ];
		arr [ pos1 ] = arr [ pos2];
        arr [ pos2 ] = temp;
		}
	private static void qs_helper (int [] data, int si, int li )
	{
	    // base case
		if ( si >= li )
			return;
		int sf ; // small finder
		int lf ; // large finder
		int pivotValue;
		pivotValue = data [ li ];
		sf = li - 1;
		lf = si;
		while ( true )
		{
		// find the smaller than pivotValue
		while ( sf > si && data [ sf ] >= pivotValue)
			sf--;
		
		// find the larger than pivotValue
		while ( lf < li && data [ lf ] < pivotValue)
			lf++;
		if ( lf < sf )
		{
			swap ( data, lf, sf);
		}
		else
			break;
		}
		swap ( data, lf, li );
		qs_helper ( data, si, lf - 1);
		qs_helper ( data, lf+1, li );
		
		
		
		
		
		
		
	}
	
	public static int [] quick_sort ( int [] arr )
	{
		   // arm length - trivial and validation
		   
		   // set an environment
		   
		   // call helper- recursive, pass, initiate
		   qs_helper ( arr, 0, arr.length-1);
		   return arr; 
	}
	public static void main( String [] parameters )
	{
		 int noe;
		 String sort_name = "QuickSort";
		 Scanner kbrd = new Scanner ( System.in );
		 noe = kbrd.nextInt();
		 int [] arr = new int[ noe ];
		 Random rnd = new Random();
		 int arr_ind;
		 for( arr_ind = 0; arr_ind < noe; arr_ind++)
		 {
		    arr [ arr_ind ] = rnd.nextInt() % 1000;
		 }
		 long start_time = System.currentTimeMillis();
		
//		int [] arr = {10,20,30,40,50,60,70,80,90,42,14,15,27,88,99,33,46,21};
//         int [] arr ={99,21,34,12,36,56,94,32,10,25,35,42,35,45,11,25,71,86,55,90,31,2,33,53,1,99};
//		 print ( arr );
		 quick_sort ( arr  );
//		 print( arr );
		 long stop_time  = System.currentTimeMillis();
		 double time_taken = ( stop_time -  start_time )/1000.0;
		 System.out.printf("%s Algo %d Elements Duration = %.3f", sort_name, arr.length, time_taken);
	}
}
