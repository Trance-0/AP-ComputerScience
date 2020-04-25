package info;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class CryptographySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> key = new ArrayList<Integer>();
		key.add(0, 0);
		key.add(1, 1);
		key.add(2, 2);
		key.add(3, 3);
		key.add(4, 4);
		key.add(5, 5);
		key.add(6, 6);
		key.add(7, 7);
		key.add(8, 8);
		key.add(9, 9);
		key.add(10, 10);
		key.add(11, 11);
		key.add(12, 12);
		key.add(13, 13);
		key.add(14, 14);
		key.add(15, 15);
		key.add(16, 16);
		key.add(17, 17);
		key.add(18, 18);
		key.add(19, 19);
		key.add(20, 20);
		key.add(21, 21);
		key.add(22, 22);
		key.add(23, 23);
		key.add(24, 24);
		key.add(25, 25);
		key.add(26, 26);
		key.add(27, 27);
		key.add(28, 28);
		key.add(29, 29);
		key.add(30, 30);
		key.add(31, 31);
		key.add(32, 32);
		key.add(33, 33);
		key.add(34, 34);
		key.add(35, 35);
		key.add(36, 36);
		key.add(37, 37);
		key.add(38, 38);
		key.add(39, 39);
		key.add(40, 40);
		key.add(41, 41);
		key.add(42, 42);
		key.add(43, 43);
		key.add(44, 44);
		key.add(45, 45);
		key.add(46, 46);
		key.add(47, 47);
		key.add(48, 48);
		key.add(49, 49);
		key.add(50, 50);
		key.add(51, 51);
		key.add(52, -1);
		
		List<Integer> character = new ArrayList<Integer>();
		List<Integer> index = new ArrayList<Integer>();
		int p1 = 0;//hour
		int p2 = 0;//day of week
		int p3 = 0;//day of month
		int p4 = index.get(1);//1
		int p5 = index.get(2);//2
		int p6 = index.get(3);//3
		int p7 = index.get(4);//4
		int p8 = index.get(5);//5
		int p9 = index.get(6);//1
		int p10 = index.get(7);//2
		int p11 = index.get(8);//3
		int p12 = index.get(9);//4
		int p13 = index.get(10);//5
		int p14 = index.get(11);//1
		int p15 = index.get(12);//2
		int p16 = index.get(13);//3
		int p17 = index.get(14);//4
		int p18 = index.get(15);//5
		int p19 = 0;//spe1
		int p20 = 0;//spe2
		int p21 = 0;//spe3
		int p22 = 0;//spe4
		System.out.println("Encryption or Decryption?");
		System.out.println("Encryption enter \"E\"");
		System.out.println("Decryption enter \"D\"");
		Scanner n = new Scanner(System.in);
		String sta = n.nextLine();
		if (sta.compareTo("en") == 0) {
			Calendar cl = Calendar.getInstance();
			Date date = new Date();
			p1 = cl.get(Calendar.HOUR_OF_DAY);
			p2 = cl.get(Calendar.DAY_OF_WEEK);
			p3 = cl.get(Calendar.DAY_OF_MONTH);
			System.out.println("Enter the user name. end in 15 words,use \"!\" to express space. ");
			Scanner an = new Scanner(System.in);
			String in1 = an.nextLine();
			if (in1.compareTo("A") == 0) {
				Integer intOb = key.get(0);
				int a = key.get(0);
				index.add(a);
			} else if (in1.compareTo("a") == 0) {
				Integer intOb = key.get(1);
				int a = key.get(1);
				index.add(a);
			} else if (in1.compareTo("B") == 0) {
				Integer intOb = key.get(2);
				int a = key.get(2);
				index.add(a);
			} else if (in1.compareTo("a") == 0) {
				Integer intOb = key.get(3);
				int a = key.get(3);
				index.add(a);
			} else if (in1.compareTo("C") == 0) {
				Integer intOb = key.get(4);
				int a = key.get(4);
				index.add(a);
			} else if (in1.compareTo("c") == 0) {
				Integer intOb = key.get(5);
				int a = key.get(5);
				index.add(a);
			} else if (in1.compareTo("D") == 0) {
				Integer intOb = key.get(6);
				int a = key.get(6);
				index.add(a);
			} else if (in1.compareTo("d") == 0) {
				Integer intOb = key.get(7);
				int a = key.get(7);
				index.add(a);
			} else if (in1.compareTo("E") == 0) {
				Integer intOb = key.get(8);
				int a = key.get(8);
				index.add(a);
			} else if (in1.compareTo("e") == 0) {
				Integer intOb = key.get(9);
				int a = key.get(9);
				index.add(a);
			} else if (in1.compareTo("F") == 0) {
				Integer intOb = key.get(10);
				int a = key.get(10);
				index.add(a);
			} else if (in1.compareTo("f") == 0) {
				Integer intOb = key.get(11);
				int a = key.get(11);
				index.add(a);
			} else if (in1.compareTo("G") == 0) {
				Integer intOb = key.get(12);
				int a = key.get(12);
				index.add(a);
			} else if (in1.compareTo("g") == 0) {
				Integer intOb = key.get(13);
				int a = key.get(13);
				index.add(a);
			} else if (in1.compareTo("H") == 0) {
				Integer intOb = key.get(14);
				int a = key.get(14);
				index.add(a);
			} else if (in1.compareTo("h") == 0) {
				Integer intOb = key.get(15);
				int a = key.get(15);
				index.add(a);
			} else if (in1.compareTo("I") == 0) {
				Integer intOb = key.get(16);
				int a = key.get(16);
				index.add(a);
			} else if (in1.compareTo("i") == 0) {
				Integer intOb = key.get(17);
				int a = key.get(17);
				index.add(a);
			} else if (in1.compareTo("J") == 0) {
				Integer intOb = key.get(18);
				int a = key.get(18);
				index.add(a);
			} else if (in1.compareTo("j") == 0) {
				Integer intOb = key.get(19);
				int a = key.get(19);
				index.add(a);
			} else if (in1.compareTo("K") == 0) {
				Integer intOb = key.get(20);
				int a = key.get(20);
				index.add(a);
			} else if (in1.compareTo("k") == 0) {
				Integer intOb = key.get(21);
				int a = key.get(21);
				index.add(a);
			} else if (in1.compareTo("L") == 0) {
				Integer intOb = key.get(22);
				int a = key.get(22);
				index.add(a);
			} else if (in1.compareTo("l") == 0) {
				Integer intOb = key.get(23);
				int a = key.get(23);
				index.add(a);
			} else if (in1.compareTo("M") == 0) {
				Integer intOb = key.get(24);
				int a = key.get(24);
				index.add(a);
			} else if (in1.compareTo("m") == 0) {
				Integer intOb = key.get(25);
				int a = key.get(25);
				index.add(a);
			} else if (in1.compareTo("N") == 0) {
				Integer intOb = key.get(26);
				int a = key.get(26);
				index.add(a);
			} else if (in1.compareTo("n") == 0) {
				Integer intOb = key.get(27);
				int a = key.get(27);
				index.add(a);
			} else if (in1.compareTo("O") == 0) {
				Integer intOb = key.get(28);
				int a = key.get(28);
				index.add(a);
			} else if (in1.compareTo("o") == 0) {
				Integer intOb = key.get(29);
				int a = key.get(29);
				index.add(a);
			} else if (in1.compareTo("P") == 0) {
				Integer intOb = key.get(30);
				int a = key.get(30);
				index.add(a);
			} else if (in1.compareTo("p") == 0) {
				Integer intOb = key.get(31);
				int a = key.get(31);
				index.add(a);
			} else if (in1.compareTo("Q") == 0) {
				Integer intOb = key.get(32);
				int a = key.get(32);
				index.add(a);
			} else if (in1.compareTo("q") == 0) {
				Integer intOb = key.get(33);
				int a = key.get(33);
				index.add(a);
			} else if (in1.compareTo("R") == 0) {
				Integer intOb = key.get(34);
				int a = key.get(34);
				index.add(a);
			} else if (in1.compareTo("r") == 0) {
				Integer intOb = key.get(35);
				int a = key.get(35);
				index.add(a);
			} else if (in1.compareTo("S") == 0) {
				Integer intOb = key.get(36);
				int a = key.get(36);
				index.add(a);
			} else if (in1.compareTo("s") == 0) {
				Integer intOb = key.get(37);
				int a = key.get(37);
				index.add(a);
			} else if (in1.compareTo("T") == 0) {
				Integer intOb = key.get(38);
				int a = key.get(38);
				index.add(a);
			} else if (in1.compareTo("t") == 0) {
				Integer intOb = key.get(39);
				int a = key.get(39);
				index.add(a);
			} else if (in1.compareTo("U") == 0) {
				Integer intOb = key.get(40);
				int a = key.get(40);
				index.add(a);
			} else if (in1.compareTo("u") == 0) {
				Integer intOb = key.get(41);
				int a = key.get(41);
				index.add(a);
			} else if (in1.compareTo("V") == 0) {
				Integer intOb = key.get(42);
				int a = key.get(42);
				index.add(a);
			} else if (in1.compareTo("v") == 0) {
				Integer intOb = key.get(43);
				int a = key.get(43);
				index.add(a);
			} else if (in1.compareTo("W") == 0) {
				Integer intOb = key.get(44);
				int a = key.get(44);
				index.add(a);
			} else if (in1.compareTo("w") == 0) {
				Integer intOb = key.get(45);
				int a = key.get(45);
				index.add(a);
			} else if (in1.compareTo("X") == 0) {
				Integer intOb = key.get(46);
				int a = key.get(46);
				index.add(a);
			} else if (in1.compareTo("x") == 0) {
				Integer intOb = key.get(47);
				int a = key.get(47);
				index.add(a);
			} else if (in1.compareTo("Y") == 0) {
				Integer intOb = key.get(48);
				int a = key.get(48);
				index.add(a);
			} else if (in1.compareTo("y") == 0) {
				Integer intOb = key.get(49);
				int a = key.get(49);
				index.add(a);
			} else if (in1.compareTo("Z") == 0) {
				Integer intOb = key.get(50);
				int a = key.get(50);
				index.add(a);
			} else if (in1.compareTo("z") == 0) {
				Integer intOb = key.get(51);
				int a = key.get(51);
				index.add(a);
			} else if (in1.compareTo("!") == 0) {
				Integer intOb = key.get(52);
				int a = key.get(52);
				index.add(a);
			} else {
				System.out.println("Error!");
			}
			Scanner bn = new Scanner(System.in);
			String in2 = bn.nextLine();
			if (in2.compareTo("A") == 0) {
				Integer intOb = key.get(0);
				int a = key.get(0);
				p5 = p5 + a;
			} else if (in2.compareTo("a") == 0) {
				Integer intOb = key.get(1);
				int a = key.get(1);
				p5 = p5 + a;
			} else if (in2.compareTo("B") == 0) {
				Integer intOb = key.get(2);
				int a = key.get(2);
				p5 = p5 + a;
			} else if (in2.compareTo("a") == 0) {
				Integer intOb = key.get(3);
				int a = key.get(3);
				p5 = p5 + a;
			} else if (in2.compareTo("C") == 0) {
				Integer intOb = key.get(4);
				int a = key.get(4);
				p5 = p5 + a;
			} else if (in2.compareTo("c") == 0) {
				Integer intOb = key.get(5);
				int a = key.get(5);
				p5 = p5 + a;
			} else if (in2.compareTo("D") == 0) {
				Integer intOb = key.get(6);
				int a = key.get(6);
				p5 = p5 + a;
			} else if (in2.compareTo("d") == 0) {
				Integer intOb = key.get(7);
				int a = key.get(7);
				p5 = p5 + a;
			} else if (in2.compareTo("E") == 0) {
				Integer intOb = key.get(8);
				int a = key.get(8);
				p5 = p5 + a;
			} else if (in2.compareTo("e") == 0) {
				Integer intOb = key.get(9);
				int a = key.get(9);
				p5 = p5 + a;
			} else if (in2.compareTo("F") == 0) {
				Integer intOb = key.get(10);
				int a = key.get(10);
				p5 = p5 + a;
			} else if (in2.compareTo("f") == 0) {
				Integer intOb = key.get(11);
				int a = key.get(11);
				p5 = p5 + a;
			} else if (in2.compareTo("G") == 0) {
				Integer intOb = key.get(12);
				int a = key.get(12);
				p5 = p5 + a;
			} else if (in2.compareTo("g") == 0) {
				Integer intOb = key.get(13);
				int a = key.get(13);
				p5 = p5 + a;
			} else if (in2.compareTo("H") == 0) {
				Integer intOb = key.get(14);
				int a = key.get(14);
				p5 = p5 + a;
			} else if (in2.compareTo("h") == 0) {
				Integer intOb = key.get(15);
				int a = key.get(15);
				p5 = p5 + a;
			} else if (in2.compareTo("I") == 0) {
				Integer intOb = key.get(16);
				int a = key.get(16);
				p5 = p5 + a;
			} else if (in2.compareTo("i") == 0) {
				Integer intOb = key.get(17);
				int a = key.get(17);
				p5 = p5 + a;
			} else if (in2.compareTo("J") == 0) {
				Integer intOb = key.get(18);
				int a = key.get(18);
				p5 = p5 + a;
			} else if (in2.compareTo("j") == 0) {
				Integer intOb = key.get(19);
				int a = key.get(19);
				p5 = p5 + a;
			} else if (in2.compareTo("K") == 0) {
				Integer intOb = key.get(20);
				int a = key.get(20);
				p5 = p5 + a;
			} else if (in2.compareTo("k") == 0) {
				Integer intOb = key.get(21);
				int a = key.get(21);
				p5 = p5 + a;
			} else if (in2.compareTo("L") == 0) {
				Integer intOb = key.get(22);
				int a = key.get(22);
				p5 = p5 + a;
			} else if (in2.compareTo("l") == 0) {
				Integer intOb = key.get(23);
				int a = key.get(23);
				p5 = p5 + a;
			} else if (in2.compareTo("M") == 0) {
				Integer intOb = key.get(24);
				int a = key.get(24);
				p5 = p5 + a;
			} else if (in2.compareTo("m") == 0) {
				Integer intOb = key.get(25);
				int a = key.get(25);
				p5 = p5 + a;
			} else if (in2.compareTo("N") == 0) {
				Integer intOb = key.get(26);
				int a = key.get(26);
				p5 = p5 + a;
			} else if (in2.compareTo("n") == 0) {
				Integer intOb = key.get(27);
				int a = key.get(27);
				p5 = p5 + a;
			} else if (in2.compareTo("O") == 0) {
				Integer intOb = key.get(28);
				int a = key.get(28);
				p5 = p5 + a;
			} else if (in2.compareTo("o") == 0) {
				Integer intOb = key.get(29);
				int a = key.get(29);
				p5 = p5 + a;
			} else if (in2.compareTo("P") == 0) {
				Integer intOb = key.get(30);
				int a = key.get(30);
				p5 = p5 + a;
			} else if (in2.compareTo("p") == 0) {
				Integer intOb = key.get(31);
				int a = key.get(31);
				p5 = p5 + a;
			} else if (in2.compareTo("Q") == 0) {
				Integer intOb = key.get(32);
				int a = key.get(32);
				p5 = p5 + a;
			} else if (in2.compareTo("q") == 0) {
				Integer intOb = key.get(33);
				int a = key.get(33);
				p5 = p5 + a;
			} else if (in2.compareTo("R") == 0) {
				Integer intOb = key.get(34);
				int a = key.get(34);
				p5 = p5 + a;
			} else if (in2.compareTo("r") == 0) {
				Integer intOb = key.get(35);
				int a = key.get(35);
				p5 = p5 + a;
			} else if (in2.compareTo("S") == 0) {
				Integer intOb = key.get(36);
				int a = key.get(36);
				p5 = p5 + a;
			} else if (in2.compareTo("s") == 0) {
				Integer intOb = key.get(37);
				int a = key.get(37);
				p5 = p5 + a;
			} else if (in2.compareTo("T") == 0) {
				Integer intOb = key.get(38);
				int a = key.get(38);
				p5 = p5 + a;
			} else if (in2.compareTo("t") == 0) {
				Integer intOb = key.get(39);
				int a = key.get(39);
				p5 = p5 + a;
			} else if (in2.compareTo("U") == 0) {
				Integer intOb = key.get(40);
				int a = key.get(40);
				p5 = p5 + a;
			} else if (in2.compareTo("u") == 0) {
				Integer intOb = key.get(41);
				int a = key.get(41);
				p5 = p5 + a;
			} else if (in2.compareTo("V") == 0) {
				Integer intOb = key.get(42);
				int a = key.get(42);
				p5 = p5 + a;
			} else if (in2.compareTo("v") == 0) {
				Integer intOb = key.get(43);
				int a = key.get(43);
				p5 = p5 + a;
			} else if (in2.compareTo("W") == 0) {
				Integer intOb = key.get(44);
				int a = key.get(44);
				p5 = p5 + a;
			} else if (in2.compareTo("w") == 0) {
				Integer intOb = key.get(45);
				int a = key.get(45);
				p5 = p5 + a;
			} else if (in2.compareTo("X") == 0) {
				Integer intOb = key.get(46);
				int a = key.get(46);
				p5 = p5 + a;
			} else if (in2.compareTo("x") == 0) {
				Integer intOb = key.get(47);
				int a = key.get(47);
				p5 = p5 + a;
			} else if (in2.compareTo("Y") == 0) {
				Integer intOb = key.get(48);
				int a = key.get(48);
				p5 = p5 + a;
			} else if (in2.compareTo("y") == 0) {
				Integer intOb = key.get(49);
				int a = key.get(49);
				p5 = p5 + a;
			} else if (in2.compareTo("Z") == 0) {
				Integer intOb = key.get(50);
				int a = key.get(50);
				p5 = p5 + a;
			} else if (in2.compareTo("z") == 0) {
				Integer intOb = key.get(51);
				int a = key.get(51);
				p5 = p5 + a;
			} else if (in2.compareTo("!") == 0) {
				Integer intOb = key.get(52);
				int a = key.get(52);
				p5 = p5 + a;
			} else {
				System.out.println("Error!");
			}
			Scanner cn = new Scanner(System.in);
			String in3 = cn.nextLine();
			if (in3.compareTo("A") == 0) {
				Integer intOb = key.get(0);
				int a = key.get(0);
				p6 = p6 + a;
			} else if (in3.compareTo("a") == 0) {
				Integer intOb = key.get(1);
				int a = key.get(1);
				p6 = p6 + a;
			} else if (in3.compareTo("B") == 0) {
				Integer intOb = key.get(2);
				int a = key.get(2);
				p6 = p6 + a;
			} else if (in3.compareTo("a") == 0) {
				Integer intOb = key.get(3);
				int a = key.get(3);
				p6 = p6 + a;
			} else if (in3.compareTo("C") == 0) {
				Integer intOb = key.get(4);
				int a = key.get(4);
				p6 = p6 + a;
			} else if (in3.compareTo("c") == 0) {
				Integer intOb = key.get(5);
				int a = key.get(5);
				p6 = p6 + a;
			} else if (in3.compareTo("D") == 0) {
				Integer intOb = key.get(6);
				int a = key.get(6);
				p6 = p6 + a;
			} else if (in3.compareTo("d") == 0) {
				Integer intOb = key.get(7);
				int a = key.get(7);
				p6 = p6 + a;
			} else if (in3.compareTo("E") == 0) {
				Integer intOb = key.get(8);
				int a = key.get(8);
				p6 = p6 + a;
			} else if (in3.compareTo("e") == 0) {
				Integer intOb = key.get(9);
				int a = key.get(9);
				p6 = p6 + a;
			} else if (in3.compareTo("F") == 0) {
				Integer intOb = key.get(10);
				int a = key.get(10);
				p6 = p6 + a;
			} else if (in3.compareTo("f") == 0) {
				Integer intOb = key.get(11);
				int a = key.get(11);
				p6 = p6 + a;
			} else if (in3.compareTo("G") == 0) {
				Integer intOb = key.get(12);
				int a = key.get(12);
				p6 = p6 + a;
			} else if (in3.compareTo("g") == 0) {
				Integer intOb = key.get(13);
				int a = key.get(13);
				p6 = p6 + a;
			} else if (in3.compareTo("H") == 0) {
				Integer intOb = key.get(14);
				int a = key.get(14);
				p6 = p6 + a;
			} else if (in3.compareTo("h") == 0) {
				Integer intOb = key.get(15);
				int a = key.get(15);
				p6 = p6 + a;
			} else if (in3.compareTo("I") == 0) {
				Integer intOb = key.get(16);
				int a = key.get(16);
				p6 = p6 + a;
			} else if (in3.compareTo("i") == 0) {
				Integer intOb = key.get(17);
				int a = key.get(17);
				p6 = p6 + a;
			} else if (in3.compareTo("J") == 0) {
				Integer intOb = key.get(18);
				int a = key.get(18);
				p6 = p6 + a;
			} else if (in3.compareTo("j") == 0) {
				Integer intOb = key.get(19);
				int a = key.get(19);
				p6 = p6 + a;
			} else if (in3.compareTo("K") == 0) {
				Integer intOb = key.get(20);
				int a = key.get(20);
				p6 = p6 + a;
			} else if (in3.compareTo("k") == 0) {
				Integer intOb = key.get(21);
				int a = key.get(21);
				p6 = p6 + a;
			} else if (in3.compareTo("L") == 0) {
				Integer intOb = key.get(22);
				int a = key.get(22);
				p6 = p6 + a;
			} else if (in3.compareTo("l") == 0) {
				Integer intOb = key.get(23);
				int a = key.get(23);
				p6 = p6 + a;
			} else if (in3.compareTo("M") == 0) {
				Integer intOb = key.get(24);
				int a = key.get(24);
				p6 = p6 + a;
			} else if (in3.compareTo("m") == 0) {
				Integer intOb = key.get(25);
				int a = key.get(25);
				p6 = p6 + a;
			} else if (in3.compareTo("N") == 0) {
				Integer intOb = key.get(26);
				int a = key.get(26);
				p6 = p6 + a;
			} else if (in3.compareTo("n") == 0) {
				Integer intOb = key.get(27);
				int a = key.get(27);
				p6 = p6 + a;
			} else if (in3.compareTo("O") == 0) {
				Integer intOb = key.get(28);
				int a = key.get(28);
				p6 = p6 + a;
			} else if (in3.compareTo("o") == 0) {
				Integer intOb = key.get(29);
				int a = key.get(29);
				p6 = p6 + a;
			} else if (in3.compareTo("P") == 0) {
				Integer intOb = key.get(30);
				int a = key.get(30);
				p6 = p6 + a;
			} else if (in3.compareTo("p") == 0) {
				Integer intOb = key.get(31);
				int a = key.get(31);
				p6 = p6 + a;
			} else if (in3.compareTo("Q") == 0) {
				Integer intOb = key.get(32);
				int a = key.get(32);
				p6 = p6 + a;
			} else if (in3.compareTo("q") == 0) {
				Integer intOb = key.get(33);
				int a = key.get(33);
				p6 = p6 + a;
			} else if (in3.compareTo("R") == 0) {
				Integer intOb = key.get(34);
				int a = key.get(34);
				p6 = p6 + a;
			} else if (in3.compareTo("r") == 0) {
				Integer intOb = key.get(35);
				int a = key.get(35);
				p6 = p6 + a;
			} else if (in3.compareTo("S") == 0) {
				Integer intOb = key.get(36);
				int a = key.get(36);
				p6 = p6 + a;
			} else if (in3.compareTo("s") == 0) {
				Integer intOb = key.get(37);
				int a = key.get(37);
				p6 = p6 + a;
			} else if (in3.compareTo("T") == 0) {
				Integer intOb = key.get(38);
				int a = key.get(38);
				p6 = p6 + a;
			} else if (in3.compareTo("t") == 0) {
				Integer intOb = key.get(39);
				int a = key.get(39);
				p6 = p6 + a;
			} else if (in3.compareTo("U") == 0) {
				Integer intOb = key.get(40);
				int a = key.get(40);
				p6 = p6 + a;
			} else if (in3.compareTo("u") == 0) {
				Integer intOb = key.get(41);
				int a = key.get(41);
				p6 = p6 + a;
			} else if (in3.compareTo("V") == 0) {
				Integer intOb = key.get(42);
				int a = key.get(42);
				p6 = p6 + a;
			} else if (in3.compareTo("v") == 0) {
				Integer intOb = key.get(43);
				int a = key.get(43);
				p6 = p6 + a;
			} else if (in3.compareTo("W") == 0) {
				Integer intOb = key.get(44);
				int a = key.get(44);
				p6 = p6 + a;
			} else if (in3.compareTo("w") == 0) {
				Integer intOb = key.get(45);
				int a = key.get(45);
				p6 = p6 + a;
			} else if (in3.compareTo("X") == 0) {
				Integer intOb = key.get(46);
				int a = key.get(46);
				p6 = p6 + a;
			} else if (in3.compareTo("x") == 0) {
				Integer intOb = key.get(47);
				int a = key.get(47);
				p6 = p6 + a;
			} else if (in3.compareTo("Y") == 0) {
				Integer intOb = key.get(48);
				int a = key.get(48);
				p6 = p6 + a;
			} else if (in3.compareTo("y") == 0) {
				Integer intOb = key.get(49);
				int a = key.get(49);
				p6 = p6 + a;
			} else if (in3.compareTo("Z") == 0) {
				Integer intOb = key.get(50);
				int a = key.get(50);
				p6 = p6 + a;
			} else if (in3.compareTo("z") == 0) {
				Integer intOb = key.get(51);
				int a = key.get(51);
				p6 = p6 + a;
			} else if (in3.compareTo("!") == 0) {
				Integer intOb = key.get(52);
				int a = key.get(52);
				p6 = p6 + a;
			} else {
				System.out.println("Error!");
			}
			Scanner dn = new Scanner(System.in);
			String in4 = dn.nextLine();
			if (in4.compareTo("A") == 0) {
				Integer intOb = key.get(0);
				int a = key.get(0);
				p7 = p7 + a;
			} else if (in4.compareTo("a") == 0) {
				Integer intOb = key.get(1);
				int a = key.get(1);
				p7 = p7 + a;
			} else if (in4.compareTo("B") == 0) {
				Integer intOb = key.get(2);
				int a = key.get(2);
				p7 = p7 + a;
			} else if (in4.compareTo("a") == 0) {
				Integer intOb = key.get(3);
				int a = key.get(3);
				p7 = p7 + a;
			} else if (in4.compareTo("C") == 0) {
				Integer intOb = key.get(4);
				int a = key.get(4);
				p7 = p7 + a;
			} else if (in4.compareTo("c") == 0) {
				Integer intOb = key.get(5);
				int a = key.get(5);
				p7 = p7 + a;
			} else if (in4.compareTo("D") == 0) {
				Integer intOb = key.get(6);
				int a = key.get(6);
				p7 = p7 + a;
			} else if (in4.compareTo("d") == 0) {
				Integer intOb = key.get(7);
				int a = key.get(7);
				p7 = p7 + a;
			} else if (in4.compareTo("E") == 0) {
				Integer intOb = key.get(8);
				int a = key.get(8);
				p7 = p7 + a;
			} else if (in4.compareTo("e") == 0) {
				Integer intOb = key.get(9);
				int a = key.get(9);
				p7 = p7 + a;
			} else if (in4.compareTo("F") == 0) {
				Integer intOb = key.get(10);
				int a = key.get(10);
				p7 = p7 + a;
			} else if (in4.compareTo("f") == 0) {
				Integer intOb = key.get(11);
				int a = key.get(11);
				p7 = p7 + a;
			} else if (in4.compareTo("G") == 0) {
				Integer intOb = key.get(12);
				int a = key.get(12);
				p7 = p7 + a;
			} else if (in4.compareTo("g") == 0) {
				Integer intOb = key.get(13);
				int a = key.get(13);
				p7 = p7 + a;
			} else if (in4.compareTo("H") == 0) {
				Integer intOb = key.get(14);
				int a = key.get(14);
				p7 = p7 + a;
			} else if (in4.compareTo("h") == 0) {
				Integer intOb = key.get(15);
				int a = key.get(15);
				p7 = p7 + a;
			} else if (in4.compareTo("I") == 0) {
				Integer intOb = key.get(16);
				int a = key.get(16);
				p7 = p7 + a;
			} else if (in4.compareTo("i") == 0) {
				Integer intOb = key.get(17);
				int a = key.get(17);
				p7 = p7 + a;
			} else if (in4.compareTo("J") == 0) {
				Integer intOb = key.get(18);
				int a = key.get(18);
				p7 = p7 + a;
			} else if (in4.compareTo("j") == 0) {
				Integer intOb = key.get(19);
				int a = key.get(19);
				p7 = p7 + a;
			} else if (in4.compareTo("K") == 0) {
				Integer intOb = key.get(20);
				int a = key.get(20);
				p7 = p7 + a;
			} else if (in4.compareTo("k") == 0) {
				Integer intOb = key.get(21);
				int a = key.get(21);
				p7 = p7 + a;
			} else if (in4.compareTo("L") == 0) {
				Integer intOb = key.get(22);
				int a = key.get(22);
				p7 = p7 + a;
			} else if (in4.compareTo("l") == 0) {
				Integer intOb = key.get(23);
				int a = key.get(23);
				p7 = p7 + a;
			} else if (in4.compareTo("M") == 0) {
				Integer intOb = key.get(24);
				int a = key.get(24);
				p7 = p7 + a;
			} else if (in4.compareTo("m") == 0) {
				Integer intOb = key.get(25);
				int a = key.get(25);
				p7 = p7 + a;
			} else if (in4.compareTo("N") == 0) {
				Integer intOb = key.get(26);
				int a = key.get(26);
				p7 = p7 + a;
			} else if (in4.compareTo("n") == 0) {
				Integer intOb = key.get(27);
				int a = key.get(27);
				p7 = p7 + a;
			} else if (in4.compareTo("O") == 0) {
				Integer intOb = key.get(28);
				int a = key.get(28);
				p7 = p7 + a;
			} else if (in4.compareTo("o") == 0) {
				Integer intOb = key.get(29);
				int a = key.get(29);
				p7 = p7 + a;
			} else if (in4.compareTo("P") == 0) {
				Integer intOb = key.get(30);
				int a = key.get(30);
				p7 = p7 + a;
			} else if (in4.compareTo("p") == 0) {
				Integer intOb = key.get(31);
				int a = key.get(31);
				p7 = p7 + a;
			} else if (in4.compareTo("Q") == 0) {
				Integer intOb = key.get(32);
				int a = key.get(32);
				p7 = p7 + a;
			} else if (in4.compareTo("q") == 0) {
				Integer intOb = key.get(33);
				int a = key.get(33);
				p7 = p7 + a;
			} else if (in4.compareTo("R") == 0) {
				Integer intOb = key.get(34);
				int a = key.get(34);
				p7 = p7 + a;
			} else if (in4.compareTo("r") == 0) {
				Integer intOb = key.get(35);
				int a = key.get(35);
				p7 = p7 + a;
			} else if (in4.compareTo("S") == 0) {
				Integer intOb = key.get(36);
				int a = key.get(36);
				p7 = p7 + a;
			} else if (in4.compareTo("s") == 0) {
				Integer intOb = key.get(37);
				int a = key.get(37);
				p7 = p7 + a;
			} else if (in4.compareTo("T") == 0) {
				Integer intOb = key.get(38);
				int a = key.get(38);
				p7 = p7 + a;
			} else if (in4.compareTo("t") == 0) {
				Integer intOb = key.get(39);
				int a = key.get(39);
				p7 = p7 + a;
			} else if (in4.compareTo("U") == 0) {
				Integer intOb = key.get(40);
				int a = key.get(40);
				p7 = p7 + a;
			} else if (in4.compareTo("u") == 0) {
				Integer intOb = key.get(41);
				int a = key.get(41);
				p7 = p7 + a;
			} else if (in4.compareTo("V") == 0) {
				Integer intOb = key.get(42);
				int a = key.get(42);
				p7 = p7 + a;
			} else if (in4.compareTo("v") == 0) {
				Integer intOb = key.get(43);
				int a = key.get(43);
				p7 = p7 + a;
			} else if (in4.compareTo("W") == 0) {
				Integer intOb = key.get(44);
				int a = key.get(44);
				p7 = p7 + a;
			} else if (in4.compareTo("w") == 0) {
				Integer intOb = key.get(45);
				int a = key.get(45);
				p7 = p7 + a;
			} else if (in4.compareTo("X") == 0) {
				Integer intOb = key.get(46);
				int a = key.get(46);
				p7 = p7 + a;
			} else if (in4.compareTo("x") == 0) {
				Integer intOb = key.get(47);
				int a = key.get(47);
				p7 = p7 + a;
			} else if (in4.compareTo("Y") == 0) {
				Integer intOb = key.get(48);
				int a = key.get(48);
				p7 = p7 + a;
			} else if (in4.compareTo("y") == 0) {
				Integer intOb = key.get(49);
				int a = key.get(49);
				p7 = p7 + a;
			} else if (in4.compareTo("Z") == 0) {
				Integer intOb = key.get(50);
				int a = key.get(50);
				p7 = p7 + a;
			} else if (in4.compareTo("z") == 0) {
				Integer intOb = key.get(51);
				int a = key.get(51);
				p7 = p7 + a;
			} else if (in4.compareTo("!") == 0) {
				Integer intOb = key.get(52);
				int a = key.get(52);
				p7 = p7 + a;
			} else {
				System.out.println("Error!");
			}
			Scanner en = new Scanner(System.in);
			String in5 = en.nextLine();
			if (in5.compareTo("A") == 0) {
				Integer intOb = key.get(0);
				int a = key.get(0);
				p8 = p8 + a;
			} else if (in5.compareTo("a") == 0) {
				Integer intOb = key.get(1);
				int a = key.get(1);
				p8 = p8 + a;
			} else if (in5.compareTo("B") == 0) {
				Integer intOb = key.get(2);
				int a = key.get(2);
				p8 = p8 + a;
			} else if (in5.compareTo("a") == 0) {
				Integer intOb = key.get(3);
				int a = key.get(3);
				p8 = p8 + a;
			} else if (in5.compareTo("C") == 0) {
				Integer intOb = key.get(4);
				int a = key.get(4);
				p8 = p8 + a;
			} else if (in5.compareTo("c") == 0) {
				Integer intOb = key.get(5);
				int a = key.get(5);
				p8 = p8 + a;
			} else if (in5.compareTo("D") == 0) {
				Integer intOb = key.get(6);
				int a = key.get(6);
				p8 = p8 + a;
			} else if (in5.compareTo("d") == 0) {
				Integer intOb = key.get(7);
				int a = key.get(7);
				p8 = p8 + a;
			} else if (in5.compareTo("E") == 0) {
				Integer intOb = key.get(8);
				int a = key.get(8);
				p8 = p8 + a;
			} else if (in5.compareTo("e") == 0) {
				Integer intOb = key.get(9);
				int a = key.get(9);
				p8 = p8 + a;
			} else if (in5.compareTo("F") == 0) {
				Integer intOb = key.get(10);
				int a = key.get(10);
				p8 = p8 + a;
			} else if (in5.compareTo("f") == 0) {
				Integer intOb = key.get(11);
				int a = key.get(11);
				p8 = p8 + a;
			} else if (in5.compareTo("G") == 0) {
				Integer intOb = key.get(12);
				int a = key.get(12);
				p8 = p8 + a;
			} else if (in5.compareTo("g") == 0) {
				Integer intOb = key.get(13);
				int a = key.get(13);
				p8 = p8 + a;
			} else if (in5.compareTo("H") == 0) {
				Integer intOb = key.get(14);
				int a = key.get(14);
				p8 = p8 + a;
			} else if (in5.compareTo("h") == 0) {
				Integer intOb = key.get(15);
				int a = key.get(15);
				p8 = p8 + a;
			} else if (in5.compareTo("I") == 0) {
				Integer intOb = key.get(16);
				int a = key.get(16);
				p8 = p8 + a;
			} else if (in5.compareTo("i") == 0) {
				Integer intOb = key.get(17);
				int a = key.get(17);
				p8 = p8 + a;
			} else if (in5.compareTo("J") == 0) {
				Integer intOb = key.get(18);
				int a = key.get(18);
				p8 = p8 + a;
			} else if (in5.compareTo("j") == 0) {
				Integer intOb = key.get(19);
				int a = key.get(19);
				p8 = p8 + a;
			} else if (in5.compareTo("K") == 0) {
				Integer intOb = key.get(20);
				int a = key.get(20);
				p8 = p8 + a;
			} else if (in5.compareTo("k") == 0) {
				Integer intOb = key.get(21);
				int a = key.get(21);
				p8 = p8 + a;
			} else if (in5.compareTo("L") == 0) {
				Integer intOb = key.get(22);
				int a = key.get(22);
				p8 = p8 + a;
			} else if (in5.compareTo("l") == 0) {
				Integer intOb = key.get(23);
				int a = key.get(23);
				p8 = p8 + a;
			} else if (in5.compareTo("M") == 0) {
				Integer intOb = key.get(24);
				int a = key.get(24);
				p8 = p8 + a;
			} else if (in5.compareTo("m") == 0) {
				Integer intOb = key.get(25);
				int a = key.get(25);
				p8 = p8 + a;
			} else if (in5.compareTo("N") == 0) {
				Integer intOb = key.get(26);
				int a = key.get(26);
				p8 = p8 + a;
			} else if (in5.compareTo("n") == 0) {
				Integer intOb = key.get(27);
				int a = key.get(27);
				p8 = p8 + a;
			} else if (in5.compareTo("O") == 0) {
				Integer intOb = key.get(28);
				int a = key.get(28);
				p8 = p8 + a;
			} else if (in5.compareTo("o") == 0) {
				Integer intOb = key.get(29);
				int a = key.get(29);
				p8 = p8 + a;
			} else if (in5.compareTo("P") == 0) {
				Integer intOb = key.get(30);
				int a = key.get(30);
				p8 = p8 + a;
			} else if (in5.compareTo("p") == 0) {
				Integer intOb = key.get(31);
				int a = key.get(31);
				p8 = p8 + a;
			} else if (in5.compareTo("Q") == 0) {
				Integer intOb = key.get(32);
				int a = key.get(32);
				p8 = p8 + a;
			} else if (in5.compareTo("q") == 0) {
				Integer intOb = key.get(33);
				int a = key.get(33);
				p8 = p8 + a;
			} else if (in5.compareTo("R") == 0) {
				Integer intOb = key.get(34);
				int a = key.get(34);
				p8 = p8 + a;
			} else if (in5.compareTo("r") == 0) {
				Integer intOb = key.get(35);
				int a = key.get(35);
				p8 = p8 + a;
			} else if (in5.compareTo("S") == 0) {
				Integer intOb = key.get(36);
				int a = key.get(36);
				p8 = p8 + a;
			} else if (in5.compareTo("s") == 0) {
				Integer intOb = key.get(37);
				int a = key.get(37);
				p8 = p8 + a;
			} else if (in5.compareTo("T") == 0) {
				Integer intOb = key.get(38);
				int a = key.get(38);
				p8 = p8 + a;
			} else if (in5.compareTo("t") == 0) {
				Integer intOb = key.get(39);
				int a = key.get(39);
				p8 = p8 + a;
			} else if (in5.compareTo("U") == 0) {
				Integer intOb = key.get(40);
				int a = key.get(40);
				p8 = p8 + a;
			} else if (in5.compareTo("u") == 0) {
				Integer intOb = key.get(41);
				int a = key.get(41);
				p8 = p8 + a;
			} else if (in5.compareTo("V") == 0) {
				Integer intOb = key.get(42);
				int a = key.get(42);
				p8 = p8 + a;
			} else if (in5.compareTo("v") == 0) {
				Integer intOb = key.get(43);
				int a = key.get(43);
				p8 = p8 + a;
			} else if (in5.compareTo("W") == 0) {
				Integer intOb = key.get(44);
				int a = key.get(44);
				p8 = p8 + a;
			} else if (in5.compareTo("w") == 0) {
				Integer intOb = key.get(45);
				int a = key.get(45);
				p8 = p8 + a;
			} else if (in5.compareTo("X") == 0) {
				Integer intOb = key.get(46);
				int a = key.get(46);
				p8 = p8 + a;
			} else if (in5.compareTo("x") == 0) {
				Integer intOb = key.get(47);
				int a = key.get(47);
				p8 = p8 + a;
			} else if (in5.compareTo("Y") == 0) {
				Integer intOb = key.get(48);
				int a = key.get(48);
				p8 = p8 + a;
			} else if (in5.compareTo("y") == 0) {
				Integer intOb = key.get(49);
				int a = key.get(49);
				p8 = p8 + a;
			} else if (in5.compareTo("Z") == 0) {
				Integer intOb = key.get(50);
				int a = key.get(50);
				p8 = p8 + a;
			} else if (in5.compareTo("z") == 0) {
				Integer intOb = key.get(51);
				int a = key.get(51);
				p8 = p8 + a;
			} else if (in5.compareTo("!") == 0) {
				Integer intOb = key.get(52);
				int a = key.get(52);
				p8 = p8 + a;
			} else {
				System.out.println("Error!");
			}
			Scanner fn = new Scanner(System.in);
			String in6 = fn.nextLine();
			if (in6.compareTo("A") == 0) {
				Integer intOb = key.get(0);
				int a = key.get(0);
				p9 = p9 + a;
			} else if (in6.compareTo("a") == 0) {
				Integer intOb = key.get(1);
				int a = key.get(1);
				p9 = p9 + a;
			} else if (in6.compareTo("B") == 0) {
				Integer intOb = key.get(2);
				int a = key.get(2);
				p9 = p9 + a;
			} else if (in6.compareTo("a") == 0) {
				Integer intOb = key.get(3);
				int a = key.get(3);
				p9 = p9 + a;
			} else if (in6.compareTo("C") == 0) {
				Integer intOb = key.get(4);
				int a = key.get(4);
				p9 = p9 + a;
			} else if (in6.compareTo("c") == 0) {
				Integer intOb = key.get(5);
				int a = key.get(5);
				p9 = p9 + a;
			} else if (in6.compareTo("D") == 0) {
				Integer intOb = key.get(6);
				int a = key.get(6);
				p9 = p9 + a;
			} else if (in6.compareTo("d") == 0) {
				Integer intOb = key.get(7);
				int a = key.get(7);
				p9 = p9 + a;
			} else if (in6.compareTo("E") == 0) {
				Integer intOb = key.get(8);
				int a = key.get(8);
				p9 = p9 + a;
			} else if (in6.compareTo("e") == 0) {
				Integer intOb = key.get(9);
				int a = key.get(9);
				p9 = p9 + a;
			} else if (in6.compareTo("F") == 0) {
				Integer intOb = key.get(10);
				int a = key.get(10);
				p9 = p9 + a;
			} else if (in6.compareTo("f") == 0) {
				Integer intOb = key.get(11);
				int a = key.get(11);
				p9 = p9 + a;
			} else if (in6.compareTo("G") == 0) {
				Integer intOb = key.get(12);
				int a = key.get(12);
				p9 = p9 + a;
			} else if (in6.compareTo("g") == 0) {
				Integer intOb = key.get(13);
				int a = key.get(13);
				p9 = p9 + a;
			} else if (in6.compareTo("H") == 0) {
				Integer intOb = key.get(14);
				int a = key.get(14);
				p9 = p9 + a;
			} else if (in6.compareTo("h") == 0) {
				Integer intOb = key.get(15);
				int a = key.get(15);
				p9 = p9 + a;
			} else if (in6.compareTo("I") == 0) {
				Integer intOb = key.get(16);
				int a = key.get(16);
				p9 = p9 + a;
			} else if (in6.compareTo("i") == 0) {
				Integer intOb = key.get(17);
				int a = key.get(17);
				p9 = p9 + a;
			} else if (in6.compareTo("J") == 0) {
				Integer intOb = key.get(18);
				int a = key.get(18);
				p9 = p9 + a;
			} else if (in6.compareTo("j") == 0) {
				Integer intOb = key.get(19);
				int a = key.get(19);
				p9 = p9 + a;
			} else if (in6.compareTo("K") == 0) {
				Integer intOb = key.get(20);
				int a = key.get(20);
				p9 = p9 + a;
			} else if (in6.compareTo("k") == 0) {
				Integer intOb = key.get(21);
				int a = key.get(21);
				p9 = p9 + a;
			} else if (in6.compareTo("L") == 0) {
				Integer intOb = key.get(22);
				int a = key.get(22);
				p9 = p9 + a;
			} else if (in6.compareTo("l") == 0) {
				Integer intOb = key.get(23);
				int a = key.get(23);
				p9 = p9 + a;
			} else if (in6.compareTo("M") == 0) {
				Integer intOb = key.get(24);
				int a = key.get(24);
				p9 = p9 + a;
			} else if (in6.compareTo("m") == 0) {
				Integer intOb = key.get(25);
				int a = key.get(25);
				p9 = p9 + a;
			} else if (in6.compareTo("N") == 0) {
				Integer intOb = key.get(26);
				int a = key.get(26);
				p9 = p9 + a;
			} else if (in6.compareTo("n") == 0) {
				Integer intOb = key.get(27);
				int a = key.get(27);
				p9 = p9 + a;
			} else if (in6.compareTo("O") == 0) {
				Integer intOb = key.get(28);
				int a = key.get(28);
				p9 = p9 + a;
			} else if (in6.compareTo("o") == 0) {
				Integer intOb = key.get(29);
				int a = key.get(29);
				p9 = p9 + a;
			} else if (in6.compareTo("P") == 0) {
				Integer intOb = key.get(30);
				int a = key.get(30);
				p9 = p9 + a;
			} else if (in6.compareTo("p") == 0) {
				Integer intOb = key.get(31);
				int a = key.get(31);
				p9 = p9 + a;
			} else if (in6.compareTo("Q") == 0) {
				Integer intOb = key.get(32);
				int a = key.get(32);
				p9 = p9 + a;
			} else if (in6.compareTo("q") == 0) {
				Integer intOb = key.get(33);
				int a = key.get(33);
				p9 = p9 + a;
			} else if (in6.compareTo("R") == 0) {
				Integer intOb = key.get(34);
				int a = key.get(34);
				p9 = p9 + a;
			} else if (in6.compareTo("r") == 0) {
				Integer intOb = key.get(35);
				int a = key.get(35);
				p9 = p9 + a;
			} else if (in6.compareTo("S") == 0) {
				Integer intOb = key.get(36);
				int a = key.get(36);
				p9 = p9 + a;
			} else if (in6.compareTo("s") == 0) {
				Integer intOb = key.get(37);
				int a = key.get(37);
				p9 = p9 + a;
			} else if (in6.compareTo("T") == 0) {
				Integer intOb = key.get(38);
				int a = key.get(38);
				p9 = p9 + a;
			} else if (in6.compareTo("t") == 0) {
				Integer intOb = key.get(39);
				int a = key.get(39);
				p9 = p9 + a;
			} else if (in6.compareTo("U") == 0) {
				Integer intOb = key.get(40);
				int a = key.get(40);
				p9 = p9 + a;
			} else if (in6.compareTo("u") == 0) {
				Integer intOb = key.get(41);
				int a = key.get(41);
				p9 = p9 + a;
			} else if (in6.compareTo("V") == 0) {
				Integer intOb = key.get(42);
				int a = key.get(42);
				p9 = p9 + a;
			} else if (in6.compareTo("v") == 0) {
				Integer intOb = key.get(43);
				int a = key.get(43);
				p9 = p9 + a;
			} else if (in6.compareTo("W") == 0) {
				Integer intOb = key.get(44);
				int a = key.get(44);
				p9 = p9 + a;
			} else if (in6.compareTo("w") == 0) {
				Integer intOb = key.get(45);
				int a = key.get(45);
				p9 = p9 + a;
			} else if (in6.compareTo("X") == 0) {
				Integer intOb = key.get(46);
				int a = key.get(46);
				p9 = p9 + a;
			} else if (in6.compareTo("x") == 0) {
				Integer intOb = key.get(47);
				int a = key.get(47);
				p9 = p9 + a;
			} else if (in6.compareTo("Y") == 0) {
				Integer intOb = key.get(48);
				int a = key.get(48);
				p9 = p9 + a;
			} else if (in6.compareTo("y") == 0) {
				Integer intOb = key.get(49);
				int a = key.get(49);
				p9 = p9 + a;
			} else if (in6.compareTo("Z") == 0) {
				Integer intOb = key.get(50);
				int a = key.get(50);
				p9 = p9 + a;
			} else if (in6.compareTo("z") == 0) {
				Integer intOb = key.get(51);
				int a = key.get(51);
				p9 = p9 + a;
			} else if (in6.compareTo("!") == 0) {
				Integer intOb = key.get(52);
				int a = key.get(52);
				p9 = p9 + a;
			} else {
				System.out.println("Error!");
			}
			Scanner gn = new Scanner(System.in);
			String in7 = gn.nextLine();
			if (in7.compareTo("A") == 0) {
				Integer intOb = key.get(0);
				int a = key.get(0);
				p10 = p10 + a;
			} else if (in7.compareTo("a") == 0) {
				Integer intOb = key.get(1);
				int a = key.get(1);
				p10 = p10 + a;
			} else if (in7.compareTo("B") == 0) {
				Integer intOb = key.get(2);
				int a = key.get(2);
				p10 = p10 + a;
			} else if (in7.compareTo("a") == 0) {
				Integer intOb = key.get(3);
				int a = key.get(3);
				p10 = p10 + a;
			} else if (in7.compareTo("C") == 0) {
				Integer intOb = key.get(4);
				int a = key.get(4);
				p10 = p10 + a;
			} else if (in7.compareTo("c") == 0) {
				Integer intOb = key.get(5);
				int a = key.get(5);
				p10 = p10 + a;
			} else if (in7.compareTo("D") == 0) {
				Integer intOb = key.get(6);
				int a = key.get(6);
				p10 = p10 + a;
			} else if (in7.compareTo("d") == 0) {
				Integer intOb = key.get(7);
				int a = key.get(7);
				p10 = p10 + a;
			} else if (in7.compareTo("E") == 0) {
				Integer intOb = key.get(8);
				int a = key.get(8);
				p10 = p10 + a;
			} else if (in7.compareTo("e") == 0) {
				Integer intOb = key.get(9);
				int a = key.get(9);
				p10 = p10 + a;
			} else if (in7.compareTo("F") == 0) {
				Integer intOb = key.get(10);
				int a = key.get(10);
				p10 = p10 + a;
			} else if (in7.compareTo("f") == 0) {
				Integer intOb = key.get(11);
				int a = key.get(11);
				p10 = p10 + a;
			} else if (in7.compareTo("G") == 0) {
				Integer intOb = key.get(12);
				int a = key.get(12);
				p10 = p10 + a;
			} else if (in7.compareTo("g") == 0) {
				Integer intOb = key.get(13);
				int a = key.get(13);
				p10 = p10 + a;
			} else if (in7.compareTo("H") == 0) {
				Integer intOb = key.get(14);
				int a = key.get(14);
				p10 = p10 + a;
			} else if (in7.compareTo("h") == 0) {
				Integer intOb = key.get(15);
				int a = key.get(15);
				p10 = p10 + a;
			} else if (in7.compareTo("I") == 0) {
				Integer intOb = key.get(16);
				int a = key.get(16);
				p10 = p10 + a;
			} else if (in7.compareTo("i") == 0) {
				Integer intOb = key.get(17);
				int a = key.get(17);
				p10 = p10 + a;
			} else if (in7.compareTo("J") == 0) {
				Integer intOb = key.get(18);
				int a = key.get(18);
				p10 = p10 + a;
			} else if (in7.compareTo("j") == 0) {
				Integer intOb = key.get(19);
				int a = key.get(19);
				p10 = p10 + a;
			} else if (in7.compareTo("K") == 0) {
				Integer intOb = key.get(20);
				int a = key.get(20);
				p10 = p10 + a;
			} else if (in7.compareTo("k") == 0) {
				Integer intOb = key.get(21);
				int a = key.get(21);
				p10 = p10 + a;
			} else if (in7.compareTo("L") == 0) {
				Integer intOb = key.get(22);
				int a = key.get(22);
				p10 = p10 + a;
			} else if (in7.compareTo("l") == 0) {
				Integer intOb = key.get(23);
				int a = key.get(23);
				p10 = p10 + a;
			} else if (in7.compareTo("M") == 0) {
				Integer intOb = key.get(24);
				int a = key.get(24);
				p10 = p10 + a;
			} else if (in7.compareTo("m") == 0) {
				Integer intOb = key.get(25);
				int a = key.get(25);
				p10 = p10 + a;
			} else if (in7.compareTo("N") == 0) {
				Integer intOb = key.get(26);
				int a = key.get(26);
				p10 = p10 + a;
			} else if (in7.compareTo("n") == 0) {
				Integer intOb = key.get(27);
				int a = key.get(27);
				p10 = p10 + a;
			} else if (in7.compareTo("O") == 0) {
				Integer intOb = key.get(28);
				int a = key.get(28);
				p10 = p10 + a;
			} else if (in7.compareTo("o") == 0) {
				Integer intOb = key.get(29);
				int a = key.get(29);
				p10 = p10 + a;
			} else if (in7.compareTo("P") == 0) {
				Integer intOb = key.get(30);
				int a = key.get(30);
				p10 = p10 + a;
			} else if (in7.compareTo("p") == 0) {
				Integer intOb = key.get(31);
				int a = key.get(31);
				p10 = p10 + a;
			} else if (in7.compareTo("Q") == 0) {
				Integer intOb = key.get(32);
				int a = key.get(32);
				p10 = p10 + a;
			} else if (in7.compareTo("q") == 0) {
				Integer intOb = key.get(33);
				int a = key.get(33);
				p10 = p10 + a;
			} else if (in7.compareTo("R") == 0) {
				Integer intOb = key.get(34);
				int a = key.get(34);
				p10 = p10 + a;
			} else if (in7.compareTo("r") == 0) {
				Integer intOb = key.get(35);
				int a = key.get(35);
				p10 = p10 + a;
			} else if (in7.compareTo("S") == 0) {
				Integer intOb = key.get(36);
				int a = key.get(36);
				p10 = p10 + a;
			} else if (in7.compareTo("s") == 0) {
				Integer intOb = key.get(37);
				int a = key.get(37);
				p10 = p10 + a;
			} else if (in7.compareTo("T") == 0) {
				Integer intOb = key.get(38);
				int a = key.get(38);
				p10 = p10 + a;
			} else if (in7.compareTo("t") == 0) {
				Integer intOb = key.get(39);
				int a = key.get(39);
				p10 = p10 + a;
			} else if (in7.compareTo("U") == 0) {
				Integer intOb = key.get(40);
				int a = key.get(40);
				p10 = p10 + a;
			} else if (in7.compareTo("u") == 0) {
				Integer intOb = key.get(41);
				int a = key.get(41);
				p10 = p10 + a;
			} else if (in7.compareTo("V") == 0) {
				Integer intOb = key.get(42);
				int a = key.get(42);
				p10 = p10 + a;
			} else if (in7.compareTo("v") == 0) {
				Integer intOb = key.get(43);
				int a = key.get(43);
				p10 = p10 + a;
			} else if (in7.compareTo("W") == 0) {
				Integer intOb = key.get(44);
				int a = key.get(44);
				p10 = p10 + a;
			} else if (in7.compareTo("w") == 0) {
				Integer intOb = key.get(45);
				int a = key.get(45);
				p10 = p10 + a;
			} else if (in7.compareTo("X") == 0) {
				Integer intOb = key.get(46);
				int a = key.get(46);
				p10 = p10 + a;
			} else if (in7.compareTo("x") == 0) {
				Integer intOb = key.get(47);
				int a = key.get(47);
				p10 = p10 + a;
			} else if (in7.compareTo("Y") == 0) {
				Integer intOb = key.get(48);
				int a = key.get(48);
				p10 = p10 + a;
			} else if (in7.compareTo("y") == 0) {
				Integer intOb = key.get(49);
				int a = key.get(49);
				p10 = p10 + a;
			} else if (in7.compareTo("Z") == 0) {
				Integer intOb = key.get(50);
				int a = key.get(50);
				p10 = p10 + a;
			} else if (in7.compareTo("z") == 0) {
				Integer intOb = key.get(51);
				int a = key.get(51);
				p10 = p10 + a;
			} else if (in7.compareTo("!") == 0) {
				Integer intOb = key.get(52);
				int a = key.get(52);
				p10 = p10 + a;
			} else {
				System.out.println("Error!");
			}
			Scanner hn = new Scanner(System.in);
			String in8 = hn.nextLine();
			if (in8.compareTo("A") == 0) {
				Integer intOb = key.get(0);
				int a = key.get(0);
				p11 = p11 + a;
			} else if (in8.compareTo("a") == 0) {
				Integer intOb = key.get(1);
				int a = key.get(1);
				p11 = p11 + a;
			} else if (in8.compareTo("B") == 0) {
				Integer intOb = key.get(2);
				int a = key.get(2);
				p11 = p11 + a;
			} else if (in8.compareTo("a") == 0) {
				Integer intOb = key.get(3);
				int a = key.get(3);
				p11 = p11 + a;
			} else if (in8.compareTo("C") == 0) {
				Integer intOb = key.get(4);
				int a = key.get(4);
				p11 = p11 + a;
			} else if (in8.compareTo("c") == 0) {
				Integer intOb = key.get(5);
				int a = key.get(5);
				p11 = p11 + a;
			} else if (in8.compareTo("D") == 0) {
				Integer intOb = key.get(6);
				int a = key.get(6);
				p11 = p11 + a;
			} else if (in8.compareTo("d") == 0) {
				Integer intOb = key.get(7);
				int a = key.get(7);
				p11 = p11 + a;
			} else if (in8.compareTo("E") == 0) {
				Integer intOb = key.get(8);
				int a = key.get(8);
				p11 = p11 + a;
			} else if (in8.compareTo("e") == 0) {
				Integer intOb = key.get(9);
				int a = key.get(9);
				p11 = p11 + a;
			} else if (in8.compareTo("F") == 0) {
				Integer intOb = key.get(10);
				int a = key.get(10);
				p11 = p11 + a;
			} else if (in8.compareTo("f") == 0) {
				Integer intOb = key.get(11);
				int a = key.get(11);
				p11 = p11 + a;
			} else if (in8.compareTo("G") == 0) {
				Integer intOb = key.get(12);
				int a = key.get(12);
				p11 = p11 + a;
			} else if (in8.compareTo("g") == 0) {
				Integer intOb = key.get(13);
				int a = key.get(13);
				p11 = p11 + a;
			} else if (in8.compareTo("H") == 0) {
				Integer intOb = key.get(14);
				int a = key.get(14);
				p11 = p11 + a;
			} else if (in8.compareTo("h") == 0) {
				Integer intOb = key.get(15);
				int a = key.get(15);
				p11 = p11 + a;
			} else if (in8.compareTo("I") == 0) {
				Integer intOb = key.get(16);
				int a = key.get(16);
				p11 = p11 + a;
			} else if (in8.compareTo("i") == 0) {
				Integer intOb = key.get(17);
				int a = key.get(17);
				p11 = p11 + a;
			} else if (in8.compareTo("J") == 0) {
				Integer intOb = key.get(18);
				int a = key.get(18);
				p11 = p11 + a;
			} else if (in8.compareTo("j") == 0) {
				Integer intOb = key.get(19);
				int a = key.get(19);
				p11 = p11 + a;
			} else if (in8.compareTo("K") == 0) {
				Integer intOb = key.get(20);
				int a = key.get(20);
				p11 = p11 + a;
			} else if (in8.compareTo("k") == 0) {
				Integer intOb = key.get(21);
				int a = key.get(21);
				p11 = p11 + a;
			} else if (in8.compareTo("L") == 0) {
				Integer intOb = key.get(22);
				int a = key.get(22);
				p11 = p11 + a;
			} else if (in8.compareTo("l") == 0) {
				Integer intOb = key.get(23);
				int a = key.get(23);
				p11 = p11 + a;
			} else if (in8.compareTo("M") == 0) {
				Integer intOb = key.get(24);
				int a = key.get(24);
				p11 = p11 + a;
			} else if (in8.compareTo("m") == 0) {
				Integer intOb = key.get(25);
				int a = key.get(25);
				p11 = p11 + a;
			} else if (in8.compareTo("N") == 0) {
				Integer intOb = key.get(26);
				int a = key.get(26);
				p11 = p11 + a;
			} else if (in8.compareTo("n") == 0) {
				Integer intOb = key.get(27);
				int a = key.get(27);
				p11 = p11 + a;
			} else if (in8.compareTo("O") == 0) {
				Integer intOb = key.get(28);
				int a = key.get(28);
				p11 = p11 + a;
			} else if (in8.compareTo("o") == 0) {
				Integer intOb = key.get(29);
				int a = key.get(29);
				p11 = p11 + a;
			} else if (in8.compareTo("P") == 0) {
				Integer intOb = key.get(30);
				int a = key.get(30);
				p11 = p11 + a;
			} else if (in8.compareTo("p") == 0) {
				Integer intOb = key.get(31);
				int a = key.get(31);
				p11 = p11 + a;
			} else if (in8.compareTo("Q") == 0) {
				Integer intOb = key.get(32);
				int a = key.get(32);
				p11 = p11 + a;
			} else if (in8.compareTo("q") == 0) {
				Integer intOb = key.get(33);
				int a = key.get(33);
				p11 = p11 + a;
			} else if (in8.compareTo("R") == 0) {
				Integer intOb = key.get(34);
				int a = key.get(34);
				p11 = p11 + a;
			} else if (in8.compareTo("r") == 0) {
				Integer intOb = key.get(35);
				int a = key.get(35);
				p11 = p11 + a;
			} else if (in8.compareTo("S") == 0) {
				Integer intOb = key.get(36);
				int a = key.get(36);
				p11 = p11 + a;
			} else if (in8.compareTo("s") == 0) {
				Integer intOb = key.get(37);
				int a = key.get(37);
				p11 = p11 + a;
			} else if (in8.compareTo("T") == 0) {
				Integer intOb = key.get(38);
				int a = key.get(38);
				p11 = p11 + a;
			} else if (in8.compareTo("t") == 0) {
				Integer intOb = key.get(39);
				int a = key.get(39);
				p11 = p11 + a;
			} else if (in8.compareTo("U") == 0) {
				Integer intOb = key.get(40);
				int a = key.get(40);
				p11 = p11 + a;
			} else if (in8.compareTo("u") == 0) {
				Integer intOb = key.get(41);
				int a = key.get(41);
				p11 = p11 + a;
			} else if (in8.compareTo("V") == 0) {
				Integer intOb = key.get(42);
				int a = key.get(42);
				p11 = p11 + a;
			} else if (in8.compareTo("v") == 0) {
				Integer intOb = key.get(43);
				int a = key.get(43);
				p11 = p11 + a;
			} else if (in8.compareTo("W") == 0) {
				Integer intOb = key.get(44);
				int a = key.get(44);
				p11 = p11 + a;
			} else if (in8.compareTo("w") == 0) {
				Integer intOb = key.get(45);
				int a = key.get(45);
				p11 = p11 + a;
			} else if (in8.compareTo("X") == 0) {
				Integer intOb = key.get(46);
				int a = key.get(46);
				p11 = p11 + a;
			} else if (in8.compareTo("x") == 0) {
				Integer intOb = key.get(47);
				int a = key.get(47);
				p11 = p11 + a;
			} else if (in8.compareTo("Y") == 0) {
				Integer intOb = key.get(48);
				int a = key.get(48);
				p11 = p11 + a;
			} else if (in8.compareTo("y") == 0) {
				Integer intOb = key.get(49);
				int a = key.get(49);
				p11 = p11 + a;
			} else if (in8.compareTo("Z") == 0) {
				Integer intOb = key.get(50);
				int a = key.get(50);
				p11 = p11 + a;
			} else if (in8.compareTo("z") == 0) {
				Integer intOb = key.get(51);
				int a = key.get(51);
				p11 = p11 + a;
			} else if (in8.compareTo("!") == 0) {
				Integer intOb = key.get(52);
				int a = key.get(52);
				p11 = p11 + a;
			} else {
				System.out.println("Error!");
			}
			Scanner in = new Scanner(System.in);
			String in9 = in.nextLine();
			if (in9.compareTo("A") == 0) {
				Integer intOb = key.get(0);
				int a = key.get(0);
				p12 = p12 + a;
			} else if (in9.compareTo("a") == 0) {
				Integer intOb = key.get(1);
				int a = key.get(1);
				p12 = p12 + a;
			} else if (in9.compareTo("B") == 0) {
				Integer intOb = key.get(2);
				int a = key.get(2);
				p12 = p12 + a;
			} else if (in9.compareTo("a") == 0) {
				Integer intOb = key.get(3);
				int a = key.get(3);
				p12 = p12 + a;
			} else if (in9.compareTo("C") == 0) {
				Integer intOb = key.get(4);
				int a = key.get(4);
				p12 = p12 + a;
			} else if (in9.compareTo("c") == 0) {
				Integer intOb = key.get(5);
				int a = key.get(5);
				p12 = p12 + a;
			} else if (in9.compareTo("D") == 0) {
				Integer intOb = key.get(6);
				int a = key.get(6);
				p12 = p12 + a;
			} else if (in9.compareTo("d") == 0) {
				Integer intOb = key.get(7);
				int a = key.get(7);
				p12 = p12 + a;
			} else if (in9.compareTo("E") == 0) {
				Integer intOb = key.get(8);
				int a = key.get(8);
				p12 = p12 + a;
			} else if (in9.compareTo("e") == 0) {
				Integer intOb = key.get(9);
				int a = key.get(9);
				p12 = p12 + a;
			} else if (in9.compareTo("F") == 0) {
				Integer intOb = key.get(10);
				int a = key.get(10);
				p12 = p12 + a;
			} else if (in9.compareTo("f") == 0) {
				Integer intOb = key.get(11);
				int a = key.get(11);
				p12 = p12 + a;
			} else if (in9.compareTo("G") == 0) {
				Integer intOb = key.get(12);
				int a = key.get(12);
				p12 = p12 + a;
			} else if (in9.compareTo("g") == 0) {
				Integer intOb = key.get(13);
				int a = key.get(13);
				p12 = p12 + a;
			} else if (in9.compareTo("H") == 0) {
				Integer intOb = key.get(14);
				int a = key.get(14);
				p12 = p12 + a;
			} else if (in9.compareTo("h") == 0) {
				Integer intOb = key.get(15);
				int a = key.get(15);
				p12 = p12 + a;
			} else if (in9.compareTo("I") == 0) {
				Integer intOb = key.get(16);
				int a = key.get(16);
				p12 = p12 + a;
			} else if (in9.compareTo("i") == 0) {
				Integer intOb = key.get(17);
				int a = key.get(17);
				p12 = p12 + a;
			} else if (in9.compareTo("J") == 0) {
				Integer intOb = key.get(18);
				int a = key.get(18);
				p12 = p12 + a;
			} else if (in9.compareTo("j") == 0) {
				Integer intOb = key.get(19);
				int a = key.get(19);
				p12 = p12 + a;
			} else if (in9.compareTo("K") == 0) {
				Integer intOb = key.get(20);
				int a = key.get(20);
				p12 = p12 + a;
			} else if (in9.compareTo("k") == 0) {
				Integer intOb = key.get(21);
				int a = key.get(21);
				p12 = p12 + a;
			} else if (in9.compareTo("L") == 0) {
				Integer intOb = key.get(22);
				int a = key.get(22);
				p12 = p12 + a;
			} else if (in9.compareTo("l") == 0) {
				Integer intOb = key.get(23);
				int a = key.get(23);
				p12 = p12 + a;
			} else if (in9.compareTo("M") == 0) {
				Integer intOb = key.get(24);
				int a = key.get(24);
				p12 = p12 + a;
			} else if (in9.compareTo("m") == 0) {
				Integer intOb = key.get(25);
				int a = key.get(25);
				p12 = p12 + a;
			} else if (in9.compareTo("N") == 0) {
				Integer intOb = key.get(26);
				int a = key.get(26);
				p12 = p12 + a;
			} else if (in9.compareTo("n") == 0) {
				Integer intOb = key.get(27);
				int a = key.get(27);
				p12 = p12 + a;
			} else if (in9.compareTo("O") == 0) {
				Integer intOb = key.get(28);
				int a = key.get(28);
				p12 = p12 + a;
			} else if (in9.compareTo("o") == 0) {
				Integer intOb = key.get(29);
				int a = key.get(29);
				p12 = p12 + a;
			} else if (in9.compareTo("P") == 0) {
				Integer intOb = key.get(30);
				int a = key.get(30);
				p12 = p12 + a;
			} else if (in9.compareTo("p") == 0) {
				Integer intOb = key.get(31);
				int a = key.get(31);
				p12 = p12 + a;
			} else if (in9.compareTo("Q") == 0) {
				Integer intOb = key.get(32);
				int a = key.get(32);
				p12 = p12 + a;
			} else if (in9.compareTo("q") == 0) {
				Integer intOb = key.get(33);
				int a = key.get(33);
				p12 = p12 + a;
			} else if (in9.compareTo("R") == 0) {
				Integer intOb = key.get(34);
				int a = key.get(34);
				p12 = p12 + a;
			} else if (in9.compareTo("r") == 0) {
				Integer intOb = key.get(35);
				int a = key.get(35);
				p12 = p12 + a;
			} else if (in9.compareTo("S") == 0) {
				Integer intOb = key.get(36);
				int a = key.get(36);
				p12 = p12 + a;
			} else if (in9.compareTo("s") == 0) {
				Integer intOb = key.get(37);
				int a = key.get(37);
				p12 = p12 + a;
			} else if (in9.compareTo("T") == 0) {
				Integer intOb = key.get(38);
				int a = key.get(38);
				p12 = p12 + a;
			} else if (in9.compareTo("t") == 0) {
				Integer intOb = key.get(39);
				int a = key.get(39);
				p12 = p12 + a;
			} else if (in9.compareTo("U") == 0) {
				Integer intOb = key.get(40);
				int a = key.get(40);
				p12 = p12 + a;
			} else if (in9.compareTo("u") == 0) {
				Integer intOb = key.get(41);
				int a = key.get(41);
				p12 = p12 + a;
			} else if (in9.compareTo("V") == 0) {
				Integer intOb = key.get(42);
				int a = key.get(42);
				p12 = p12 + a;
			} else if (in9.compareTo("v") == 0) {
				Integer intOb = key.get(43);
				int a = key.get(43);
				p12 = p12 + a;
			} else if (in9.compareTo("W") == 0) {
				Integer intOb = key.get(44);
				int a = key.get(44);
				p12 = p12 + a;
			} else if (in9.compareTo("w") == 0) {
				Integer intOb = key.get(45);
				int a = key.get(45);
				p12 = p12 + a;
			} else if (in9.compareTo("X") == 0) {
				Integer intOb = key.get(46);
				int a = key.get(46);
				p12 = p12 + a;
			} else if (in9.compareTo("x") == 0) {
				Integer intOb = key.get(47);
				int a = key.get(47);
				p12 = p12 + a;
			} else if (in9.compareTo("Y") == 0) {
				Integer intOb = key.get(48);
				int a = key.get(48);
				p12 = p12 + a;
			} else if (in9.compareTo("y") == 0) {
				Integer intOb = key.get(49);
				int a = key.get(49);
				p12 = p12 + a;
			} else if (in9.compareTo("Z") == 0) {
				Integer intOb = key.get(50);
				int a = key.get(50);
				p12 = p12 + a;
			} else if (in9.compareTo("z") == 0) {
				Integer intOb = key.get(51);
				int a = key.get(51);
				p12 = p12 + a;
			} else if (in9.compareTo("!") == 0) {
				Integer intOb = key.get(52);
				int a = key.get(52);
				p12 = p12 + a;
			} else {
				System.out.println("Error!");
			}

			Scanner jn = new Scanner(System.in);
			String in10 = jn.nextLine();
			if (in10.compareTo("A") == 0) {
				Integer intOb = key.get(0);
				int a = key.get(0);
				p13 = p13 + a;
			} else if (in10.compareTo("a") == 0) {
				Integer intOb = key.get(1);
				int a = key.get(1);
				p13 = p13 + a;
			} else if (in10.compareTo("B") == 0) {
				Integer intOb = key.get(2);
				int a = key.get(2);
				p13 = p13 + a;
			} else if (in10.compareTo("a") == 0) {
				Integer intOb = key.get(3);
				int a = key.get(3);
				p13 = p13 + a;
			} else if (in10.compareTo("C") == 0) {
				Integer intOb = key.get(4);
				int a = key.get(4);
				p13 = p13 + a;
			} else if (in10.compareTo("c") == 0) {
				Integer intOb = key.get(5);
				int a = key.get(5);
				p13 = p13 + a;
			} else if (in10.compareTo("D") == 0) {
				Integer intOb = key.get(6);
				int a = key.get(6);
				p13 = p13 + a;
			} else if (in10.compareTo("d") == 0) {
				Integer intOb = key.get(7);
				int a = key.get(7);
				p13 = p13 + a;
			} else if (in10.compareTo("E") == 0) {
				Integer intOb = key.get(8);
				int a = key.get(8);
				p13 = p13 + a;
			} else if (in10.compareTo("e") == 0) {
				Integer intOb = key.get(9);
				int a = key.get(9);
				p13 = p13 + a;
			} else if (in10.compareTo("F") == 0) {
				Integer intOb = key.get(10);
				int a = key.get(10);
				p13 = p13 + a;
			} else if (in10.compareTo("f") == 0) {
				Integer intOb = key.get(11);
				int a = key.get(11);
				p13 = p13 + a;
			} else if (in10.compareTo("G") == 0) {
				Integer intOb = key.get(12);
				int a = key.get(12);
				p13 = p13 + a;
			} else if (in10.compareTo("g") == 0) {
				Integer intOb = key.get(13);
				int a = key.get(13);
				p13 = p13 + a;
			} else if (in10.compareTo("H") == 0) {
				Integer intOb = key.get(14);
				int a = key.get(14);
				p13 = p13 + a;
			} else if (in10.compareTo("h") == 0) {
				Integer intOb = key.get(15);
				int a = key.get(15);
				p13 = p13 + a;
			} else if (in10.compareTo("I") == 0) {
				Integer intOb = key.get(16);
				int a = key.get(16);
				p13 = p13 + a;
			} else if (in10.compareTo("i") == 0) {
				Integer intOb = key.get(17);
				int a = key.get(17);
				p13 = p13 + a;
			} else if (in10.compareTo("J") == 0) {
				Integer intOb = key.get(18);
				int a = key.get(18);
				p13 = p13 + a;
			} else if (in10.compareTo("j") == 0) {
				Integer intOb = key.get(19);
				int a = key.get(19);
				p13 = p13 + a;
			} else if (in10.compareTo("K") == 0) {
				Integer intOb = key.get(20);
				int a = key.get(20);
				p13 = p13 + a;
			} else if (in10.compareTo("k") == 0) {
				Integer intOb = key.get(21);
				int a = key.get(21);
				p13 = p13 + a;
			} else if (in10.compareTo("L") == 0) {
				Integer intOb = key.get(22);
				int a = key.get(22);
				p13 = p13 + a;
			} else if (in10.compareTo("l") == 0) {
				Integer intOb = key.get(23);
				int a = key.get(23);
				p13 = p13 + a;
			} else if (in10.compareTo("M") == 0) {
				Integer intOb = key.get(24);
				int a = key.get(24);
				p13 = p13 + a;
			} else if (in10.compareTo("m") == 0) {
				Integer intOb = key.get(25);
				int a = key.get(25);
				p13 = p13 + a;
			} else if (in10.compareTo("N") == 0) {
				Integer intOb = key.get(26);
				int a = key.get(26);
				p13 = p13 + a;
			} else if (in10.compareTo("n") == 0) {
				Integer intOb = key.get(27);
				int a = key.get(27);
				p13 = p13 + a;
			} else if (in10.compareTo("O") == 0) {
				Integer intOb = key.get(28);
				int a = key.get(28);
				p13 = p13 + a;
			} else if (in10.compareTo("o") == 0) {
				Integer intOb = key.get(29);
				int a = key.get(29);
				p13 = p13 + a;
			} else if (in10.compareTo("P") == 0) {
				Integer intOb = key.get(30);
				int a = key.get(30);
				p13 = p13 + a;
			} else if (in10.compareTo("p") == 0) {
				Integer intOb = key.get(31);
				int a = key.get(31);
				p13 = p13 + a;
			} else if (in10.compareTo("Q") == 0) {
				Integer intOb = key.get(32);
				int a = key.get(32);
				p13 = p13 + a;
			} else if (in10.compareTo("q") == 0) {
				Integer intOb = key.get(33);
				int a = key.get(33);
				p13 = p13 + a;
			} else if (in10.compareTo("R") == 0) {
				Integer intOb = key.get(34);
				int a = key.get(34);
				p13 = p13 + a;
			} else if (in10.compareTo("r") == 0) {
				Integer intOb = key.get(35);
				int a = key.get(35);
				p13 = p13 + a;
			} else if (in10.compareTo("S") == 0) {
				Integer intOb = key.get(36);
				int a = key.get(36);
				p13 = p13 + a;
			} else if (in10.compareTo("s") == 0) {
				Integer intOb = key.get(37);
				int a = key.get(37);
				p13 = p13 + a;
			} else if (in10.compareTo("T") == 0) {
				Integer intOb = key.get(38);
				int a = key.get(38);
				p13 = p13 + a;
			} else if (in10.compareTo("t") == 0) {
				Integer intOb = key.get(39);
				int a = key.get(39);
				p13 = p13 + a;
			} else if (in10.compareTo("U") == 0) {
				Integer intOb = key.get(40);
				int a = key.get(40);
				p13 = p13 + a;
			} else if (in10.compareTo("u") == 0) {
				Integer intOb = key.get(41);
				int a = key.get(41);
				p13 = p13 + a;
			} else if (in10.compareTo("V") == 0) {
				Integer intOb = key.get(42);
				int a = key.get(42);
				p13 = p13 + a;
			} else if (in10.compareTo("v") == 0) {
				Integer intOb = key.get(43);
				int a = key.get(43);
				p13 = p13 + a;
			} else if (in10.compareTo("W") == 0) {
				Integer intOb = key.get(44);
				int a = key.get(44);
				p13 = p13 + a;
			} else if (in10.compareTo("w") == 0) {
				Integer intOb = key.get(45);
				int a = key.get(45);
				p13 = p13 + a;
			} else if (in10.compareTo("X") == 0) {
				Integer intOb = key.get(46);
				int a = key.get(46);
				p13 = p13 + a;
			} else if (in10.compareTo("x") == 0) {
				Integer intOb = key.get(47);
				int a = key.get(47);
				p13 = p13 + a;
			} else if (in10.compareTo("Y") == 0) {
				Integer intOb = key.get(48);
				int a = key.get(48);
				p13 = p13 + a;
			} else if (in10.compareTo("y") == 0) {
				Integer intOb = key.get(49);
				int a = key.get(49);
				p13 = p13 + a;
			} else if (in10.compareTo("Z") == 0) {
				Integer intOb = key.get(50);
				int a = key.get(50);
				p13 = p13 + a;
			} else if (in10.compareTo("z") == 0) {
				Integer intOb = key.get(51);
				int a = key.get(51);
				p13 = p13 + a;
			} else if (in10.compareTo("!") == 0) {
				Integer intOb = key.get(52);
				int a = key.get(52);
				p13 = p13 + a;
			} else {
				System.out.println("Error!");
			}
			Scanner kn = new Scanner(System.in);
			String in11 = kn.nextLine();
			if (in11.compareTo("A") == 0) {
				Integer intOb = key.get(0);
				int a = key.get(0);
				p14 = p14 + a;
			} else if (in11.compareTo("a") == 0) {
				Integer intOb = key.get(1);
				int a = key.get(1);
				p14 = p14 + a;
			} else if (in11.compareTo("B") == 0) {
				Integer intOb = key.get(2);
				int a = key.get(2);
				p14 = p14 + a;
			} else if (in11.compareTo("a") == 0) {
				Integer intOb = key.get(3);
				int a = key.get(3);
				p14 = p14 + a;
			} else if (in11.compareTo("C") == 0) {
				Integer intOb = key.get(4);
				int a = key.get(4);
				p14 = p14 + a;
			} else if (in11.compareTo("c") == 0) {
				Integer intOb = key.get(5);
				int a = key.get(5);
				p14 = p14 + a;
			} else if (in11.compareTo("D") == 0) {
				Integer intOb = key.get(6);
				int a = key.get(6);
				p14 = p14 + a;
			} else if (in11.compareTo("d") == 0) {
				Integer intOb = key.get(7);
				int a = key.get(7);
				p14 = p14 + a;
			} else if (in11.compareTo("E") == 0) {
				Integer intOb = key.get(8);
				int a = key.get(8);
				p14 = p14 + a;
			} else if (in11.compareTo("e") == 0) {
				Integer intOb = key.get(9);
				int a = key.get(9);
				p14 = p14 + a;
			} else if (in11.compareTo("F") == 0) {
				Integer intOb = key.get(10);
				int a = key.get(10);
				p14 = p14 + a;
			} else if (in11.compareTo("f") == 0) {
				Integer intOb = key.get(11);
				int a = key.get(11);
				p14 = p14 + a;
			} else if (in11.compareTo("G") == 0) {
				Integer intOb = key.get(12);
				int a = key.get(12);
				p14 = p14 + a;
			} else if (in11.compareTo("g") == 0) {
				Integer intOb = key.get(13);
				int a = key.get(13);
				p14 = p14 + a;
			} else if (in11.compareTo("H") == 0) {
				Integer intOb = key.get(14);
				int a = key.get(14);
				p14 = p14 + a;
			} else if (in11.compareTo("h") == 0) {
				Integer intOb = key.get(15);
				int a = key.get(15);
				p14 = p14 + a;
			} else if (in11.compareTo("I") == 0) {
				Integer intOb = key.get(16);
				int a = key.get(16);
				p14 = p14 + a;
			} else if (in11.compareTo("i") == 0) {
				Integer intOb = key.get(17);
				int a = key.get(17);
				p14 = p14 + a;
			} else if (in11.compareTo("J") == 0) {
				Integer intOb = key.get(18);
				int a = key.get(18);
				p14 = p14 + a;
			} else if (in11.compareTo("j") == 0) {
				Integer intOb = key.get(19);
				int a = key.get(19);
				p14 = p14 + a;
			} else if (in11.compareTo("K") == 0) {
				Integer intOb = key.get(20);
				int a = key.get(20);
				p14 = p14 + a;
			} else if (in11.compareTo("k") == 0) {
				Integer intOb = key.get(21);
				int a = key.get(21);
				p14 = p14 + a;
			} else if (in11.compareTo("L") == 0) {
				Integer intOb = key.get(22);
				int a = key.get(22);
				p14 = p14 + a;
			} else if (in11.compareTo("l") == 0) {
				Integer intOb = key.get(23);
				int a = key.get(23);
				p14 = p14 + a;
			} else if (in11.compareTo("M") == 0) {
				Integer intOb = key.get(24);
				int a = key.get(24);
				p14 = p14 + a;
			} else if (in11.compareTo("m") == 0) {
				Integer intOb = key.get(25);
				int a = key.get(25);
				p14 = p14 + a;
			} else if (in11.compareTo("N") == 0) {
				Integer intOb = key.get(26);
				int a = key.get(26);
				p14 = p14 + a;
			} else if (in11.compareTo("n") == 0) {
				Integer intOb = key.get(27);
				int a = key.get(27);
				p14 = p14 + a;
			} else if (in11.compareTo("O") == 0) {
				Integer intOb = key.get(28);
				int a = key.get(28);
				p14 = p14 + a;
			} else if (in11.compareTo("o") == 0) {
				Integer intOb = key.get(29);
				int a = key.get(29);
				p14 = p14 + a;
			} else if (in11.compareTo("P") == 0) {
				Integer intOb = key.get(30);
				int a = key.get(30);
				p14 = p14 + a;
			} else if (in11.compareTo("p") == 0) {
				Integer intOb = key.get(31);
				int a = key.get(31);
				p14 = p14 + a;
			} else if (in11.compareTo("Q") == 0) {
				Integer intOb = key.get(32);
				int a = key.get(32);
				p14 = p14 + a;
			} else if (in11.compareTo("q") == 0) {
				Integer intOb = key.get(33);
				int a = key.get(33);
				p14 = p14 + a;
			} else if (in11.compareTo("R") == 0) {
				Integer intOb = key.get(34);
				int a = key.get(34);
				p14 = p14 + a;
			} else if (in11.compareTo("r") == 0) {
				Integer intOb = key.get(35);
				int a = key.get(35);
				p14 = p14 + a;
			} else if (in11.compareTo("S") == 0) {
				Integer intOb = key.get(36);
				int a = key.get(36);
				p14 = p14 + a;
			} else if (in11.compareTo("s") == 0) {
				Integer intOb = key.get(37);
				int a = key.get(37);
				p14 = p14 + a;
			} else if (in11.compareTo("T") == 0) {
				Integer intOb = key.get(38);
				int a = key.get(38);
				p14 = p14 + a;
			} else if (in11.compareTo("t") == 0) {
				Integer intOb = key.get(39);
				int a = key.get(39);
				p14 = p14 + a;
			} else if (in11.compareTo("U") == 0) {
				Integer intOb = key.get(40);
				int a = key.get(40);
				p14 = p14 + a;
			} else if (in11.compareTo("u") == 0) {
				Integer intOb = key.get(41);
				int a = key.get(41);
				p14 = p14 + a;
			} else if (in11.compareTo("V") == 0) {
				Integer intOb = key.get(42);
				int a = key.get(42);
				p14 = p14 + a;
			} else if (in11.compareTo("v") == 0) {
				Integer intOb = key.get(43);
				int a = key.get(43);
				p14 = p14 + a;
			} else if (in11.compareTo("W") == 0) {
				Integer intOb = key.get(44);
				int a = key.get(44);
				p14 = p14 + a;
			} else if (in11.compareTo("w") == 0) {
				Integer intOb = key.get(45);
				int a = key.get(45);
				p14 = p14 + a;
			} else if (in11.compareTo("X") == 0) {
				Integer intOb = key.get(46);
				int a = key.get(46);
				p14 = p14 + a;
			} else if (in11.compareTo("x") == 0) {
				Integer intOb = key.get(47);
				int a = key.get(47);
				p14 = p14 + a;
			} else if (in11.compareTo("Y") == 0) {
				Integer intOb = key.get(48);
				int a = key.get(48);
				p14 = p14 + a;
			} else if (in11.compareTo("y") == 0) {
				Integer intOb = key.get(49);
				int a = key.get(49);
				p14 = p14 + a;
			} else if (in11.compareTo("Z") == 0) {
				Integer intOb = key.get(50);
				int a = key.get(50);
				p14 = p14 + a;
			} else if (in11.compareTo("z") == 0) {
				Integer intOb = key.get(51);
				int a = key.get(51);
				p14 = p14 + a;
			} else if (in11.compareTo("!") == 0) {
				Integer intOb = key.get(52);
				int a = key.get(52);
				p14 = p14 + a;
			} else {
				System.out.println("Error!");
			}
			Scanner ln = new Scanner(System.in);
			String in12 = ln.nextLine();
			if (in12.compareTo("A") == 0) {
				Integer intOb = key.get(0);
				int a = key.get(0);
				p15 = p15 + a;
			} else if (in12.compareTo("a") == 0) {
				Integer intOb = key.get(1);
				int a = key.get(1);
				p15 = p15 + a;
			} else if (in12.compareTo("B") == 0) {
				Integer intOb = key.get(2);
				int a = key.get(2);
				p15 = p15 + a;
			} else if (in12.compareTo("a") == 0) {
				Integer intOb = key.get(3);
				int a = key.get(3);
				p15 = p15 + a;
			} else if (in12.compareTo("C") == 0) {
				Integer intOb = key.get(4);
				int a = key.get(4);
				p15 = p15 + a;
			} else if (in12.compareTo("c") == 0) {
				Integer intOb = key.get(5);
				int a = key.get(5);
				p15 = p15 + a;
			} else if (in12.compareTo("D") == 0) {
				Integer intOb = key.get(6);
				int a = key.get(6);
				p15 = p15 + a;
			} else if (in12.compareTo("d") == 0) {
				Integer intOb = key.get(7);
				int a = key.get(7);
				p15 = p15 + a;
			} else if (in12.compareTo("E") == 0) {
				Integer intOb = key.get(8);
				int a = key.get(8);
				p15 = p15 + a;
			} else if (in12.compareTo("e") == 0) {
				Integer intOb = key.get(9);
				int a = key.get(9);
				p15 = p15 + a;
			} else if (in12.compareTo("F") == 0) {
				Integer intOb = key.get(10);
				int a = key.get(10);
				p15 = p15 + a;
			} else if (in12.compareTo("f") == 0) {
				Integer intOb = key.get(11);
				int a = key.get(11);
				p15 = p15 + a;
			} else if (in12.compareTo("G") == 0) {
				Integer intOb = key.get(12);
				int a = key.get(12);
				p15 = p15 + a;
			} else if (in12.compareTo("g") == 0) {
				Integer intOb = key.get(13);
				int a = key.get(13);
				p15 = p15 + a;
			} else if (in12.compareTo("H") == 0) {
				Integer intOb = key.get(14);
				int a = key.get(14);
				p15 = p15 + a;
			} else if (in12.compareTo("h") == 0) {
				Integer intOb = key.get(15);
				int a = key.get(15);
				p15 = p15 + a;
			} else if (in12.compareTo("I") == 0) {
				Integer intOb = key.get(16);
				int a = key.get(16);
				p15 = p15 + a;
			} else if (in12.compareTo("i") == 0) {
				Integer intOb = key.get(17);
				int a = key.get(17);
				p15 = p15 + a;
			} else if (in12.compareTo("J") == 0) {
				Integer intOb = key.get(18);
				int a = key.get(18);
				p15 = p15 + a;
			} else if (in12.compareTo("j") == 0) {
				Integer intOb = key.get(19);
				int a = key.get(19);
				p15 = p15 + a;
			} else if (in12.compareTo("K") == 0) {
				Integer intOb = key.get(20);
				int a = key.get(20);
				p15 = p15 + a;
			} else if (in12.compareTo("k") == 0) {
				Integer intOb = key.get(21);
				int a = key.get(21);
				p15 = p15 + a;
			} else if (in12.compareTo("L") == 0) {
				Integer intOb = key.get(22);
				int a = key.get(22);
				p15 = p15 + a;
			} else if (in12.compareTo("l") == 0) {
				Integer intOb = key.get(23);
				int a = key.get(23);
				p15 = p15 + a;
			} else if (in12.compareTo("M") == 0) {
				Integer intOb = key.get(24);
				int a = key.get(24);
				p15 = p15 + a;
			} else if (in12.compareTo("m") == 0) {
				Integer intOb = key.get(25);
				int a = key.get(25);
				p15 = p15 + a;
			} else if (in12.compareTo("N") == 0) {
				Integer intOb = key.get(26);
				int a = key.get(26);
				p15 = p15 + a;
			} else if (in12.compareTo("n") == 0) {
				Integer intOb = key.get(27);
				int a = key.get(27);
				p15 = p15 + a;
			} else if (in12.compareTo("O") == 0) {
				Integer intOb = key.get(28);
				int a = key.get(28);
				p15 = p15 + a;
			} else if (in12.compareTo("o") == 0) {
				Integer intOb = key.get(29);
				int a = key.get(29);
				p15 = p15 + a;
			} else if (in12.compareTo("P") == 0) {
				Integer intOb = key.get(30);
				int a = key.get(30);
				p15 = p15 + a;
			} else if (in12.compareTo("p") == 0) {
				Integer intOb = key.get(31);
				int a = key.get(31);
				p15 = p15 + a;
			} else if (in12.compareTo("Q") == 0) {
				Integer intOb = key.get(32);
				int a = key.get(32);
				p15 = p15 + a;
			} else if (in12.compareTo("q") == 0) {
				Integer intOb = key.get(33);
				int a = key.get(33);
				p15 = p15 + a;
			} else if (in12.compareTo("R") == 0) {
				Integer intOb = key.get(34);
				int a = key.get(34);
				p15 = p15 + a;
			} else if (in12.compareTo("r") == 0) {
				Integer intOb = key.get(35);
				int a = key.get(35);
				p15 = p15 + a;
			} else if (in12.compareTo("S") == 0) {
				Integer intOb = key.get(36);
				int a = key.get(36);
				p15 = p15 + a;
			} else if (in12.compareTo("s") == 0) {
				Integer intOb = key.get(37);
				int a = key.get(37);
				p15 = p15 + a;
			} else if (in12.compareTo("T") == 0) {
				Integer intOb = key.get(38);
				int a = key.get(38);
				p15 = p15 + a;
			} else if (in12.compareTo("t") == 0) {
				Integer intOb = key.get(39);
				int a = key.get(39);
				p15 = p15 + a;
			} else if (in12.compareTo("U") == 0) {
				Integer intOb = key.get(40);
				int a = key.get(40);
				p15 = p15 + a;
			} else if (in12.compareTo("u") == 0) {
				Integer intOb = key.get(41);
				int a = key.get(41);
				p15 = p15 + a;
			} else if (in12.compareTo("V") == 0) {
				Integer intOb = key.get(42);
				int a = key.get(42);
				p15 = p15 + a;
			} else if (in12.compareTo("v") == 0) {
				Integer intOb = key.get(43);
				int a = key.get(43);
				p15 = p15 + a;
			} else if (in12.compareTo("W") == 0) {
				Integer intOb = key.get(44);
				int a = key.get(44);
				p15 = p15 + a;
			} else if (in12.compareTo("w") == 0) {
				Integer intOb = key.get(45);
				int a = key.get(45);
				p15 = p15 + a;
			} else if (in12.compareTo("X") == 0) {
				Integer intOb = key.get(46);
				int a = key.get(46);
				p15 = p15 + a;
			} else if (in12.compareTo("x") == 0) {
				Integer intOb = key.get(47);
				int a = key.get(47);
				p15 = p15 + a;
			} else if (in12.compareTo("Y") == 0) {
				Integer intOb = key.get(48);
				int a = key.get(48);
				p15 = p15 + a;
			} else if (in12.compareTo("y") == 0) {
				Integer intOb = key.get(49);
				int a = key.get(49);
				p15 = p15 + a;
			} else if (in12.compareTo("Z") == 0) {
				Integer intOb = key.get(50);
				int a = key.get(50);
				p15 = p15 + a;
			} else if (in12.compareTo("z") == 0) {
				Integer intOb = key.get(51);
				int a = key.get(51);
				p15 = p15 + a;
			} else if (in12.compareTo("!") == 0) {
				Integer intOb = key.get(52);
				int a = key.get(52);
				p15 = p15 + a;
			} else {
				System.out.println("Error!");
			}
			Scanner mn = new Scanner(System.in);
			String in13 = mn.nextLine();
			if (in13.compareTo("A") == 0) {
				Integer intOb = key.get(0);
				int a = key.get(0);
				p16 = p16 + a;
			} else if (in13.compareTo("a") == 0) {
				Integer intOb = key.get(1);
				int a = key.get(1);
				p16 = p16 + a;
			} else if (in13.compareTo("B") == 0) {
				Integer intOb = key.get(2);
				int a = key.get(2);
				p16 = p16 + a;
			} else if (in13.compareTo("a") == 0) {
				Integer intOb = key.get(3);
				int a = key.get(3);
				p16 = p16 + a;
			} else if (in13.compareTo("C") == 0) {
				Integer intOb = key.get(4);
				int a = key.get(4);
				p16 = p16 + a;
			} else if (in13.compareTo("c") == 0) {
				Integer intOb = key.get(5);
				int a = key.get(5);
				p16 = p16 + a;
			} else if (in13.compareTo("D") == 0) {
				Integer intOb = key.get(6);
				int a = key.get(6);
				p16 = p16 + a;
			} else if (in13.compareTo("d") == 0) {
				Integer intOb = key.get(7);
				int a = key.get(7);
				p16 = p16 + a;
			} else if (in13.compareTo("E") == 0) {
				Integer intOb = key.get(8);
				int a = key.get(8);
				p16 = p16 + a;
			} else if (in13.compareTo("e") == 0) {
				Integer intOb = key.get(9);
				int a = key.get(9);
				p16 = p16 + a;
			} else if (in13.compareTo("F") == 0) {
				Integer intOb = key.get(10);
				int a = key.get(10);
				p16 = p16 + a;
			} else if (in13.compareTo("f") == 0) {
				Integer intOb = key.get(11);
				int a = key.get(11);
				p16 = p16 + a;
			} else if (in13.compareTo("G") == 0) {
				Integer intOb = key.get(12);
				int a = key.get(12);
				p16 = p16 + a;
			} else if (in13.compareTo("g") == 0) {
				Integer intOb = key.get(13);
				int a = key.get(13);
				p16 = p16 + a;
			} else if (in13.compareTo("H") == 0) {
				Integer intOb = key.get(14);
				int a = key.get(14);
				p16 = p16 + a;
			} else if (in13.compareTo("h") == 0) {
				Integer intOb = key.get(15);
				int a = key.get(15);
				p16 = p16 + a;
			} else if (in13.compareTo("I") == 0) {
				Integer intOb = key.get(16);
				int a = key.get(16);
				p16 = p16 + a;
			} else if (in13.compareTo("i") == 0) {
				Integer intOb = key.get(17);
				int a = key.get(17);
				p16 = p16 + a;
			} else if (in13.compareTo("J") == 0) {
				Integer intOb = key.get(18);
				int a = key.get(18);
				p16 = p16 + a;
			} else if (in13.compareTo("j") == 0) {
				Integer intOb = key.get(19);
				int a = key.get(19);
				p16 = p16 + a;
			} else if (in13.compareTo("K") == 0) {
				Integer intOb = key.get(20);
				int a = key.get(20);
				p16 = p16 + a;
			} else if (in13.compareTo("k") == 0) {
				Integer intOb = key.get(21);
				int a = key.get(21);
				p16 = p16 + a;
			} else if (in13.compareTo("L") == 0) {
				Integer intOb = key.get(22);
				int a = key.get(22);
				p16 = p16 + a;
			} else if (in13.compareTo("l") == 0) {
				Integer intOb = key.get(23);
				int a = key.get(23);
				p16 = p16 + a;
			} else if (in13.compareTo("M") == 0) {
				Integer intOb = key.get(24);
				int a = key.get(24);
				p16 = p16 + a;
			} else if (in13.compareTo("m") == 0) {
				Integer intOb = key.get(25);
				int a = key.get(25);
				p16 = p16 + a;
			} else if (in13.compareTo("N") == 0) {
				Integer intOb = key.get(26);
				int a = key.get(26);
				p16 = p16 + a;
			} else if (in13.compareTo("n") == 0) {
				Integer intOb = key.get(27);
				int a = key.get(27);
				p16 = p16 + a;
			} else if (in13.compareTo("O") == 0) {
				Integer intOb = key.get(28);
				int a = key.get(28);
				p16 = p16 + a;
			} else if (in13.compareTo("o") == 0) {
				Integer intOb = key.get(29);
				int a = key.get(29);
				p16 = p16 + a;
			} else if (in13.compareTo("P") == 0) {
				Integer intOb = key.get(30);
				int a = key.get(30);
				p16 = p16 + a;
			} else if (in13.compareTo("p") == 0) {
				Integer intOb = key.get(31);
				int a = key.get(31);
				p16 = p16 + a;
			} else if (in13.compareTo("Q") == 0) {
				Integer intOb = key.get(32);
				int a = key.get(32);
				p16 = p16 + a;
			} else if (in13.compareTo("q") == 0) {
				Integer intOb = key.get(33);
				int a = key.get(33);
				p16 = p16 + a;
			} else if (in13.compareTo("R") == 0) {
				Integer intOb = key.get(34);
				int a = key.get(34);
				p16 = p16 + a;
			} else if (in13.compareTo("r") == 0) {
				Integer intOb = key.get(35);
				int a = key.get(35);
				p16 = p16 + a;
			} else if (in13.compareTo("S") == 0) {
				Integer intOb = key.get(36);
				int a = key.get(36);
				p16 = p16 + a;
			} else if (in13.compareTo("s") == 0) {
				Integer intOb = key.get(37);
				int a = key.get(37);
				p16 = p16 + a;
			} else if (in13.compareTo("T") == 0) {
				Integer intOb = key.get(38);
				int a = key.get(38);
				p16 = p16 + a;
			} else if (in13.compareTo("t") == 0) {
				Integer intOb = key.get(39);
				int a = key.get(39);
				p16 = p16 + a;
			} else if (in13.compareTo("U") == 0) {
				Integer intOb = key.get(40);
				int a = key.get(40);
				p16 = p16 + a;
			} else if (in13.compareTo("u") == 0) {
				Integer intOb = key.get(41);
				int a = key.get(41);
				p16 = p16 + a;
			} else if (in13.compareTo("V") == 0) {
				Integer intOb = key.get(42);
				int a = key.get(42);
				p16 = p16 + a;
			} else if (in13.compareTo("v") == 0) {
				Integer intOb = key.get(43);
				int a = key.get(43);
				p16 = p16 + a;
			} else if (in13.compareTo("W") == 0) {
				Integer intOb = key.get(44);
				int a = key.get(44);
				p16 = p16 + a;
			} else if (in13.compareTo("w") == 0) {
				Integer intOb = key.get(45);
				int a = key.get(45);
				p16 = p16 + a;
			} else if (in13.compareTo("X") == 0) {
				Integer intOb = key.get(46);
				int a = key.get(46);
				p16 = p16 + a;
			} else if (in13.compareTo("x") == 0) {
				Integer intOb = key.get(47);
				int a = key.get(47);
				p16 = p16 + a;
			} else if (in13.compareTo("Y") == 0) {
				Integer intOb = key.get(48);
				int a = key.get(48);
				p16 = p16 + a;
			} else if (in13.compareTo("y") == 0) {
				Integer intOb = key.get(49);
				int a = key.get(49);
				p16 = p16 + a;
			} else if (in13.compareTo("Z") == 0) {
				Integer intOb = key.get(50);
				int a = key.get(50);
				p16 = p16 + a;
			} else if (in13.compareTo("z") == 0) {
				Integer intOb = key.get(51);
				int a = key.get(51);
				p16 = p16 + a;
			} else if (in13.compareTo("!") == 0) {
				Integer intOb = key.get(52);
				int a = key.get(52);
				p16 = p16 + a;
			} else {
				System.out.println("Error!");
			}
			Scanner nn = new Scanner(System.in);
			String in14 = nn.nextLine();
			if (in14.compareTo("A") == 0) {
				Integer intOb = key.get(0);
				int a = key.get(0);
				p17 = p17 + a;
			} else if (in14.compareTo("a") == 0) {
				Integer intOb = key.get(1);
				int a = key.get(1);
				p17 = p17 + a;
			} else if (in14.compareTo("B") == 0) {
				Integer intOb = key.get(2);
				int a = key.get(2);
				p17 = p17 + a;
			} else if (in14.compareTo("a") == 0) {
				Integer intOb = key.get(3);
				int a = key.get(3);
				p17 = p17 + a;
			} else if (in14.compareTo("C") == 0) {
				Integer intOb = key.get(4);
				int a = key.get(4);
				p17 = p17 + a;
			} else if (in14.compareTo("c") == 0) {
				Integer intOb = key.get(5);
				int a = key.get(5);
				p17 = p17 + a;
			} else if (in14.compareTo("D") == 0) {
				Integer intOb = key.get(6);
				int a = key.get(6);
				p17 = p17 + a;
			} else if (in14.compareTo("d") == 0) {
				Integer intOb = key.get(7);
				int a = key.get(7);
				p17 = p17 + a;
			} else if (in14.compareTo("E") == 0) {
				Integer intOb = key.get(8);
				int a = key.get(8);
				p17 = p17 + a;
			} else if (in14.compareTo("e") == 0) {
				Integer intOb = key.get(9);
				int a = key.get(9);
				p17 = p17 + a;
			} else if (in14.compareTo("F") == 0) {
				Integer intOb = key.get(10);
				int a = key.get(10);
				p17 = p17 + a;
			} else if (in14.compareTo("f") == 0) {
				Integer intOb = key.get(11);
				int a = key.get(11);
				p17 = p17 + a;
			} else if (in14.compareTo("G") == 0) {
				Integer intOb = key.get(12);
				int a = key.get(12);
				p17 = p17 + a;
			} else if (in14.compareTo("g") == 0) {
				Integer intOb = key.get(13);
				int a = key.get(13);
				p17 = p17 + a;
			} else if (in14.compareTo("H") == 0) {
				Integer intOb = key.get(14);
				int a = key.get(14);
				p17 = p17 + a;
			} else if (in14.compareTo("h") == 0) {
				Integer intOb = key.get(15);
				int a = key.get(15);
				p17 = p17 + a;
			} else if (in14.compareTo("I") == 0) {
				Integer intOb = key.get(16);
				int a = key.get(16);
				p17 = p17 + a;
			} else if (in14.compareTo("i") == 0) {
				Integer intOb = key.get(17);
				int a = key.get(17);
				p17 = p17 + a;
			} else if (in14.compareTo("J") == 0) {
				Integer intOb = key.get(18);
				int a = key.get(18);
				p17 = p17 + a;
			} else if (in14.compareTo("j") == 0) {
				Integer intOb = key.get(19);
				int a = key.get(19);
				p17 = p17 + a;
			} else if (in14.compareTo("K") == 0) {
				Integer intOb = key.get(20);
				int a = key.get(20);
				p17 = p17 + a;
			} else if (in14.compareTo("k") == 0) {
				Integer intOb = key.get(21);
				int a = key.get(21);
				p17 = p17 + a;
			} else if (in14.compareTo("L") == 0) {
				Integer intOb = key.get(22);
				int a = key.get(22);
				p17 = p17 + a;
			} else if (in14.compareTo("l") == 0) {
				Integer intOb = key.get(23);
				int a = key.get(23);
				p17 = p17 + a;
			} else if (in14.compareTo("M") == 0) {
				Integer intOb = key.get(24);
				int a = key.get(24);
				p17 = p17 + a;
			} else if (in14.compareTo("m") == 0) {
				Integer intOb = key.get(25);
				int a = key.get(25);
				p17 = p17 + a;
			} else if (in14.compareTo("N") == 0) {
				Integer intOb = key.get(26);
				int a = key.get(26);
				p17 = p17 + a;
			} else if (in14.compareTo("n") == 0) {
				Integer intOb = key.get(27);
				int a = key.get(27);
				p17 = p17 + a;
			} else if (in14.compareTo("O") == 0) {
				Integer intOb = key.get(28);
				int a = key.get(28);
				p17 = p17 + a;
			} else if (in14.compareTo("o") == 0) {
				Integer intOb = key.get(29);
				int a = key.get(29);
				p17 = p17 + a;
			} else if (in14.compareTo("P") == 0) {
				Integer intOb = key.get(30);
				int a = key.get(30);
				p17 = p17 + a;
			} else if (in14.compareTo("p") == 0) {
				Integer intOb = key.get(31);
				int a = key.get(31);
				p17 = p17 + a;
			} else if (in14.compareTo("Q") == 0) {
				Integer intOb = key.get(32);
				int a = key.get(32);
				p17 = p17 + a;
			} else if (in14.compareTo("q") == 0) {
				Integer intOb = key.get(33);
				int a = key.get(33);
				p17 = p17 + a;
			} else if (in14.compareTo("R") == 0) {
				Integer intOb = key.get(34);
				int a = key.get(34);
				p17 = p17 + a;
			} else if (in14.compareTo("r") == 0) {
				Integer intOb = key.get(35);
				int a = key.get(35);
				p17 = p17 + a;
			} else if (in14.compareTo("S") == 0) {
				Integer intOb = key.get(36);
				int a = key.get(36);
				p17 = p17 + a;
			} else if (in14.compareTo("s") == 0) {
				Integer intOb = key.get(37);
				int a = key.get(37);
				p17 = p17 + a;
			} else if (in14.compareTo("T") == 0) {
				Integer intOb = key.get(38);
				int a = key.get(38);
				p17 = p17 + a;
			} else if (in14.compareTo("t") == 0) {
				Integer intOb = key.get(39);
				int a = key.get(39);
				p17 = p17 + a;
			} else if (in14.compareTo("U") == 0) {
				Integer intOb = key.get(40);
				int a = key.get(40);
				p17 = p17 + a;
			} else if (in14.compareTo("u") == 0) {
				Integer intOb = key.get(41);
				int a = key.get(41);
				p17 = p17 + a;
			} else if (in14.compareTo("V") == 0) {
				Integer intOb = key.get(42);
				int a = key.get(42);
				p17 = p17 + a;
			} else if (in14.compareTo("v") == 0) {
				Integer intOb = key.get(43);
				int a = key.get(43);
				p17 = p17 + a;
			} else if (in14.compareTo("W") == 0) {
				Integer intOb = key.get(44);
				int a = key.get(44);
				p17 = p17 + a;
			} else if (in14.compareTo("w") == 0) {
				Integer intOb = key.get(45);
				int a = key.get(45);
				p17 = p17 + a;
			} else if (in14.compareTo("X") == 0) {
				Integer intOb = key.get(46);
				int a = key.get(46);
				p17 = p17 + a;
			} else if (in14.compareTo("x") == 0) {
				Integer intOb = key.get(47);
				int a = key.get(47);
				p17 = p17 + a;
			} else if (in14.compareTo("Y") == 0) {
				Integer intOb = key.get(48);
				int a = key.get(48);
				p17 = p17 + a;
			} else if (in14.compareTo("y") == 0) {
				Integer intOb = key.get(49);
				int a = key.get(49);
				p17 = p17 + a;
			} else if (in14.compareTo("Z") == 0) {
				Integer intOb = key.get(50);
				int a = key.get(50);
				p17 = p17 + a;
			} else if (in14.compareTo("z") == 0) {
				Integer intOb = key.get(51);
				int a = key.get(51);
				p17 = p17 + a;
			} else if (in14.compareTo("!") == 0) {
				Integer intOb = key.get(52);
				int a = key.get(52);
				p17 = p17 + a;
			} else {
				System.out.println("Error!");
			}
			Scanner on = new Scanner(System.in);
			String in15 = on.nextLine();
			if (in15.compareTo("A") == 0) {
				Integer intOb = key.get(0);
				int a = key.get(0);
				p18 = p18 + a;
			} else if (in15.compareTo("a") == 0) {
				Integer intOb = key.get(1);
				int a = key.get(1);
				p18 = p18 + a;
			} else if (in15.compareTo("B") == 0) {
				Integer intOb = key.get(2);
				int a = key.get(2);
				p18 = p18 + a;
			} else if (in15.compareTo("a") == 0) {
				Integer intOb = key.get(3);
				int a = key.get(3);
				p18 = p18 + a;
			} else if (in15.compareTo("C") == 0) {
				Integer intOb = key.get(4);
				int a = key.get(4);
				p18 = p18 + a;
			} else if (in15.compareTo("c") == 0) {
				Integer intOb = key.get(5);
				int a = key.get(5);
				p18 = p18 + a;
			} else if (in15.compareTo("D") == 0) {
				Integer intOb = key.get(6);
				int a = key.get(6);
				p18 = p18 + a;
			} else if (in15.compareTo("d") == 0) {
				Integer intOb = key.get(7);
				int a = key.get(7);
				p18 = p18 + a;
			} else if (in15.compareTo("E") == 0) {
				Integer intOb = key.get(8);
				int a = key.get(8);
				p18 = p18 + a;
			} else if (in15.compareTo("e") == 0) {
				Integer intOb = key.get(9);
				int a = key.get(9);
				p18 = p18 + a;
			} else if (in15.compareTo("F") == 0) {
				Integer intOb = key.get(10);
				int a = key.get(10);
				p18 = p18 + a;
			} else if (in15.compareTo("f") == 0) {
				Integer intOb = key.get(11);
				int a = key.get(11);
				p18 = p18 + a;
			} else if (in15.compareTo("G") == 0) {
				Integer intOb = key.get(12);
				int a = key.get(12);
				p18 = p18 + a;
			} else if (in15.compareTo("g") == 0) {
				Integer intOb = key.get(13);
				int a = key.get(13);
				p18 = p18 + a;
			} else if (in15.compareTo("H") == 0) {
				Integer intOb = key.get(14);
				int a = key.get(14);
				p18 = p18 + a;
			} else if (in15.compareTo("h") == 0) {
				Integer intOb = key.get(15);
				int a = key.get(15);
				p18 = p18 + a;
			} else if (in15.compareTo("I") == 0) {
				Integer intOb = key.get(16);
				int a = key.get(16);
				p18 = p18 + a;
			} else if (in15.compareTo("i") == 0) {
				Integer intOb = key.get(17);
				int a = key.get(17);
				p18 = p18 + a;
			} else if (in15.compareTo("J") == 0) {
				Integer intOb = key.get(18);
				int a = key.get(18);
				p18 = p18 + a;
			} else if (in15.compareTo("j") == 0) {
				Integer intOb = key.get(19);
				int a = key.get(19);
				p18 = p18 + a;
			} else if (in15.compareTo("K") == 0) {
				Integer intOb = key.get(20);
				int a = key.get(20);
				p18 = p18 + a;
			} else if (in15.compareTo("k") == 0) {
				Integer intOb = key.get(21);
				int a = key.get(21);
				p18 = p18 + a;
			} else if (in15.compareTo("L") == 0) {
				Integer intOb = key.get(22);
				int a = key.get(22);
				p18 = p18 + a;
			} else if (in15.compareTo("l") == 0) {
				Integer intOb = key.get(23);
				int a = key.get(23);
				p18 = p18 + a;
			} else if (in15.compareTo("M") == 0) {
				Integer intOb = key.get(24);
				int a = key.get(24);
				p18 = p18 + a;
			} else if (in15.compareTo("m") == 0) {
				Integer intOb = key.get(25);
				int a = key.get(25);
				p18 = p18 + a;
			} else if (in15.compareTo("N") == 0) {
				Integer intOb = key.get(26);
				int a = key.get(26);
				p18 = p18 + a;
			} else if (in15.compareTo("n") == 0) {
				Integer intOb = key.get(27);
				int a = key.get(27);
				p18 = p18 + a;
			} else if (in15.compareTo("O") == 0) {
				Integer intOb = key.get(28);
				int a = key.get(28);
				p18 = p18 + a;
			} else if (in15.compareTo("o") == 0) {
				Integer intOb = key.get(29);
				int a = key.get(29);
				p18 = p18 + a;
			} else if (in15.compareTo("P") == 0) {
				Integer intOb = key.get(30);
				int a = key.get(30);
				p18 = p18 + a;
			} else if (in15.compareTo("p") == 0) {
				Integer intOb = key.get(31);
				int a = key.get(31);
				p18 = p18 + a;
			} else if (in15.compareTo("Q") == 0) {
				Integer intOb = key.get(32);
				int a = key.get(32);
				p18 = p18 + a;
			} else if (in15.compareTo("q") == 0) {
				Integer intOb = key.get(33);
				int a = key.get(33);
				p18 = p18 + a;
			} else if (in15.compareTo("R") == 0) {
				Integer intOb = key.get(34);
				int a = key.get(34);
				p18 = p18 + a;
			} else if (in15.compareTo("r") == 0) {
				Integer intOb = key.get(35);
				int a = key.get(35);
				p18 = p18 + a;
			} else if (in15.compareTo("S") == 0) {
				Integer intOb = key.get(36);
				int a = key.get(36);
				p18 = p18 + a;
			} else if (in15.compareTo("s") == 0) {
				Integer intOb = key.get(37);
				int a = key.get(37);
				p18 = p18 + a;
			} else if (in15.compareTo("T") == 0) {
				Integer intOb = key.get(38);
				int a = key.get(38);
				p18 = p18 + a;
			} else if (in15.compareTo("t") == 0) {
				Integer intOb = key.get(39);
				int a = key.get(39);
				p18 = p18 + a;
			} else if (in15.compareTo("U") == 0) {
				Integer intOb = key.get(40);
				int a = key.get(40);
				p18 = p18 + a;
			} else if (in15.compareTo("u") == 0) {
				Integer intOb = key.get(41);
				int a = key.get(41);
				p18 = p18 + a;
			} else if (in15.compareTo("V") == 0) {
				Integer intOb = key.get(42);
				int a = key.get(42);
				p18 = p18 + a;
			} else if (in15.compareTo("v") == 0) {
				Integer intOb = key.get(43);
				int a = key.get(43);
				p18 = p18 + a;
			} else if (in15.compareTo("W") == 0) {
				Integer intOb = key.get(44);
				int a = key.get(44);
				p18 = p18 + a;
			} else if (in15.compareTo("w") == 0) {
				Integer intOb = key.get(45);
				int a = key.get(45);
				p18 = p18 + a;
			} else if (in15.compareTo("X") == 0) {
				Integer intOb = key.get(46);
				int a = key.get(46);
				p18 = p18 + a;
			} else if (in15.compareTo("x") == 0) {
				Integer intOb = key.get(47);
				int a = key.get(47);
				p18 = p18 + a;
			} else if (in15.compareTo("Y") == 0) {
				Integer intOb = key.get(48);
				int a = key.get(48);
				p18 = p18 + a;
			} else if (in15.compareTo("y") == 0) {
				Integer intOb = key.get(49);
				int a = key.get(49);
				p18 = p18 + a;
			} else if (in15.compareTo("Z") == 0) {
				Integer intOb = key.get(50);
				int a = key.get(50);
				p18 = p18 + a;
			} else if (in15.compareTo("z") == 0) {
				Integer intOb = key.get(51);
				int a = key.get(51);
				p18 = p18 + a;
			} else if (in15.compareTo("!") == 0) {
				Integer intOb = key.get(52);
				int a = key.get(52);
				p18 = p18 + a;
			} else {
				System.out.println("Error!");
			}
			System.out.println("Have special order?");
			System.out.println("enter Y to have special order, N to continue.");
			Scanner spe = new Scanner(System.in);
			String sp = spe.nextLine();
			if (sp.compareTo("Y") == 0) {
				System.out.println("Enter your special order, please.");
				Scanner qn = new Scanner(System.in);
				int in17 = qn.nextInt();
				p19 = in17;
				Scanner rn = new Scanner(System.in);
				int in18 = qn.nextInt();
				p20 = in18;
				Scanner sn = new Scanner(System.in);
				int in19 = qn.nextInt();
				p21 = in19;
				Scanner tn = new Scanner(System.in);
				int in20 = qn.nextInt();
				p22 = in20;
			} else if (sp.compareTo("N") == 0) {
				p19 = -1;
				p20 = -1;
				p21 = -1;
				p22 = -1;
			} else {
				System.out.println("Error!");
			}

			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
			System.out.println(p4);
			System.out.println(p5);
			System.out.println(p6);
			System.out.println(p7);
			System.out.println(p8);
			System.out.println(p9);
			System.out.println(p10);
			System.out.println(p11);
			System.out.println(p12);
			System.out.println(p13);
			System.out.println(p14);
			System.out.println(p15);
			System.out.println(p16);
			System.out.println(p17);
			System.out.println(p18);
			System.out.println(p19);
			System.out.println(p20);
			System.out.println(p21);
			System.out.println(p22);
//			System.out.println(p23);
//			System.out.println(p24);
//			System.out.println(p25);
//			System.out.println(p26);
//			System.out.println(p27);
//			System.out.println(p28);
//			System.out.println(p29);
//			System.out.println(p30);
			List<Integer> info=new ArrayList<Integer>();
			System.out.println("Give the info you have to translate.");
			Scanner a =new Scanner(System.in);
			List <Integer> list= new ArrayList<Integer>();
			final String SENTINEL = ".";
			System.out.println("Enter your info end with \".\"");
			String value =a.nextLine();
			while (value !=SENTINEL) {
			
			}

		} else if (sta.compareTo("ch") == 0) {
			System.out.println("Tell me how many KEY you want to change?");
			Scanner c = new Scanner(System.in);
			int ti = c.nextInt();
			int tim = 0;
			while (tim < ti) {
				System.out.println("The position of the old KEY.");
				Scanner d = new Scanner(System.in);
				int okey = (int) d.nextInt();
				System.out.println("The new KEY.");
				Scanner e = new Scanner(System.in);
				int nkey = (int) e.nextInt();
				key.remove(okey);
				key.add(okey, nkey);
				tim++;
			}

		}
//		System.out.println(key);
	}
}
