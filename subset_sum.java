/*

 0 1 2 3 
{3,7,1,8,5}
       ^
ts 9
f({3,7,1,8,5}, 9, 3, 4)
3 take
leava
take 7
leave 7
take 1
leave 1

*/
class subset_sum
{

    public static void subsetSum_helper( int [] arr, boolean [] used ,int ts, int index, int currSum)
	{

		
	   // boundary check
	   if ( arr.length == index )
	       return;
	   // check 
	   if ( ts == currSum )
	   {
	      //System.out.println("Achieved!!!!!");
		  int arr_ind;
		  System.out.printf("{");
		  for ( arr_ind =0; arr_ind < arr.length ; arr_ind ++)
		  {
			  if ( used [ arr_ind ]  )
			  System.out.printf("%d ", arr [ arr_ind ]) ;
		  }
	   System.out.printf("}\n");
		  return;
	   }

	//   System.out.printf("%d %d\n", index, currSum);
	   // enumerate all the choices 
	   // include arr [ index ] or exclude
	   //include 
	   used [ index ] = true;
	   subsetSum_helper ( arr, used, ts, index +1, currSum+arr[index]);
	   used [ index ] = false;
	   // exclude
	   subsetSum_helper ( arr, used, ts, index +1, currSum);
	   
	
	
	}

    public static void subsetSum( int [] arr, int ts ) // target Sum
	{
	    // arm length - trivial solutions / validatation
		if ( arr.length == 0 )
		     return ;
		if ( arr.length == 1 && arr [ 0] == ts )
        {
		    // print 
			return;
        }		
		// set an environment
        boolean [] used = new boolean [ arr.length ];		
		// call a helper - recursive , pass, initiate
		subsetSum_helper ( arr, used, ts , 0, 0 ); // down top 
		
		
	}
	public static void main( String [] parameters )
	{
		int arr[] = {3, 34, 0, 4, 12, 1, 8,6,5, 2};
		//      3 4 1
		//      3 5
		//      3 0 4 1
		//      3 0 5
		//      0 8
		//      8
		int targetSum;
		targetSum = 8;
		subsetSum ( arr, targetSum );
	}
}