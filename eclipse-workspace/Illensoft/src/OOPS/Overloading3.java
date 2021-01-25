package OOPS;

class Addition2{
	static double add (double a, double b) {
		return a+b;
	}
	static int add (int a, int b, int c) {
		return a+b+c;
	}
}


public class Overloading3 {

	public static void main(String[] args) {
		// we can overload java main method
		// but string [] args main method can be only one
		System.out.println(Addition2.add(10, 10));
		System.out.println(Addition2.add(22, 543, 9776));
		System.out.println("Main String [] args");
		main();
		main("lilly,donna,array");
	}
	
	public static void main(String args) {
		System.out.println("without [] main");
	}
	
	public static void main () {
		System.out.println("without String [] args");
	}

}
