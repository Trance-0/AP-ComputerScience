package info;

import java.util.Scanner;

public class RationalCalculateSystem {

		public static void rationalCalculateSystem() {
			int i = 0;
			while (i < 1) {
				System.out.println("Please enter the numerator.");
				Scanner in = new Scanner(System.in);
				int a = in.nextInt();
				System.out.println("Please enter the denominator.");
				Scanner on = new Scanner(System.in);
				int b = in.nextInt();
				RationalCalculateSystem h = new RationalCalculateSystem(a, b);
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


	private int numerator;
	private int denominator;

	RationalCalculateSystem() {
		numerator = 0;
		denominator = 1;
	}

	RationalCalculateSystem(int n) {
		numerator = n;
		denominator = 1;
	}

	RationalCalculateSystem(int numer, int demon) {
		numerator = numer;
		denominator = demon;
	}

	int numerator() {
		return numerator;
	};

	int denominator() {
		return denominator;
	};

	public RationalCalculateSystem plus(RationalCalculateSystem r) {

		System.out.println("Please enter the new numerator.");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		System.out.println("Please enter the new denominator.");
		Scanner on = new Scanner(System.in);
		int b = in.nextInt();
		RationalCalculateSystem h = new RationalCalculateSystem(a, b);
		h.fixSigns();
		r.fixSigns();
		int demon = b * r.denominator;
		int numer = a * r.denominator + r.numerator * b;
		RationalCalculateSystem rat = new RationalCalculateSystem(numer, demon);
		rat.reduce();
		return rat;

	}

	public RationalCalculateSystem minus(RationalCalculateSystem r) {

		System.out.println("Please enter the new numerator.");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		System.out.println("Please enter the new denominator.");
		Scanner on = new Scanner(System.in);
		int b = in.nextInt();
		RationalCalculateSystem h = new RationalCalculateSystem(a, b);
		h.fixSigns();
		r.fixSigns();
		int demon = b * r.denominator;
		int numer = r.numerator * b - a * r.denominator;
		RationalCalculateSystem rat = new RationalCalculateSystem(numer, demon);
		rat.reduce();
		return rat;

	}

	public RationalCalculateSystem multiply(RationalCalculateSystem r) {

		System.out.println("Please enter the new numerator.");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		System.out.println("Please enter the new denominator.");
		Scanner on = new Scanner(System.in);
		int b = in.nextInt();
		RationalCalculateSystem h = new RationalCalculateSystem(a, b);
		h.fixSigns();
		r.fixSigns();
		int demon = b * r.denominator;
		int numer = a * r.numerator;
		RationalCalculateSystem rat = new RationalCalculateSystem(numer, demon);
		rat.reduce();
		return rat;

	}

	public RationalCalculateSystem divide(RationalCalculateSystem r) {

		System.out.println("Please enter the new numerator.");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		System.out.println("Please enter the new denominator.");
		Scanner on = new Scanner(System.in);
		int b = in.nextInt();
		RationalCalculateSystem h = new RationalCalculateSystem(a, b);
		h.fixSigns();
		r.fixSigns();
		int demon = a * r.denominator;
		int numer = b * r.numerator;
		RationalCalculateSystem rat = new RationalCalculateSystem(numer, demon);
		rat.reduce();
		return rat;

	}

	private void reduce() {
		int min = 0;
		int greatCommonDivisor = 1;
		if (denominator > numerator) {
			min = numerator;
		} else {
			min = denominator;
		}
		for (int i = 2; i <= min; i++) {
			if (numerator % i == 0 && denominator % i == 0) {
				greatCommonDivisor = i;
			}
		}
		numerator /= greatCommonDivisor;
		denominator /= greatCommonDivisor;
	}

	private void fixSigns() {
		if (denominator < 0 && numerator < 0) {
			numerator = -numerator;
			denominator = -denominator;
		} else if (denominator == 0) {
			System.out.println("Invalid denominator");
		}

	}

	public String toString() {
		return numerator + "/" + denominator;
	}
}

