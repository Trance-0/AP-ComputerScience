package info;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class CryptographySystemII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> key = new ArrayList<Integer>();
		for (int f = 0; f < 52; f++) {
			key.add(f);
		}
		key.add(52, 0);

		List<Integer> index = new ArrayList<Integer>();
		int p1 = 0;// hour
		int p2 = 0;// day of week
		int p3 = 0;// day of month
		int org = 0;
		index.add(org);// Original code
		System.out.println("Encryption or Decryption?");
		System.out.println("Encryption enter \"E\"");
		System.out.println("Decryption enter \"D\"");
		Scanner n = new Scanner(System.in);
		String sta = n.nextLine();
		if (sta.compareTo("E") == 0) {
			Calendar cl = Calendar.getInstance();
			Date date = new Date();
			p1 = cl.get(Calendar.HOUR_OF_DAY);
			p2 = cl.get(Calendar.DAY_OF_WEEK);
			p3 = cl.get(Calendar.DAY_OF_MONTH);
			System.out.print(" " + p1);// test
			System.out.print(" " + p2);// test
			System.out.print(" " + p3);// test
			int ti = p1 + p2 + p3;
			System.out.println();
			System.out.println("Enter the user name. end in 15 words,use \"Enter\" to end. ");
			int e = 15;
			while (e >= 0) {
				Scanner an = new Scanner(System.in);
				String in1 = an.nextLine();
				if (in1.compareTo("A") == 0) {
					int a = key.get(0);
					index.add(a + 1);
				} else if (in1.compareTo("a") == 0) {
					int a = key.get(1);
					index.add(a + 1);
				} else if (in1.compareTo("B") == 0) {
					int a = key.get(2);
					index.add(a + 1);
				} else if (in1.compareTo("b") == 0) {
					int a = key.get(3);
					index.add(a + 1);
				} else if (in1.compareTo("C") == 0) {
					int a = key.get(4);
					index.add(a + 1);
				} else if (in1.compareTo("c") == 0) {
					int a = key.get(5);
					index.add(a + 1);
				} else if (in1.compareTo("D") == 0) {
					int a = key.get(6);
					index.add(a + 1);
				} else if (in1.compareTo("d") == 0) {
					int a = key.get(7);
					index.add(a + 1);
				} else if (in1.compareTo("E") == 0) {
					int a = key.get(8);
					index.add(a + 1);
				} else if (in1.compareTo("e") == 0) {
					int a = key.get(9);
					index.add(a + 1);
				} else if (in1.compareTo("F") == 0) {
					int a = key.get(10);
					index.add(a + 1);
				} else if (in1.compareTo("f") == 0) {
					int a = key.get(11);
					index.add(a + 1);
				} else if (in1.compareTo("G") == 0) {
					int a = key.get(12);
					index.add(a + 1);
				} else if (in1.compareTo("g") == 0) {
					int a = key.get(13);
					index.add(a + 1);
				} else if (in1.compareTo("H") == 0) {
					int a = key.get(14);
					index.add(a + 1);
				} else if (in1.compareTo("h") == 0) {
					int a = key.get(15);
					index.add(a + 1);
				} else if (in1.compareTo("I") == 0) {
					int a = key.get(16);
					index.add(a + 1);
				} else if (in1.compareTo("i") == 0) {
					int a = key.get(17);
					index.add(a + 1);
				} else if (in1.compareTo("J") == 0) {
					int a = key.get(18);
					index.add(a + 1);
				} else if (in1.compareTo("j") == 0) {
					int a = key.get(19);
					index.add(a + 1);
				} else if (in1.compareTo("K") == 0) {
					int a = key.get(20);
					index.add(a + 1);
				} else if (in1.compareTo("k") == 0) {
					int a = key.get(21);
					index.add(a + 1);
				} else if (in1.compareTo("L") == 0) {
					int a = key.get(22);
					index.add(a + 1);
				} else if (in1.compareTo("l") == 0) {
					int a = key.get(23);
					index.add(a + 1);
				} else if (in1.compareTo("M") == 0) {
					int a = key.get(24);
					index.add(a + 1);
				} else if (in1.compareTo("m") == 0) {
					int a = key.get(25);
					index.add(a + 1);
				} else if (in1.compareTo("N") == 0) {
					int a = key.get(26);
					index.add(a + 1);
				} else if (in1.compareTo("n") == 0) {
					int a = key.get(27);
					index.add(a + 1);
				} else if (in1.compareTo("O") == 0) {
					int a = key.get(28);
					index.add(a + 1);
				} else if (in1.compareTo("o") == 0) {
					int a = key.get(29);
					index.add(a + 1);
				} else if (in1.compareTo("P") == 0) {
					int a = key.get(30);
					index.add(a + 1);
				} else if (in1.compareTo("p") == 0) {
					int a = key.get(31);
					index.add(a + 1);
				} else if (in1.compareTo("Q") == 0) {
					int a = key.get(32);
					index.add(a + 1);
				} else if (in1.compareTo("q") == 0) {
					int a = key.get(33);
					index.add(a + 1);
				} else if (in1.compareTo("R") == 0) {
					int a = key.get(34);
					index.add(a + 1);
				} else if (in1.compareTo("r") == 0) {
					int a = key.get(35);
					index.add(a + 1);
				} else if (in1.compareTo("S") == 0) {
					int a = key.get(36);
					index.add(a + 1);
				} else if (in1.compareTo("s") == 0) {
					int a = key.get(37);
					index.add(a + 1);
				} else if (in1.compareTo("T") == 0) {
					int a = key.get(38);
					index.add(a + 1);
				} else if (in1.compareTo("t") == 0) {
					int a = key.get(39);
					index.add(a + 1);
				} else if (in1.compareTo("U") == 0) {
					int a = key.get(40);
					index.add(a + 1);
				} else if (in1.compareTo("u") == 0) {
					int a = key.get(41);
					index.add(a + 1);
				} else if (in1.compareTo("V") == 0) {
					int a = key.get(42);
					index.add(a + 1);
				} else if (in1.compareTo("v") == 0) {
					int a = key.get(43);
					index.add(a + 1);
				} else if (in1.compareTo("W") == 0) {
					int a = key.get(44);
					index.add(a + 1);
				} else if (in1.compareTo("w") == 0) {
					int a = key.get(45);
					index.add(a + 1);
				} else if (in1.compareTo("X") == 0) {
					int a = key.get(46);
					index.add(a + 1);
				} else if (in1.compareTo("x") == 0) {
					int a = key.get(47);
					index.add(a + 1);
				} else if (in1.compareTo("Y") == 0) {
					int a = key.get(48);
					index.add(a + 1);
				} else if (in1.compareTo("y") == 0) {
					int a = key.get(49);
					index.add(a + 1);
				} else if (in1.compareTo("Z") == 0) {
					int a = key.get(50);
					index.add(a + 1);
				} else if (in1.compareTo("z") == 0) {
					int a = key.get(51);
					index.add(a + 1);
				} else if (in1.compareTo("") == 0) {
					int u = 0;
					int a = key.get(52);
					while (u < e) {
						index.add(a);
						u++;
					}
					e = e - 15;
				} else {
					System.out.println("Error!");
				}
				System.out.println(index);// test
				e--;
			}
			//System.out.println(index);
			System.out.println("Have special order?");
			System.out.println("enter Y to have special order, N to continue.");
			Scanner spe = new Scanner(System.in);
			String special = spe.nextLine();
			if (special.compareTo("Y") == 0) {
				System.out.println("Enter your special order, please.");
				Scanner qn = new Scanner(System.in);
				int in17 = qn.nextInt();
				index.add(in17);
				Scanner rn = new Scanner(System.in);
				int in18 = qn.nextInt();
				index.add(in18);
				Scanner sn = new Scanner(System.in);
				int in19 = qn.nextInt();
				index.add(in19);
				Scanner tn = new Scanner(System.in);
				int in20 = qn.nextInt();
				index.add(in20);
			} else if (special.compareTo("N") == 0) {
				for (int k = 0; k <= 4; k++) {
					index.add(0);
				}
			} else {
				System.out.println("Error!");
			}
			System.out.println(index);// test
			int p4 = index.get(1);// 1
			int p5 = index.get(2);// 2
			int p6 = index.get(3);// 3
			int p7 = index.get(4);// 1
			int p8 = index.get(5);// 2
			int p9 = index.get(6);// 3
			int p10 = index.get(7);// 1
			int p11 = index.get(8);// 2
			int p12 = index.get(9);// 3
			int p13 = index.get(10);// 1
			int p14 = index.get(11);// 2
			int p15 = index.get(12);// 3
			int p16 = index.get(13);// 1
			int p17 = index.get(14);// 2
			int p18 = index.get(15);// 3
			int p19 = index.get(16);// spe1
			int p20 = index.get(17);// spe2
			int p21 = index.get(18);// spe3
			int p22 = index.get(19);// spe4
			int sp = p19 * 1000 + p20 * 100 + p21 * 10 + p22;
			long Public1 = p4 + p7 + p10 + p13 + p16;// max
			long Public2 = p5 + p8 + p11 + p14 + p17;
			long Public3 = p6 + p9 + p12 + p15 + p18;
			System.out.println("Please enter the secure mode,0<=S<=5");
			Scanner s = new Scanner(System.in);
			int S = s.nextInt();
			long cry = 0;
			if (S == 1) {
				cry = Public1;
			} else if (S == 2) {
				cry = Public1 * 1000 + Public2;
			} else if (S == 3) {
				cry = Public1 * 1000000 + Public2 * 1000 + Public3;
			} else if (S == 4) {
				cry = Public1 * 1000000 + Public2 * 1000 - Public3;
			} else if (S == 5) {
				cry = Public1 * 1000000 - Public2 * 1000 + Public3;
			} else {
				cry = 1;
			}
			if (cry == 0) {
				System.out.println("Black hole username, please try again. ");
			}
			System.out.println(cry);// test
			List<Integer> cha = new ArrayList<Integer>();
			for (int f = 1; f < 61; f++) {
				cha.add(f);
			}
			List input = new ArrayList();
			System.out.println("Enter the text,use \".\" to end. ");
			System.out.println("You can use puctuation such as \",-:;!?.");
			int t = -1;
			while (t < 0) {
				Scanner an = new Scanner(System.in);
				String in1 = an.nextLine();
				if (in1.compareTo("A") == 0) {
					int a = cha.get(0);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("a") == 0) {
					int a = cha.get(1);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("B") == 0) {
					int a = cha.get(2);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("b") == 0) {
					int a = cha.get(3);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("C") == 0) {
					int a = cha.get(4);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("c") == 0) {
					int a = cha.get(5);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("D") == 0) {
					int a = cha.get(6);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("d") == 0) {
					int a = cha.get(7);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("E") == 0) {
					int a = cha.get(8);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("e") == 0) {
					int a = cha.get(9);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("F") == 0) {
					int a = cha.get(10);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("f") == 0) {
					int a = cha.get(11);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("G") == 0) {
					int a = cha.get(12);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("g") == 0) {
					int a = cha.get(13);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("H") == 0) {
					int a = cha.get(14);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("h") == 0) {
					int a = cha.get(15);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("I") == 0) {
					int a = cha.get(16);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("i") == 0) {
					int a = cha.get(17);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("J") == 0) {
					int a = cha.get(18);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("j") == 0) {
					int a = cha.get(19);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("K") == 0) {
					int a = cha.get(20);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("k") == 0) {
					int a = cha.get(21);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("L") == 0) {
					int a = cha.get(22);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("l") == 0) {
					int a = cha.get(23);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("M") == 0) {
					int a = cha.get(24);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("m") == 0) {
					int a = cha.get(25);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("N") == 0) {
					int a = cha.get(26);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("n") == 0) {
					int a = cha.get(27);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("O") == 0) {
					int a = cha.get(28);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("o") == 0) {
					int a = cha.get(29);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("P") == 0) {
					int a = cha.get(30);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("p") == 0) {
					int a = cha.get(31);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("Q") == 0) {
					int a = cha.get(32);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("q") == 0) {
					int a = cha.get(33);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("R") == 0) {
					int a = cha.get(34);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("r") == 0) {
					int a = cha.get(35);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("S") == 0) {
					int a = cha.get(36);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("s") == 0) {
					int a = cha.get(37);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("T") == 0) {
					int a = cha.get(38);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("t") == 0) {
					int a = cha.get(39);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("U") == 0) {
					int a = cha.get(40);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("u") == 0) {
					int a = cha.get(41);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("V") == 0) {
					int a = cha.get(42);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("v") == 0) {
					int a = cha.get(43);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("W") == 0) {
					int a = cha.get(44);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("w") == 0) {
					int a = cha.get(45);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("X") == 0) {
					int a = cha.get(46);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("x") == 0) {
					int a = cha.get(47);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("Y") == 0) {
					int a = cha.get(48);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("y") == 0) {
					int a = cha.get(49);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("Z") == 0) {
					int a = cha.get(50);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("z") == 0) {
					int a = cha.get(51);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("\"") == 0) {
					int a = cha.get(52);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo(":") == 0) {
					int a = cha.get(53);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo(",") == 0) {
					int a = cha.get(54);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo(";") == 0) {
					int a = cha.get(55);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("!") == 0) {
					int a = cha.get(56);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("?") == 0) {
					int a = cha.get(57);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo("-") == 0) {
					int a = cha.get(58);
					input.add(cry * ti * sp * a);
				} else if (in1.compareTo(".") == 0) {
					int a = cha.get(59);
					input.add(cry * ti * sp * a);
					t++;
				} else {
					System.out.println("Error!");
				}
				System.out.println(input);// test
			}

//			System.out.println(p1);
//			System.out.println(p2);
//			System.out.println(p3);
//			System.out.println(p4);
//			System.out.println(p5);
//			System.out.println(p6);
//			System.out.println(p7);
//			System.out.println(p8);
//			System.out.println(p9);
//			System.out.println(p10);
//			System.out.println(p11);
//			System.out.println(p12);
//			System.out.println(p13);
//			System.out.println(p14);
//			System.out.println(p15);
//			System.out.println(p16);
//			System.out.println(p17);
//			System.out.println(p18);
//			System.out.println(p19);
//			System.out.println(p20);
//			System.out.println(p21);
//			System.out.println(p22);

		} else if (sta.compareTo("D") == 0)

		{
			Calendar cl = Calendar.getInstance();
			Date date = new Date();
			p1 = cl.get(Calendar.HOUR_OF_DAY);
			p2 = cl.get(Calendar.DAY_OF_WEEK);
			p3 = cl.get(Calendar.DAY_OF_MONTH);
			System.out.print(" " + p1);// test
			System.out.print(" " + p2);// test
			System.out.print(" " + p3);// test
			int ti = p1 + p2 + p3;
			System.out.println();
			System.out.println("Enter the user name. end in 15 words,use \"Enter\" to end. ");
			int e = 15;
			while (e >= 0) {
				Scanner an = new Scanner(System.in);
				String in1 = an.nextLine();
				if (in1.compareTo("A") == 0) {
					int a = key.get(0);
					index.add(a + 1);
				} else if (in1.compareTo("a") == 0) {
					int a = key.get(1);
					index.add(a + 1);
				} else if (in1.compareTo("B") == 0) {
					int a = key.get(2);
					index.add(a + 1);
				} else if (in1.compareTo("a") == 0) {
					int a = key.get(3);
					index.add(a + 1);
				} else if (in1.compareTo("C") == 0) {
					int a = key.get(4);
					index.add(a + 1);
				} else if (in1.compareTo("c") == 0) {
					int a = key.get(5);
					index.add(a + 1);
				} else if (in1.compareTo("D") == 0) {
					int a = key.get(6);
					index.add(a + 1);
				} else if (in1.compareTo("d") == 0) {
					int a = key.get(7);
					index.add(a + 1);
				} else if (in1.compareTo("E") == 0) {
					int a = key.get(8);
					index.add(a + 1);
				} else if (in1.compareTo("e") == 0) {
					int a = key.get(9);
					index.add(a + 1);
				} else if (in1.compareTo("F") == 0) {
					int a = key.get(10);
					index.add(a + 1);
				} else if (in1.compareTo("f") == 0) {
					int a = key.get(11);
					index.add(a + 1);
				} else if (in1.compareTo("G") == 0) {
					int a = key.get(12);
					index.add(a + 1);
				} else if (in1.compareTo("g") == 0) {
					int a = key.get(13);
					index.add(a + 1);
				} else if (in1.compareTo("H") == 0) {
					int a = key.get(14);
					index.add(a + 1);
				} else if (in1.compareTo("h") == 0) {
					int a = key.get(15);
					index.add(a + 1);
				} else if (in1.compareTo("I") == 0) {
					int a = key.get(16);
					index.add(a + 1);
				} else if (in1.compareTo("i") == 0) {
					int a = key.get(17);
					index.add(a + 1);
				} else if (in1.compareTo("J") == 0) {
					int a = key.get(18);
					index.add(a + 1);
				} else if (in1.compareTo("j") == 0) {
					int a = key.get(19);
					index.add(a + 1);
				} else if (in1.compareTo("K") == 0) {
					int a = key.get(20);
					index.add(a + 1);
				} else if (in1.compareTo("k") == 0) {
					int a = key.get(21);
					index.add(a + 1);
				} else if (in1.compareTo("L") == 0) {
					int a = key.get(22);
					index.add(a + 1);
				} else if (in1.compareTo("l") == 0) {
					int a = key.get(23);
					index.add(a + 1);
				} else if (in1.compareTo("M") == 0) {
					int a = key.get(24);
					index.add(a + 1);
				} else if (in1.compareTo("m") == 0) {
					int a = key.get(25);
					index.add(a + 1);
				} else if (in1.compareTo("N") == 0) {
					int a = key.get(26);
					index.add(a + 1);
				} else if (in1.compareTo("n") == 0) {
					int a = key.get(27);
					index.add(a + 1);
				} else if (in1.compareTo("O") == 0) {
					int a = key.get(28);
					index.add(a + 1);
				} else if (in1.compareTo("o") == 0) {
					int a = key.get(29);
					index.add(a + 1);
				} else if (in1.compareTo("P") == 0) {
					int a = key.get(30);
					index.add(a + 1);
				} else if (in1.compareTo("p") == 0) {
					int a = key.get(31);
					index.add(a + 1);
				} else if (in1.compareTo("Q") == 0) {
					int a = key.get(32);
					index.add(a + 1);
				} else if (in1.compareTo("q") == 0) {
					int a = key.get(33);
					index.add(a + 1);
				} else if (in1.compareTo("R") == 0) {
					int a = key.get(34);
					index.add(a + 1);
				} else if (in1.compareTo("r") == 0) {
					int a = key.get(35);
					index.add(a + 1);
				} else if (in1.compareTo("S") == 0) {
					int a = key.get(36);
					index.add(a + 1);
				} else if (in1.compareTo("s") == 0) {
					int a = key.get(37);
					index.add(a + 1);
				} else if (in1.compareTo("T") == 0) {
					int a = key.get(38);
					index.add(a + 1);
				} else if (in1.compareTo("t") == 0) {
					int a = key.get(39);
					index.add(a + 1);
				} else if (in1.compareTo("U") == 0) {
					int a = key.get(40);
					index.add(a + 1);
				} else if (in1.compareTo("u") == 0) {
					int a = key.get(41);
					index.add(a + 1);
				} else if (in1.compareTo("V") == 0) {
					int a = key.get(42);
					index.add(a + 1);
				} else if (in1.compareTo("v") == 0) {
					int a = key.get(43);
					index.add(a + 1);
				} else if (in1.compareTo("W") == 0) {
					int a = key.get(44);
					index.add(a + 1);
				} else if (in1.compareTo("w") == 0) {
					int a = key.get(45);
					index.add(a + 1);
				} else if (in1.compareTo("X") == 0) {
					int a = key.get(46);
					index.add(a + 1);
				} else if (in1.compareTo("x") == 0) {
					int a = key.get(47);
					index.add(a + 1);
				} else if (in1.compareTo("Y") == 0) {
					int a = key.get(48);
					index.add(a + 1);
				} else if (in1.compareTo("y") == 0) {
					int a = key.get(49);
					index.add(a + 1);
				} else if (in1.compareTo("Z") == 0) {
					int a = key.get(50);
					index.add(a + 1);
				} else if (in1.compareTo("z") == 0) {
					int a = key.get(51);
					index.add(a + 1);
				} else if (in1.compareTo("") == 0) {
					int u = 0;
					int a = key.get(52);
					while (u < e) {
						index.add(a);
						u++;
					}
					e = e - 15;
				} else {
					System.out.println("Error!");
				}
				System.out.println(index);// test
				e--;
			}
			System.out.println(index);
			System.out.println("Have special order?");
			System.out.println("enter Y to have special order, N to continue.");
			Scanner spe = new Scanner(System.in);
			String special = spe.nextLine();
			if (special.compareTo("Y") == 0) {
				System.out.println("Enter your special order, please.");
				Scanner qn = new Scanner(System.in);
				int in17 = qn.nextInt();
				index.add(in17);
				Scanner rn = new Scanner(System.in);
				int in18 = qn.nextInt();
				index.add(in18);
				Scanner sn = new Scanner(System.in);
				int in19 = qn.nextInt();
				index.add(in19);
				Scanner tn = new Scanner(System.in);
				int in20 = qn.nextInt();
				index.add(in20);
			} else if (special.compareTo("N") == 0) {
				for (int k = 0; k <= 4; k++) {
					index.add(0);
				}
			} else {
				System.out.println("Error!");
			}
			System.out.println(index);// test
			int p4 = index.get(1);// 1
			int p5 = index.get(2);// 2
			int p6 = index.get(3);// 3
			int p7 = index.get(4);// 1
			int p8 = index.get(5);// 2
			int p9 = index.get(6);// 3
			int p10 = index.get(7);// 1
			int p11 = index.get(8);// 2
			int p12 = index.get(9);// 3
			int p13 = index.get(10);// 1
			int p14 = index.get(11);// 2
			int p15 = index.get(12);// 3
			int p16 = index.get(13);// 1
			int p17 = index.get(14);// 2
			int p18 = index.get(15);// 3
			int p19 = index.get(16);// spe1
			int p20 = index.get(17);// spe2
			int p21 = index.get(18);// spe3
			int p22 = index.get(19);// spe4
			int sp = p19 * 1000 + p20 * 100 + p21 * 10 + p22;
			long Public1 = p4 + p7 + p10 + p13 + p16;// max
			long Public2 = p5 + p8 + p11 + p14 + p17;
			long Public3 = p6 + p9 + p12 + p15 + p18;
			System.out.println("Please enter the secure mode,0<=S<=5");
			Scanner s = new Scanner(System.in);
			int S = s.nextInt();
			long cry = 0;
			if (S == 1) {
				cry = Public1;
			} else if (S == 2) {
				cry = Public1 * 1000 + Public2;
			} else if (S == 3) {
				cry = Public1 * 1000000 + Public2 * 1000 + Public3;
			} else if (S == 4) {
				cry = Public1 * 1000000 + Public2 * 1000 - Public3;
			} else if (S == 5) {
				cry = Public1 * 1000000 - Public2 * 1000 + Public3;
			} else {
				cry = 1;
			}
			if (cry == 0) {
				System.out.println("Black hole username, please try again. ");
			}
			System.out.println(cry);// test
			List<Integer> cha = new ArrayList<Integer>();
			for (int f = 1; f < 61; f++) {
				cha.add(f);
			}
			List output = new ArrayList();
			System.out.println("Enter the text,use \".\" to end. ");
			System.out.println("You can use puctuation such as \",-:;!?.");
			int t = -1;
			while (t < 0) {
				Scanner an = new Scanner(System.in);
				long ou = an.nextLong();
				long out = ou / cry / ti / sp;
				if (out == cha.get(0)) {
					output.add("A");
				} else if (out == cha.get(1)) {
					output.add("a");
				} else if (out == cha.get(2)) {
					output.add("B");
				} else if (out == cha.get(3)) {
					output.add("b");
				} else if (out == cha.get(4)) {
					output.add("C");
				} else if (out == cha.get(5)) {
					output.add("c");
				} else if (out == cha.get(6)) {
					output.add("D");
				} else if (out == cha.get(7)) {
					output.add("d");
				} else if (out == cha.get(8)) {
					output.add("E");
				} else if (out == cha.get(9)) {
					output.add("e");
				} else if (out == cha.get(10)) {
					output.add("F");
				} else if (out == cha.get(11)) {
					output.add("f");
				} else if (out == cha.get(12)) {
					output.add("G");
				} else if (out == cha.get(13)) {
					output.add("g");
				} else if (out == cha.get(14)) {
					output.add("H");
				} else if (out == cha.get(15)) {
					output.add("h");
				} else if (out == cha.get(16)) {
					output.add("I");
				} else if (out == cha.get(17)) {
					output.add("i");
				} else if (out == cha.get(18)) {
					output.add("J");
				} else if (out == cha.get(19)) {
					output.add("j");
				} else if (out == cha.get(20)) {
					output.add("K");
				} else if (out == cha.get(21)) {
					output.add("k");
				} else if (out == cha.get(22)) {
					output.add("L");
				} else if (out == cha.get(23)) {
					output.add("l");
				} else if (out == cha.get(24)) {
					output.add("M");
				} else if (out == cha.get(25)) {
					output.add("m");
				} else if (out == cha.get(26)) {
					output.add("N");
				} else if (out == cha.get(27)) {
					output.add("n");
				} else if (out == cha.get(28)) {
					output.add("O");
				} else if (out == cha.get(29)) {
					output.add("o");
				} else if (out == cha.get(30)) {
					output.add("P");
				} else if (out == cha.get(31)) {
					output.add("p");
				} else if (out == cha.get(32)) {
					output.add("Q");
				} else if (out == cha.get(33)) {
					output.add("q");
				} else if (out == cha.get(34)) {
					output.add("R");
				} else if (out == cha.get(35)) {
					output.add("r");
				} else if (out == cha.get(36)) {
					output.add("S");
				} else if (out == cha.get(37)) {
					output.add("s");
				} else if (out == cha.get(38)) {
					output.add("T");
				} else if (out == cha.get(39)) {
					output.add("t");
				} else if (out == cha.get(40)) {
					output.add("U");
				} else if (out == cha.get(41)) {
					output.add("u");
				} else if (out == cha.get(42)) {
					output.add("V");
				} else if (out == cha.get(43)) {
					output.add("v");
				} else if (out == cha.get(44)) {
					output.add("W");
				} else if (out == cha.get(45)) {
					output.add("w");
				} else if (out == cha.get(46)) {
					output.add("X");
				} else if (out == cha.get(47)) {
					output.add("x");
				} else if (out == cha.get(48)) {
					output.add("Y");
				} else if (out == cha.get(49)) {
					output.add("y");
				} else if (out == cha.get(50)) {
					output.add("Z");
				} else if (out == cha.get(51)) {
					output.add("z");
				} else if (out == cha.get(52)) {
					output.add("\"");
				} else if (out == cha.get(53)) {
					output.add(":");
				} else if (out == cha.get(54)) {
					output.add(",");
				} else if (out == cha.get(55)) {
					output.add(";");
				} else if (out == cha.get(56)) {
					output.add("!");
				} else if (out == cha.get(57)) {
					output.add("?");
				} else if (out == cha.get(58)) {
					output.add("-");
				} else if (out == cha.get(59)) {
					output.add(".");
					t++;
				} else {
					System.out.println("Error!");
				}
				System.out.println(output);// test
			}

		}

		else {
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

//		System.out.println(key);
		}
	}
}
