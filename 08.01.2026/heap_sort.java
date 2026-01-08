import java.util.Scanner;
// 15.18
//  
import java.util.Random;
class heapSort
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
	public static void heap_sort ( int [] arr )
	{
		 // arm length - trivia, validation
		 // environment
		 // call helper - recursive, pass , initiate
		 hs_helper ( arr );
	}
	private static void maxHeapify ( int [] arr, int pno, int li )
	{
		   int left;
		   int right;
		   left = 2 * pno + 1;
		   right = 2 * pno + 2;
		   // child
		   if ( left > li)
			   return;
		   // parent with single child 
		   if ( left == li )
		   {
			      if ( arr [ left] > arr [ pno ])
					  swap( arr, left, pno );
				  
				  return;
		   }
		   // parent with both children
		   
		   if ( arr [ left ] > arr [ pno ] || arr [ right] > arr [ pno ] )
		   {
			   if ( arr [ left ] > arr [ right ] )
			   {
				   swap( arr, left, pno );
				   maxHeapify ( arr, left, li);
			   }
			   else
			   {
				   swap( arr, right, pno );
				   maxHeapify ( arr, right, li);

			   }
			   
		   }
		   
		   
		   
	}
	private static void hs_helper ( int [] arr  )
	{
	    // calculate the number of parents
        // make every parent a MAXHEAP
        int nop; // number of parents 	
        nop = arr.length / 2;
		int li; // last Index
		li = arr.length - 1;
        for ( int pno = nop - 1; pno >= 0; pno--)
        {
              maxHeapify(arr, pno, li);
        } 
		swap( arr, 0, li);
		li--;
		while ( li > 0)
		{
	           maxHeapify(arr, 0, li);
			   swap( arr, 0, li);
		       li--;
   		
		}
		
		
		
    }
	public static void main( String [] parameters )
	{
		 int noe;
		 String sort_name = "Heap aSort";
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
   //      int [] arr ={5,15,10,25,55,35,75,45,95,50,70,40,60,90,3};
	//	 print ( arr );
		 heap_sort ( arr  );
	//	 print( arr );
		 long stop_time  = System.currentTimeMillis();
		 double time_taken = ( stop_time -  start_time )/1000.0;
		 System.out.printf("%s Algo %d Elements Duration = %.3f", sort_name, arr.length, time_taken);
	}
}
