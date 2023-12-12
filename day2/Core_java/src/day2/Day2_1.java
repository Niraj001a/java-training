package day2;

import java.io.IOException;
import java.util.*;

import javax.swing.JOptionPane;

public class Day2_1 {
	private int real;
	private int imag;
	
	public Day2_1(){
		imag=2;
		real=45;
		System.out.println("Default constructer called...........");
		
	}
	
	public Day2_1(int a, int b){
		imag=a;
		real=b;
		System.out.println("parameterised constructer called...........");
		
	}
	
	public String toString() {
		return("Complex values are "+this.real+" "+this.imag);
	}
	
	public void get() {
		System.out.println("value of real : "+real);
		System.out.println("value of imag : "+imag);
	}
	
	
//	First method to accept value from  user---- BufferedReader
	
	public void acceptComplexValues() throws IOException{
		
		
//		BufferedReader input =new BuffeRedreader
		
		
		
	
	
//	Second method to accept value from  user---- Scanner
		
		
//	 Scanner sc = new Scanner(System.in);
//	 System.out.println("Enter the value of real :");
//	 
//	 System.out.println("Enter the value of real :");
	 
//		third method to accept value from  user---- showinputDialog
	 
//	 this.real= Integer.parseInt(JOptionPane.showInputDialog("Enter the Real value"));
//	 this.imag= Integer.parseInt(JOptionPane.showInputDialog("Enter the imag value"));
//	 JOptionPane.showMessageDialog(null,"Values are "+this.real+" "+this.imag );

	 
	 
	 
	}
	
	
	
	
	public static void main(String[]args) throws IOException {
		
		Day2_1 c1= new Day2_1();
//		c1.acceptComplexValues();
		System.out.println(c1);
		
//		c1.get();
//		
//		
//		Day2_1 c2= new Day2_1(100,200);
//		c2.get();
		
		
		
	}

}
