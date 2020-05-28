package Assignment;

import java.util.Scanner;

public class Assignment3b {

	public static void main(String[] args) {
		// 2.	Given N --- Print backward to 0. 
		
		System.out.println("Give me a number");
		Scanner n = new Scanner(System.in);
		int na = n.nextInt();
		
		for(int i=na; i>=0 ; i--) {
			System.out.println(i);
		}

	}

}
