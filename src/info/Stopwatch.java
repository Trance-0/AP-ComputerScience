package info;

import java.util.Scanner;

import java.util.Calendar;

import java.util.Date;

public class Stopwatch {

	public static void main(String[] args)  throws InterruptedException{
		// TODO Auto-generated method stub
		System.out.println("Welcome to use Stop Watch.");
		System.out.println("Press enter to start.");
		Scanner in = new Scanner(System.in);
		String answer1 = in.nextLine();
		if (answer1.compareTo("") == 0) {
			Calendar cl = Calendar.getInstance();
			Date date1 = new Date();
			int sec1 = cl.get(Calendar.SECOND);
			int min1 = cl.get(Calendar.MINUTE);
			int hod1 = cl.get(Calendar.HOUR_OF_DAY);
			System.out.println("Time starts now " + hod1 + ":" + min1 + ":" + sec1);
			Scanner in1 = new Scanner(System.in);
			String answer2 = in1.nextLine();
			if (answer2.compareTo("") == 0) {
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
				System.out.println("The time is " + hod + ":" + min + ":" + sec);
			}
		}
		else if(answer1.compareTo("Hide")==0) {
			System.out.print(" and seek.");
			System.out.println("");
			Scanner in2 =new Scanner(System.in);
			String Song2= in2.nextLine();
			if (Song2.compareTo("Reason")==0) {
				System.out.print(" and rhyme.");
				System.out.println("");
				Scanner in3 =new Scanner(System.in);
				String Song3= in3.nextLine();
				if (Song3.compareTo("Grand")==0) {
					System.out.print(" and glorious.");
					System.out.println("");
					Scanner in4 =new Scanner(System.in);
					String Song4= in4.nextLine();
					if (Song4.compareTo("Living")==0) {
						System.out.print(" the dream.");
						System.out.println("");
						Scanner in5 =new Scanner(System.in);
						String Song5= in5.nextLine();
						if (Song5.compareTo("Yours")==0) {
							System.out.print(" and mine.");
							System.out.println("");
							Thread.sleep(1000*1);
							System.out.println(" EUPHORIA.");
							Thread.sleep(1000*3);
							System.out.println("//That was a long way to go.");
							Thread.sleep(1000*1);
							System.out.println("//And a long memories...");
							Thread.sleep(1000*3);
							System.out.println("//In a fall of 2010.");
							Thread.sleep(1000*1);
							System.out.println("//They met in a classroom.");
							Thread.sleep(1000*1);
							System.out.println("//A child who floating on the sea of life.");
							Thread.sleep(1000*1);
							System.out.println("//Opend a window at that moument.");
							Thread.sleep(1000*1);
							System.out.println("//She was a lighthouse.");
							Thread.sleep(1000*1);
							System.out.println("//Give the lost soul, an aim, a light.");
							Thread.sleep(1000*2);
							System.out.println("//The child kept learning, wanted to reach her.");
							Thread.sleep(1000*1);
							System.out.println("//They learn painting together.");
							Thread.sleep(1000*1);
							System.out.println("//They study Chinese together.");
							Thread.sleep(1000*1);
							System.out.println("//They live in the same classroom.");
							Thread.sleep(1000*1);
							System.out.println("//For 9 years.");
							Thread.sleep(1000*1);
							System.out.println("//Even though the girl never know him.");
							Thread.sleep(1000*1);
							System.out.println("//Even though the boy never said any words with her.");
							Thread.sleep(1000*1);
							System.out.println("//Because he didn't know how to talk to her.");
							Thread.sleep(1000*1);
							System.out.println("//He is dare to give public speech infront of hole class.");
							Thread.sleep(1000*1);
							System.out.println("//He is dare to join every difficult activities.");
							Thread.sleep(1000*1);
							System.out.println("//He is dare to challenge everything.");
							Thread.sleep(1000*2);
							System.out.println("//Thus, he is afraid to talk with her.");
							Thread.sleep(1000*1);
							System.out.println("//Till the end of the junior high school,");
							Thread.sleep(1000*1);
							System.out.println("//the girl asked him about a history question.");
							Thread.sleep(1000*1);
							System.out.println("//It was the first time she talked to him.");
							Thread.sleep(1000*2);
							System.out.println("//At the summer of 2019, The high school entrance exam.");
							Thread.sleep(1000*1);
							System.out.println("//He missed.");
							Thread.sleep(1000*1);
							System.out.println("//In order to see her,");
							Thread.sleep(1000*1);
							System.out.println("//He joined the international department of the high school that she was in.");
							Thread.sleep(1000*1);
							System.out.println("//Now he can have chance to see her.");
							Thread.sleep(1000*1);
							System.out.println("//But how long he can have.");
							Thread.sleep(1000*1);
							System.out.println("//We don't know.");
							Thread.sleep(1000*2);
							System.out.println("//He don't know, either.");
						}
						else {
							System.out.print("System error:1011.");
						}
					}
					else {
						System.out.print("System error:4.");
					}
				}
				else {
					System.out.print("System error:03.");
				}
			}
			else {
				System.out.print("System error:61.");
			}
		}
		else {
			System.out.print("System error:11.");
		}
	}

}
