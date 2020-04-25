package info;

import java.util.Calendar;

import java.util.Date;

import java.util.Scanner;

public class LanguageSystemAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String UserName="Trance";
System.out.println("Welcome to language system, the most hard system in this stupid program.");
System.out.println("Tell me the times you want to try.");
Scanner an =new Scanner(System.in);
int times= an.nextInt();
System.out.println("Time starts now.");
for (int i =0; i<=times; i++) {
	Scanner bn =new Scanner(System.in);
	String input1= bn.nextLine();
	if(input1.compareTo("Good night!")==0) {
		System.out.println("Good night!"+UserName+".");
	}
	else if(input1.compareTo("What day is it today?")==0) {
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
			Scanner cn=new Scanner(System.in);
			String answer =cn.nextLine();
		}
		if (dom ==30 && mon == 3) {
			System.out.println("I forget to say some thing...");
			Scanner dn=new Scanner(System.in);
			String answer1 =dn.nextLine();
			System.out.println("Happy birth day,Trance.");
			Scanner en=new Scanner(System.in);
			String answer2 =en.nextLine();
		}
		if (hod>=22&&dow<=4) {
			System.out.println("It is time for sleep now. You need to have class tomorrow.");
	}
	else if (hod>=22&&dow>4) {
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
	else {
		System.out.println("Sorry, I can't understand you, may I get your code?");
		System.out.println("Inter the answer that you like.");
		Scanner zn =new Scanner(System.in);
		String input2= zn.nextLine();
		System.out.println("if(input1).compareTo(\""+input1+"\")==0){");
		System.out.println("System.out.println(\""+input2+"\");");
		System.out.println("}");
		
		
	}
}
	}

}
