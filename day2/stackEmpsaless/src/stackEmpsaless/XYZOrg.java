package stackEmpsaless;

import java.util.ArrayList;
import java.util.Scanner;

public class XYZOrg {
	public static void main(String[] args) {
		
		StackSalesEmployeeImpl myStack =new StackSalesEmployeeImpl(10);
		SalesEmployee s1=new SalesEmployee(101,"EShan",10000,5000);
		
		
		SalesEmployee s2=new SalesEmployee(102,"Tanish",20000,5656);
		
		SalesEmployee s3=new SalesEmployee(103,"Manish",30000,3456);
		
		
		
		SalesEmployee s4= new SalesEmployee(104,"Kanish",40000,6656);
		
				
		SalesEmployee s5=new SalesEmployee(105,"Vanish",50000,4544);
		
		
		
		myStack.push(s1);
		myStack.push(s2);
		myStack.push(s3);
		myStack.push(s4);
		myStack.push(s5);
		
		
		System.out.println(myStack.pop());
		
	}
	}
