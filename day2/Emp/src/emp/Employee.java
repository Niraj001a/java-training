package emp;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	
	public Employee() {
		System.out.println("Default constructer of employee is called....");
		this.empId=0;
		this.empName="";
		this.salary=0;
	}
	
	
	public Employee(int empId,String empName,double salary) {
		System.out.println("parametarised constructer of employee is called....");
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	public String toString() {
		return "    |    "+this.empId+"     |      "+this.empName+"    |        "+this.salary;
	}
	
	public String getEmpName() {
		return empName;
	}
	public double getsalary() {
		return salary;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	
	public void setempName(String empName) {
		this.empName=empName;
	}

}
