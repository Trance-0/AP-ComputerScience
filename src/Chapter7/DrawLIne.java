package Chapter7;

import java.util.Scanner;

public class DrawLIne {
	public static void drawLine(int n) {
		if (n == 0) {
			System.out.println("That is all.");
		} else {
			for (int i = 1; i <= n; i++) {
				System.out.print("*");
			}
			System.out.println("");
			drawLine(n - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many line do you need.");
		Scanner in = new Scanner(System.in);
		int line = in.nextInt();
		drawLine(line);

	}

}
