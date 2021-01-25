package OOPS;

public abstract class ExamplesJavaAbstraction {
	// Abstract keyword
	// can have abstract and non abstract methods.
	// hiding details and showing functionality
	// 2 ways to achieve abstraction
	// 1)Abstract class 2)Interface
	// can't create an object of abstract
	// can have constructors and static methods
	// can have final method 
	// non-abstract can inherit from abstract
	
	void Java() {
		
	}
	
}

class Second extends ExamplesJavaAbstraction{
	
	public static void main(String[]args) {
		
		ExamplesJavaAbstraction a = new Second();
		a.Java();
		System.out.println("java runs");
		
	}
}

