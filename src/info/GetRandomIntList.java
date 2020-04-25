package info;

import java.util.Scanner;

import java.util.List;

import java.util.ArrayList;

public class GetRandomIntList {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many subjects do you have?");
		Scanner on =new Scanner(System.in);
		List org = new ArrayList();
		int sum = on.nextInt();
		for (int k = 1; k <= sum; k++) {
			org.add(k);
		}
		System.out.print("How many intagers do you need?");
		Scanner in = new Scanner(System.in);
		List list = new ArrayList();
		int length = in.nextInt()-1;
		for (int i = 0; i <length; i++) {
			int pla = (int) (Math.random() *(sum-length));
			int p = (int) org.remove(pla);
			list.add(p);
		}
		System.out.print("Do you need some special order? Put y to add special order, n to get the answer.");
		Scanner kn = new Scanner(System.in);
		String order= kn.nextLine();
		if (order.compareTo("y") == 0) {
			System.out.println("Please tell me your special order.");
		Scanner hn = new Scanner(System.in);
			int spe =(int)hn.nextInt();
		   org.remove(spe - 1);
		   int plac = (int) (Math.random() * length);
		   list.add(plac, spe);
		}
		else if (order.compareTo("n") == 0) {
			int pla = (int) (Math.random() *(sum-length));
			int p = (int) org.remove(pla);
			list.add(p);
		}
		else {
			System.out.println("Put y to add special order, n to get the answer, start the program again please.");
		}
		System.out.println(list);

	}
}
