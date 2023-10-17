package PatternProgram;

import java.util.Scanner;

public class PatternC7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		String st = sc.next();
		int n = st.length();
		for (int i = n; i >= 1; i--)// AJIT
		{
			for (int j = 0; j < i; j++)// J=0,1,2,3
			{
				System.out.print(st.charAt(j) + " ");

			}
			System.out.println();

		}
	}
}
