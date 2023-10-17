package PatternProgram;

import java.util.Scanner;

public class DiamondPattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int space = n / 2, star = 1;
		int sp = space, st = star;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
//1 no ans
			/*
			 * for(int j=1;j<=st;j++) { System.out.print("*"); }
			 */
//etiki jae
//2 no ans
			/*
			 * for(int j=1;j<=st;j++) if(j==1||j==st) { System.out.print("*"); } else {
			 * System.out.print(" "); }
			 */
			/*
			 * etiki jae //ans 3 no
			 */

			int x = 1;
			for (int j = 1; j <= st; j++) {
				System.out.print(x);
				if (j <= st / 2)
					x++;
				else
					x--;
			}
//etiki jae*/

			if (i <= n / 2)// common part all qtn
			{
				sp--;
				st = st + 2;
			} else {
				sp++;
				st = st - 2;
			}
			System.out.println();
		}
	}
}