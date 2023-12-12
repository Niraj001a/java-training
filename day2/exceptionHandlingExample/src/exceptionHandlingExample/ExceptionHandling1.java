package exceptionHandlingExample;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		 try {
			 int a= 100/0;
			 
		 }
		 catch (Exception e){
			 System.out.println("Found Error!!! Message from Catch block :"+e.getMessage());
		 }
		 
		 System.out.println(" ENDED");

	}

}
