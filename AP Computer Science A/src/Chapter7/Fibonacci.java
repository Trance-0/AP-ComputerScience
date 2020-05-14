package Chapter7;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Fibonacci {
public static long fibonacci(long n) {
	if(n<=2) {
		return 1;
	}
	else {
		return fibonacci(n-1)+fibonacci(n-2);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
	long i=in.nextInt();
	Calendar cl = Calendar.getInstance();
	Date date1 = new Date();
	int sec1 = cl.get(Calendar.SECOND);
	int min1 = cl.get(Calendar.MINUTE);
	int hod1 = cl.get(Calendar.HOUR_OF_DAY);
	System.out.println("Time starts now ");
System.out.println(fibonacci(i));
		Calendar cl1 = Calendar.getInstance();
		Date date2 = new Date();
		int sec2 = cl1.get(Calendar.SECOND);
		int min2 = cl1.get(Calendar.MINUTE);
		int hod2 = cl1.get(Calendar.HOUR_OF_DAY);
		int sec = 0;
		int min = 0;
		int hod = 0;
		int sec3 = sec2 - sec1;
		int min3 = min2 - min1;
		int hod3 = hod2 - hod1;

		if (hod3 >= 0) {
			hod = hod3;
		} else {
			hod = 24 + hod3;
		}

		if (min3 >= 0) {
			min = min3;
		} else {
			min = 60 + min3;
			hod = hod3 - 1;
		}

		if (sec3 >= 0) {
			sec = sec3;
		} else {
			sec = 60 + sec3;
			min = min3 - 1;
		}
		System.out.println("The time cost is " + hod + ":" + min + ":" + sec);
		
	}

}
