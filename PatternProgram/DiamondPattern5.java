package PatternProgram;

import java.util.Scanner;

public class DiamondPattern5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				// 1
				/*
				 * if(j==1||j==n||i==j||i+j==n+1||i==1||i==n) System.out.print("*"); else
				 * System.out.print(" ");
				 */
				// 2
				/*
				 * if(j==1||j==n||i==1||i==n||i==n/2+1||j==n/2+1) System.out.print("*"); else
				 * System.out.print(" ");
				 */
				// 3
				/*
				 * if(i==j||i+j==n+1||i==n/2+1||j==n/2+1) System.out.print("*"); else
				 * System.out.print(" ");
				 */
				// 4
				/*
				 * if(j==1||j==n||i==1||i==n) System.out.print("*"); else System.out.print(" ");
				 */
				// 5
				/*
				 * if(j==1||j==n) System.out.print("*"); else System.out.print(" ");
				 */
				// 6
				/*
				 * if(i==1||i==n) System.out.print("*"); else System.out.print(" ");
				 */
				// 7
				if (j == 1 || j == n || i == 1 || i == n || i == n / 2 + 1 || j == n / 2 + 1)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}

}
