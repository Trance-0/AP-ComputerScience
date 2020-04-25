package Chapter4;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class RomeCode {
	public static void main(String[] args) {
		List<String> org = new ArrayList<String>();
		int i = 0;
		while (i < 2) {
			org.add("A");
			org.add("B");
			org.add("C");
			org.add("D");
			org.add("E");
			org.add("F");
			org.add("G");
			org.add("H");
			org.add("I");
			org.add("J");
			org.add("K");
			org.add("L");
			org.add("M");
			org.add("N");
			org.add("O");
			org.add("P");
			org.add("Q");
			org.add("R");
			org.add("S");
			org.add("T");
			org.add("U");
			org.add("V");
			org.add("W");
			org.add("X");
			org.add("Y");
			org.add("Z");
			i++;
		}
		org.add(" ");
		System.out.println(org);
		System.out.println("Please enter the A= ");
		Scanner in = new Scanner(System.in);
		int key = 0;
		String io = in.nextLine();
		if (io.compareTo("A") == 0) {
			key = 0;
		} else if (io.compareTo("B") == 0) {
			key = 1;
		} else if (io.compareTo("C") == 0) {
			key = 2;
		} else if (io.compareTo("D") == 0) {
			key = 3;
		} else if (io.compareTo("E") == 0) {
			key = 4;
		} else if (io.compareTo("F") == 0) {
			key = 5;
		} else if (io.compareTo("G") == 0) {
			key = 6;
		} else if (io.compareTo("H") == 0) {
			key = 7;
		} else if (io.compareTo("I") == 0) {
			key = 8;
		} else if (io.compareTo("J") == 0) {
			key = 9;
		} else if (io.compareTo("K") == 0) {
			key = 10;
		} else if (io.compareTo("L") == 0) {
			key = 11;
		} else if (io.compareTo("M") == 0) {
			key = 12;
		} else if (io.compareTo("N") == 0) {
			key = 13;
		} else if (io.compareTo("O") == 0) {
			key = 14;
		} else if (io.compareTo("P") == 0) {
			key = 15;
		} else if (io.compareTo("Q") == 0) {
			key = 16;
		} else if (io.compareTo("R") == 0) {
			key = 17;
		} else if (io.compareTo("S") == 0) {
			key = 18;
		} else if (io.compareTo("T") == 0) {
			key = 19;
		} else if (io.compareTo("U") == 0) {
			key = 20;
		} else if (io.compareTo("V") == 0) {
			key = 21;
		} else if (io.compareTo("W") == 0) {
			key = 22;
		} else if (io.compareTo("X") == 0) {
			key = 23;
		} else if (io.compareTo("Y") == 0) {
			key = 24;
		} else if (io.compareTo("Z") == 0) {
			key = 25;
		} else {
			System.out.println("Error!");
		}
		System.out.println(key);
		List<String> dec = new ArrayList<String>();
		System.out.println("Please enter the content of the text, end with \".\" .");
		int k = 0;
		int le = 0;
		while (k < 1) {
			System.out.println(dec);
			le++;
			Scanner on = new Scanner(System.in);
			String ind = on.nextLine();
			if (ind.compareTo(".") == 0) {
				k++;
				dec.add(".");
			} else {
				if (ind.compareTo("A") == 0) {
					dec.add(org.get(key));
				} else if (ind.compareTo("B") == 0) {
					dec.add(org.get(key + 1));
				} else if (ind.compareTo("C") == 0) {
					dec.add(org.get(key + 2));
				} else if (ind.compareTo("D") == 0) {
					dec.add(org.get(key + 3));
				} else if (ind.compareTo("E") == 0) {
					dec.add(org.get(key + 4));
				} else if (ind.compareTo("F") == 0) {
					dec.add(org.get(key + 5));
				} else if (ind.compareTo("G") == 0) {
					dec.add(org.get(key + 6));
				} else if (ind.compareTo("H") == 0) {
					dec.add(org.get(key + 7));
				} else if (ind.compareTo("I") == 0) {
					dec.add(org.get(key + 8));
				} else if (ind.compareTo("J") == 0) {
					dec.add(org.get(key + 9));
				} else if (ind.compareTo("K") == 0) {
					dec.add(org.get(key + 10));
				} else if (ind.compareTo("L") == 0) {
					dec.add(org.get(key + 11));
				} else if (ind.compareTo("M") == 0) {
					dec.add(org.get(key + 12));
				} else if (ind.compareTo("N") == 0) {
					dec.add(org.get(key + 13));
				} else if (ind.compareTo("O") == 0) {
					dec.add(org.get(key + 14));
				} else if (ind.compareTo("P") == 0) {
					dec.add(org.get(key + 15));
				} else if (ind.compareTo("Q") == 0) {
					dec.add(org.get(key + 16));
				} else if (ind.compareTo("R") == 0) {
					dec.add(org.get(key + 17));
				} else if (ind.compareTo("S") == 0) {
					dec.add(org.get(key + 18));
				} else if (ind.compareTo("T") == 0) {
					dec.add(org.get(key + 19));
				} else if (ind.compareTo("U") == 0) {
					dec.add(org.get(key + 20));
				} else if (ind.compareTo("V") == 0) {
					dec.add(org.get(key + 21));
				} else if (ind.compareTo("W") == 0) {
					dec.add(org.get(key + 22));
				} else if (ind.compareTo("X") == 0) {
					dec.add(org.get(key + 23));
				} else if (ind.compareTo("Y") == 0) {
					dec.add(org.get(key + 24));
				} else if (ind.compareTo("Z") == 0) {
					dec.add(org.get(key + 25));
				} else {
					dec.add(org.get(org.size() - 1));
				}
			}
		}
		int e = 0;
		while (e < le) {
			System.out.print(dec.get(e));
			e++;
		}
	}
}
