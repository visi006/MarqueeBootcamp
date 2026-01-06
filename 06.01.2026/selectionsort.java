// cin >> num1 >> num2 >> num3;
//    cin >> num2 >> num3;
//        cin >> num3;
// istream_with_assign & operator >> ( istream_with_assign & cin, int &);

import java.util.Scanner;
import java.util.Random;
class selection_stable
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
		   System.out.printf("%02d ", arr [ arr_ind ] );
	   System.out.println();
	   
	   
   }
   
    private static int [] selectionSort ( int [] data )
    {
	    int workfor_index;
		int small_value_ind;
		int small_value;
        int find_min_index;
		int data_size;
		data_size = data.length;
		small_value = 0;
		small_value_ind =0;
		for ( workfor_index = 0; workfor_index < data_size ; workfor_index++)
		{
		     small_value = Integer.MAX_VALUE;
			 for( find_min_index = workfor_index ; find_min_index < data_size; find_min_index++)
			 {
			 
			    if ( data [ find_min_index ]  < small_value )
				{
				   small_value_ind = find_min_index;
				   small_value = data [ find_min_index ];
				}
			 }
			 swap ( data, workfor_index, small_value_ind );
			 swap ( ind, workfor_index, small_value_ind );
		}
		return data;
    }	
	public static void main( String [] parameters )
	{
		Scanner kbrd = new Scanner ( System.in  );
		String sortStr = "Selection";
		int  noe; // number of elements
	//	noe = kbrd.nextInt();
	    //int [] arr = new int [ noe ];
		int [] ind = {  0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int [] arr = { 56,23,77,89,23,88,12,23,90,23};
		
/*		Random rnd = new Random();
		int arr_ind;
		int value;
		for( arr_ind = 0; arr_ind < noe; arr_ind++)
		{
		   value = rnd.nextInt( 1000 );
		   arr [ arr_ind ] = value;
		}*/
		print( ind  );
	    print( arr );
		
		selectionSort ( arr  ind );
	    print( ind );	
	 	print( arr );
	}
}

