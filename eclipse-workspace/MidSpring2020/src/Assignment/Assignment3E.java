package Assignment;

import java.util.Scanner;

public class Assignment3E {
	static Scanner n = new Scanner(System.in);
	static int na;

	public static void main(String[] args) {
		//5.	Ask user for a number and print out ODD if the number is odd; otherwise print EVEN.
		System.out.println("Give me a number");
		na = n.nextInt();
		
		if(na%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("ODD");
		}
		
		two();
	}
	
	public static void two() {
		
		if(na%2 !=0) {
			System.out.println("Odd");
		}
		else {
			System.out.println("even");
		}
		
	}

}
