package Assignment;

import java.util.Scanner;

public class Assignment3c {

	public static void main(String[] args) {
//		3.	Build a basic calculator (Plus, Minus, Multiplication, Division)
//		a.	(Ask user for a number and then ask for the second number 
//		– then ask for the operation: ADD, SUB, MULTI, DIV)
//		b.	Use “IF and ELSE” or “SWITCH”
//		c.	Use method for each operation
		

		System.out.println("What operation do you want to do :Plus, Minus, Multiplication, Division ");
		Scanner n = new Scanner(System.in);
		String na = n.next();
		System.out.println("Give me 1st number");
		int naa = n.nextInt();
		System.out.println("Give me 2nd number");
		int nb = n.nextInt();
		
		if (na.equalsIgnoreCase("plus")) {
			System.out.println(naa+nb);
		}
		if(na.equalsIgnoreCase("minus")) {
			System.out.println(naa-nb);
		}
		if(na.equalsIgnoreCase("multiplication")) {
			System.out.println(naa*nb);
		}
		if(na.equalsIgnoreCase("division")) {
			System.out.println(naa/nb);
		}
		else {
			System.out.println("there is no such function");
		}
	}

}
