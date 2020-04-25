package info;

import java.util.Scanner;

import java.util.Calendar;

import java.util.Date;

public class TimeSet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cl = Calendar.getInstance();
		Date date = new Date();
		int sec = cl.get(Calendar.SECOND);
		int min = cl.get(Calendar.MINUTE);
		int hod = cl.get(Calendar.HOUR_OF_DAY);
		int dow = cl.get(Calendar.DAY_OF_WEEK);
		int dom = cl.get(Calendar.DAY_OF_MONTH);
		int yea = cl.get(Calendar.YEAR);
		int mon = cl.get(Calendar.MONTH);

		System.out.println("Today is " + yea + "." + mon + "." + dom +  "  " + hod + ":" + min + ":" + sec);
		if (dom == 11 && mon == 10) {
			System.out.println("You forget to say some thing...");
			Scanner in=new Scanner(System.in);
			String answer =in.nextLine();
		}
		if (dom ==30 && mon == 3) {
			System.out.println("I forget to say some thing...");
			Scanner on=new Scanner(System.in);
			String answer1 =on.nextLine();
			System.out.println("Happy birth day,Trance.");
			Scanner kn=new Scanner(System.in);
			String answer2 =kn.nextLine();
		}
		if (hod>=23&&dow<=4) {
			System.out.println("It is time for sleep now. You need to have class tomorrow.");
	}
	else if (hod>=23&&dow>4) {
		System.out.println("It is "+hod + ":" + min + ":" + sec+" now, time fo sleep, unless you are crazy. ");
}
	else if (hod>=12&&dow<=5) {
		System.out.println("How dare you are to bring computer to school?");
}
	else if (hod>=6&&dow>5) {
		System.out.println("Good morning!");
	}
		else if (hod>=6&&dow<=5) {
			System.out.println("Why you are playing computer here?");
		}
			else if (hod>=7&&dow>5) {
				System.out.println("Don't disturb me please,let me have a sleep......");
			}
			else if (hod<6&&dow<=5) {
				System.out.println("What ?!");
			}
				else if (hod<7&&dow>5) {
					System.out.println("You should have a better sleep.");
				}
}
}
