package info;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class CryptographySystemIII {
	// Encryption method:
	// 1,Get a date [3~50]
	// [time]=key1+key2+key3
	// 2,Get a user name [5~415]{10~2165}
	// [name1]=cha1+cha4+cha7+cha10+cha13
	// [name2]=cha2+cha5+cha8+cha11+cha14
	// [name3]=cha3+cha6+cha9+cha12+cha15
	// 3,Get a special order [1~9999]
	// [special order]=sp1*1000+sp2*100+sp3*10+sp4
	// 4,Get the context
	// [context]=context
	// 5,Encryption [1~83]{1~433}
	// [Encryption]=1000000000+[time]*[name1/2/3]*[special order]*[context]+1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Encryption or Decryption?");
		System.out.println("Encryption enter \"E\"");
		System.out.println("Decryption enter \"D\"");
		Scanner n = new Scanner(System.in);
		String sta = n.nextLine();
		if (sta.compareTo("E") == 0) {
			Encription();
		} else if (sta.compareTo("D") == 0) {
//			Decription();
		}
	}

	public static void Encription() {
		// TODO Auto-generated method stub
		// dictionary
		List<Integer> dic = new ArrayList<Integer>();
		int a = 0;// change
		int t = 0;// times
		while (t < 83) {
			dic.add(t, t + 1 + a);
			t++;
		}
		// translator
		List<String> tra = new ArrayList<String>();
		int b = 0;// change
		tra.add(0, "A");
		tra.add(1, "a");
		tra.add(2, "B");
		tra.add(3, "b");
		tra.add(4, "C");
		tra.add(5, "c");
		tra.add(6, "D");
		tra.add(7, "d");
		tra.add(8, "E");
		tra.add(9, "e");
		tra.add(0, "F");
		tra.add(11, "f");
		tra.add(12, "G");
		tra.add(13, "g");
		tra.add(14, "H");
		tra.add(15, "h");
		tra.add(16, "I");
		tra.add(17, "i");
		tra.add(18, "J");
		tra.add(19, "j");
		tra.add(20, "K");
		tra.add(21, "k");
		tra.add(22, "L");
		tra.add(23, "l");
		tra.add(24, "M");
		tra.add(25, "m");
		tra.add(26, "N");
		tra.add(27, "n");
		tra.add(28, "O");
		tra.add(29, "o");
		tra.add(30, "P");
		tra.add(31, "p");
		tra.add(32, "Q");
		tra.add(33, "q");
		tra.add(34, "R");
		tra.add(35, "r");
		tra.add(36, "S");
		tra.add(37, "s");
		tra.add(38, "T");
		tra.add(39, "t");
		tra.add(40, "U");
		tra.add(41, "u");
		tra.add(42, "V");
		tra.add(43, "v");
		tra.add(44, "W");
		tra.add(45, "w");
		tra.add(46, "X");
		tra.add(47, "x");
		tra.add(48, "Y");
		tra.add(49, "y");
		tra.add(50, "Z");
		tra.add(51, "z");
		tra.add(52, "1");
		tra.add(53, "2");
		tra.add(54, "3");
		tra.add(55, "4");
		tra.add(56, "5");
		tra.add(57, "6");
		tra.add(58, "7");
		tra.add(59, "8");
		tra.add(60, "9");
		tra.add(61, "0");
		tra.add(62, "~");
		tra.add(63, "`");
		tra.add(64, "!");
		tra.add(65, "@");
		tra.add(66, "#");
		tra.add(67, "$");
		tra.add(68, "%");
		tra.add(69, "^");
		tra.add(70, "&");
		tra.add(71, "*");
		tra.add(72, "(");
		tra.add(73, ")");
		tra.add(74, "_");
		tra.add(75, "-");
		tra.add(76, "+");
		tra.add(77, "=");
		tra.add(78, "{");
		tra.add(79, "[");
		tra.add(80, "}");
		tra.add(81, "]");
		tra.add(82, "|");
		tra.add(83, "\\");
		tra.add(84, ":");
		tra.add(85, ";");
		tra.add(86, "\"");
		tra.add(87, "'");
		tra.add(88, "<");
		tra.add(89, ",");
		tra.add(90, ">");
		tra.add(91, ".");
		tra.add(92, "?");
		tra.add(93, "/");
		tra.add(94, " ");
		tra.add(95, "A");
		tra.add(96, "a");
		tra.add(97, "B");
		tra.add(98, "b");
		tra.add(99, "C");
		tra.add(100, "c");
		tra.add(101, "D");
		tra.add(102, "d");
		tra.add(103, "E");
		tra.add(104, "e");
		tra.add(105, "F");
		tra.add(106, "f");
		tra.add(107, "G");
		tra.add(108, "g");
		tra.add(109, "H");
		tra.add(110, "h");
		tra.add(111, "I");
		tra.add(112, "i");
		tra.add(113, "J");
		tra.add(114, "j");
		tra.add(115, "K");
		tra.add(116, "k");
		tra.add(117, "L");
		tra.add(118, "l");
		tra.add(119, "M");
		tra.add(120, "m");
		tra.add(121, "N");
		tra.add(122, "n");
		tra.add(123, "O");
		tra.add(124, "o");
		tra.add(125, "P");
		tra.add(126, "p");
		tra.add(127, "Q");
		tra.add(128, "q");
		tra.add(129, "R");
		tra.add(130, "r");
		tra.add(131, "S");
		tra.add(132, "s");
		tra.add(133, "T");
		tra.add(134, "t");
		tra.add(135, "U");
		tra.add(136, "u");
		tra.add(137, "V");
		tra.add(138, "v");
		tra.add(139, "W");
		tra.add(140, "w");
		tra.add(141, "X");
		tra.add(142, "x");
		tra.add(143, "Y");
		tra.add(144, "y");
		tra.add(145, "Z");
		tra.add(146, "z");
		tra.add(147, "1");
		tra.add(148, "2");
		tra.add(149, "3");
		tra.add(150, "4");
		tra.add(151, "5");
		tra.add(152, "6");
		tra.add(153, "7");
		tra.add(154, "8");
		tra.add(155, "9");
		tra.add(156, "0");
		tra.add(157, "~");
		tra.add(158, "`");
		tra.add(159, "!");
		tra.add(160, "@");
		tra.add(161, "#");
		tra.add(162, "$");
		tra.add(163, "%");
		tra.add(164, "^");
		tra.add(165, "&");
		tra.add(166, "*");
		tra.add(167, "(");
		tra.add(168, ")");
		tra.add(169, "_");
		tra.add(170, "-");
		tra.add(171, "+");
		tra.add(172, "=");
		tra.add(173, "{");
		tra.add(174, "[");
		tra.add(175, "}");
		tra.add(176, "]");
		tra.add(177, "|");
		tra.add(178, "\\");
		tra.add(179, ":");
		tra.add(180, ";");
		tra.add(181, "\"");
		tra.add(182, "'");
		tra.add(183, "<");
		tra.add(184, ",");
		tra.add(185, ">");
		tra.add(186, ".");
		tra.add(187, "?");
		tra.add(188, "/");
		tra.add(189, " ");
		// 1,Get a date [3~50]
		// [time]=key1+key2+key3
		List<Integer> time = new ArrayList<Integer>();
		Calendar cl = Calendar.getInstance();
		Date date = new Date();
		time.add(cl.get(Calendar.DAY_OF_WEEK));// day of week
		time.add(cl.get(Calendar.DAY_OF_MONTH));// day of month
		time.add(cl.get(Calendar.MONTH));// month of year
		int finaltime = dic.get(time.get(0)) + dic.get(time.get(1) - 1) + dic.get(time.get(2) - 1);// sum max =
																									// 24+7+12=43 min =
																									// 1+1+1=3
		System.out.println(finaltime);// test
		System.out.println();
		// 2,Get a user name [5~415]{10~2165}
		// [name1]=cha1+cha4+cha7+cha10+cha13
		// [name2]=cha2+cha5+cha8+cha11+cha14
		// [name3]=cha3+cha6+cha9+cha12+cha15
		System.out.println("Enter the user name. end in 15 words,use \"Enter\" to end. ");
		Scanner an = new Scanner(System.in);
		String in = an.nextLine();// user name enter
		List<Integer> un = new ArrayList<Integer>();
		int c = 0;
		int d = in.length() - 1;
		System.out.println(c + "+" + d);
		if (in.length() <= 15 && in.length()>3) {
			while (c <= d) {
				String in1 = in.substring(c, c + 1);// translate
				if (in1.compareTo("A") == 0) {
					un.add(dic.indexOf("A") + b);
				} else if (in1.compareTo("a") == 0) {
					un.add(dic.indexOf("a") + b);
				} else if (in1.compareTo("B") == 0) {
					un.add(dic.indexOf("B") + b);
				} else if (in1.compareTo("b") == 0) {
					un.add(dic.indexOf("b") + b);
				} else if (in1.compareTo("C") == 0) {
					un.add(dic.indexOf("C") + b);
				} else if (in1.compareTo("c") == 0) {
					un.add(dic.indexOf("c") + b);
				} else if (in1.compareTo("D") == 0) {
					un.add(dic.indexOf("D") + b);
				} else if (in1.compareTo("d") == 0) {
					un.add(dic.indexOf("d") + b);
				} else if (in1.compareTo("E") == 0) {
					un.add(dic.indexOf("E") + b);
				} else if (in1.compareTo("e") == 0) {
					un.add(dic.indexOf("e") + b);
				} else if (in1.compareTo("F") == 0) {
					un.add(dic.indexOf("F") + b);
				} else if (in1.compareTo("f") == 0) {
					un.add(dic.indexOf("f") + b);
				} else if (in1.compareTo("G") == 0) {
					un.add(dic.indexOf("G") + b);
				} else if (in1.compareTo("g") == 0) {
					un.add(dic.indexOf("g") + b);
				} else if (in1.compareTo("H") == 0) {
					un.add(dic.indexOf("H") + b);
				} else if (in1.compareTo("h") == 0) {
					un.add(dic.indexOf("h") + b);
				} else if (in1.compareTo("I") == 0) {
					un.add(dic.indexOf("I") + b);
				} else if (in1.compareTo("i") == 0) {
					un.add(dic.indexOf("i") + b);
				} else if (in1.compareTo("J") == 0) {
					un.add(dic.indexOf("J") + b);
				} else if (in1.compareTo("j") == 0) {
					un.add(dic.indexOf("j") + b);
				} else if (in1.compareTo("K") == 0) {
					un.add(dic.indexOf("K") + b);
				} else if (in1.compareTo("k") == 0) {
					un.add(dic.indexOf("k") + b);
				} else if (in1.compareTo("L") == 0) {
					un.add(dic.indexOf("L") + b);
				} else if (in1.compareTo("l") == 0) {
					un.add(dic.indexOf("l") + b);
				} else if (in1.compareTo("M") == 0) {
					un.add(dic.indexOf("M") + b);
				} else if (in1.compareTo("m") == 0) {
					un.add(dic.indexOf("m") + b);
				} else if (in1.compareTo("N") == 0) {
					un.add(dic.indexOf("N") + b);
				} else if (in1.compareTo("n") == 0) {
					un.add(dic.indexOf("n") + b);
				} else if (in1.compareTo("O") == 0) {
					un.add(dic.indexOf("O") + b);
				} else if (in1.compareTo("o") == 0) {
					un.add(dic.indexOf("o") + b);
				} else if (in1.compareTo("P") == 0) {
					un.add(dic.indexOf("P") + b);
				} else if (in1.compareTo("p") == 0) {
					un.add(dic.indexOf("p") + b);
				} else if (in1.compareTo("Q") == 0) {
					un.add(dic.indexOf("Q") + b);
				} else if (in1.compareTo("q") == 0) {
					un.add(dic.indexOf("q") + b);
				} else if (in1.compareTo("R") == 0) {
					un.add(dic.indexOf("R") + b);
				} else if (in1.compareTo("r") == 0) {
					un.add(dic.indexOf("r") + b);
				} else if (in1.compareTo("S") == 0) {
					un.add(dic.indexOf("S") + b);
				} else if (in1.compareTo("s") == 0) {
					un.add(dic.indexOf("s") + b);
				} else if (in1.compareTo("T") == 0) {
					un.add(dic.indexOf("T") + b);
				} else if (in1.compareTo("t") == 0) {
					un.add(dic.indexOf("t") + b);
				} else if (in1.compareTo("U") == 0) {
					un.add(dic.indexOf("U") + b);
				} else if (in1.compareTo("u") == 0) {
					un.add(dic.indexOf("u") + b);
				} else if (in1.compareTo("V") == 0) {
					un.add(dic.indexOf("V") + b);
				} else if (in1.compareTo("v") == 0) {
					un.add(dic.indexOf("v") + b);
				} else if (in1.compareTo("W") == 0) {
					un.add(dic.indexOf("W") + b);
				} else if (in1.compareTo("w") == 0) {
					un.add(dic.indexOf("w") + b);
				} else if (in1.compareTo("X") == 0) {
					un.add(dic.indexOf("X") + b);
				} else if (in1.compareTo("x") == 0) {
					un.add(dic.indexOf("x") + b);
				} else if (in1.compareTo("Y") == 0) {
					un.add(dic.indexOf("Y") + b);
				} else if (in1.compareTo("y") == 0) {
					un.add(dic.indexOf("y") + b);
				} else if (in1.compareTo("Z") == 0) {
					un.add(dic.indexOf("Z") + b);
				} else if (in1.compareTo("z") == 0) {
					un.add(dic.indexOf("z") + b);
				} else if (in1.compareTo("1") == 0) {
					un.add(dic.indexOf("1") + b);
				} else if (in1.compareTo("2") == 0) {
					un.add(dic.indexOf("2") + b);
				} else if (in1.compareTo("3") == 0) {
					un.add(dic.indexOf("3") + b);
				} else if (in1.compareTo("4") == 0) {
					un.add(dic.indexOf("4") + b);
				} else if (in1.compareTo("5") == 0) {
					un.add(dic.indexOf("5") + b);
				} else if (in1.compareTo("6") == 0) {
					un.add(dic.indexOf("6") + b);
				} else if (in1.compareTo("7") == 0) {
					un.add(dic.indexOf("7") + b);
				} else if (in1.compareTo("8") == 0) {
					un.add(dic.indexOf("8") + b);
				} else if (in1.compareTo("9") == 0) {
					un.add(dic.indexOf("9") + b);
				} else if (in1.compareTo("0") == 0) {
					un.add(dic.indexOf("0") + b);
				} else if (in1.compareTo("~") == 0) {
					un.add(dic.indexOf("~") + b);
				} else if (in1.compareTo("`") == 0) {
					un.add(dic.indexOf("`") + b);
				} else if (in1.compareTo("!") == 0) {
					un.add(dic.indexOf("!") + b);
				} else if (in1.compareTo("@") == 0) {
					un.add(dic.indexOf("@") + b);
				} else if (in1.compareTo("#") == 0) {
					un.add(dic.indexOf("#") + b);
				} else if (in1.compareTo("$") == 0) {
					un.add(dic.indexOf("$") + b);
				} else if (in1.compareTo("%") == 0) {
					un.add(dic.indexOf("%") + b);
				} else if (in1.compareTo("^") == 0) {
					un.add(dic.indexOf("^") + b);
				} else if (in1.compareTo("&") == 0) {
					un.add(dic.indexOf("&") + b);
				} else if (in1.compareTo("*") == 0) {
					un.add(dic.indexOf("*") + b);
				} else if (in1.compareTo("(") == 0) {
					un.add(dic.indexOf("(") + b);
				} else if (in1.compareTo(")") == 0) {
					un.add(dic.indexOf(")") + b);
				} else if (in1.compareTo("_") == 0) {
					un.add(dic.indexOf("_") + b);
				} else if (in1.compareTo("-") == 0) {
					un.add(dic.indexOf("-") + b);
				} else if (in1.compareTo("+") == 0) {
					un.add(dic.indexOf("+") + b);
				} else if (in1.compareTo("=") == 0) {
					un.add(dic.indexOf("=") + b);
				} else if (in1.compareTo("{") == 0) {
					un.add(dic.indexOf("{") + b);
				} else if (in1.compareTo("[") == 0) {
					un.add(dic.indexOf("[") + b);
				} else if (in1.compareTo("}") == 0) {
					un.add(dic.indexOf("}") + b);
				} else if (in1.compareTo("]") == 0) {
					un.add(dic.indexOf("]") + b);
				} else if (in1.compareTo("|") == 0) {
					un.add(dic.indexOf("|") + b);
				} else if (in1.compareTo("\\") == 0) {
					un.add(dic.indexOf("\\") + b);
				} else if (in1.compareTo(":") == 0) {
					un.add(dic.indexOf(":") + b);
				} else if (in1.compareTo(";") == 0) {
					un.add(dic.indexOf(";") + b);
				} else if (in1.compareTo("\"") == 0) {
					un.add(dic.indexOf("\"") + b);
				} else if (in1.compareTo("'") == 0) {
					un.add(dic.indexOf("'") + b);
				} else if (in1.compareTo("<") == 0) {
					un.add(dic.indexOf("<") + b);
				} else if (in1.compareTo(",") == 0) {
					un.add(dic.indexOf(",") + b);
				} else if (in1.compareTo(">") == 0) {
					un.add(dic.indexOf(">") + b);
				} else if (in1.compareTo(".") == 0) {
					un.add(dic.indexOf(".") + b);
				} else if (in1.compareTo("?") == 0) {
					un.add(dic.indexOf("?") + b);
				} else if (in1.compareTo("/") == 0) {
					un.add(dic.indexOf("/") + b);
				} else if (in1.compareTo(" ") == 0) {
					un.add(dic.indexOf(" ") + b);
				} else {
					System.out.println("Error!");
				}
				System.out.println(un);// test
				c++;
			}
		} else {
			System.out.println("Your name is out of index, please check the name and type again.");
		}
	}

//		// System.out.println(index);
//		System.out.println("Have special order?");
//		System.out.println("enter Y to have special order, N to continue.");
//		Scanner spe = new Scanner(System.in);
//		String special = spe.nextLine();
//		if (special.compareTo("Y") == 0) {
//			System.out.println("Enter your special order, please.");
//			Scanner qn = new Scanner(System.in);
//			int in17 = qn.nextInt();
//			index.add(in17);
//			Scanner rn = new Scanner(System.in);
//			int in18 = qn.nextInt();
//			index.add(in18);
//			Scanner sn = new Scanner(System.in);
//			int in19 = qn.nextInt();
//			index.add(in19);
//			Scanner tn = new Scanner(System.in);
//			int in20 = qn.nextInt();
//			index.add(in20);
//		} else if (special.compareTo("N") == 0) {
//			for (int k = 0; k <= 4; k++) {
//				index.add(0);
//			}
//		} else {
//			System.out.println("Error!");
//		}
//		System.out.println(index);// test
//		int p4 = index.get(1);// 1
//		int p5 = index.get(2);// 2
//		int p6 = index.get(3);// 3
//		int p7 = index.get(4);// 1
//		int p8 = index.get(5);// 2
//		int p9 = index.get(6);// 3
//		int p10 = index.get(7);// 1
//		int p11 = index.get(8);// 2
//		int p12 = index.get(9);// 3
//		int p13 = index.get(10);// 1
//		int p14 = index.get(11);// 2
//		int p15 = index.get(12);// 3
//		int p16 = index.get(13);// 1
//		int p17 = index.get(14);// 2
//		int p18 = index.get(15);// 3
//		int p19 = index.get(16);// spe1
//		int p20 = index.get(17);// spe2
//		int p21 = index.get(18);// spe3
//		int p22 = index.get(19);// spe4
//		int sp = p19 * 1000 + p20 * 100 + p21 * 10 + p22;
//		long Public1 = p4 + p7 + p10 + p13 + p16;// max
//		long Public2 = p5 + p8 + p11 + p14 + p17;
//		long Public3 = p6 + p9 + p12 + p15 + p18;
//		System.out.println("Please enter the secure mode,0<=S<=5");
//		Scanner s = new Scanner(System.in);
//		int S = s.nextInt();
//		long cry = 0;
//		if (S == 1) {
//			cry = Public1;
//		} else if (S == 2) {
//			cry = Public1 * 1000 + Public2;
//		} else if (S == 3) {
//			cry = Public1 * 1000000 + Public2 * 1000 + Public3;
//		} else if (S == 4) {
//			cry = Public1 * 1000000 + Public2 * 1000 - Public3;
//		} else if (S == 5) {
//			cry = Public1 * 1000000 - Public2 * 1000 + Public3;
//		} else {
//			cry = 1;
//		}
//		if (cry == 0) {
//			System.out.println("Black hole username, please try again. ");
//		}
//		System.out.println(cry);// test
//		List<Integer> cha = new ArrayList<Integer>();
//		for (int f = 1; f < 61; f++) {
//			cha.add(f);
//		}
//		List input = new ArrayList();
//		System.out.println("Enter the text,use \".\" to end. ");
//		System.out.println("You can use puctuation such as \",-:;!?.");
//		int t = -1;
//		while (t < 0) {
//			Scanner an = new Scanner(System.in);
//			String in1 = an.nextLine();
//			if (in1.compareTo("A") == 0) {
//				int a = cha.get(0);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("a") == 0) {
//				int a = cha.get(1);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("B") == 0) {
//				int a = cha.get(2);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("b") == 0) {
//				int a = cha.get(3);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("C") == 0) {
//				int a = cha.get(4);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("c") == 0) {
//				int a = cha.get(5);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("D") == 0) {
//				int a = cha.get(6);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("d") == 0) {
//				int a = cha.get(7);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("E") == 0) {
//				int a = cha.get(8);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("e") == 0) {
//				int a = cha.get(9);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("F") == 0) {
//				int a = cha.get(10);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("f") == 0) {
//				int a = cha.get(11);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("G") == 0) {
//				int a = cha.get(12);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("g") == 0) {
//				int a = cha.get(13);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("H") == 0) {
//				int a = cha.get(14);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("h") == 0) {
//				int a = cha.get(15);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("I") == 0) {
//				int a = cha.get(16);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("i") == 0) {
//				int a = cha.get(17);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("J") == 0) {
//				int a = cha.get(18);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("j") == 0) {
//				int a = cha.get(19);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("K") == 0) {
//				int a = cha.get(20);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("k") == 0) {
//				int a = cha.get(21);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("L") == 0) {
//				int a = cha.get(22);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("l") == 0) {
//				int a = cha.get(23);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("M") == 0) {
//				int a = cha.get(24);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("m") == 0) {
//				int a = cha.get(25);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("N") == 0) {
//				int a = cha.get(26);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("n") == 0) {
//				int a = cha.get(27);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("O") == 0) {
//				int a = cha.get(28);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("o") == 0) {
//				int a = cha.get(29);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("P") == 0) {
//				int a = cha.get(30);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("p") == 0) {
//				int a = cha.get(31);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("Q") == 0) {
//				int a = cha.get(32);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("q") == 0) {
//				int a = cha.get(33);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("R") == 0) {
//				int a = cha.get(34);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("r") == 0) {
//				int a = cha.get(35);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("S") == 0) {
//				int a = cha.get(36);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("s") == 0) {
//				int a = cha.get(37);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("T") == 0) {
//				int a = cha.get(38);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("t") == 0) {
//				int a = cha.get(39);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("U") == 0) {
//				int a = cha.get(40);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("u") == 0) {
//				int a = cha.get(41);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("V") == 0) {
//				int a = cha.get(42);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("v") == 0) {
//				int a = cha.get(43);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("W") == 0) {
//				int a = cha.get(44);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("w") == 0) {
//				int a = cha.get(45);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("X") == 0) {
//				int a = cha.get(46);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("x") == 0) {
//				int a = cha.get(47);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("Y") == 0) {
//				int a = cha.get(48);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("y") == 0) {
//				int a = cha.get(49);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("Z") == 0) {
//				int a = cha.get(50);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("z") == 0) {
//				int a = cha.get(51);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("\"") == 0) {
//				int a = cha.get(52);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo(":") == 0) {
//				int a = cha.get(53);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo(",") == 0) {
//				int a = cha.get(54);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo(";") == 0) {
//				int a = cha.get(55);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("!") == 0) {
//				int a = cha.get(56);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("?") == 0) {
//				int a = cha.get(57);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo("-") == 0) {
//				int a = cha.get(58);
//				input.add(cry * ti * sp * a);
//			} else if (in1.compareTo(".") == 0) {
//				int a = cha.get(59);
//				input.add(cry * ti * sp * a);
//				t++;
//			} else {
//				System.out.println("Error!");
//			}
//			System.out.println(input);// test
//		}
//	}
}