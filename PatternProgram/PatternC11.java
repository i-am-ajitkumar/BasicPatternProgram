package PatternProgram;

import java.util.Scanner;

public class PatternC11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++)// n=5
		{
			for (int j = 1; j <= i; j++)// i=1,2,3,4,5
			{
				System.out.print((char) (i + 64));// A=65,B=66,....1+64=65=A..2+64=66=B..
			}
			System.out.println();
		}

	}
}
