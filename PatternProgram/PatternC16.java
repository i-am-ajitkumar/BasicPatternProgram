package PatternProgram;

import java.util.Scanner;

public class PatternC16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");

		int n = sc.nextInt();
		for (int i = 1; i <= n; i++)// n=5 so i=5;//outer loop
		{
			for (int j = i; j < n; j++) {
				System.out.print(" "); // Space print
			}
			for (int j = 1; j <= i; j++)// inner loop
			{
				System.out.print((char) (j + 64));
			}
			System.out.println();// next line
		}
	}
}
