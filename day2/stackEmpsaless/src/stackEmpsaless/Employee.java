package stackEmpsaless;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	
	public Employee() {
		System.out.println("Default constructor of Employee is called");
		this.empId=0;
		this.empName="";
		this.salary=0;
	}
	
	public Employee(int empId,String empName,double salary) {
		System.out.println("Parameterised constructor of Employee is called");
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String name) {
		this.empName=name;
	}
	
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	
	public String toString() {
		return " | "+this.empId+" | "+this.empName+" | "+this.salary;
	} 
	

}

