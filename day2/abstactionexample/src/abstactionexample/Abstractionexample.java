package abstactionexample;


	
	abstract class ParentClass{
		
		public void displayParent() {
			System.out.println("Display of parents is called..............");
		}
		
	public abstract void show();
		public abstract void show2();
		
		public ParentClass() {
			System.out.println("Constructor is called");
		}
		
	}
	
	class childClass extends ParentClass{

		@Override
		public void show() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void show2() {
			// TODO Auto-generated method stub
			
		}
//		public void displayParent() {
//			System.out.println("Display of Child1 is called..............");
//		}
		
                                       
		
	}
	
	
	class child2Class extends ParentClass {
//		public void displayParent() {
//			System.out.println("Display of Child2 is called..............");
//		}
		public void displayParent2() {
			System.out.println("Display of Child2 child is called..............");
		}

		@Override
		public void show() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void show2() {
			// TODO Auto-generated method stub
			
		}
	}
	
	
	
	
	public class Abstractionexample {
	
	public static void main(String[] args) {
		ParentClass p1= new childClass();
		p1.show();
		p1.displayParent();
	    
		ParentClass p11= new child2Class();
		p11.displayParent();
		
		p11=new child2Class();
		p11.show();
		p11.displayParent();

	}

}
