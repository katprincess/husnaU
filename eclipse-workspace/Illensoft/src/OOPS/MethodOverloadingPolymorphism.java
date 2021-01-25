package OOPS;

public class MethodOverloadingPolymorphism {
	
	void min (){
		System.out.println("default");
	}
	void min (int a) {
		System.out.println("int a = " + a);
	}
	void min (int a, String b) {
		System.out.println("int a = " + a + " String b = " + b);
	}
	void min (int a, String b, int c) {
		System.out.println("int a = " + a + " String b = " + b + "int c = " + c);
	}
	
	public static void main(String[] args) {
		// same methods, different parameters
		// increases readability of the program
		// by changing the number of arguments.
		// by changing the data types
		
		MethodOverloadingPolymorphism aa = new MethodOverloadingPolymorphism();
		aa.min();
		aa.min(22);
		aa.min(34, "i am free");
		aa.min(56, "this is dark lord" , 34);
		
	}

}
