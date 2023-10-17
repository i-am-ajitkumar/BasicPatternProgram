package PatternProgram;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  number:");
		int n = sc.nextInt();
		// int m=sc.nextInt();
		for (int i = 1; i <= n; i++)// YOU CAN PUT NUMBER(n=1,2,3..) MANNUALLY
		{
			for (int j = 1; j <= n; j++)// YOU CAN PUT NUMBER(m=1,2,3..) MANNUALLY
			{
				System.out.print("*");
			}
			{
				System.out.println();

			}
		}
	}
}
