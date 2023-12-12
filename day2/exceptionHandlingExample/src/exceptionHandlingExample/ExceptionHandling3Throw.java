package exceptionHandlingExample;

class MyException extends Exception{
	private String myMsg;
	
	public MyException() {
		myMsg="";
		System.out.println("Default constructor of MyException class is called");
	}
	
	public MyException(String msg) {
		
		System.out.println("Parameterised constructor of MyException class is called");
		myMsg=msg;
	}
	
	public String getMyMessage() {
		return myMsg;
	}
}

public class ExceptionHandling3Throw { 
	public static void main(String[] args) {
	int a=0;
	
	try {
		if(a==0) {
			throw new MyException("This is my custom message ");
		}
	}
	catch(MyException e){
		System.out.println("Error , Message : "+e.getMyMessage());
	}
}

}
