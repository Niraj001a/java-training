package handson;

import java.util.Scanner;

public class FibbonacchiNumber {
	
	public static void main(String[] args) {
//		5] Write a program to print all the elements of Fibonacci series
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number of Fibonacci term : ");
		int n= sc.nextInt();
		int flag=0;
		int temp=0;
		int num1=0;
		int num2=1;
		
		System.out.print("The Fibbonacci series is : "+num1);
		while (flag!=n-1) {
			System.out.print(" "+num2);
			temp=num2;
			num2+=num1;
			
			num1=temp;
			
			flag++;
		}
		
		
		
	}

}
