package Chapter1;

import java.util.Scanner;

public class ApScore {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int choice=in.nextInt(); 
		int free=in.nextInt();
		double score=(choice+free)*1.11;
		if(score>=62)
		System.out.println(5);
		else if(score>=47)
		System.out.println(4);
		else if(score>=37)
		System.out.println(3);
		else if(score>=29)
		System.out.println(2);
		else 
			System.out.println(1);
	}

}
