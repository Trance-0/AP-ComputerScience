package Chapter6;

import java.util.Scanner;

import java.util.List;

import java.util.ArrayList;

public class getRandomIntListbeta {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		List org = new ArrayList();
		int sum = 101;
		for (int k = 1; k < sum; k++) {
			org.add(k);
		}
		System.out.print("How many intagers?");
		Scanner in = new Scanner(System.in);
		List list = new ArrayList();
		int length = in.nextInt()-1;
		for (int i = 0; i <length; i++) {
			int pla = (int) (Math.random() *(100-length));
			int p = (int) org.remove(pla);
			list.add(p);
		}
		int spe = 10;
		org.remove(spe - 1);
		int plac = (int) (Math.random() * length);
		list.add(plac, spe);
		System.out.println(list);

	}
}
