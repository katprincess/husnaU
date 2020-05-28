package Assignment;

import java.util.Scanner;

public class Assignment3d {
	
	public static void main(String[] args) {
		// 4.	Ask the USER for a string and print if the string is palindrome // Hello == olleh
		String b = "";
		System.out.println("Give me a Palidrome word");
		Scanner n = new Scanner(System.in);
		String na = n.next();
		
		int l = na.length();
		for(int i=l-1 ; i>=0; i--) {
			b=b+na.charAt(i);
		}
		if (na.equalsIgnoreCase(b)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
		two();
	}
	
	public static void two() {
		System.out.println("Give me a Palidrome word");
		Scanner n = new Scanner(System.in);
		String na = n.next(); 
		String reverse = new StringBuffer(na).reverse().toString();
		if (na.equals(reverse))
			System.out.println("String is palindrome");
			else
			System.out.println("String is not palindrome");
			}
	}
	
