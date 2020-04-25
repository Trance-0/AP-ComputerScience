package info;

import java.util.Scanner;

import java.util.List;

import java.util.ArrayList;

public class ChemistrySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.println("Welcome to use the cemistry system.");
		System.out.println("This is a program which use to calculate the ");
		System.out.println("The Relative Molecular mass.");
		System.out.println("The Relative Atoms mass.");
		System.out.println("The format is xx n yy n zz n .");
		System.out.println("if you don't need the element,just follow the format.");
		System.out.println("for example O 2 yy 1 zz 1.");
		System.out.println("if you need to enter the (),you need to change it in to simple format.");
		System.out.println("for example Mg(OH)2 need translate into Mg 1 O 2 H 2.");
		Scanner var = new Scanner(System.in);
		String input1 = var.next();// element 1
		int num1 = var.nextInt();
		String input2 = var.next();// element 2
		double num2 = var.nextInt();
		String input3 = var.next();// element 3
	    double num3 = var.nextInt();
		double sum = 0;
		double sun = 0;
		double suo = 0;
		if (input1.compareTo("H") == 0) {
			int i = (int) tram.get(0);
			sum = i * num1/10;
			} else if (input1.compareTo("He") == 0) {
			int i = (int) tram.get(1);
			sum = i * num1/10;
			} else if (input1.compareTo("Li") == 0) {
			int i = (int) tram.get(2);
			sum = i * num1/10;
			} else if (input1.compareTo("Be") == 0) {
			int i = (int) tram.get(3);
			sum = i * num1/10;
			} else if (input1.compareTo("B") == 0) {
			int i = (int) tram.get(4);
			sum = i * num1/10;
			} else if (input1.compareTo("C") == 0) {
			int i = (int) tram.get(5);
			sum = i * num1/10;
			} else if (input1.compareTo("N") == 0) {
			int i = (int) tram.get(6);
			sum = i * num1/10;
			} else if (input1.compareTo("O") == 0) {
			int i = (int) tram.get(7);
			sum = i * num1/10;
			} else if (input1.compareTo("F") == 0) {
			int i = (int) tram.get(8);
			sum = i * num1/10;
			} else if (input1.compareTo("Ne") == 0) {
			int i = (int) tram.get(9);
			sum = i * num1/10;
			} else if (input1.compareTo("Na") == 0) {
			int i = (int) tram.get(10);
			sum = i * num1/10;
			} else if (input1.compareTo("Mg") == 0) {
			int i = (int) tram.get(11);
			sum = i * num1/10;
			} else if (input1.compareTo("Al") == 0) {
			int i = (int) tram.get(12);
			sum = i * num1/10;
			} else if (input1.compareTo("Si") == 0) {
			int i = (int) tram.get(13);
			sum = i * num1/10;
			} else if (input1.compareTo("P") == 0) {
			int i = (int) tram.get(14);
			sum = i * num1/10;
			} else if (input1.compareTo("S") == 0) {
			int i = (int) tram.get(15);
			sum = i * num1/10;
			} else if (input1.compareTo("Cl") == 0) {
			int i = (int) tram.get(16);
			sum = i * num1/10;
			} else if (input1.compareTo("Ar") == 0) {
			int i = (int) tram.get(17);
			sum = i * num1/10;
			} else if (input1.compareTo("K") == 0) {
			int i = (int) tram.get(18);
			sum = i * num1/10;
			} else if (input1.compareTo("Ca") == 0) {
			int i = (int) tram.get(19);
			sum = i * num1/10;
			} else if (input1.compareTo("Sc") == 0) {
			int i = (int) tram.get(20);
			sum = i * num1/10;
			} else if (input1.compareTo("Ti") == 0) {
			int i = (int) tram.get(21);
			sum = i * num1/10;
			} else if (input1.compareTo("V") == 0) {
			int i = (int) tram.get(22);
			sum = i * num1/10;
			} else if (input1.compareTo("Cr") == 0) {
			int i = (int) tram.get(23);
			sum = i * num1/10;
			} else if (input1.compareTo("Mn") == 0) {
			int i = (int) tram.get(24);
			sum = i * num1/10;
			} else if (input1.compareTo("Fe") == 0) {
			int i = (int) tram.get(25);
			sum = i * num1/10;
			} else if (input1.compareTo("Co") == 0) {
			int i = (int) tram.get(26);
			sum = i * num1/10;
			} else if (input1.compareTo("Ni") == 0) {
			int i = (int) tram.get(27);
			sum = i * num1/10;
			} else if (input1.compareTo("Cu") == 0) {
			int i = (int) tram.get(28);
			sum = i * num1/10;
			} else if (input1.compareTo("Zn") == 0) {
			int i = (int) tram.get(29);
			sum = i * num1/10;
			} else if (input1.compareTo("Ga") == 0) {
			int i = (int) tram.get(30);
			sum = i * num1/10;
			} else if (input1.compareTo("Ge") == 0) {
			int i = (int) tram.get(31);
			sum = i * num1/10;
			} else if (input1.compareTo("As") == 0) {
			int i = (int) tram.get(32);
			sum = i * num1/10;
			} else if (input1.compareTo("Se") == 0) {
			int i = (int) tram.get(33);
			sum = i * num1/10;
			} else if (input1.compareTo("Br") == 0) {
			int i = (int) tram.get(34);
			sum = i * num1/10;
			} else if (input1.compareTo("Kr") == 0) {
			int i = (int) tram.get(35);
			sum = i * num1/10;
			} else if (input1.compareTo("Rb") == 0) {
			int i = (int) tram.get(36);
			sum = i * num1/10;
			} else if (input1.compareTo("Sr") == 0) {
			int i = (int) tram.get(37);
			sum = i * num1/10;
			} else if (input1.compareTo("Y") == 0) {
			int i = (int) tram.get(38);
			sum = i * num1/10;
			} else if (input1.compareTo("Zr") == 0) {
			int i = (int) tram.get(39);
			sum = i * num1/10;
			} else if (input1.compareTo("Nb") == 0) {
			int i = (int) tram.get(40);
			sum = i * num1/10;
			} else if (input1.compareTo("Mo") == 0) {
			int i = (int) tram.get(41);
			sum = i * num1/10;
			} else if (input1.compareTo("Tc") == 0) {
			int i = (int) tram.get(42);
			sum = i * num1/10;
			} else if (input1.compareTo("Ru") == 0) {
			int i = (int) tram.get(43);
			sum = i * num1/10;
			} else if (input1.compareTo("Rh") == 0) {
			int i = (int) tram.get(44);
			sum = i * num1/10;
			} else if (input1.compareTo("Pd") == 0) {
			int i = (int) tram.get(45);
			sum = i * num1/10;
			} else if (input1.compareTo("Ag") == 0) {
			int i = (int) tram.get(46);
			sum = i * num1/10;
			} else if (input1.compareTo("Cd") == 0) {
			int i = (int) tram.get(47);
			sum = i * num1/10;
			} else if (input1.compareTo("In") == 0) {
			int i = (int) tram.get(48);
			sum = i * num1/10;
			} else if (input1.compareTo("Sn") == 0) {
			int i = (int) tram.get(49);
			sum = i * num1/10;
			} else if (input1.compareTo("Sb") == 0) {
			int i = (int) tram.get(50);
			sum = i * num1/10;
			} else if (input1.compareTo("Te") == 0) {
			int i = (int) tram.get(51);
			sum = i * num1/10;
			} else if (input1.compareTo("I") == 0) {
			int i = (int) tram.get(52);
			sum = i * num1/10;
			} else if (input1.compareTo("Xe") == 0) {
			int i = (int) tram.get(53);
			sum = i * num1/10;
			} else if (input1.compareTo("Cs") == 0) {
			int i = (int) tram.get(54);
			sum = i * num1/10;
			} else if (input1.compareTo("Ba") == 0) {
			int i = (int) tram.get(55);
			sum = i * num1/10;
			} else if (input1.compareTo("La") == 0) {
			int i = (int) tram.get(56);
			sum = i * num1/10;
			} else if (input1.compareTo("Ce") == 0) {
			int i = (int) tram.get(57);
			sum = i * num1/10;
			} else if (input1.compareTo("Pr") == 0) {
			int i = (int) tram.get(58);
			sum = i * num1/10;
			} else if (input1.compareTo("Nd") == 0) {
			int i = (int) tram.get(59);
			sum = i * num1/10;
			} else if (input1.compareTo("Pm") == 0) {
			int i = (int) tram.get(60);
			sum = i * num1/10;
			} else if (input1.compareTo("Sm") == 0) {
			int i = (int) tram.get(61);
			sum = i * num1/10;
			} else if (input1.compareTo("Eu") == 0) {
			int i = (int) tram.get(62);
			sum = i * num1/10;
			} else if (input1.compareTo("Gd") == 0) {
			int i = (int) tram.get(63);
			sum = i * num1/10;
			} else if (input1.compareTo("Tb") == 0) {
			int i = (int) tram.get(64);
			sum = i * num1/10;
			} else if (input1.compareTo("Dy") == 0) {
			int i = (int) tram.get(65);
			sum = i * num1/10;
			} else if (input1.compareTo("Ho") == 0) {
			int i = (int) tram.get(66);
			sum = i * num1/10;
			} else if (input1.compareTo("Er") == 0) {
			int i = (int) tram.get(67);
			sum = i * num1/10;
			} else if (input1.compareTo("Tm") == 0) {
			int i = (int) tram.get(68);
			sum = i * num1/10;
			} else if (input1.compareTo("Yb") == 0) {
			int i = (int) tram.get(69);
			sum = i * num1/10;
			} else if (input1.compareTo("Lu") == 0) {
			int i = (int) tram.get(70);
			sum = i * num1/10;
			} else if (input1.compareTo("Hf") == 0) {
			int i = (int) tram.get(71);
			sum = i * num1/10;
			} else if (input1.compareTo("Ta") == 0) {
			int i = (int) tram.get(72);
			sum = i * num1/10;
			} else if (input1.compareTo("W") == 0) {
			int i = (int) tram.get(73);
			sum = i * num1/10;
			} else if (input1.compareTo("Re") == 0) {
			int i = (int) tram.get(74);
			sum = i * num1/10;
			} else if (input1.compareTo("Os") == 0) {
			int i = (int) tram.get(75);
			sum = i * num1/10;
			} else if (input1.compareTo("Ir") == 0) {
			int i = (int) tram.get(76);
			sum = i * num1/10;
			} else if (input1.compareTo("Pt") == 0) {
			int i = (int) tram.get(77);
			sum = i * num1/10;
			} else if (input1.compareTo("Au") == 0) {
			int i = (int) tram.get(78);
			sum = i * num1/10;
			} else if (input1.compareTo("Hg") == 0) {
			int i = (int) tram.get(79);
			sum = i * num1/10;
			} else if (input1.compareTo("Ti") == 0) {
			int i = (int) tram.get(80);
			sum = i * num1/10;
			} else if (input1.compareTo("Pb") == 0) {
			int i = (int) tram.get(81);
			sum = i * num1/10;
			} else if (input1.compareTo("Bi") == 0) {
			int i = (int) tram.get(82);
			sum = i * num1/10;
			} else if (input1.compareTo("Po") == 0) {
			int i = (int) tram.get(83);
			sum = i * num1/10;
			} else if (input1.compareTo("At") == 0) {
			int i = (int) tram.get(84);
			sum = i * num1/10;
			} else if (input1.compareTo("Rn") == 0) {
			int i = (int) tram.get(85);
			sum = i * num1/10;
			} else if (input1.compareTo("Fr") == 0) {
			int i = (int) tram.get(86);
			sum = i * num1/10;
			} else if (input1.compareTo("Ra") == 0) {
			int i = (int) tram.get(87);
			sum = i * num1/10;
			} else if (input1.compareTo("Ac") == 0) {
			int i = (int) tram.get(88);
			sum = i * num1/10;
			} else if (input1.compareTo("Th") == 0) {
			int i = (int) tram.get(89);
			sum = i * num1/10;
			} else if (input1.compareTo("Pa") == 0) {
			int i = (int) tram.get(90);
			sum = i * num1/10;
			} else if (input1.compareTo("U") == 0) {
			int i = (int) tram.get(91);
			sum = i * num1/10;
			} else if (input1.compareTo("Np") == 0) {
			int i = (int) tram.get(92);
			sum = i * num1/10;
			} else if (input1.compareTo("Pu") == 0) {
			int i = (int) tram.get(93);
			sum = i * num1/10;
			} else if (input1.compareTo("Am") == 0) {
			int i = (int) tram.get(94);
			sum = i * num1/10;
			} else if (input1.compareTo("Cm") == 0) {
			int i = (int) tram.get(95);
			sum = i * num1/10;
			} else if (input1.compareTo("Bk") == 0) {
			int i = (int) tram.get(96);
			sum = i * num1/10;
			} else if (input1.compareTo("Cf") == 0) {
			int i = (int) tram.get(97);
			sum = i * num1/10;
			} else if (input1.compareTo("Es") == 0) {
			int i = (int) tram.get(98);
			sum = i * num1/10;
			} else if (input1.compareTo("Fm") == 0) {
			int i = (int) tram.get(99);
			sum = i * num1/10;
			} else if (input1.compareTo("Md") == 0) {
			int i = (int) tram.get(100);
			sum = i * num1/10;
			} else if (input1.compareTo("No") == 0) {
			int i = (int) tram.get(101);
			sum = i * num1/10;
			} else if (input1.compareTo("Lr") == 0) {
			int i = (int) tram.get(102);
			sum = i * num1/10;
			} else if (input1.compareTo("Rf") == 0) {
			int i = (int) tram.get(103);
			sum = i * num1/10;
			} else if (input1.compareTo("Db") == 0) {
			int i = (int) tram.get(104);
			sum = i * num1/10;
			} else if (input1.compareTo("Sg") == 0) {
			int i = (int) tram.get(105);
			sum = i * num1/10;
			} else if (input1.compareTo("Bh") == 0) {
			int i = (int) tram.get(106);
			sum = i * num1/10;
			} else if (input1.compareTo("Hs") == 0) {
			int i = (int) tram.get(107);
			sum = i * num1/10;
			} else if (input1.compareTo("Mt") == 0) {
			int i = (int) tram.get(108);
			sum = i * num1/10;
			} else if (input1.compareTo("Ds") == 0) {
			int i = (int) tram.get(109);
			sum = i * num1/10;
			} else if (input1.compareTo("Rg") == 0) {
			int i = (int) tram.get(110);
			sum = i * num1/10;
			} else if (input1.compareTo("Cn") == 0) {
			int i = (int) tram.get(111);
			sum = i * num1/10;
			} else if (input1.compareTo("Nh") == 0) {
			int i = (int) tram.get(112);
			sum = i * num1/10;
			} else if (input1.compareTo("Fl") == 0) {
			int i = (int) tram.get(113);
			sum = i * num1/10;
			} else if (input1.compareTo("Mc") == 0) {
			int i = (int) tram.get(114);
			sum = i * num1/10;
			} else if (input1.compareTo("Lv") == 0) {
			int i = (int) tram.get(115);
			sum = i * num1/10;
			} else if (input1.compareTo("Ts") == 0) {
			int i = (int) tram.get(116);
			sum = i * num1/10;
			} else if (input1.compareTo("Og") == 0) {
			int i = (int) tram.get(117);
			sum = i * num1/10;
			}else if(input1.compareTo("zz") == 0) {
			int k = (int) tram.get(118);
			sum = k * num1/10;
			}


			if (input2.compareTo("H") == 0) {
			int j = (int) tram.get(0);
			sun = j * num2/10;
			} else if (input2.compareTo("He") == 0) {
			int j = (int) tram.get(1);
			sun = j * num2/10;
			} else if (input2.compareTo("Li") == 0) {
			int j = (int) tram.get(2);
			sun = j * num2/10;
			} else if (input2.compareTo("Be") == 0) {
			int j = (int) tram.get(3);
			sun = j * num2/10;
			} else if (input2.compareTo("B") == 0) {
			int j = (int) tram.get(4);
			sun = j * num2/10;
			} else if (input2.compareTo("C") == 0) {
			int j = (int) tram.get(5);
			sun = j * num2/10;
			} else if (input2.compareTo("N") == 0) {
			int j = (int) tram.get(6);
			sun = j * num2/10;
			} else if (input2.compareTo("O") == 0) {
			int j = (int) tram.get(7);
			sun = j * num2/10;
			} else if (input2.compareTo("F") == 0) {
			int j = (int) tram.get(8);
			sun = j * num2/10;
			} else if (input2.compareTo("Ne") == 0) {
			int j = (int) tram.get(9);
			sun = j * num2/10;
			} else if (input2.compareTo("Na") == 0) {
			int j = (int) tram.get(10);
			sun = j * num2/10;
			} else if (input2.compareTo("Mg") == 0) {
			int j = (int) tram.get(11);
			sun = j * num2/10;
			} else if (input2.compareTo("Al") == 0) {
			int j = (int) tram.get(12);
			sun = j * num2/10;
			} else if (input2.compareTo("Si") == 0) {
			int j = (int) tram.get(13);
			sun = j * num2/10;
			} else if (input2.compareTo("P") == 0) {
			int j = (int) tram.get(14);
			sun = j * num2/10;
			} else if (input2.compareTo("S") == 0) {
			int j = (int) tram.get(15);
			sun = j * num2/10;
			} else if (input2.compareTo("Cl") == 0) {
			int j = (int) tram.get(16);
			sun = j * num2/10;
			} else if (input2.compareTo("Ar") == 0) {
			int j = (int) tram.get(17);
			sun = j * num2/10;
			} else if (input2.compareTo("K") == 0) {
			int j = (int) tram.get(18);
			sun = j * num2/10;
			} else if (input2.compareTo("Ca") == 0) {
			int j = (int) tram.get(19);
			sun = j * num2/10;
			} else if (input2.compareTo("Sc") == 0) {
			int j = (int) tram.get(20);
			sun = j * num2/10;
			} else if (input2.compareTo("Ti") == 0) {
			int j = (int) tram.get(21);
			sun = j * num2/10;
			} else if (input2.compareTo("V") == 0) {
			int j = (int) tram.get(22);
			sun = j * num2/10;
			} else if (input2.compareTo("Cr") == 0) {
			int j = (int) tram.get(23);
			sun = j * num2/10;
			} else if (input2.compareTo("Mn") == 0) {
			int j = (int) tram.get(24);
			sun = j * num2/10;
			} else if (input2.compareTo("Fe") == 0) {
			int j = (int) tram.get(25);
			sun = j * num2/10;
			} else if (input2.compareTo("Co") == 0) {
			int j = (int) tram.get(26);
			sun = j * num2/10;
			} else if (input2.compareTo("Ni") == 0) {
			int j = (int) tram.get(27);
			sun = j * num2/10;
			} else if (input2.compareTo("Cu") == 0) {
			int j = (int) tram.get(28);
			sun = j * num2/10;
			} else if (input2.compareTo("Zn") == 0) {
			int j = (int) tram.get(29);
			sun = j * num2/10;
			} else if (input2.compareTo("Ga") == 0) {
			int j = (int) tram.get(30);
			sun = j * num2/10;
			} else if (input2.compareTo("Ge") == 0) {
			int j = (int) tram.get(31);
			sun = j * num2/10;
			} else if (input2.compareTo("As") == 0) {
			int j = (int) tram.get(32);
			sun = j * num2/10;
			} else if (input2.compareTo("Se") == 0) {
			int j = (int) tram.get(33);
			sun = j * num2/10;
			} else if (input2.compareTo("Br") == 0) {
			int j = (int) tram.get(34);
			sun = j * num2/10;
			} else if (input2.compareTo("Kr") == 0) {
			int j = (int) tram.get(35);
			sun = j * num2/10;
			} else if (input2.compareTo("Rb") == 0) {
			int j = (int) tram.get(36);
			sun = j * num2/10;
			} else if (input2.compareTo("Sr") == 0) {
			int j = (int) tram.get(37);
			sun = j * num2/10;
			} else if (input2.compareTo("Y") == 0) {
			int j = (int) tram.get(38);
			sun = j * num2/10;
			} else if (input2.compareTo("Zr") == 0) {
			int j = (int) tram.get(39);
			sun = j * num2/10;
			} else if (input2.compareTo("Nb") == 0) {
			int j = (int) tram.get(40);
			sun = j * num2/10;
			} else if (input2.compareTo("Mo") == 0) {
			int j = (int) tram.get(41);
			sun = j * num2/10;
			} else if (input2.compareTo("Tc") == 0) {
			int j = (int) tram.get(42);
			sun = j * num2/10;
			} else if (input2.compareTo("Ru") == 0) {
			int j = (int) tram.get(43);
			sun = j * num2/10;
			} else if (input2.compareTo("Rh") == 0) {
			int j = (int) tram.get(44);
			sun = j * num2/10;
			} else if (input2.compareTo("Pd") == 0) {
			int j = (int) tram.get(45);
			sun = j * num2/10;
			} else if (input2.compareTo("Ag") == 0) {
			int j = (int) tram.get(46);
			sun = j * num2/10;
			} else if (input2.compareTo("Cd") == 0) {
			int j = (int) tram.get(47);
			sun = j * num2/10;
			} else if (input2.compareTo("In") == 0) {
			int j = (int) tram.get(48);
			sun = j * num2/10;
			} else if (input2.compareTo("Sn") == 0) {
			int j = (int) tram.get(49);
			sun = j * num2/10;
			} else if (input2.compareTo("Sb") == 0) {
			int j = (int) tram.get(50);
			sun = j * num2/10;
			} else if (input2.compareTo("Te") == 0) {
			int j = (int) tram.get(51);
			sun = j * num2/10;
			} else if (input2.compareTo("I") == 0) {
			int j = (int) tram.get(52);
			sun = j * num2/10;
			} else if (input2.compareTo("Xe") == 0) {
			int j = (int) tram.get(53);
			sun = j * num2/10;
			} else if (input2.compareTo("Cs") == 0) {
			int j = (int) tram.get(54);
			sun = j * num2/10;
			} else if (input2.compareTo("Ba") == 0) {
			int j = (int) tram.get(55);
			sun = j * num2/10;
			} else if (input2.compareTo("La") == 0) {
			int j = (int) tram.get(56);
			sun = j * num2/10;
			} else if (input2.compareTo("Ce") == 0) {
			int j = (int) tram.get(57);
			sun = j * num2/10;
			} else if (input2.compareTo("Pr") == 0) {
			int j = (int) tram.get(58);
			sun = j * num2/10;
			} else if (input2.compareTo("Nd") == 0) {
			int j = (int) tram.get(59);
			sun = j * num2/10;
			} else if (input2.compareTo("Pm") == 0) {
			int j = (int) tram.get(60);
			sun = j * num2/10;
			} else if (input2.compareTo("Sm") == 0) {
			int j = (int) tram.get(61);
			sun = j * num2/10;
			} else if (input2.compareTo("Eu") == 0) {
			int j = (int) tram.get(62);
			sun = j * num2/10;
			} else if (input2.compareTo("Gd") == 0) {
			int j = (int) tram.get(63);
			sun = j * num2/10;
			} else if (input2.compareTo("Tb") == 0) {
			int j = (int) tram.get(64);
			sun = j * num2/10;
			} else if (input2.compareTo("Dy") == 0) {
			int j = (int) tram.get(65);
			sun = j * num2/10;
			} else if (input2.compareTo("Ho") == 0) {
			int j = (int) tram.get(66);
			sun = j * num2/10;
			} else if (input2.compareTo("Er") == 0) {
			int j = (int) tram.get(67);
			sun = j * num2/10;
			} else if (input2.compareTo("Tm") == 0) {
			int j = (int) tram.get(68);
			sun = j * num2/10;
			} else if (input2.compareTo("Yb") == 0) {
			int j = (int) tram.get(69);
			sun = j * num2/10;
			} else if (input2.compareTo("Lu") == 0) {
			int j = (int) tram.get(70);
			sun = j * num2/10;
			} else if (input2.compareTo("Hf") == 0) {
			int j = (int) tram.get(71);
			sun = j * num2/10;
			} else if (input2.compareTo("Ta") == 0) {
			int j = (int) tram.get(72);
			sun = j * num2/10;
			} else if (input2.compareTo("W") == 0) {
			int j = (int) tram.get(73);
			sun = j * num2/10;
			} else if (input2.compareTo("Re") == 0) {
			int j = (int) tram.get(74);
			sun = j * num2/10;
			} else if (input2.compareTo("Os") == 0) {
			int j = (int) tram.get(75);
			sun = j * num2/10;
			} else if (input2.compareTo("Ir") == 0) {
			int j = (int) tram.get(76);
			sun = j * num2/10;
			} else if (input2.compareTo("Pt") == 0) {
			int j = (int) tram.get(77);
			sun = j * num2/10;
			} else if (input2.compareTo("Au") == 0) {
			int j = (int) tram.get(78);
			sun = j * num2/10;
			} else if (input2.compareTo("Hg") == 0) {
			int j = (int) tram.get(79);
			sun = j * num2/10;
			} else if (input2.compareTo("Ti") == 0) {
			int j = (int) tram.get(80);
			sun = j * num2/10;
			} else if (input2.compareTo("Pb") == 0) {
			int j = (int) tram.get(81);
			sun = j * num2/10;
			} else if (input2.compareTo("Bi") == 0) {
			int j = (int) tram.get(82);
			sun = j * num2/10;
			} else if (input2.compareTo("Po") == 0) {
			int j = (int) tram.get(83);
			sun = j * num2/10;
			} else if (input2.compareTo("At") == 0) {
			int j = (int) tram.get(84);
			sun = j * num2/10;
			} else if (input2.compareTo("Rn") == 0) {
			int j = (int) tram.get(85);
			sun = j * num2/10;
			} else if (input2.compareTo("Fr") == 0) {
			int j = (int) tram.get(86);
			sun = j * num2/10;
			} else if (input2.compareTo("Ra") == 0) {
			int j = (int) tram.get(87);
			sun = j * num2/10;
			} else if (input2.compareTo("Ac") == 0) {
			int j = (int) tram.get(88);
			sun = j * num2/10;
			} else if (input2.compareTo("Th") == 0) {
			int j = (int) tram.get(89);
			sun = j * num2/10;
			} else if (input2.compareTo("Pa") == 0) {
			int j = (int) tram.get(90);
			sun = j * num2/10;
			} else if (input2.compareTo("U") == 0) {
			int j = (int) tram.get(91);
			sun = j * num2/10;
			} else if (input2.compareTo("Np") == 0) {
			int j = (int) tram.get(92);
			sun = j * num2/10;
			} else if (input2.compareTo("Pu") == 0) {
			int j = (int) tram.get(93);
			sun = j * num2/10;
			} else if (input2.compareTo("Am") == 0) {
			int j = (int) tram.get(94);
			sun = j * num2/10;
			} else if (input2.compareTo("Cm") == 0) {
			int j = (int) tram.get(95);
			sun = j * num2/10;
			} else if (input2.compareTo("Bk") == 0) {
			int j = (int) tram.get(96);
			sun = j * num2/10;
			} else if (input2.compareTo("Cf") == 0) {
			int j = (int) tram.get(97);
			sun = j * num2/10;
			} else if (input2.compareTo("Es") == 0) {
			int j = (int) tram.get(98);
			sun = j * num2/10;
			} else if (input2.compareTo("Fm") == 0) {
			int j = (int) tram.get(99);
			sun = j * num2/10;
			} else if (input2.compareTo("Md") == 0) {
			int j = (int) tram.get(100);
			sun = j * num2/10;
			} else if (input2.compareTo("No") == 0) {
			int j = (int) tram.get(101);
			sun = j * num2/10;
			} else if (input2.compareTo("Lr") == 0) {
			int j = (int) tram.get(102);
			sun = j * num2/10;
			} else if (input2.compareTo("Rf") == 0) {
			int j = (int) tram.get(103);
			sun = j * num2/10;
			} else if (input2.compareTo("Db") == 0) {
			int j = (int) tram.get(104);
			sun = j * num2/10;
			} else if (input2.compareTo("Sg") == 0) {
			int j = (int) tram.get(105);
			sun = j * num2/10;
			} else if (input2.compareTo("Bh") == 0) {
			int j = (int) tram.get(106);
			sun = j * num2/10;
			} else if (input2.compareTo("Hs") == 0) {
			int j = (int) tram.get(107);
			sun = j * num2/10;
			} else if (input2.compareTo("Mt") == 0) {
			int j = (int) tram.get(108);
			sun = j * num2/10;
			} else if (input2.compareTo("Ds") == 0) {
			int j = (int) tram.get(109);
			sun = j * num2/10;
			} else if (input2.compareTo("Rg") == 0) {
			int j = (int) tram.get(110);
			sun = j * num2/10;
			} else if (input2.compareTo("Cn") == 0) {
			int j = (int) tram.get(111);
			sun = j * num2/10;
			} else if (input2.compareTo("Nh") == 0) {
			int j = (int) tram.get(112);
			sun = j * num2/10;
			} else if (input2.compareTo("Fl") == 0) {
			int j = (int) tram.get(113);
			sun = j * num2/10;
			} else if (input2.compareTo("Mc") == 0) {
			int j = (int) tram.get(114);
			sun = j * num2/10;
			} else if (input2.compareTo("Lv") == 0) {
			int j = (int) tram.get(115);
			sun = j * num2/10;
			} else if (input2.compareTo("Ts") == 0) {
			int j = (int) tram.get(116);
			sun = j * num2/10;
			} else if (input2.compareTo("Og") == 0) {
			int j = (int) tram.get(117);
			sun = j * num2/10;
			} else if (input2.compareTo(" ") == 0){
			int j = (int) tram.get(118);
			sun = j * num2/10;
			}
			if (input3.compareTo("H") == 0) {
			int k = (int) tram.get(0);
			suo = k * num3/10;
			} else if (input3.compareTo("He") == 0) {
			int k = (int) tram.get(1);
			suo = k * num3/10;
			} else if (input3.compareTo("Li") == 0) {
			int k = (int) tram.get(2);
			suo = k * num3/10;
			} else if (input3.compareTo("Be") == 0) {
			int k = (int) tram.get(3);
			suo = k * num3/10;
			} else if (input3.compareTo("B") == 0) {
			int k = (int) tram.get(4);
			suo = k * num3/10;
			} else if (input3.compareTo("C") == 0) {
			int k = (int) tram.get(5);
			suo = k * num3/10;
			} else if (input3.compareTo("N") == 0) {
			int k = (int) tram.get(6);
			suo = k * num3/10;
			} else if (input3.compareTo("O") == 0) {
			int k = (int) tram.get(7);
			suo = k * num3/10;
			} else if (input3.compareTo("F") == 0) {
			int k = (int) tram.get(8);
			suo = k * num3/10;
			} else if (input3.compareTo("Ne") == 0) {
			int k = (int) tram.get(9);
			suo = k * num3/10;
			} else if (input3.compareTo("Na") == 0) {
			int k = (int) tram.get(10);
			suo = k * num3/10;
			} else if (input3.compareTo("Mg") == 0) {
			int k = (int) tram.get(11);
			suo = k * num3/10;
			} else if (input3.compareTo("Al") == 0) {
			int k = (int) tram.get(12);
			suo = k * num3/10;
			} else if (input3.compareTo("Si") == 0) {
			int k = (int) tram.get(13);
			suo = k * num3/10;
			} else if (input3.compareTo("P") == 0) {
			int k = (int) tram.get(14);
			suo = k * num3/10;
			} else if (input3.compareTo("S") == 0) {
			int k = (int) tram.get(15);
			suo = k * num3/10;
			} else if (input3.compareTo("Cl") == 0) {
			int k = (int) tram.get(16);
			suo = k * num3/10;
			} else if (input3.compareTo("Ar") == 0) {
			int k = (int) tram.get(17);
			suo = k * num3/10;
			} else if (input3.compareTo("K") == 0) {
			int k = (int) tram.get(18);
			suo = k * num3/10;
			} else if (input3.compareTo("Ca") == 0) {
			int k = (int) tram.get(19);
			suo = k * num3/10;
			} else if (input3.compareTo("Sc") == 0) {
			int k = (int) tram.get(20);
			suo = k * num3/10;
			} else if (input3.compareTo("Ti") == 0) {
			int k = (int) tram.get(21);
			suo = k * num3/10;
			} else if (input3.compareTo("V") == 0) {
			int k = (int) tram.get(22);
			suo = k * num3/10;
			} else if (input3.compareTo("Cr") == 0) {
			int k = (int) tram.get(23);
			suo = k * num3/10;
			} else if (input3.compareTo("Mn") == 0) {
			int k = (int) tram.get(24);
			suo = k * num3/10;
			} else if (input3.compareTo("Fe") == 0) {
			int k = (int) tram.get(25);
			suo = k * num3/10;
			} else if (input3.compareTo("Co") == 0) {
			int k = (int) tram.get(26);
			suo = k * num3/10;
			} else if (input3.compareTo("Ni") == 0) {
			int k = (int) tram.get(27);
			suo = k * num3/10;
			} else if (input3.compareTo("Cu") == 0) {
			int k = (int) tram.get(28);
			suo = k * num3/10;
			} else if (input3.compareTo("Zn") == 0) {
			int k = (int) tram.get(29);
			suo = k * num3/10;
			} else if (input3.compareTo("Ga") == 0) {
			int k = (int) tram.get(30);
			suo = k * num3/10;
			} else if (input3.compareTo("Ge") == 0) {
			int k = (int) tram.get(31);
			suo = k * num3/10;
			} else if (input3.compareTo("As") == 0) {
			int k = (int) tram.get(32);
			suo = k * num3/10;
			} else if (input3.compareTo("Se") == 0) {
			int k = (int) tram.get(33);
			suo = k * num3/10;
			} else if (input3.compareTo("Br") == 0) {
			int k = (int) tram.get(34);
			suo = k * num3/10;
			} else if (input3.compareTo("Kr") == 0) {
			int k = (int) tram.get(35);
			suo = k * num3/10;
			} else if (input3.compareTo("Rb") == 0) {
			int k = (int) tram.get(36);
			suo = k * num3/10;
			} else if (input3.compareTo("Sr") == 0) {
			int k = (int) tram.get(37);
			suo = k * num3/10;
			} else if (input3.compareTo("Y") == 0) {
			int k = (int) tram.get(38);
			suo = k * num3/10;
			} else if (input3.compareTo("Zr") == 0) {
			int k = (int) tram.get(39);
			suo = k * num3/10;
			} else if (input3.compareTo("Nb") == 0) {
			int k = (int) tram.get(40);
			suo = k * num3/10;
			} else if (input3.compareTo("Mo") == 0) {
			int k = (int) tram.get(41);
			suo = k * num3/10;
			} else if (input3.compareTo("Tc") == 0) {
			int k = (int) tram.get(42);
			suo = k * num3/10;
			} else if (input3.compareTo("Ru") == 0) {
			int k = (int) tram.get(43);
			suo = k * num3/10;
			} else if (input3.compareTo("Rh") == 0) {
			int k = (int) tram.get(44);
			suo = k * num3/10;
			} else if (input3.compareTo("Pd") == 0) {
			int k = (int) tram.get(45);
			suo = k * num3/10;
			} else if (input3.compareTo("Ag") == 0) {
			int k = (int) tram.get(46);
			suo = k * num3/10;
			} else if (input3.compareTo("Cd") == 0) {
			int k = (int) tram.get(47);
			suo = k * num3/10;
			} else if (input3.compareTo("In") == 0) {
			int k = (int) tram.get(48);
			suo = k * num3/10;
			} else if (input3.compareTo("Sn") == 0) {
			int k = (int) tram.get(49);
			suo = k * num3/10;
			} else if (input3.compareTo("Sb") == 0) {
			int k = (int) tram.get(50);
			suo = k * num3/10;
			} else if (input3.compareTo("Te") == 0) {
			int k = (int) tram.get(51);
			suo = k * num3/10;
			} else if (input3.compareTo("I") == 0) {
			int k = (int) tram.get(52);
			suo = k * num3/10;
			} else if (input3.compareTo("Xe") == 0) {
			int k = (int) tram.get(53);
			suo = k * num3/10;
			} else if (input3.compareTo("Cs") == 0) {
			int k = (int) tram.get(54);
			suo = k * num3/10;
			} else if (input3.compareTo("Ba") == 0) {
			int k = (int) tram.get(55);
			suo = k * num3/10;
			} else if (input3.compareTo("La") == 0) {
			int k = (int) tram.get(56);
			suo = k * num3/10;
			} else if (input3.compareTo("Ce") == 0) {
			int k = (int) tram.get(57);
			suo = k * num3/10;
			} else if (input3.compareTo("Pr") == 0) {
			int k = (int) tram.get(58);
			suo = k * num3/10;
			} else if (input3.compareTo("Nd") == 0) {
			int k = (int) tram.get(59);
			suo = k * num3/10;
			} else if (input3.compareTo("Pm") == 0) {
			int k = (int) tram.get(60);
			suo = k * num3/10;
			} else if (input3.compareTo("Sm") == 0) {
			int k = (int) tram.get(61);
			suo = k * num3/10;
			} else if (input3.compareTo("Eu") == 0) {
			int k = (int) tram.get(62);
			suo = k * num3/10;
			} else if (input3.compareTo("Gd") == 0) {
			int k = (int) tram.get(63);
			suo = k * num3/10;
			} else if (input3.compareTo("Tb") == 0) {
			int k = (int) tram.get(64);
			suo = k * num3/10;
			} else if (input3.compareTo("Dy") == 0) {
			int k = (int) tram.get(65);
			suo = k * num3/10;
			} else if (input3.compareTo("Ho") == 0) {
			int k = (int) tram.get(66);
			suo = k * num3/10;
			} else if (input3.compareTo("Er") == 0) {
			int k = (int) tram.get(67);
			suo = k * num3/10;
			} else if (input3.compareTo("Tm") == 0) {
			int k = (int) tram.get(68);
			suo = k * num3/10;
			} else if (input3.compareTo("Yb") == 0) {
			int k = (int) tram.get(69);
			suo = k * num3/10;
			} else if (input3.compareTo("Lu") == 0) {
			int k = (int) tram.get(70);
			suo = k * num3/10;
			} else if (input3.compareTo("Hf") == 0) {
			int k = (int) tram.get(71);
			suo = k * num3/10;
			} else if (input3.compareTo("Ta") == 0) {
			int k = (int) tram.get(72);
			suo = k * num3/10;
			} else if (input3.compareTo("W") == 0) {
			int k = (int) tram.get(73);
			suo = k * num3/10;
			} else if (input3.compareTo("Re") == 0) {
			int k = (int) tram.get(74);
			suo = k * num3/10;
			} else if (input3.compareTo("Os") == 0) {
			int k = (int) tram.get(75);
			suo = k * num3/10;
			} else if (input3.compareTo("Ir") == 0) {
			int k = (int) tram.get(76);
			suo = k * num3/10;
			} else if (input3.compareTo("Pt") == 0) {
			int k = (int) tram.get(77);
			suo = k * num3/10;
			} else if (input3.compareTo("Au") == 0) {
			int k = (int) tram.get(78);
			suo = k * num3/10;
			} else if (input3.compareTo("Hg") == 0) {
			int k = (int) tram.get(79);
			suo = k * num3/10;
			} else if (input3.compareTo("Ti") == 0) {
			int k = (int) tram.get(80);
			suo = k * num3/10;
			} else if (input3.compareTo("Pb") == 0) {
			int k = (int) tram.get(81);
			suo = k * num3/10;
			} else if (input3.compareTo("Bi") == 0) {
			int k = (int) tram.get(82);
			suo = k * num3/10;
			} else if (input3.compareTo("Po") == 0) {
			int k = (int) tram.get(83);
			suo = k * num3/10;
			} else if (input3.compareTo("At") == 0) {
			int k = (int) tram.get(84);
			suo = k * num3/10;
			} else if (input3.compareTo("Rn") == 0) {
			int k = (int) tram.get(85);
			suo = k * num3/10;
			} else if (input3.compareTo("Fr") == 0) {
			int k = (int) tram.get(86);
			suo = k * num3/10;
			} else if (input3.compareTo("Ra") == 0) {
			int k = (int) tram.get(87);
			suo = k * num3/10;
			} else if (input3.compareTo("Ac") == 0) {
			int k = (int) tram.get(88);
			suo = k * num3/10;
			} else if (input3.compareTo("Th") == 0) {
			int k = (int) tram.get(89);
			suo = k * num3/10;
			} else if (input3.compareTo("Pa") == 0) {
			int k = (int) tram.get(90);
			suo = k * num3/10;
			} else if (input3.compareTo("U") == 0) {
			int k = (int) tram.get(91);
			suo = k * num3/10;
			} else if (input3.compareTo("Np") == 0) {
			int k = (int) tram.get(92);
			suo = k * num3/10;
			} else if (input3.compareTo("Pu") == 0) {
			int k = (int) tram.get(93);
			suo = k * num3/10;
			} else if (input3.compareTo("Am") == 0) {
			int k = (int) tram.get(94);
			suo = k * num3/10;
			} else if (input3.compareTo("Cm") == 0) {
			int k = (int) tram.get(95);
			suo = k * num3/10;
			} else if (input3.compareTo("Bk") == 0) {
			int k = (int) tram.get(96);
			suo = k * num3/10;
			} else if (input3.compareTo("Cf") == 0) {
			int k = (int) tram.get(97);
			suo = k * num3/10;
			} else if (input3.compareTo("Es") == 0) {
			int k = (int) tram.get(98);
			suo = k * num3/10;
			} else if (input3.compareTo("Fm") == 0) {
			int k = (int) tram.get(99);
			suo = k * num3/10;
			} else if (input3.compareTo("Md") == 0) {
			int k = (int) tram.get(100);
			suo = k * num3/10;
			} else if (input3.compareTo("No") == 0) {
			int k = (int) tram.get(101);
			suo = k * num3/10;
			} else if (input3.compareTo("Lr") == 0) {
			int k = (int) tram.get(102);
			suo = k * num3/10;
			} else if (input3.compareTo("Rf") == 0) {
			int k = (int) tram.get(103);
			suo = k * num3/10;
			} else if (input3.compareTo("Db") == 0) {
			int k = (int) tram.get(104);
			suo = k * num3/10;
			} else if (input3.compareTo("Sg") == 0) {
			int k = (int) tram.get(105);
			suo = k * num3/10;
			} else if (input3.compareTo("Bh") == 0) {
			int k = (int) tram.get(106);
			suo = k * num3/10;
			} else if (input3.compareTo("Hs") == 0) {
			int k = (int) tram.get(107);
			suo = k * num3/10;
			} else if (input3.compareTo("Mt") == 0) {
			int k = (int) tram.get(108);
			suo = k * num3/10;
			} else if (input3.compareTo("Ds") == 0) {
			int k = (int) tram.get(109);
			suo = k * num3/10;
			} else if (input3.compareTo("Rg") == 0) {
			int k = (int) tram.get(110);
			suo = k * num3/10;
			} else if (input3.compareTo("Cn") == 0) {
			int k = (int) tram.get(111);
			suo = k * num3/10;
			} else if (input3.compareTo("Nh") == 0) {
			int k = (int) tram.get(112);
			suo = k * num3/10;
			} else if (input3.compareTo("Fl") == 0) {
			int k = (int) tram.get(113);
			suo = k * num3/10;
			} else if (input3.compareTo("Mc") == 0) {
			int k = (int) tram.get(114);
			suo = k * num3/10;
			} else if (input3.compareTo("Lv") == 0) {
			int k = (int) tram.get(115);
			suo = k * num3/10;
			} else if (input3.compareTo("Ts") == 0) {
			int k = (int) tram.get(116);
			suo = k * num3/10;
			} else if (input3.compareTo("Og") == 0) {
			int k = (int) tram.get(117);
			suo = k * num3/10;
			} else if(input3.compareTo(" ") == 0) {
			int k = (int) tram.get(118);
			suo = k * num3/10;
			}

		double tot=sum+sun+suo;
		System.out.println("The Relative Molecular mass of ");
				System.out.println(input1 + num1 + input2 + num2 +input3 + num3 );
				System.out.println("is " + tot+" .");
	}
}