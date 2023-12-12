package containtStackExample;

import java.util.Arrays;
import java.util.Scanner;

class Employee1{
	private int empId;
	private String empName;
	private double salary;
	
	
//	Default Constructor of Employee
	public Employee1() {
		System.out.println("Default Constructor of employee is called  ");
		this.empId=0;
		this.empName="";
		this.salary=0;
	}
	
	
//	Parameterised Constructor of Employee

	
	public Employee1(int empId,String empName,double salary) {
		System.out.println("Default Constructor of employee is called  ");
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	
//	toString() overridding of Employee

	
	public String toString() {
		

		return " Employee Id : "+this.empId+"  | Employee Name : "+this.empName+"   | Salary  :"+this.salary;
	}
		
	
}
	


// class Organization

 class Organization1 {
	
	private String orgName;
	private String orgLocation;
	
	private Employee1[] emp;
	
	
	//Default Constructor of Organisation which internally calling Employee

	public Organization1() {
		System.out.println("Default Constructor of Organization is called  ");
		this.orgName="";
		this.orgLocation="";
		this.emp=new Employee1[0];
	
	}
	
//	Parameterised Constructor of Organisation which internally calling Employee

	
	public Organization1(String orgName,String orgLocation,int size) {
		System.out.println("Default Constructor of Organization is called  ");
		this.orgName=orgName;
		this.orgLocation=orgLocation;
		this.emp=new Employee1[size];
	
		
	}
	
	
	
//	Parameterised Constructor of Organisation which internally calling Employee

	
	public Organization1(String orgName,String orgLocation,Employee1[] empList) {
		System.out.println("Default Constructor of Organization is called  ");
		this.orgName=orgName;
		this.orgLocation=orgLocation;
		this.emp=empList;
	
		
	}
	
//	toString() overridding of Organisation
	public String toString() {
		return Arrays.toString(emp)+" |  OrgName  : "+this.orgName+"   |  OrgLocation : "+this.orgLocation;	}
	
	

}



//Public class which has main method
public class ArrayContainElement {
	public static void main(String[] args) {
		
		
//		---------------First Main program--------------
		
//		Organization mav= new Organization();
//		
//		
//		Organization mav1= new Organization("maveric","Pune",11,"Niraj",100);
//		System.out.println(mav1);
		
		
//		---------------Second Main program--------------

		
//		Employee empList[]= new Employee[5];
//		Organization1 org1=new Organization1("MYOrg","pune",empList);
//		
//		empList[0]=new Employee(101,"Eshan",10000);
//		empList[1]=new Employee(102,"Priya",20000);
//		empList[2]=new Employee(103,"Anand",30000);
//		empList[3]=new Employee(104,"Manish",40000);
//		empList[4]=new Employee(105,"Tanish",50000);
//		System.out.println(org1);
		
		
		
//		---------------Third Main program--------------
		Scanner sc = new Scanner(System.in);
		boolean flag =true;
		int counter=0;
		Employee1 empList[]= new Employee1[10];
		do {
			System.out.println("1.Add employee\n2.Remove employee\n3.Print all employee\n4.Exit");
			int ch=sc.nextInt();
			switch(ch) {
			
//-------------------  Adding Employee--------------------------
			case 1:
				  
				  System.out.print("Enter employee Id:  ");
				  int Id=sc.nextInt();
				  System.out.print("Enter employee Name :  ");
				  String Name =sc.next();
				  System.out.print("Enter employee Salary:  ");
				  int sal=sc.nextInt();
				  empList[counter++]=new Employee1(Id,Name,sal);
				  
					System.out.println("Added successfully................");

				  
				  break;
				  
//-------------------  Removing Employee--------------------------
			case 2:
				  
				empList[counter-1]= null;
				counter--;
				System.out.println("Removed successfull................");

				  
				  break;
				  
//-------------------  Printing Employee--------------------------
 
			case 3:
				Organization1 org1=new Organization1("MYOrg","pune",empList);
				  System.out.println(org1);
					System.out.println("................Printing  Details................");

				  break;
				  
//---------------------Exit do while loop------------------
			case 4:
				flag=false;
				System.out.println("Exit successfull................");
				break;
				  
		    default:
					  System.out.println("Invalid choice.......");
				 
				
			}
			
		}while(flag);

		
		
		
		
	}
}
