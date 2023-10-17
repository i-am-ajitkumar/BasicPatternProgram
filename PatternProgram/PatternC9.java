package PatternProgram;

import java.util.Scanner;

public class PatternC9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value number:");
		int n = sc.nextInt();

		for (int i = n; i >= 1; i--)// n=5
		{
			for (int j = i; j >= 1; j--)// i=1,2,3,4,5
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}
}
