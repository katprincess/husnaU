package OOPS;

class Addition{
	static int add (int a, int b) {
		return a+b;
	}
	static int add (int a, int b, int c) {
		return a+b+c;
	}
}


public class PolymorphismOverload2 {

	public static void main(String[] args) {
		System.out.println(Addition.add(10, 10));
		System.out.println(Addition.add(22, 543, 9776));

	}

}
