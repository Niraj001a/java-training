package nestedClass;

class Demo {

	// Method of helper class
	void show()
	{
		// Print statement
		System.out.println(
				"i am in show method of super class");
	}
}


public class AnonymousClass {

	//  An anonymous class with Demo as base class
	 static Demo d = new Demo() {
		// Method 1
		// show() method
		void show()
		{
			// Calling method show() via super keyword
			// which refers to parent class
			super.show();

			// Print statement
			System.out.println("i am in Flavor1Demo class");
		}
	};

		public static void main(String[] args) {
			d.show();

		}

}

