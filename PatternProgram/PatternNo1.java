package PatternProgram;

import java.util.Scanner;

public class PatternNo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++)// OUTER LOOP
		{
			for (int j = 1; j <= n - i; j++)// SPACE
			{
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--)// INNER LOOP
			{
				System.out.print(j);
			}
			for (int j = 2; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();

		}
	}
}
