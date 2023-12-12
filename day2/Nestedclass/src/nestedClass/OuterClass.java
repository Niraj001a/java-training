package nestedClass;

public class OuterClass {
	private int num = 3;

//	Inner class starts
	public class InnerClass {

		private String msg = "Hello";

		public InnerClass() {

			System.out.println("Default Constructor of InnerClass");
		}

		public InnerClass(int n) {

			System.out.println("para Constructor of InnerClass");
		}

		public void show() {
			System.out.println("Show method of inner class");
			num = 2;
		}

	}

	public OuterClass() {
		System.out.println("Default Constructor of OuterClass");
	}

}
