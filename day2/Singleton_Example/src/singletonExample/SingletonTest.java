package singletonExample;

class Singleton
{	
	static boolean onlyOne = false;		
	static Singleton s1;
	int price = 100;
   	private Singleton( ) {   }
	public static Singleton getInstance( )
	{
	       if(onlyOne == false)
	       {
		onlyOne = true;
		s1 = new Singleton( );		
		return s1;
	       }
	       else
	       {
		System.out.println("You can not create a second object");
		return null;
	       }
	}
}
 public class Singleton
{
	public static void main(String args[])
	{
		// Singleton s1 = new Singleton( ); raises error as Singleton( ) is private
		Singleton s1 = Singleton.getInstance( );
		System.out.println(s1.price);

	          Singleton s2 = Singleton.getInstance( ); // s2 not created and prints else part
	}
}





