class oursort
{
	public static void main( String [] parameters )
	{
		String [] arr = {"3", "30", "34", "5", "9"};
		int pass_num;
		int iter_in;
		String s1s2;
		String s2s1;
		String temp;
		for ( pass_num = 0; pass_num < arr.length - 1; pass_num++)
		{
		    for( iter_in = 0; iter_in < arr.length - 1; iter_in++)
			{
			   s1s2 = arr [ iter_in ] + arr [ iter_in + 1];
			   s2s1 = arr [ iter_in + 1] + arr [ iter_in ];
			   if ( s1s2.compareTo(s2s1) > 0)
			   {
			       temp = arr [ iter_in ];
				   arr [ iter_in ]  = arr [ iter_in + 1];
				   arr [ iter_in + 1]  = temp;
			   }
			}
		}
		String res= new String("");;
		for( int arr_ind = 0; arr_ind < arr.length ; arr_ind++)
		    res+=arr [ arr_ind ];
		System.out.println( res );	
		
	}
}
