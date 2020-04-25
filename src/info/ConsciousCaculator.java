package info;

import java.util.Scanner;

public class ConsciousCaculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter your sleeping time today. by the format hh mm.");
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		Scanner on = new Scanner(System.in);
		int m = on.nextInt();
		int t = h * 60 + m;
		System.out.println("You have slept for "+t+" minutes today.");
		double i = Math.PI * t;
		//System.out.println(i);
		double ins = i / 720;
		//System.out.println(ins);
		double cs = Math.cos(ins);
		//System.out.println(cs);
		double css = -100*cs;
		String s=String.format("%.3f",css);
		System.out.println("The consious you have left is "+s+" .");
		if(css<-75) {
			System.out.println("Go back to sleep now!");
			System.out.println("You can't do anything in this circumstance.");
			System.out.println("***************************************");
			System.out.println("*            SYSTEM WARNING           *");
			System.out.println("*  ---------------------------------  *");
			System.out.println("*       CONSCIOUS LOWER THAN -75      *");
			System.out.println("***************************************");

		}
		else if(css<-50) {
			System.out.println("You need more sleep, at least 2 class or 1.5 hour!");
			System.out.println("***************************************");
			System.out.println("*            SYSTEM WARNING           *");
			System.out.println("*  ---------------------------------  *");
			System.out.println("*       CONSCIOUS LOWER THAN -50      *");
			System.out.println("***************************************");
		}
		else if(css<-30) {
			System.out.println("You need more sleep, at least 1 class or 1 hour!");
			System.out.println("Your conscious have droped to a danger level.");
			System.out.println("***************************************");
			System.out.println("*            SYSTEM WARNING           *");
			System.out.println("*  ---------------------------------  *");
			System.out.println("*       CONSCIOUS LOWER THAN -30      *");
			System.out.println("***************************************");
		}
		else if(css<-10) {
			System.out.println("You need more coffee to keep awake.");
		}
		else if(css<0) {
			System.out.println("You need some coffee to keep awake.");
		}
		else if(css<10) {
			System.out.println("Safe level");
		}
		else if(css<30) {
			System.out.println("You can be identified as NORMAL in this circumstance.");
			System.out.println("Go and do something cool.");
		}
		else if(css<50) {
			System.out.println("You can be identified as ADVANCED in this circumstance.");
			System.out.println("Go and do something meaningful.");
		}
		else if(css<75) {
			System.out.println("You can be identified as SUPREME in this circumstance.");
			System.out.println("Read more book at this moment, you won't be regret.");
		}
		else if(css<85) {
			System.out.println("Good morning, Eason!");
		}
	}

}
