package containtStackExample;

class Employee{
	private int empId;
	private String empName;
	private double salary;
	
	
//	Default Constructor of Employee
	public Employee() {
		System.out.println("Default Constructor of employee is called  ");
		this.empId=0;
		this.empName="";
		this.salary=0;
	}
	
	
//	Parameterised Constructor of Employee

	
	public Employee(int empId,String empName,double salary) {
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

 class Organization {
	
	private String orgName;
	private String orgLocation;
	
	private Employee emp;
	
	
	//Default Constructor of Organisation which internally calling Employee

	public Organization() {
		System.out.println("Default Constructor of Organization is called  ");
		this.orgName="";
		this.orgLocation="";
		this.emp=new Employee();
	
	}
	
//	Parameterised Constructor of Organisation which internally calling Employee

	
	public Organization(String orgName,String orgLocation,int empId,String empName,double salary) {
		System.out.println("Default Constructor of Organization is called  ");
		this.orgName=orgName;
		this.orgLocation=orgLocation;
		this.emp=new Employee(empId,empName,salary);
	
		
	}
	
	
//	toString() overridding of Organisation
	public String toString() {
		return emp.toString()+"  | OrgName : "+this.orgName+" |  OrgLocation : "+this.orgLocation;
	}
	
	

}



//Public class which has main method
public class ContainElement {
	public static void main(String[] args) {
		
		
		Organization mav= new Organization();
		
		
		Organization mav1= new Organization("maveric","Pune",11,"Niraj",100);
		System.out.println(mav1);
	}
}
