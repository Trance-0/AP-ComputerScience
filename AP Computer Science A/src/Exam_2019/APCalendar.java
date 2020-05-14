package Exam_2019;

public class APCalendar {
	/** Returns true if year is a leap year and false otherwise. */
	private static boolean isLeapYear(int year) {
		return false;
	}

	/**
	 * Returns the number of leap years between year1 and year2, inclusive.
	 * Precondition: 0 <= year1 <= year2
	 */
	public static int numberOfLeapYears(int year1, int year2) {
		int result = 0;
		while (year1 <= year2) {
			if (isLeapYear(year1)) {
				result++;
			}
			year1++;
		}
		return result;
	}

	/**
	 * Returns the value representing the day of the week for the first day of year,
	 * where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
	 */
	private static int firstDayOfYear(int year) {
		return 0;
	}

	/**
	 * Returns n, where month, day, and year specify the nth day of the year.
	 * Returns 1 for January 1 (month = 1, day = 1) of any year. Precondition: The
	 * date represented by month, day, year is a valid date.
	 */
	private static int dayOfYear(int month, int day, int year) {
		return 0;
	}

	/**
	 * Returns the value representing the day of the week for the given date (month,
	 * day, year), where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes
	 * Saturday. Precondition: The date represented by month, day, year is a valid
	 * date.
	 */
	public static int dayOfWeek(int month, int day, int year) {
		int dayOfYear=dayOfYear(month, day, year);
		int firstDayOfYear=firstDayOfYear(year) ;
		return dayOfYear%7+firstDayOfYear;
	}
	// There may be instance variables, constructors, and other methods not shown.
}
