package Chapter6;

import java.util.Scanner;

import java.util.List;

import java.util.ArrayList;

public class getRandomIntListalpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("How many intagers?");
		Scanner in = new Scanner(System.in);
		List list = new ArrayList();
		int length = in.nextInt();

//for (int i;i<101;i++) {
		// list.add(i);
//}
		int spen = 1;
		int spe = 10;
		int pla = (int) (Math.random() * (length + 1));
 
		for (int i = 0; i < (length - 1); i++) {
			int newNum = (int) (Math.random() * 101);
			if(newNum!=spe) {
				list.add(newNum);
			}
			else if(newNum==spe) {
				int corret = (int) (Math.random() * 101);
			}
			
		}
		list.add(pla, spe);
		System.out.println(list);

	}

}
