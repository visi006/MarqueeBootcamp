import   java.util.Scanner;
class leetCode_313
{
	public static void main( String [] parameters )
	{
		Scanner kbrd = new Scanner ( System.in );
		int noe;
		noe = kbrd.nextInt();
		int [] pl = new int [ noe ];
        for( int iter = 0; iter < noe; iter++)
           pl [ iter ] = kbrd.nextInt();
        int nth_sun;
        nth_sun = kbrd.nextInt();
        int pl_ind;
        int num;
		int work_num;
		int sun_ctr;
		sun_ctr = 0;
		num = 1;
		// 2 3 5 23 29 47
		// 2 5 17 19
		// 8
		// 1 5
		while ( sun_ctr < nth_sun)
			// 2 3 17 19
		    // 16
			// pl_ind 0 1
			// wm 16 8 4 2 1 17
			// 34 17 1
			// 39 % 2
			// 39 % 3 => 13
        {
		//	System.out.printf("D : %d\n", num );
			work_num = num;
			for ( pl_ind = 0; work_num != 1 && pl_ind < noe && work_num >= pl [pl_ind ]  ; pl_ind ++)
			{
				if ( work_num % pl [ pl_ind ] != 0)
				  continue;
				else
				{ 
				   while ( work_num % pl [ pl_ind ] == 0)
					   work_num /= pl [ pl_ind];
				}		
			}
			if ( work_num == 1 )
			{
				 System.out.printf("%d ", num );
				 sun_ctr++;
			}
			num++;
		}
		
	}
}
