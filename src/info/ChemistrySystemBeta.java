package info;

import java.util.Scanner;

import java.util.List;

import java.util.ArrayList;

public class ChemistrySystemBeta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> output = new ArrayList<Integer>();
		List<String> input = new ArrayList<String>();
		List<Integer> amount = new ArrayList<Integer>();
		List<Integer> tram = new ArrayList<Integer>();
		tram.add(0, 10);
		tram.add(1, 40);
		tram.add(2, 70);
		tram.add(3, 90);
		tram.add(4, 110);
		tram.add(5, 120);
		tram.add(6, 140);
		tram.add(7, 160);
		tram.add(8, 190);
		tram.add(9, 200);
		tram.add(10, 230);
		tram.add(11, 240);
		tram.add(12, 270);
		tram.add(13, 280);
		tram.add(14, 300);
		tram.add(15, 320);
		tram.add(16, 355);
		tram.add(17, 400);
		tram.add(18, 390);
		tram.add(19, 400);
		tram.add(20, 450);
		tram.add(21, 480);
		tram.add(22, 510);
		tram.add(23, 520);
		tram.add(24, 550);
		tram.add(25, 560);
		tram.add(26, 590);
		tram.add(27, 590);
		tram.add(28, 640);
		tram.add(29, 650);
		tram.add(30, 700);
		tram.add(31, 730);
		tram.add(32, 750);
		tram.add(33, 790);
		tram.add(34, 800);
		tram.add(35, 840);
		tram.add(36, 850);
		tram.add(37, 880);
		tram.add(38, 910);
		tram.add(39, 930);
		tram.add(40, 930);
		tram.add(41, 960);
		tram.add(42, 980);
		tram.add(43, 1010);
		tram.add(44, 1030);
		tram.add(45, 1060);
		tram.add(46, 1080);
		tram.add(47, 1120);
		tram.add(48, 1150);
		tram.add(49, 1190);
		tram.add(50, 1220);
		tram.add(51, 1280);
		tram.add(52, 1270);
		tram.add(53, 1310);
		tram.add(54, 1330);
		tram.add(55, 1370);
		tram.add(56, 1390);
		tram.add(57, 1400);
		tram.add(58, 1410);
		tram.add(59, 1440);
		tram.add(60, 1450);
		tram.add(61, 1500);
		tram.add(62, 1520);
		tram.add(63, 1570);
		tram.add(64, 1590);
		tram.add(65, 1625);
		tram.add(66, 1650);
		tram.add(67, 1670);
		tram.add(68, 1690);
		tram.add(69, 1730);
		tram.add(70, 1750);
		tram.add(71, 1785);
		tram.add(72, 1810);
		tram.add(73, 1840);
		tram.add(74, 1860);
		tram.add(75, 1900);
		tram.add(76, 1920);
		tram.add(77, 1950);
		tram.add(78, 1970);
		tram.add(79, 2010);
		tram.add(80, 2040);
		tram.add(81, 2070);
		tram.add(82, 2090);
		tram.add(83, 2090);
		tram.add(84, 2100);
		tram.add(85, 2220);
		tram.add(86, 2230);
		tram.add(87, 2260);
		tram.add(88, 2270);
		tram.add(89, 2320);
		tram.add(90, 2310);
		tram.add(91, 2380);
		tram.add(92, 2370);
		tram.add(93, 2440);
		tram.add(94, 2430);
		tram.add(95, 2470);
		tram.add(96, 2470);
		tram.add(97, 2510);
		tram.add(98, 2520);
		tram.add(99, 2570);
		tram.add(100, 2580);
		tram.add(101, 2590);
		tram.add(102, 2660);
		tram.add(103, 2670);
		tram.add(104, 2680);
		tram.add(105, 2690);
		tram.add(106, 2700);
		tram.add(107, 2700);
		tram.add(108, 2780);
		tram.add(109, 2810);
		tram.add(110, 2820);
		tram.add(111, 2850);
		tram.add(112, 2860);
		tram.add(113, 2890);
		tram.add(114, 2900);
		tram.add(115, 2930);
		tram.add(116, 2940);
		tram.add(117, 2940);
		tram.add(118, 0);
		System.out.println("Welcome to use the chemistry system.");
		System.out.println("This is a program which use to calculate the ");
		System.out.println("The Relative Molecular mass.");
		System.out.println("The Relative Atoms mass.");
		System.out.println("The format is \"Name amount\".");
		System.out.println("if you need to enter the (),you need to change it in to simple format.");
		System.out.println("for example Mg(OH)2 need translate into Mg 1 O 2 H 2.");
		System.out.println("How many elements in this compound?");
		Scanner var = new Scanner(System.in);
		int amo = var.nextInt();
		System.out.println("What are the elements in this compound?");
		int j = 0;
		while (j < amo) {
			Scanner va1 = new Scanner(System.in);
			String element = va1.nextLine();
			Scanner va2 = new Scanner(System.in);
			int num = va2.nextInt();
			int i = 0;
			if (element.compareTo("H") == 0) {
				i = (int) tram.get(0)*num;

			} else if (element.compareTo("He") == 0) {
				i = (int) tram.get(1)*num;

			} else if (element.compareTo("Li") == 0) {
				i = (int) tram.get(2)*num;

			} else if (element.compareTo("Be") == 0) {
				i = (int) tram.get(3)*num;

			} else if (element.compareTo("B") == 0) {
				i = (int) tram.get(4)*num;

			} else if (element.compareTo("C") == 0) {
				i = (int) tram.get(5)*num;

			} else if (element.compareTo("N") == 0) {
				i = (int) tram.get(6)*num;

			} else if (element.compareTo("O") == 0) {
				i = (int) tram.get(7)*num;

			} else if (element.compareTo("F") == 0) {
				i = (int) tram.get(8)*num;

			} else if (element.compareTo("Ne") == 0) {
				i = (int) tram.get(9)*num;

			} else if (element.compareTo("Na") == 0) {
				i = (int) tram.get(10)*num;

			} else if (element.compareTo("Mg") == 0) {
				i = (int) tram.get(11)*num;

			} else if (element.compareTo("Al") == 0) {
				i = (int) tram.get(12)*num;

			} else if (element.compareTo("Si") == 0) {
				i = (int) tram.get(13)*num;

			} else if (element.compareTo("P") == 0) {
				i = (int) tram.get(14)*num;

			} else if (element.compareTo("S") == 0) {
				i = (int) tram.get(15)*num;

			} else if (element.compareTo("Cl") == 0) {
				i = (int) tram.get(16)*num;

			} else if (element.compareTo("Ar") == 0) {
				i = (int) tram.get(17)*num;

			} else if (element.compareTo("K") == 0) {
				i = (int) tram.get(18)*num;

			} else if (element.compareTo("Ca") == 0) {
				i = (int) tram.get(19)*num;

			} else if (element.compareTo("Sc") == 0) {
				i = (int) tram.get(20)*num;

			} else if (element.compareTo("Ti") == 0) {
				i = (int) tram.get(21)*num;

			} else if (element.compareTo("V") == 0) {
				i = (int) tram.get(22)*num;

			} else if (element.compareTo("Cr") == 0) {
				i = (int) tram.get(23)*num;

			} else if (element.compareTo("Mn") == 0) {
				i = (int) tram.get(24)*num;

			} else if (element.compareTo("Fe") == 0) {
				i = (int) tram.get(25)*num;

			} else if (element.compareTo("Co") == 0) {
				i = (int) tram.get(26)*num;

			} else if (element.compareTo("Ni") == 0) {
				i = (int) tram.get(27)*num;

			} else if (element.compareTo("Cu") == 0) {
				i = (int) tram.get(28)*num;

			} else if (element.compareTo("Zn") == 0) {
				i = (int) tram.get(29)*num;

			} else if (element.compareTo("Ga") == 0) {
				i = (int) tram.get(30)*num;

			} else if (element.compareTo("Ge") == 0) {
				i = (int) tram.get(31)*num;

			} else if (element.compareTo("As") == 0) {
				i = (int) tram.get(32)*num;

			} else if (element.compareTo("Se") == 0) {
				i = (int) tram.get(33)*num;

			} else if (element.compareTo("Br") == 0) {
				i = (int) tram.get(34)*num;

			} else if (element.compareTo("Kr") == 0) {
				i = (int) tram.get(35)*num;

			} else if (element.compareTo("Rb") == 0) {
				i = (int) tram.get(36)*num;

			} else if (element.compareTo("Sr") == 0) {
				i = (int) tram.get(37)*num;

			} else if (element.compareTo("Y") == 0) {
				i = (int) tram.get(38)*num;

			} else if (element.compareTo("Zr") == 0) {
				i = (int) tram.get(39)*num;

			} else if (element.compareTo("Nb") == 0) {
				i = (int) tram.get(40)*num;

			} else if (element.compareTo("Mo") == 0) {
				i = (int) tram.get(41)*num;

			} else if (element.compareTo("Tc") == 0) {
				i = (int) tram.get(42)*num;

			} else if (element.compareTo("Ru") == 0) {
				i = (int) tram.get(43)*num;

			} else if (element.compareTo("Rh") == 0) {
				i = (int) tram.get(44)*num;

			} else if (element.compareTo("Pd") == 0) {
				i = (int) tram.get(45)*num;

			} else if (element.compareTo("Ag") == 0) {
				i = (int) tram.get(46)*num;

			} else if (element.compareTo("Cd") == 0) {
				i = (int) tram.get(47)*num;

			} else if (element.compareTo("In") == 0) {
				i = (int) tram.get(48)*num;

			} else if (element.compareTo("Sn") == 0) {
				i = (int) tram.get(49)*num;

			} else if (element.compareTo("Sb") == 0) {
				i = (int) tram.get(50)*num;

			} else if (element.compareTo("Te") == 0) {
				i = (int) tram.get(51)*num;

			} else if (element.compareTo("I") == 0) {
				i = (int) tram.get(52)*num;

			} else if (element.compareTo("Xe") == 0) {
				i = (int) tram.get(53)*num;

			} else if (element.compareTo("Cs") == 0) {
				i = (int) tram.get(54)*num;

			} else if (element.compareTo("Ba") == 0) {
				i = (int) tram.get(55)*num;

			} else if (element.compareTo("La") == 0) {
				i = (int) tram.get(56)*num;

			} else if (element.compareTo("Ce") == 0) {
				i = (int) tram.get(57)*num;

			} else if (element.compareTo("Pr") == 0) {
				i = (int) tram.get(58)*num;

			} else if (element.compareTo("Nd") == 0) {
				i = (int) tram.get(59)*num;

			} else if (element.compareTo("Pm") == 0) {
				i = (int) tram.get(60)*num;

			} else if (element.compareTo("Sm") == 0) {
				i = (int) tram.get(61)*num;

			} else if (element.compareTo("Eu") == 0) {
				i = (int) tram.get(62)*num;

			} else if (element.compareTo("Gd") == 0) {
				i = (int) tram.get(63)*num;

			} else if (element.compareTo("Tb") == 0) {
				i = (int) tram.get(64)*num;

			} else if (element.compareTo("Dy") == 0) {
				i = (int) tram.get(65)*num;

			} else if (element.compareTo("Ho") == 0) {
				i = (int) tram.get(66)*num;

			} else if (element.compareTo("Er") == 0) {
				i = (int) tram.get(67)*num;

			} else if (element.compareTo("Tm") == 0) {
				i = (int) tram.get(68)*num;

			} else if (element.compareTo("Yb") == 0) {
				i = (int) tram.get(69)*num;

			} else if (element.compareTo("Lu") == 0) {
				i = (int) tram.get(70)*num;

			} else if (element.compareTo("Hf") == 0) {
				i = (int) tram.get(71)*num;

			} else if (element.compareTo("Ta") == 0) {
				i = (int) tram.get(72)*num;

			} else if (element.compareTo("W") == 0) {
				i = (int) tram.get(73)*num;

			} else if (element.compareTo("Re") == 0) {
				i = (int) tram.get(74)*num;

			} else if (element.compareTo("Os") == 0) {
				i = (int) tram.get(75)*num;

			} else if (element.compareTo("Ir") == 0) {
				i = (int) tram.get(76)*num;

			} else if (element.compareTo("Pt") == 0) {
				i = (int) tram.get(77)*num;

			} else if (element.compareTo("Au") == 0) {
				i = (int) tram.get(78)*num;

			} else if (element.compareTo("Hg") == 0) {
				i = (int) tram.get(79)*num;

			} else if (element.compareTo("Ti") == 0) {
				i = (int) tram.get(80)*num;

			} else if (element.compareTo("Pb") == 0) {
				i = (int) tram.get(81)*num;

			} else if (element.compareTo("Bi") == 0) {
				i = (int) tram.get(82)*num;

			} else if (element.compareTo("Po") == 0) {
				i = (int) tram.get(83)*num;

			} else if (element.compareTo("At") == 0) {
				i = (int) tram.get(84)*num;

			} else if (element.compareTo("Rn") == 0) {
				i = (int) tram.get(85)*num;

			} else if (element.compareTo("Fr") == 0) {
				i = (int) tram.get(86)*num;

			} else if (element.compareTo("Ra") == 0) {
				i = (int) tram.get(87)*num;

			} else if (element.compareTo("Ac") == 0) {
				i = (int) tram.get(88)*num;

			} else if (element.compareTo("Th") == 0) {
				i = (int) tram.get(89)*num;

			} else if (element.compareTo("Pa") == 0) {
				i = (int) tram.get(90)*num;

			} else if (element.compareTo("U") == 0) {
				i = (int) tram.get(91)*num;

			} else if (element.compareTo("Np") == 0) {
				i = (int) tram.get(92)*num;

			} else if (element.compareTo("Pu") == 0) {
				i = (int) tram.get(93)*num;

			} else if (element.compareTo("Am") == 0) {
				i = (int) tram.get(94)*num;

			} else if (element.compareTo("Cm") == 0) {
				i = (int) tram.get(95)*num;

			} else if (element.compareTo("Bk") == 0) {
				i = (int) tram.get(96)*num;

			} else if (element.compareTo("Cf") == 0) {
				i = (int) tram.get(97)*num;

			} else if (element.compareTo("Es") == 0) {
				i = (int) tram.get(98)*num;

			} else if (element.compareTo("Fm") == 0) {
				i = (int) tram.get(99)*num;

			} else if (element.compareTo("Md") == 0) {
				i = (int) tram.get(100)*num;

			} else if (element.compareTo("No") == 0) {
				i = (int) tram.get(101)*num;

			} else if (element.compareTo("Lr") == 0) {
				i = (int) tram.get(102)*num;

			} else if (element.compareTo("Rf") == 0) {
				i = (int) tram.get(103)*num;

			} else if (element.compareTo("Db") == 0) {
				i = (int) tram.get(104)*num;

			} else if (element.compareTo("Sg") == 0) {
				i = (int) tram.get(105)*num;

			} else if (element.compareTo("Bh") == 0) {
				i = (int) tram.get(106)*num;

			} else if (element.compareTo("Hs") == 0) {
				i = (int) tram.get(107)*num;

			} else if (element.compareTo("Mt") == 0) {
				i = (int) tram.get(108)*num;

			} else if (element.compareTo("Ds") == 0) {
				i = (int) tram.get(109)*num;

			} else if (element.compareTo("Rg") == 0) {
				i = (int) tram.get(110)*num;

			} else if (element.compareTo("Cn") == 0) {
				i = (int) tram.get(111)*num;

			} else if (element.compareTo("Nh") == 0) {
				i = (int) tram.get(112)*num;

			} else if (element.compareTo("Fl") == 0) {
				i = (int) tram.get(113)*num;

			} else if (element.compareTo("Mc") == 0) {
				i = (int) tram.get(114)*num;

			} else if (element.compareTo("Lv") == 0) {
				i = (int) tram.get(115)*num;

			} else if (element.compareTo("Ts") == 0) {
				i = (int) tram.get(116)*num;

			} else if (element.compareTo("Og") == 0) {
				i = (int) tram.get(117)*num;

			} else {
				System.out.println("Error, please try again.");
			}
			output.add(i);
			input.add(element);
			amount.add(num);
			j++;
		}
		double k1 = 0;
		double k2 = 0;
		double k3 = 0;
		double k4 = 0;
		double k5 = 0;
		double k6 = 0;
		double k7 = 0;
		double k8 = 0;
		double k9 = 0;
		double k10 = 0;
		String l1 = "";
		String l2 = "";
		String l3 = "";
		String l4 = "";
		String l5 = "";
		String l6 = "";
		String l7 = "";
		String l8 = "";
		String l9 = "";
		String l10 = "";
		int m1 = 0;
		int m2 = 0;
		int m3 = 0;
		int m4 = 0;
		int m5 = 0;
		int m6 = 0;
		int m7 = 0;
		int m8 = 0;
		int m9 = 0;
		int m10 = 0;
		if (amo == 1) {
			k1 = (double) output.get(0) / 10;
		l1 = (String) input.get(0);
			m1 = (int) amount.get(0);
			double tot = k1 ;
			System.out.println("The Relative Molecular mass of ");
			System.out.println(
					l1 + m1  );
			System.out.println("is " + tot + " .");
		} else if (amo == 2) {
			k1 = (double) output.get(0) / 10;
			k2 = (double) output.get(1) / 10;
		l1 = (String) input.get(0);
			l2 = (String) input.get(1);
			m1 = (int) amount.get(0);
			m2 = (int) amount.get(1);
			double tot = k1 + k2   ;
			System.out.println("The Relative Molecular mass of ");
			System.out.println(
					l1 + m1 + l2 + m2  );
			System.out.println("is " + tot + " .");
		} else if (amo == 3) {
			k1 = (double) output.get(0) / 10;
			k2 = (double) output.get(1) / 10;
			k3 = (double) output.get(2) / 10;
		l1 = (String) input.get(0);
			l2 = (String) input.get(1);
			l3 = (String) input.get(2);
			m1 = (int) amount.get(0);
			m2 = (int) amount.get(1);
			m3 = (int) amount.get(2);
			double tot = k1 + k2 + k3   ;
			System.out.println("The Relative Molecular mass of ");
			System.out.println(
					l1 + m1 + l2 + m2 + l3 + m3  );
			System.out.println("is " + tot + " .");
		} else if (amo == 4) {
			k1 = (double) output.get(0) / 10;
			k2 = (double) output.get(1) / 10;
			k3 = (double) output.get(2) / 10;
			k4 = (double) output.get(3) / 10;
		l1 = (String) input.get(0);
			l2 = (String) input.get(1);
			l3 = (String) input.get(2);
			l4 = (String) input.get(3);
			m1 = (int) amount.get(0);
			m2 = (int) amount.get(1);
			m3 = (int) amount.get(2);
			m4 = (int) amount.get(3);
			double tot = k1 + k2 + k3 + k4  ;
			System.out.println("The Relative Molecular mass of ");
			System.out.println(
					l1 + m1 + l2 + m2 + l3 + m3 + l4 + m4  );
			System.out.println("is " + tot + " .");
		} else if (amo == 5) {
			k1 = (double) output.get(0) / 10;
			k2 = (double) output.get(1) / 10;
			k3 = (double) output.get(2) / 10;
			k4 = (double) output.get(3) / 10;
			k5 = (double) output.get(4) / 10;
		l1 = (String) input.get(0);
			l2 = (String) input.get(1);
			l3 = (String) input.get(2);
			l4 = (String) input.get(3);
			l5 = (String) input.get(4);

			m1 = (int) amount.get(0);
			m2 = (int) amount.get(1);
			m3 = (int) amount.get(2);
			m4 = (int) amount.get(3);
			m5 = (int) amount.get(4);
			double tot = k1 + k2 + k3 + k4 + k5  ;
			System.out.println("The Relative Molecular mass of ");
			System.out.println(
					l1 + m1 + l2 + m2 + l3 + m3 + l4 + m4 + l5 + m5 );
			System.out.println("is " + tot + " .");
		} else if (amo == 6) {
			k1 = (double) output.get(0) / 10;
			k2 = (double) output.get(1) / 10;
			k3 = (double) output.get(2) / 10;
			k4 = (double) output.get(3) / 10;
			k5 = (double) output.get(4) / 10;
			k6 = (double) output.get(5) / 10;
		l1 = (String) input.get(0);
			l2 = (String) input.get(1);
			l3 = (String) input.get(2);
			l4 = (String) input.get(3);
			l5 = (String) input.get(4);
			l6 = (String) input.get(5);

			m1 = (int) amount.get(0);
			m2 = (int) amount.get(1);
			m3 = (int) amount.get(2);
			m4 = (int) amount.get(3);
			m5 = (int) amount.get(4);
			m6 = (int) amount.get(5);
			double tot = k1 + k2 + k3 + k4 + k5 + k6  ;
			System.out.println("The Relative Molecular mass of ");
			System.out.println(
					l1 + m1 + l2 + m2 + l3 + m3 + l4 + m4 + l5 + m5 + l6 + m6  );
			System.out.println("is " + tot + " .");
		} else if (amo == 7) {
			k1 = (double) output.get(0) / 10;
			k2 = (double) output.get(1) / 10;
			k3 = (double) output.get(2) / 10;
			k4 = (double) output.get(3) / 10;
			k5 = (double) output.get(4) / 10;
			k6 = (double) output.get(5) / 10;
			k7 = (double) output.get(6) / 10;
		l1 = (String) input.get(0);
			l2 = (String) input.get(1);
			l3 = (String) input.get(2);
			l4 = (String) input.get(3);
			l5 = (String) input.get(4);
			l6 = (String) input.get(5);
			l7 = (String) input.get(6);
			m1 = (int) amount.get(0);
			m2 = (int) amount.get(1);
			m3 = (int) amount.get(2);
			m4 = (int) amount.get(3);
			m5 = (int) amount.get(4);
			m6 = (int) amount.get(5);
			m7 = (int) amount.get(6);
			double tot = k1 + k2 + k3 + k4 + k5 + k6 + k7  ;
			System.out.println("The Relative Molecular mass of ");
			System.out.println(
					l1 + m1 + l2 + m2 + l3 + m3 + l4 + m4 + l5 + m5 + l6 + m6 + l7 + m7  );
			System.out.println("is " + tot + " .");
		} else if (amo == 8) {
			k1 = (double) output.get(0) / 10;
			k2 = (double) output.get(1) / 10;
			k3 = (double) output.get(2) / 10;
			k4 = (double) output.get(3) / 10;
			k5 = (double) output.get(4) / 10;
			k6 = (double) output.get(5) / 10;
			k7 = (double) output.get(6) / 10;
			k8 = (double) output.get(7) / 10;

		
			l1 = (String) input.get(0);
			l2 = (String) input.get(1);
			l3 = (String) input.get(2);
			l4 = (String) input.get(3);
			l5 = (String) input.get(4);
			l6 = (String) input.get(5);
			l7 = (String) input.get(6);
			l8 = (String) input.get(7);

	
			m1 = (int) amount.get(0);
			m2 = (int) amount.get(1);
			m3 = (int) amount.get(2);
			m4 = (int) amount.get(3);
			m5 = (int) amount.get(4);
			m6 = (int) amount.get(5);
			m7 = (int) amount.get(6);
			m8 = (int) amount.get(7);
			double tot = k1 + k2 + k3 + k4 + k5 + k6 + k7 + k8  ;
			System.out.println("The Relative Molecular mass of ");
			System.out.println(
					l1 + m1 + l2 + m2 + l3 + m3 + l4 + m4 + l5 + m5 + l6 + m6 + l7 + m7 + l8 + m8  );
			System.out.println("is " + tot + " .");
		
		} else if (amo == 9) {
			k1 = (double) output.get(0) / 10;
			k2 = (double) output.get(1) / 10;
			k3 = (double) output.get(2) / 10;
			k4 = (double) output.get(3) / 10;
			k5 = (double) output.get(4) / 10;
			k6 = (double) output.get(5) / 10;
			k7 = (double) output.get(6) / 10;
			k8 = (double) output.get(7) / 10;
			k9 = (double) output.get(8) / 10;
		
			l1 = (String) input.get(0);
			l2 = (String) input.get(1);
			l3 = (String) input.get(2);
			l4 = (String) input.get(3);
			l5 = (String) input.get(4);
			l6 = (String) input.get(5);
			l7 = (String) input.get(6);
			l8 = (String) input.get(7);
			l9 = (String) input.get(8);
	
			m1 = (int) amount.get(0);
			m2 = (int) amount.get(1);
			m3 = (int) amount.get(2);
			m4 = (int) amount.get(3);
			m5 = (int) amount.get(4);
			m6 = (int) amount.get(5);
			m7 = (int) amount.get(6);
			m8 = (int) amount.get(7);
			m9 = (int) amount.get(8);

			double tot = k1 + k2 + k3 + k4 + k5 + k6 + k7 + k8 + k9 ;
			System.out.println("The Relative Molecular mass of ");
			System.out.println(
					l1 + m1 + l2 + m2 + l3 + m3 + l4 + m4 + l5 + m5 + l6 + m6 + l7 + m7 + l8 + m8 + l9 + m9 );
			System.out.println("is " + tot + " .");
		} else if (amo == 10) {
			k1 = (double) output.get(0) / 10;
			k2 = (double) output.get(1) / 10;
			k3 = (double) output.get(2) / 10;
			k4 = (double) output.get(3) / 10;
			k5 = (double) output.get(4) / 10;
			k6 = (double) output.get(5) / 10;
			k7 = (double) output.get(6) / 10;
			k8 = (double) output.get(7) / 10;
			k9 = (double) output.get(8) / 10;
			k10 = (double) output.get(9) / 10;
			l1 = (String) input.get(0);
			l2 = (String) input.get(1);
			l3 = (String) input.get(2);
			l4 = (String) input.get(3);
			l5 = (String) input.get(4);
			l6 = (String) input.get(5);
			l7 = (String) input.get(6);
			l8 = (String) input.get(7);
			l9 = (String) input.get(8);
			l10 = (String) input.get(9);
			m1 = (int) amount.get(0);
			m2 = (int) amount.get(1);
			m3 = (int) amount.get(2);
			m4 = (int) amount.get(3);
			m5 = (int) amount.get(4);
			m6 = (int) amount.get(5);
			m7 = (int) amount.get(6);
			m8 = (int) amount.get(7);
			m9 = (int) amount.get(8);
			m10 = (int) amount.get(9);

			double tot = k1 + k2 + k3 + k4 + k5 + k6 + k7 + k8 + k9 + k10;
			System.out.println("The Relative Molecular mass of ");
			System.out.println(
					l1 + m1 + l2 + m2 + l3 + m3 + l4 + m4 + l5 + m5 + l6 + m6 + l7 + m7 + l8 + m8 + l9 + m9 + l10 + m10);
			System.out.println("is " + tot + " .");
		} else {
			System.out.println("The maximum number of element is 10.");
		}

	}
}