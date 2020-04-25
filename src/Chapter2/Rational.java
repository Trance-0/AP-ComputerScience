package Chapter2;

import java.util.Scanner;

public class Rational {
	private int numerator;
	private int denominator;

	Rational() {
		numerator = 0;
		denominator = 1;
	}

	Rational(int n) {
		numerator = n;
		denominator = 1;
	}

	Rational(int numer, int demon) {
		numerator = numer;
		denominator = demon;
	}

	int numerator() {
		return numerator;
	};

	int denominator() {
		return denominator;
	};

	public Rational plus(Rational r) {

		System.out.println("Please enter the new numerator.");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		System.out.println("Please enter the new denominator.");
		Scanner on = new Scanner(System.in);
		int b = in.nextInt();
		Rational h = new Rational(a, b);
		h.fixSigns();
		r.fixSigns();
		int demon = b * r.denominator;
		int numer = a * r.denominator + r.numerator * b;
		Rational rat = new Rational(numer, demon);
		rat.reduce();
		return rat;

	}

	public Rational minus(Rational r) {

		System.out.println("Please enter the new numerator.");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		System.out.println("Please enter the new denominator.");
		Scanner on = new Scanner(System.in);
		int b = in.nextInt();
		Rational h = new Rational(a, b);
		h.fixSigns();
		r.fixSigns();
		int demon = b * r.denominator;
		int numer = r.numerator * b - a * r.denominator;
		Rational rat = new Rational(numer, demon);
		rat.reduce();
		return rat;

	}

	public Rational multiply(Rational r) {

		System.out.println("Please enter the new numerator.");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		System.out.println("Please enter the new denominator.");
		Scanner on = new Scanner(System.in);
		int b = in.nextInt();
		Rational h = new Rational(a, b);
		h.fixSigns();
		r.fixSigns();
		int demon = b * r.denominator;
		int numer = a * r.numerator;
		Rational rat = new Rational(numer, demon);
		rat.reduce();
		return rat;

	}

	public Rational divide(Rational r) {

		System.out.println("Please enter the new numerator.");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		System.out.println("Please enter the new denominator.");
		Scanner on = new Scanner(System.in);
		int b = in.nextInt();
		Rational h = new Rational(a, b);
		h.fixSigns();
		r.fixSigns();
		int demon = a * r.denominator;
		int numer = b * r.numerator;
		Rational rat = new Rational(numer, demon);
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
