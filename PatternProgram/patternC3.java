package PatternProgram;

import java.util.Scanner;

public class patternC3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value number:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");

			}
			System.out.println();
		}

	}
}
