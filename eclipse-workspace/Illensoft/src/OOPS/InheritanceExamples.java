package OOPS;

public class InheritanceExamples extends InheritanceExample2 {

	public static void main(String[] args) {
		System.out.println("1st inheritance class / method");
		InheritanceExample2.mayar(); // static . Do'nt have to create an object
		
		InheritanceExample2 ac = new InheritanceExample2();
		ac.lilly();// non-static have to create an object

	}

}