package amtCalc;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AmtCalcApp {

	
	
	public static float ammounCalc(int year,String monName,float totalSal,float workhours) {
		
		monName=monName.substring(0,3);
		
		
	int totDays=numberOfMonth(year,monName);
//	System.out.println("Totdays"+totDays);
//	System.out.println(totalSal/totDays);
	float day_sal=(totalSal/totDays)/8;
//	System.out.println("day"+day_sal);
	float netSal=day_sal*workhours;
	
	return netSal;
	
		
		
		
		
	}
	
public static  int numberOfMonth(int year,String monName) {
	int days=0;
	
//	if(monName.equals("jan") || monName.equals("mar") || monName.equals("may") || monName.equals("jul") || monName.equals("aug") || monName.equals("oct") || monName.equals("dec")){
	if (monName.matches("^(?i)(jan|mar|may|jul|aug|oct|dec)$")) {	
	days=31;
	}else if(monName.equals("apr") || monName.equals("jun") || monName.equals("sept") || monName.equals("nov") ) {
		days=30;
	}
	else {
		if(year%4==0) {
			days=29;
		}else {
			days=28;
		}
	}
	
	return days;
		
		
	}
	

	public static void main(String[] args) {
		
		int year;
		float work_hours;
		float  totSal;
		String monName;
		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the first three later of month name: ");
//		String monName=sc.next();
//		System.out.println("Enter the year: ");
//		int year=sc.nextInt();
//		System.out.println("Enter the Number of hours he worked: ");
//		float work_hours=sc.nextFloat();	
//		System.out.println("Enter the total month Salary: ");
//		float  totSal=sc.nextFloat();	
		
		monName = JOptionPane.showInputDialog("Enter the first three later of month name");
		year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year"));
		work_hours = Float.parseFloat(JOptionPane.showInputDialog("Enter the Number of hours he worked"));
	    totSal = Float.parseFloat(JOptionPane.showInputDialog("Enter the total month Salary"));
		
		
		
		float netsal=ammounCalc(year,monName,totSal,work_hours);
		
//		System.out.println("Total net salary of work will be  : "+netsal);
		JOptionPane.showMessageDialog(null, "The Net salary of worker is:  "+netsal);
		
		
		
		
		
		
	}

}
