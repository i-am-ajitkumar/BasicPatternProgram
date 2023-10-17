package PatternProgram;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of range :" );
		int n = sc.nextInt();
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");

			}
			for (int J = i; J >= 1; J--) {
				System.out.print(J + " ");
			}
			System.out.println();
		}

		/*
		 * for (int i = 1; i <=n; i++) { for (int j = 1; j <=n-i; j++) {
		 * System.out.print(" ");
		 * 
		 * } for (int j2 = 1; j2 <=i; j2++) { System.out.print((char)(j2+64)); }
		 * System.out.println(); }
		 * 
		 * A AB ABC ABCD ABCDE
		 */

	}

}
