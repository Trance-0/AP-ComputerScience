package Chapter2;

import java.util.Scanner;

public class TestRational {

	public static void main(String[] args) {
		int i = 0;
		while (i < 1) {
			System.out.println("Please enter the numerator.");
			Scanner in = new Scanner(System.in);
			int a = in.nextInt();
			System.out.println("Please enter the denominator.");
			Scanner on = new Scanner(System.in);
			int b = in.nextInt();
			Rational h = new Rational(a, b);
			System.out.println(h);
			System.out.println("use + to plus");
			System.out.println("use - to minus");
			System.out.println("use x to time");
			System.out.println("use / to divide into");
			System.out.println("use others to quit");
			Scanner kn = new Scanner(System.in);
			String q = kn.nextLine();
			if (q.compareTo("+") == 0) {

				System.out.println(h.plus(h));
			} else if (q.compareTo("-") == 0) {

				System.out.println(h.minus(h));
			} else if (q.compareTo("x") == 0) {

				System.out.println(h.multiply(h));
			} else if (q.compareTo("/") == 0) {

				System.out.println(h.divide(h));
			} else {
				i++;
			}
		}
	}

}
