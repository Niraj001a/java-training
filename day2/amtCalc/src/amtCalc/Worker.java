package amtCalc;

import java.util.Scanner;

public class Worker {
	
	
	
	
	
	public static float ammounCalc(int year,String monName,float totalSal,float workhours) {
		
		monName=monName.substring(0,3);
		
		
	int totDays=numberOfMonth(year,monName);
	System.out.println("Total number of days: "+totDays);
	System.out.println("Salary of per day: "+totalSal/totDays);
	float day_sal=(totalSal/totDays)/8;
	System.out.println("per day salary: "+day_sal);
	float netSal=day_sal*workhours;
	
	return netSal;
	
		
		
		
		
	}
	
public static  int numberOfMonth(int year,String monName) {
	int days=0;
	int check=0;
	
	
	
//	if(monName.equals("jan") || monName.equals("mar") || monName.equals("may") || monName.equals("jul") || monName.equals("aug") || monName.equals("oct") || monName.equals("dec")){
	if (monName.matches("^(?i)(jan|mar|may|jul|aug|oct|dec)$")) {	
	days=31;
	check++;
	}else if(monName.equals("apr") || monName.equals("jun") || monName.equals("sept") || monName.equals("nov") ) {
		days=30;
		check++;
	}
	else if(monName.equalsIgnoreCase("feb")){
		if(year%4==0) {
			days=29;
			check++;
		}else {
			days=28;
		}
	}
	else {
		System.out.println("Enter the valid month name");
		
	}
	
	return days;
		
	

}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first three later of month name: ");
		String monName=sc.next();
		System.out.println("Enter the year: ");
		int year=sc.nextInt();
		System.out.println("Enter the Number of hours he worked: ");
		float work_hours=sc.nextFloat();	
		System.out.println("Enter th total month Salary: ");
		float  totSal=sc.nextFloat();	
		
		float netsal=ammounCalc(year,monName,totSal,work_hours);
		
		System.out.println("Total net salary of work will be  : "+netsal);
		sc.close();
		
		
		
		
		
	}

}
