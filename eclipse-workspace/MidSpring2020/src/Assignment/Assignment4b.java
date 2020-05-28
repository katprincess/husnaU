package Assignment;

public class Assignment4b {

	public Assignment4b() {
		this (77);
		System.out.println("default constructor");
	}
	public Assignment4b (int a) {
		this("husna is so awesome");
		System.out.println("int: "+a);
	}
	public Assignment4b(String a) {
		this(34, 56);
		System.out.println("String: "+a);
	}
	public Assignment4b (int a, int b) {
		System.out.println("ints :"+a+b);
	}

}
