package PatternProgram;

import java.util.Scanner;

public class PatternNo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++)// OUTER LOOP
		{
			for (int j = 1; j < i - 1; j++)// SPACE
			{
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(j);
			}
			for (int j = n - 1; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();

		}
	}
}
