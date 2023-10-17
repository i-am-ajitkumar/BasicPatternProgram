package PatternProgram;

import java.util.Scanner;

public class PatternC17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");

		int n = sc.nextInt();
		for (int i = 1; i <= n; i++)// n=5 so i=5;
		{
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = i; j < 2 * i; j++)

			{
				System.out.print((char) (j + 64));// (i+64)
			}
			/*
			 * for(int j=i;i>1;j--) { System.out.println((char)(j+64)); }
			 */
			System.out.println();
		}
	}
}
