package PatternProgram;

import java.util.Scanner;

public class PatternC13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");

		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; i <= j - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n - 1 + 1; j++)

			{

				System.out.print("*");
			}
			System.out.println();
		}
	}
}
