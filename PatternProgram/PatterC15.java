package PatternProgram;

import java.util.Scanner;

public class PatterC15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");

		int n = sc.nextInt();
		for (int i = n; i >= 1; i--)// n=5 so i=5;
		{
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++)

			{

				System.out.print(j);
			}
			System.out.println();
		}
	}
}
