package Assignment;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// 1.	Given N --- Print this pattern up to N: 1, 4, 8, 12, 16, 20…
		
		System.out.println("Give me a number");
		Scanner n = new Scanner(System.in);
		int na = n.nextInt();
		for (int i=0; i<=na; i++) {
			
			if (i==0) {
				System.out.println(1);
			}
			else if (i>na/4) {
				break;
			}
			else {
				System.out.println(i*4);
			}
		}

	}

}
