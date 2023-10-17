package PatternProgram;

import java.util.Scanner;

public class PatternC19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++)// OUTER LOOP
		{
			for (int j = 1; j <= n; j++)// SPACE//n=3
			{
				System.out.print("*");
			}
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = n - 1; j > 1; j--) {
				System.out.print("*");// NOT COMPLETE
			}
			System.out.println();

		}
	}
}
