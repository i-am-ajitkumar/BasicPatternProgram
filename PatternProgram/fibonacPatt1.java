package PatternProgram;

import java.util.Scanner;

public class fibonacPatt1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range:");
		int a = 0, b = 1, c = a + b;
		int n = sc.nextInt();// n=4

		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(c + " ");
				c = a + b;
				a = b;
				b = c;
			}

			System.out.println();

		}

	}
}
