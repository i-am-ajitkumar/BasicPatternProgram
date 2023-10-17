package PatternProgram;

import java.util.Scanner;

public class Pattern7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range number:");
		int n = sc.nextInt();
		int number = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(number + " ");// +","(to use print ,)
				number++;
			}
			System.out.println();
		}
	}

}
