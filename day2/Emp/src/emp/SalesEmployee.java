package emp;

public class SalesEmployee extends Employee implements employeeInterface{
//	private int sales;
//	private double commission;
//	private double netSalary;
	private SalesEmployee stak[];
	private int top;
	
	public SalesEmployee() {
		System.out.println("Default constructor of SalesEmployee is called");
		stak=new SalesEmployee[5];
		
		
		
//		this.sales=0;
//		this.commission=0;
//		this.netSalary=0;
	}

	public SalesEmployee(int empId,String empName,double salary,int sales) {
		super(empId,empName,salary);
		System.out.println("Parameterised constructor of SalesEmployee is called");
		this.sales = sales;
		this.commission = 0;
		this.netSalary = 0;
	}
	
	public String toString() {
		return super.toString()+ "Sales "+this.sales+" Commission "+this.commission+" Net Salary"+this.netSalary;
	}

	@Override
	public void push(SalesEmployee sel) {
		if(top==stak.length-1){
			System.out.println("Stack is full");
		}
		
	}

	@Override
	public SalesEmployee pop() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}


