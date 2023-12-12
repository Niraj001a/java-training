package handson;

import java.util.Scanner;

public class Prime_Number {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number of Prime Number is required: ");
	int n=sc.nextInt();
	
	
	int check=0;
	int num =1;
	int flag;
	System.out.print("The Prime Number Are :   ");
	while(check!=n) {
	 flag=0;
//		Checking Prime
		for(int i=2;i<=num/2;i++) {
			
		if( num%i==0) {
			flag++;
		}
			
		}
		
		if(flag==0) {
			System.out.print(num+ "  ");
			check++;
		}
		num++;
	}
		
	}
	

}
