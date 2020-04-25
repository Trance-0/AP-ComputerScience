package info;

import java.util.Calendar;

import java.util.Date;

import java.util.Scanner;

public class Info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cl = Calendar.getInstance();
		Date dat = new Date();
		int yea = cl.get(Calendar.YEAR);
		String name="Alice";
				int age=yea-2004;
		        int className=1915;
				double height=169.5;
				int date=11;
				int month=10;
			    String school="Yali High School";
				System.out.println("My name is "+name);
			    System.out.println("I am "+age+"years old now.");
			    System.out.println("My birthday is "+month+"."+date+".");
			    System.out.println("Now the school I am reading is "+school+",");
			    System.out.println("class name is "+className+".");
			    System.out.println("I am "+height+"centimeters high.");		
			    System.out.println("May I get your name?");
			    Scanner in = new Scanner(System.in);
			    String UserName = in.nextLine();
			    System.out.println("Hello "+UserName+",nice to meet you.");
	} 

}
