
public class Casting {

	public static void main(StringSting[] args) {
		// Casting is used when we want to convert data type to another
		// two types
		// implicit casting
		// explicit casting

		// Implicit Casting
		// done by the complier.
		// smaller values in large variable types

		int value = 100;
		long value1 = value;// implicit // storing small variable in large variable
		float f = 100; // implicit

		System.out.println(value + " " + value1 + " " + f);

		// Explicit Casting
		// done thought coding
		// Storing large values into smaller variables

		long number = 234567;
		int number1 = (int) number; // explicit //storing larger value in smaller variable
		int b = (int) 35.6788;// explicit

		System.out.println(number + " " + number1 + " " + b);

		// Explicit casting can cause truncation of value stored is greater than the
		// size of the variable

		int big = 280;
		byte small = (byte) big;
		System.out.println(small);// output 24 cuz only 8 bits remain;
	}

}
