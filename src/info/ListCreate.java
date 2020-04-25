package info;

import java.util.Scanner;

import java.util.List;

import java.util.ArrayList;

public class ListCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		System.out.println("Start from?");
		Scanner qn = new Scanner(System.in);
		int sta = qn.nextInt();
		System.out.println("End in?");
		Scanner kn = new Scanner(System.in);			
		int end = kn.nextInt();	
		System.out.println("How much is the difference?");
		Scanner in = new Scanner(System.in);
		int dif = in.nextInt();
int num=end-sta;
        int i=0;
		while (i<=num) {
			  int pn=sta+dif*i;
			  list.add(i,pn);
			  i++;

		}
		System.out.println(list);
	}

}
