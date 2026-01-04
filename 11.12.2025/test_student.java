
JAVA CODE FOR = operator and equals() function

class student
{
   String name;
   int id;
   student( String name, int id )
   {
      this.name = name;
	  this.id = id;
   }
   boolean equals(student gp)
   {
	   return name.equals(gp.name) && id == gp.id; 
   }
   
}
class test_student
{
	public static void main( String [] parameters )
	{
		student s1 = new student("Jia", 1234);
		student s2 = new student("Jia", 1234);
		System.out.println( s1 == s2 );
		System.out.println( s1.equals(s2) );
		
	}
}
