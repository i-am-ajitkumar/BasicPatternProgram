package PatternProgram;

import java.util.Scanner;

public class PatternC5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value number:");
		int n = sc.nextInt();
		int x = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(x + " ");
				x++;
				if (x == 10)
					x = 1;
			}
			System.out.println();
		}
	}
}
