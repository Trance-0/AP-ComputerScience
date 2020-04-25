package Chapter2;

public class Date {
	private int year;
	private int month;
	private int day;

	public Date(int year, int month, int day) {
		// TODO Auto-generated method stub
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getDay(int day) {
		return day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getMonth(int month) {
		return month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear(int year) {
		return year;
	}

	private boolean isLeafYear() {
		return this.year % 4 == 0 && this.year % 100 != 0 || this.year % 400 == 0;
	}

	public boolean isEuqals(Date d) {
		return this.year == d.year && this.month == d.month && this.day == d.day;
	}

	public void changeDay() {
		if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8
				|| this.month == 10) {
			if (day < 31)
				day++;
			else {
				day = 1;
				month++;
			}
		} else if (this.month == 12) {
			if (day < 31) {
				day++;
			} else {
				day = 1;
				month = 1;
				year++;
			}
		} else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
			if (day < 30) {
				day++;
			} else {
				day = 1;
				month++;
			}
		} else if (this.month == 2) {
			int k=28;
			if (isLeafYear()) {
				k++;
			} 
			if (day < k) {
				day++;
			}
			else {
					day = 1;
					month++;
			}

		}
	}

	public String toString() {
		return year + "-" + month + "-" + day;

	}
}
