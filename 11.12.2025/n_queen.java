// 2:29

import java.util.Scanner;


class n_queen
{
	static int solctr;
    private static boolean isSafe( int noq, int [] qpos, int qno, int pos )
	{
	     int row;
		 int col;
	    // left diagonal
		for ( row = qno -1, col = pos - 1; row >= 0 && col >= 0;row--, col--)
		     if ( qpos [ row ] == col )
			      return false;
		// top
		for ( row = qno -1, col = pos ; row >= 0 ;row--)
		     if ( qpos [ row ] == col )
			      return false;
		
		
		// right diagonal
		for ( row = qno -1, col = pos + 1; row >= 0 && col < noq ;row--, col++)
		     if ( qpos [ row ] == col )
			      return false;
				  
				  
				  return true;
	}
	private static void printBoard ( int noq, int [] qpos )
	{
		int row;
		int col;
		for ( row = 0; row < noq; row++, System.out.println())
		{
			for( col = 0; col < noq; col++)
			{
				System.out.printf("%c ", qpos [ row ] == col ? 'Q' : '-');
			}
		}
			// for ( initial SETUP; is the SETUP good enouugh; alter the SETUP)
		    // {
			//    statement(s);
			// }
	}
    private static  void n_queen_helper ( int noq, int [] qpos , int qno )
	{
	    if ( qno == noq )
		{
		    //System.out.println("S o l v e d !!!!!!!!!");
			System.out.printf("%d Queens Solution #%d\n", noq, ++solctr);
			printBoard( noq, qpos );
		}
	    // enumerate 0 to noq-1
		int pos;
		for( pos = 0; pos < noq; pos++)
		{
		  if ( isSafe ( noq, qpos, qno, pos ) == true )
		  {
		     qpos [ qno ] = pos;;
			 n_queen_helper ( noq, qpos, qno + 1);
			 qpos [ qno ] = -1;
		  }
		}
	}
    public static void solveNQueen ( int noq  )
	{
	   // arm length
	   if ( noq == 1)
	       System.out.println("1 Solution");
	   if ( noq < 4 )
	       System.out.println("No Solution");
		   // environment
		   int [] qpos = new int [ noq ];
		   int qpos_ind;
		   for( qpos_ind = 0; qpos_ind < noq; qpos_ind++)
		        qpos [ qpos_ind] = -1;
				
				solctr =0;
	   // call helper - recursive, pass the environment, initiate
	   
	   n_queen_helper ( noq, qpos, 0);
	   
	   
	   
	   
	}

	public static void main( String [] parameters )
	{
		int noq; // number of queens
		Scanner kbrd = new Scanner ( System.in );
		noq = kbrd.nextInt();
		solveNQueen ( noq );
	}
}
