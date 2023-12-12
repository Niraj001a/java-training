package stackEmpsaless;

public class StackSalesEmployeeImpl implements EmpStkInterface{
	private SalesEmployee stk[];
	private int top;
		
	public StackSalesEmployeeImpl() {
		System.out.println("Default constructor of StackSalesEmployeeImpl is called");
		stk=new SalesEmployee[0];
		top=0;
	}
	// allocate and initialize stack
	public StackSalesEmployeeImpl(int size) {
			System.out.println("Parameterised constructor of StackSalesEmployeeImpl is called");
			stk = new SalesEmployee[size];
			top = -1;
	}
	
	@Override
	public void push(SalesEmployee se1) {
		if(top==stk.length-1) // use length member
			System.out.println("Stack is full.");
		else
			stk[++top] = se1;
	}

	@Override
	public SalesEmployee pop() {
		if(top < 0) {
			System.out.println("Stack underflow.");
			return null;
		}
		else
			return stk[top--];
	}
}

