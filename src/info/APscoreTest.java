package info;

import java.util.Scanner;

import info.Info;

public class APscoreTest {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
     System.out.println("What's your AP score?");
		Scanner on=new Scanner(System.in);
		System.out.println("So,how much you get in choice?");
		int choice=on.nextInt(); 
		System.out.println("And, free?");
		int free=on.nextInt();
		double score=(choice+free)*1.11;
		if(score>=62)
		System.out.println("Wow, you did a great job! You will get 5 score!");
		else if(score>=47)
		System.out.println("Well,not bad, you will get 4 in this subject.");
		else if(score>=37)
		System.out.println("Review, and try again!");
		else if(score>=29)
		System.out.println("How did you do that?");
		else 
			System.out.println("Wow, garbage!");
	}

}
