package Assignment;

import java.util.Scanner;

public class assignment1 {

	public static void main(String[] args) {
		System.out.println("hello, my name is husna");
		
		System.out.println("give me a string");
		Scanner N = new Scanner(System.in);
		// printing out the answer
		String Na = N.next();
		System.out.println(Na);
		// making that answer uppercase
		String Naa = Na.toUpperCase();
		System.out.println(Naa);
		// finding the length of the answer
		int Nb = Na.length();
		System.out.println(Nb);
		// replacing the alphabet uppercase O to uppercase Z
		String Nbb = Naa.replace("O", "Z");
		System.out.println(Nbb);
		// finding the char at index 4 in the answer
		char Nc = Nbb.charAt(4);
		System.out.println(Nc);
		// concat test with the original answer.
		String Nd = Na.concat(" Test");
		System.out.println(Nd);
		
	}

}
