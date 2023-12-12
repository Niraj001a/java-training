package exceptionHandlingExample;

public class ExceptionHandling2 {
	public static void main(String[] args) {
		
		int a=0;
		
		try {
			a=100/0;
			
		}
		catch(ArithmeticException e) {
			System.out.println("Found Error at Arthimatic Exception "+e.getMessage());
			
		}
		catch(Exception e) {
			System.out.println("Found Error at generic Exception  "+e.getMessage());
		}
		finally {
			System.out.println("Finally block is called !!!!");
		}
		System.out.println("Program Ended");
	}

}
