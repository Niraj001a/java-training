package nestedClass;

import nestedClass.OuterClass.InnerClass;

public class NestedRunner {
	public static void main(String[] args) {
		InnerClass obj1=new OuterClass().new InnerClass(5);
		
	}

}
